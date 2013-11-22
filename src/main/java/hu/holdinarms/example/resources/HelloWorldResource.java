package hu.holdinarms.example.resources;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import hu.holdinarms.example.core.Saying;
import hu.holdinarms.example.dao.MyDao;
import com.google.common.base.Optional;
import com.yammer.metrics.annotation.Timed;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
	private final String template;
	private final String defaultName;
	private final AtomicLong counter;
	
	private MyDao dao;
	
//	public HelloWorldResource(String template, String defaultName){
//		this.template = template;
//		this.defaultName = defaultName;
//		this.counter = new AtomicLong();
//	}
	
	public HelloWorldResource(String template, String defaultName, MyDao dao){
		this.template = template;
		this.defaultName = defaultName;
		this.counter = new AtomicLong();
		
		this.dao = dao;
	}
	
	@GET
	@Timed
	public Saying sayHello( @QueryParam("name") Optional<String> name){
		return new Saying( counter.incrementAndGet(), String.format(template, name.or(defaultName)) );
	}
}
