package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.RouteFavoriteDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.RouteFavorite;
import entity.RouteFavoriteExample;
import entity.Userinfo;
import service.AdmininfoService;
import service.RouteFavoriteService;
import service.SpotService;
import service.UserinfoService;

@Service
public class RouteFavoriteServiceImpl implements RouteFavoriteService{
	@Autowired
	private RouteFavoriteDAO RouteFavoriteDAO;

	@Override
	public int insert(RouteFavorite record) {
		// TODO Auto-generated method stub
		return RouteFavoriteDAO.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return RouteFavoriteDAO.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(RouteFavorite record) {
		// TODO Auto-generated method stub
		return RouteFavoriteDAO.updateByPrimaryKey(record);
	}

	@Override
	public List<RouteFavorite> selectByExample(RouteFavoriteExample example) {
		// TODO Auto-generated method stub
		return RouteFavoriteDAO.selectByExample(example);
	}

	@Override
	public RouteFavorite selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return RouteFavoriteDAO.selectByPrimaryKey(id);
	}

	
	
}
