package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.AdmininfoDAO;
import dao.SpotDAO;
import dao.UserinfoDAO;
import entity.Admininfo;
import entity.AdmininfoExample;
import entity.AdmininfoMapper;
import entity.Spot;
import entity.SpotExample;
import entity.SpotMapper;
import entity.Userinfo;
import entity.UserinfoExample;
import entity.UserinfoMapper;

@Repository
public class SpotDAOImpl implements SpotDAO {
	@Autowired
	private SpotMapper spotMapper;

	@Override
	public int insert(Spot record) {
		return spotMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return spotMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Spot record) {
		System.out.println("dao" + record.getIntro());
		return spotMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Spot> selectByExample(SpotExample example) {
		return spotMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public Spot selectByPrimaryKey(Integer id) {
		return spotMapper.selectByPrimaryKey(id);
	}
	
}
