package dao;

import java.util.List;

import entity.Admininfo;
import entity.Userinfo;
import entity.UserinfoExample;

public interface UserinfoDAO {
	List<Userinfo> selectByExample();
	int insert(Userinfo record);
	List<Userinfo> selectByExample(UserinfoExample example);
	int changeUserinfo(Userinfo record, UserinfoExample example);
}
