package hu.holdinarms.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import hu.holdinarms.example.core.Campaign;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class CampaignMapper implements ResultSetMapper<Campaign>{

//	public Campaign map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
//		return new Campaign( Long.parseLong(resultSet.getString("id")), resultSet.getString("name"), Long.parseLong(resultSet.getString("brand_id"))  );
//	}
	
	public Campaign map(int i, ResultSet resultSet, StatementContext statementContext)throws SQLException {
		return new Campaign( 
				Long.parseLong(resultSet.getString("id")), 
				resultSet.getString("name"), 
				Long.parseLong(resultSet.getString("brand_id")),
				resultSet.getString("brand_name")
		);
	}

}
