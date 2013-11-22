package hu.holdinarms.example.resources;

import java.util.List;

import hu.holdinarms.example.core.CampaignHasKeyword;
import hu.holdinarms.example.dao.MyDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("campaignhaskeyword")
@Produces(MediaType.APPLICATION_JSON)
public class CampaignHasKeywordResource {

	private MyDao myDao;

	public CampaignHasKeywordResource(MyDao myDao) {
		this.myDao = myDao;
	}
	
	@GET
	public List<CampaignHasKeyword> getCampaignHasKeywords(){
		return myDao.getCampaignHasKeywordList();
	}
}
