package dao;

import java.util.List;

import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.SpotFavorite;
import entity.SpotFavoriteExample;
import entity.Userinfo;
import entity.UserinfoExample;

public interface SpotFavoriteDAO {	
	int insert(SpotFavorite record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(SpotFavorite record);
	List<SpotFavorite> selectByExample(SpotFavoriteExample example);
	SpotFavorite selectByPrimaryKey(Integer id);
}
