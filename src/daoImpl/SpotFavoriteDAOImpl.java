package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.SpotFavoriteDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.AdmininfoExample;
import entity.AdmininfoMapper;
import entity.Spot;
import entity.SpotExample;
import entity.SpotFavorite;
import entity.SpotFavoriteExample;
import entity.SpotFavoriteMapper;
import entity.SpotMapper;
import entity.Userinfo;
import entity.UserinfoExample;
import entity.UserinfoMapper;

@Repository
public class SpotFavoriteDAOImpl implements SpotFavoriteDAO {
	@Autowired
	private SpotFavoriteMapper spotFavoriteMapper;

	@Override
	public int insert(SpotFavorite record) {
		// TODO Auto-generated method stub
		return spotFavoriteMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return spotFavoriteMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(SpotFavorite record) {
		// TODO Auto-generated method stub
		return spotFavoriteMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<SpotFavorite> selectByExample(SpotFavoriteExample example) {
		// TODO Auto-generated method stub
		return spotFavoriteMapper.selectByExample(example);
	}

	@Override
	public SpotFavorite selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return spotFavoriteMapper.selectByPrimaryKey(id);
	}
	
}
