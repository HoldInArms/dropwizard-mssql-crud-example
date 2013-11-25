package hu.holdinarms.example.resources;

import java.util.List;

import hu.holdinarms.example.core.Campaign;
import hu.holdinarms.example.dao.MyDao;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/campaign")
public class CampaignResource {

	private MyDao myDao;
	
	public CampaignResource( MyDao myDao ){
		this.myDao = myDao;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Campaign> getCampaings(){
		return myDao.getCampaingList();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addCampaign( Campaign newCampaign ){
		myDao.insertToCampaign(newCampaign.getName(), newCampaign.getBrand_id());
	}
	
	@Path("{id}")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public boolean updateCampaign( @PathParam("id") String id, Campaign campaign ){
		if( myDao.existsCampaign(id) ){
			myDao.updateCampaign(id, campaign.getName(), campaign.getBrand_id() );
			return true;
		}else{
			return false;
		}
	}
	
	@Path("{id}")
	@DELETE
	public void delete( @PathParam("id") String id ){
		myDao.deleteCampaign(id);
	}
	
}
