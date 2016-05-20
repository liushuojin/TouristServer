package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdmininfoDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.Userinfo;
import entity.UserinfoExample;
import service.AdmininfoService;
import service.UserinfoService;

@Service
public class UserinfoServiceImpl implements UserinfoService{
	@Autowired
	private UserinfoDAO userinfoDAO;
	
	@Override
	public List<Userinfo> getUserinfos() {
		return userinfoDAO.selectByExample();
	}

	@Override
	public int insert(Userinfo record) {
		record.setStatus(1);
		return userinfoDAO.insert(record);
	}

	@Override
	public List<Userinfo> selectByExample(UserinfoExample example) {
		return userinfoDAO.selectByExample(example);
	}

	@Override
	public int changeUserinfo(Userinfo record, UserinfoExample example) {
		// TODO Auto-generated method stub
		return userinfoDAO.changeUserinfo(record, example);
	}
	
}
