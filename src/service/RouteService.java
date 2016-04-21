package service;

import java.util.List;

import entity.Route;
import entity.RouteExample;
import entity.Userinfo;

public interface RouteService {
	int addRoute(String name, String intro);
	int delRoute(Integer id);
	int updateRoute(Integer id, String name, String intro);
	List<Route> getRoutes();//返回全部
	List<Route> findRoutes(String nameSection);//返回查询部分
	Route findRoute(Integer id);
	List<Route> selectByExample(RouteExample example);
}
