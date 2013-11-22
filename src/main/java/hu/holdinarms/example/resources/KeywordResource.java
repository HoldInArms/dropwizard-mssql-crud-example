package hu.holdinarms.example.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.validator.constraints.NotEmpty;

import hu.holdinarms.example.core.Keyword;
import hu.holdinarms.example.dao.MyDao;

@Path("/keyword")
@Produces(MediaType.APPLICATION_JSON)
public class KeywordResource {
	
	private MyDao myDao;
	
	public KeywordResource(MyDao myDao){
		this.myDao = myDao;
	}

	@GET
	public List<Keyword> getKeywords(){
		return myDao.getKeywordList();
	}
	
	@POST
	@Path("{name}")
	public boolean addKeyword(@PathParam("name") @NotEmpty String name ){
		myDao.insertToKeyword(name);
		
		return true;
	}
	
}
