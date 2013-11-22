package hu.holdinarms.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import hu.holdinarms.example.core.Keyword;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class KeywordMapper implements ResultSetMapper<Keyword>{

	public Keyword map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
		return new Keyword( Long.parseLong( resultSet.getString("id") ), resultSet.getString("name") );
	}

}
