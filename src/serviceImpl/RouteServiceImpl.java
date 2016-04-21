package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdmininfoDAO;
import dao.RouteDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.Route;
import entity.RouteExample;
import entity.Userinfo;
import service.AdmininfoService;
import service.RouteService;
import service.UserinfoService;

@Service
public class RouteServiceImpl implements RouteService{
	@Autowired
	private RouteDAO RouteDAO;

	@Override
	public int addRoute(String name, String intro) {
		return RouteDAO.insert(new Route(name, intro));
	}

	@Override
	public int delRoute(Integer id) {
		return RouteDAO.deleteByPrimaryKey(id);
	}

	@Override
	public int updateRoute(Integer id, String name, String intro) {
		return RouteDAO.updateByPrimaryKey(new Route(id, name, intro));
	}

	@Override
	public List<Route> getRoutes() {
		return RouteDAO.selectByExample(new RouteExample());
	}

	@Override
	public List<Route> findRoutes(String nameSection) {
		RouteExample RouteExample = new RouteExample();
		RouteExample.createCriteria().andNameLike("%" + nameSection + "%");
		return RouteDAO.selectByExample(RouteExample);
	}

	@Override
	public Route findRoute(Integer id) {
		return RouteDAO.selectByPrimaryKey(id);
	}

	@Override
	public List<Route> selectByExample(RouteExample example) {
		return RouteDAO.selectByExample(example);
	}
	
	
}
