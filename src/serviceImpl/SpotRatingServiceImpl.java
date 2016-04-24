package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.SpotRatingDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.SpotRating;
import entity.SpotRatingExample;
import entity.Userinfo;
import service.AdmininfoService;
import service.SpotRatingService;
import service.SpotService;
import service.UserinfoService;

@Service
public class SpotRatingServiceImpl implements SpotRatingService{
	@Autowired
	private SpotRatingDAO SpotRatingDAO;

	@Override
	public int insert(SpotRating record) {
		// TODO Auto-generated method stub
		return SpotRatingDAO.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return SpotRatingDAO.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(SpotRating record) {
		// TODO Auto-generated method stub
		return SpotRatingDAO.updateByPrimaryKey(record);
	}

	@Override
	public List<SpotRating> selectByExample(SpotRatingExample example) {
		// TODO Auto-generated method stub
		return SpotRatingDAO.selectByExample(example);
	}

	@Override
	public SpotRating selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return SpotRatingDAO.selectByPrimaryKey(id);
	}

	@Override
	public List<SpotRating> selectByExampleWithBLOBs(SpotRatingExample example) {
		// TODO Auto-generated method stub
		return SpotRatingDAO.selectByExampleWithBLOBs(example);
	}

	
	
}
