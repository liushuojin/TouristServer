package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdmininfoDAO;
import entity.Admininfo;
import service.AdmininfoService;

@Service
public class AdmininfoServiceImpl implements AdmininfoService{
	@Autowired
	private AdmininfoDAO admininfoDAO;
	//private AdmininfoDAO 
	@Override
	public boolean isAdmin(String name, String password) {
		Admininfo admininfo = new Admininfo();
		admininfo.setName(name);
		admininfo.setPassword(password);
		return admininfoDAO.countByExample(admininfo) > 0;
	}
	
}
