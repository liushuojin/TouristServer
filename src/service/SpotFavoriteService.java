package service;

import java.util.List;

import entity.Spot;
import entity.SpotExample;
import entity.SpotFavorite;
import entity.SpotFavoriteExample;
import entity.Userinfo;

public interface SpotFavoriteService {
	int insert(SpotFavorite record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(SpotFavorite record);
	List<SpotFavorite> selectByExample(SpotFavoriteExample example);
	SpotFavorite selectByPrimaryKey(Integer id);
}
