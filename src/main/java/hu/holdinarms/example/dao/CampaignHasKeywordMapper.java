package hu.holdinarms.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import hu.holdinarms.example.core.CampaignHasKeyword;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class CampaignHasKeywordMapper implements ResultSetMapper<CampaignHasKeyword>{

	public CampaignHasKeyword map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {

		return new CampaignHasKeyword(Long.parseLong( resultSet.getString("campaign_id") ), Long.parseLong( resultSet.getString("keyword_id") ));
	}

}
