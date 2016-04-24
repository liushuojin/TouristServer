package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.RouteFavoriteDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.AdmininfoExample;
import entity.AdmininfoMapper;
import entity.Spot;
import entity.SpotExample;
import entity.RouteFavorite;
import entity.RouteFavoriteExample;
import entity.RouteFavoriteMapper;
import entity.SpotMapper;
import entity.Userinfo;
import entity.UserinfoExample;
import entity.UserinfoMapper;

@Repository
public class RouteFavoriteDAOImpl implements RouteFavoriteDAO {
	@Autowired
	private RouteFavoriteMapper RouteFavoriteMapper;

	@Override
	public int insert(RouteFavorite record) {
		// TODO Auto-generated method stub
		return RouteFavoriteMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return RouteFavoriteMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(RouteFavorite record) {
		// TODO Auto-generated method stub
		return RouteFavoriteMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<RouteFavorite> selectByExample(RouteFavoriteExample example) {
		// TODO Auto-generated method stub
		return RouteFavoriteMapper.selectByExample(example);
	}

	@Override
	public RouteFavorite selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return RouteFavoriteMapper.selectByPrimaryKey(id);
	}
	
}
