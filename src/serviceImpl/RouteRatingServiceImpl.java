package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.RouteRatingDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.RouteRating;
import entity.RouteRatingExample;
import entity.Userinfo;
import service.AdmininfoService;
import service.RouteRatingService;
import service.SpotService;
import service.UserinfoService;

@Service
public class RouteRatingServiceImpl implements RouteRatingService{
	@Autowired
	private RouteRatingDAO RouteRatingDAO;

	@Override
	public int insert(RouteRating record) {
		// TODO Auto-generated method stub
		return RouteRatingDAO.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return RouteRatingDAO.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(RouteRating record) {
		// TODO Auto-generated method stub
		return RouteRatingDAO.updateByPrimaryKey(record);
	}

	@Override
	public List<RouteRating> selectByExample(RouteRatingExample example) {
		// TODO Auto-generated method stub
		return RouteRatingDAO.selectByExample(example);
	}

	@Override
	public RouteRating selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return RouteRatingDAO.selectByPrimaryKey(id);
	}

	@Override
	public List<RouteRating> selectByExampleWithBLOBs(RouteRatingExample example) {
		// TODO Auto-generated method stub
		return RouteRatingDAO.selectByExampleWithBLOBs(example);
	}

	
	
}
