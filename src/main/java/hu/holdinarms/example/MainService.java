package hu.holdinarms.example;

import org.skife.jdbi.v2.DBI;

import hu.holdinarms.example.dao.MyDao;
import hu.holdinarms.example.health.TemplateHealthCheck;
import hu.holdinarms.example.resources.BrandResource;
import hu.holdinarms.example.resources.HelloWorldResource;
import hu.holdinarms.example.resources.HtmlPageResource;
import hu.holdinarms.example.resources.KeywordResource;
import com.yammer.dropwizard.Service;
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
		
	}
	
	@Override
	public void run(MainConfiguration configuration, Environment environment) throws Exception {
//		final String template = configuration.getTemplate();
//		final String defaultName = configuration.getDefaultName();
		
		
		final DBIFactory factory = new DBIFactory();
		final DBI jdbi = factory.build(environment, configuration.getDatabaseConfiguration(), "mssql");
		final MyDao dao = jdbi.onDemand(MyDao.class);
		
//		environment.addResource(new HelloWorldResource(template, defaultName));
//		environment.addResource(new HelloWorldResource(template, defaultName,dao));
		//
		environment.addResource( new HtmlPageResource() );
		environment.addResource( new BrandResource( dao ) );
		environment.addResource( new KeywordResource( dao ) );
		//
//		environment.addHealthCheck(new TemplateHealthCheck(template));
		
	}

}
