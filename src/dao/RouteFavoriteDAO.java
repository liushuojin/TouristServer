package dao;

import java.util.List;

import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.RouteFavorite;
import entity.RouteFavoriteExample;
import entity.Userinfo;
import entity.UserinfoExample;

public interface RouteFavoriteDAO {	
	int insert(RouteFavorite record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(RouteFavorite record);
	List<RouteFavorite> selectByExample(RouteFavoriteExample example);
	RouteFavorite selectByPrimaryKey(Integer id);
}
