/**
 * 
 */
package hu.holdinarms.example.dao;

import hu.holdinarms.example.core.UserRoles;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

/**
 * Mapper class for the UserRole entity.
 * 
 * @author Bela Szabo
 *
 */
public class UserRoleMapper implements ResultSetMapper<UserRoles>{

	public UserRoles map(final int index, final ResultSet r, final StatementContext ctx) throws SQLException {
		return new UserRoles( r.getLong("id") , r.getLong("user_id"), r.getString("role") );
	}

}
