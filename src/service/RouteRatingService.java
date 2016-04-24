package service;

import java.util.List;

import entity.Spot;
import entity.SpotExample;
import entity.RouteRating;
import entity.RouteRatingExample;
import entity.Userinfo;

public interface RouteRatingService {
	int insert(RouteRating record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(RouteRating record);
	List<RouteRating> selectByExample(RouteRatingExample example);
	RouteRating selectByPrimaryKey(Integer id);
	List<RouteRating> selectByExampleWithBLOBs(RouteRatingExample example);
}
