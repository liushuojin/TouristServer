package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.SpotFavoriteDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.SpotFavorite;
import entity.SpotFavoriteExample;
import entity.Userinfo;
import service.AdmininfoService;
import service.SpotFavoriteService;
import service.SpotService;
import service.UserinfoService;

@Service
public class SpotFavoriteServiceImpl implements SpotFavoriteService{
	@Autowired
	private SpotFavoriteDAO spotFavoriteDAO;

	@Override
	public int insert(SpotFavorite record) {
		// TODO Auto-generated method stub
		return spotFavoriteDAO.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return spotFavoriteDAO.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(SpotFavorite record) {
		// TODO Auto-generated method stub
		return spotFavoriteDAO.updateByPrimaryKey(record);
	}

	@Override
	public List<SpotFavorite> selectByExample(SpotFavoriteExample example) {
		// TODO Auto-generated method stub
		return spotFavoriteDAO.selectByExample(example);
	}

	@Override
	public SpotFavorite selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return spotFavoriteDAO.selectByPrimaryKey(id);
	}

	
	
}
