package dao;

import java.util.List;

import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.Userinfo;
import entity.UserinfoExample;

public interface SpotDAO {
	int insert(Spot record);
	int deleteByPrimaryKey(Integer id);
	int updateByPrimaryKey(Spot record);
	List<Spot> selectByExample(SpotExample example);//����ȫ�����ѯ����
	Spot selectByPrimaryKey(Integer id);
}
