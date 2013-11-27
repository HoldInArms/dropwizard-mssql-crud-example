/**
 * 
 */
package hu.holdinarms.example.resources;

import hu.holdinarms.example.core.User;
import hu.holdinarms.example.core.UserRoles;
import hu.holdinarms.example.dao.MyDao;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * This resource class associates to the user URIs.
 * 
 * @author Bela Szabo
 *
 */
@Path("/user")
public class UserResource {
	
	private MyDao myDao;
	
	public UserResource( MyDao myDao ){
		this.myDao = myDao;
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public User autheticateUser( @QueryParam("username") String username, @QueryParam("password") String password){
		User user = myDao.getAuthenticatedUser(username, password);
		if (user == null) {
			return new User();
		}
		List<UserRoles> userRoles = myDao.getUserRoles(user.getId());
		user.setUserRoles(userRoles);
		
		return user;
	}
}
