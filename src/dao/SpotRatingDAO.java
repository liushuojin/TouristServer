package dao;

import java.util.List;

import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.SpotRating;
import entity.SpotRatingExample;
import entity.Userinfo;
import entity.UserinfoExample;

public interface SpotRatingDAO {	
	int insert(SpotRating record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(SpotRating record);
	List<SpotRating> selectByExample(SpotRatingExample example);
	SpotRating selectByPrimaryKey(Integer id);
	List<SpotRating> selectByExampleWithBLOBs(SpotRatingExample example);
}
