package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.AdmininfoDAO;
import dao.RouteDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.AdmininfoExample;
import entity.AdmininfoMapper;
import entity.Route;
import entity.RouteExample;
import entity.RouteMapper;
import entity.Userinfo;
import entity.UserinfoExample;
import entity.UserinfoMapper;

@Repository
public class RouteDAOImpl implements RouteDAO {
	@Autowired
	private RouteMapper RouteMapper;

	@Override
	public int insert(Route record) {
		return RouteMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return RouteMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Route record) {
		System.out.println("dao" + record.getIntro());
		return RouteMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Route> selectByExample(RouteExample example) {
		return RouteMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public Route selectByPrimaryKey(Integer id) {
		return RouteMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Route> selectByExample2(RouteExample example) {
		return RouteMapper.selectByExample(example);
	}
	
}
