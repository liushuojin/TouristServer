package service;

import java.util.List;

import entity.Spot;
import entity.SpotExample;
import entity.Userinfo;

public interface SpotService {
	int addSpot(String name, String pic, String trans, String intro);
	int delSpot(Integer id);
	int updateSpot(Integer id, String name, String pic, String trans, String intro);
	List<Spot> getSpots();//返回全部
	List<Spot> findSpots(String nameSection);//返回查询部分
	Spot findSpot(Integer id);
	List<Spot> selectByExample(SpotExample example);//返回全部或查询部分
}
