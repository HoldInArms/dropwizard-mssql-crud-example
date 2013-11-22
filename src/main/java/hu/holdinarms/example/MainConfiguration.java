package hu.holdinarms.example;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.client.HttpClientConfiguration;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.db.DatabaseConfiguration;

public class MainConfiguration extends Configuration{

//	@NotEmpty
//	@JsonProperty
//	private String template;
//	
//	@NotEmpty
//	@JsonProperty
//	private String defaultName = "Stranger";
	
	@Valid
	@NotNull
	@JsonProperty
	private DatabaseConfiguration database = new DatabaseConfiguration();
	
	
//	public String getTemplate(){
//		return template;
//	}
//	
//	public String getDefaultName(){
//		return defaultName;
//	}
//	
	public DatabaseConfiguration getDatabaseConfiguration(){
		return database;
	}
	
}
