package hu.holdinarms.example.dao;

import hu.holdinarms.example.core.Brand;
import hu.holdinarms.example.core.Campaign;
import hu.holdinarms.example.core.Keyword;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;


//@RegisterMapper(BrandMapper.class)
public interface MyDao {

	//Brand
	@SqlQuery("select * from brand")
	@Mapper(BrandMapper.class)
	public List<Brand> getBrandList();
	
	@SqlUpdate("insert into brand (name) values (:name)")
	void insertToBrand(@Bind("name") String name);
	
	//Keyword
	@SqlQuery("select * from keyword")
	@Mapper(KeywordMapper.class)
	public List<Keyword> getKeywordList();
	
	@SqlUpdate("insert into keyword (name) values (:name)")
	void insertToKeyword(@Bind("name") String name);
	
	//Campaign
	@SqlQuery("select * from campaign")
	@Mapper(CampaignMapper.class)
	public List<Campaign> getCampaingList();
	
}
