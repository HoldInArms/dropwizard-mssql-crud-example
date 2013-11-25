package hu.holdinarms.example.dao;

import hu.holdinarms.example.core.Brand;
import hu.holdinarms.example.core.Campaign;
import hu.holdinarms.example.core.CampaignHasKeyword;
import hu.holdinarms.example.core.Competitor;
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
	
	@SqlQuery("select COUNT(*) from brand where id = :id")
	boolean existsBrand( @Bind("id") String id );
	
	@SqlUpdate("UPDATE brand SET name = :name WHERE id = :id")
	void updateBrand( @Bind("id") String id, @Bind("name") String name );
	
	@SqlUpdate("DELETE FROM brand WHERE id = :id")
	void deleteBrand( @Bind("id") String id );
	
	//Keyword
	
	@SqlQuery("select * from keyword")
	@Mapper(KeywordMapper.class)
	public List<Keyword> getKeywordList();
	
	@SqlUpdate("insert into keyword (name) values (:name)")
	void insertToKeyword(@Bind("name") String name);
	
	@SqlQuery("select COUNT(*) from keyword where id = :id")
	boolean existsKeyword( @Bind("id") String id );
	
	@SqlUpdate("UPDATE keyword SET name = :name WHERE id = :id")
	void updateKeyword( @Bind("id") String id, @Bind("name") String name );
	
	@SqlUpdate("DELETE FROM keyword WHERE id = :id")
	void deleteKeyword( @Bind("id") String id );
	
	//Campaign
	
	@SqlQuery("select * from campaign")
	@Mapper(CampaignMapper.class)
	public List<Campaign> getCampaingList();
	
	@SqlUpdate("insert into campaign (name,brand_id) values (:name,:brand_id)")
	void insertToCampaign(@Bind("name") String name, @Bind("brand_id") long brand_id);
	
	@SqlQuery("select COUNT(*) from campaign where id = :id")
	boolean existsCampaign( @Bind("id") String id );
	
	@SqlUpdate("UPDATE campaign SET name = :name, brand_id = :brand_id WHERE id = :id")
	void updateCampaign( @Bind("id") String id, @Bind("name") String name, @Bind("brand_id") long brand_id );
	
	//CampaignHasKeyword
	
	@SqlQuery("select * from campaign_has_keyword")
	@Mapper(CampaignHasKeywordMapper.class)
	public List<CampaignHasKeyword> getCampaignHasKeywordList();
	
	//Competitor
	
	@SqlQuery("select * from competitor")
	@Mapper(CompetitorMapper.class)
	public List<Competitor> getCompetitorList();
	
}
