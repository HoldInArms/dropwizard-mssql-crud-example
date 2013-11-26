package hu.holdinarms.example.resources;

import javax.ws.rs.core.Response;

import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;
import com.yammer.dropwizard.testing.ResourceTest;

import static org.junit.Assert.assertEquals;

/**
 * Index HTML test class.
 * 
 * @author Dgzt
 */
public class HtmlPageResourceTest extends ResourceTest{

	@Override
	protected void setUpResources() throws Exception {
		addResource( new HtmlPageResource() );
	}
	
	@Test
	public void testLoadIndexPage(){
		ClientResponse response = client().resource("/").get(ClientResponse.class);
		
		assertEquals( response.getStatus(), Response.Status.OK.getStatusCode() );
	}

}
