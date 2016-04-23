package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.SpotRatingDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.AdmininfoExample;
import entity.AdmininfoMapper;
import entity.Spot;
import entity.SpotExample;
import entity.SpotRating;
import entity.SpotRatingExample;
import entity.SpotRatingMapper;
import entity.SpotMapper;
import entity.Userinfo;
import entity.UserinfoExample;
import entity.UserinfoMapper;

@Repository
public class SpotRatingDAOImpl implements SpotRatingDAO {
	@Autowired
	private SpotRatingMapper SpotRatingMapper;

	@Override
	public int insert(SpotRating record) {
		// TODO Auto-generated method stub
		return SpotRatingMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return SpotRatingMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(SpotRating record) {
		// TODO Auto-generated method stub
		return SpotRatingMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<SpotRating> selectByExample(SpotRatingExample example) {
		// TODO Auto-generated method stub
		return SpotRatingMapper.selectByExample(example);
	}

	@Override
	public SpotRating selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return SpotRatingMapper.selectByPrimaryKey(id);
	}
	
}
