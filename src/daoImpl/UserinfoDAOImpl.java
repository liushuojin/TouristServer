package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.AdmininfoDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.AdmininfoExample;
import entity.AdmininfoMapper;
import entity.Userinfo;
import entity.UserinfoExample;
import entity.UserinfoMapper;

@Repository
public class UserinfoDAOImpl implements UserinfoDAO {
	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Override
	public List<Userinfo> selectByExample() {
		UserinfoExample example = new UserinfoExample();
		// TODO Auto-generated method stub
		return userinfoMapper.selectByExample(example);
	}

	@Override
	public int insert(Userinfo record) {
		return userinfoMapper.insert(record);
	}

	@Override
	public List<Userinfo> selectByExample(UserinfoExample example) {
		return userinfoMapper.selectByExample(example);
	}
}
