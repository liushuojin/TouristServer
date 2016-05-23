package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.SpotRouteDAO;
import entity.SpotRoute;
import entity.SpotRouteExample;
import entity.SpotRouteMapper;

@Repository
public class SpotRouteDAOImpl implements SpotRouteDAO {
	@Autowired
	private SpotRouteMapper SpotRouteMapper;

	@Override
	public int insert(SpotRoute record) {
		// TODO Auto-generated method stub
		return SpotRouteMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return SpotRouteMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(SpotRoute record) {
		// TODO Auto-generated method stub
		return SpotRouteMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<SpotRoute> selectByExample(SpotRouteExample example) {
		// TODO Auto-generated method stub
		return SpotRouteMapper.selectByExample(example);
	}

	@Override
	public SpotRoute selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return SpotRouteMapper.selectByPrimaryKey(id);
	}
	
}
