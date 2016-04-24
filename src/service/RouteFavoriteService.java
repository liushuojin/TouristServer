package service;

import java.util.List;

import entity.Spot;
import entity.SpotExample;
import entity.RouteFavorite;
import entity.RouteFavoriteExample;
import entity.Userinfo;

public interface RouteFavoriteService {
	int insert(RouteFavorite record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(RouteFavorite record);
	List<RouteFavorite> selectByExample(RouteFavoriteExample example);
	RouteFavorite selectByPrimaryKey(Integer id);
}
