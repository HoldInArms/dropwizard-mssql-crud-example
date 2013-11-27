/**
 * 
 */
package hu.holdinarms.example.core;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This entity stores the user authentication information.
 * 
 * @author Bela Szabo
 *
 */
public class User {
	
	@JsonProperty
	private long id;
	
	@JsonProperty
	private String userName;
	
	@JsonProperty
	private String password;
	
	private List<UserRoles> userRoles;
	
	public User() {
	}
	
	public User(long id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}
}
