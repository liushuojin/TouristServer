package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.RouteRatingDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.AdmininfoExample;
import entity.AdmininfoMapper;
import entity.Spot;
import entity.SpotExample;
import entity.RouteRating;
import entity.RouteRatingExample;
import entity.RouteRatingMapper;
import entity.SpotMapper;
import entity.Userinfo;
import entity.UserinfoExample;
import entity.UserinfoMapper;

@Repository
public class RouteRatingDAOImpl implements RouteRatingDAO {
	@Autowired
	private RouteRatingMapper RouteRatingMapper;

	@Override
	public int insert(RouteRating record) {
		// TODO Auto-generated method stub
		return RouteRatingMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return RouteRatingMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(RouteRating record) {
		// TODO Auto-generated method stub
		return RouteRatingMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<RouteRating> selectByExample(RouteRatingExample example) {
		// TODO Auto-generated method stub
		return RouteRatingMapper.selectByExample(example);
	}

	@Override
	public RouteRating selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return RouteRatingMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<RouteRating> selectByExampleWithBLOBs(RouteRatingExample example) {
		// TODO Auto-generated method stub
		return RouteRatingMapper.selectByExampleWithBLOBs(example);
	}
	
}
