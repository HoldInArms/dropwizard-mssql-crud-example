/**
 * 
 */
package hu.holdinarms.example.dao;

import hu.holdinarms.example.core.User;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

/**
 * Mapper class for the User entity.
 * 
 * @author Bela Szabo
 *
 */
public class UserMapper implements ResultSetMapper<User>{

	public User map(final int index, final ResultSet r, final StatementContext ctx) throws SQLException {
		return new User( r.getLong("id") , r.getString("username") );
	}

}
