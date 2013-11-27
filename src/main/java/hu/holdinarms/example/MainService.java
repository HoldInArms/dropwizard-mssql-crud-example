package hu.holdinarms.example;

import org.skife.jdbi.v2.DBI;

import hu.holdinarms.example.dao.MyDao;
import hu.holdinarms.example.health.DatabaseHealthCheck;
import hu.holdinarms.example.resources.BrandResource;
import hu.holdinarms.example.resources.CampaignHasKeywordResource;
import hu.holdinarms.example.resources.CampaignResource;
import hu.holdinarms.example.resources.CompetitorResource;
import hu.holdinarms.example.resources.HtmlPageResource;
import hu.holdinarms.example.resources.KeywordResource;
import hu.holdinarms.example.resources.UserResource;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import com.yammer.dropwizard.jdbi.DBIFactory;
import com.yammer.dropwizard.migrations.MigrationsBundle;

public class MainService extends Service<MainConfiguration>{

	public static void main(String[] args) throws Exception{
		new MainService().run(args);
	}
	
	@Override
	public void initialize(Bootstrap<MainConfiguration> bootstrap) {
		bootstrap.setName("hello-world");
		
		bootstrap.addBundle( new MigrationsBundle<MainConfiguration>(){

			public DatabaseConfiguration getDatabaseConfiguration(MainConfiguration configuration) {
				return configuration.getDatabaseConfiguration();
			}
			
		});
		
		bootstrap.addBundle(new AssetsBundle("/assets/"));
		
	}
	
	@Override
	public void run(MainConfiguration configuration, Environment environment) throws Exception {
		final DBIFactory factory = new DBIFactory();
		final DBI jdbi = factory.build(environment, configuration.getDatabaseConfiguration(), "mssql");
		final MyDao dao = jdbi.onDemand(MyDao.class);
		
		environment.addResource( new HtmlPageResource() );
		environment.addResource( new BrandResource( dao ) );
		environment.addResource( new UserResource(dao) );
		environment.addResource( new KeywordResource( dao ) );
		environment.addResource( new CampaignResource( dao ));
		environment.addResource( new CampaignHasKeywordResource( dao ) );
		environment.addResource( new CompetitorResource( dao ) );
		
		environment.addHealthCheck( new DatabaseHealthCheck(jdbi, configuration.getDatabaseConfiguration().getValidationQuery() ) );
	}

}
