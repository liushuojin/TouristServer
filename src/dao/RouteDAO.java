package dao;

import java.util.List;

import entity.Admininfo;
import entity.Route;
import entity.RouteExample;
import entity.Userinfo;
import entity.UserinfoExample;

public interface RouteDAO {
	int insert(Route record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(Route record);
	List<Route> selectByExample(RouteExample example);//返回全部或查询部分
	Route selectByPrimaryKey(Integer id);
	List<Route> selectByExample2(RouteExample example);
}
