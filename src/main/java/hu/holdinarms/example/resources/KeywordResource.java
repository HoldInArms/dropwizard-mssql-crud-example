package hu.holdinarms.example.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import hu.holdinarms.example.core.Keyword;
import hu.holdinarms.example.dao.MyDao;

@Path("/keyword")
public class KeywordResource {
	
	private MyDao myDao;
	
	public KeywordResource(MyDao myDao){
		this.myDao = myDao;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Keyword> getKeywords(){
		return myDao.getKeywordList();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addKeyword( Keyword newKeyword ){
		myDao.insertToKeyword( newKeyword.getName() );
	}
	
	@Path("{id}")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public boolean updateKeyword( @PathParam("id") String id, Keyword updateKeyword ){
		if( myDao.existsKeyword(id) ){
			myDao.updateKeyword(id, updateKeyword.getName() );
			return true;
		}else{
			return false;
		}
	}
	
	@Path("{id}")
	@DELETE
	public void delete( @PathParam("id") String id ){
		myDao.deleteKeyword(id);
	}
	
}
