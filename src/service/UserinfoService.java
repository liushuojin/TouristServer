package service;

import java.util.List;

import entity.Userinfo;
import entity.UserinfoExample;

public interface UserinfoService {
	List<Userinfo> getUserinfos();
	int insert(Userinfo record);
	List<Userinfo> selectByExample(UserinfoExample example);
}
