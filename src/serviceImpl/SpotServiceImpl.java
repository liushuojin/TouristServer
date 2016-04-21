package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.Spot;
import entity.SpotExample;
import entity.Userinfo;
import service.AdmininfoService;
import service.SpotService;
import service.UserinfoService;

@Service
public class SpotServiceImpl implements SpotService{
	@Autowired
	private SpotDAO spotDAO;

	@Override
	public int addSpot(String name, String pic, String trans,
			String intro) {
		return spotDAO.insert(new Spot(name, pic, trans, intro));
	}

	@Override
	public int delSpot(Integer id) {
		return spotDAO.deleteByPrimaryKey(id);
	}

	@Override
	public int updateSpot(Integer id, String name, String pic, String trans,
			String intro) {
		return spotDAO.updateByPrimaryKey(new Spot(id, name, pic, trans, intro));
	}

	@Override
	public List<Spot> getSpots() {
		return spotDAO.selectByExample(new SpotExample());
	}

	@Override
	public List<Spot> findSpots(String nameSection) {
		SpotExample spotExample = new SpotExample();
		spotExample.createCriteria().andNameLike("%" + nameSection + "%");
		return spotDAO.selectByExample(spotExample);
	}

	@Override
	public Spot findSpot(Integer id) {
		return spotDAO.selectByPrimaryKey(id);
	}

	@Override
	public List<Spot> selectByExample(SpotExample example) {
		return spotDAO.selectByExample(example);
	}
	
	
}
