package service;

import java.util.List;

import entity.Spot;
import entity.SpotExample;
import entity.Userinfo;

public interface SpotService {
	int addSpot(String name, String pic, String trans, String intro);
	int delSpot(Integer id);
	int updateSpot(Integer id, String name, String pic, String trans, String intro);
	List<Spot> getSpots();//����ȫ��
	List<Spot> findSpots(String nameSection);//���ز�ѯ����
	Spot findSpot(Integer id);
	List<Spot> selectByExample(SpotExample example);//����ȫ�����ѯ����
}
