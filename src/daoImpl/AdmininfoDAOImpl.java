package daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.AdmininfoDAO;
import entity.Admininfo;
import entity.AdmininfoExample;
import entity.AdmininfoMapper;

@Repository
public class AdmininfoDAOImpl implements AdmininfoDAO {
	@Autowired
	private AdmininfoMapper admininfoMapper;
	
	public int countByExample(Admininfo admininfo) {
		AdmininfoExample example = new AdmininfoExample();
		example.createCriteria().andNameEqualTo(admininfo.getName()).andPasswordEqualTo(admininfo.getPassword());		
		return admininfoMapper.countByExample(example);
	}
}
