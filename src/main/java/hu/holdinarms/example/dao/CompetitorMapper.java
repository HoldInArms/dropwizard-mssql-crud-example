package hu.holdinarms.example.dao;

import hu.holdinarms.example.core.Competitor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class CompetitorMapper implements ResultSetMapper<Competitor>{

	public Competitor map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
		return new Competitor( Long.parseLong( resultSet.getString("campaign_id") ), Long.parseLong( resultSet.getString("brand_id") ) );
	}

}
