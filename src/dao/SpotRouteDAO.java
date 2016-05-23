package dao;

import java.util.List;

import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.SpotRoute;
import entity.SpotRouteExample;
import entity.Userinfo;
import entity.UserinfoExample;

public interface SpotRouteDAO {	
	int insert(SpotRoute record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(SpotRoute record);
	List<SpotRoute> selectByExample(SpotRouteExample example);
	SpotRoute selectByPrimaryKey(Integer id);
}
