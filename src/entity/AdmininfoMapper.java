package entity;

import entity.Admininfo;
import entity.AdmininfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmininfoMapper {
    
    int countByExample(AdmininfoExample example);
    
    List<Admininfo> selectByExample(AdmininfoExample example);

    Admininfo selectByPrimaryKey(Integer id);

}