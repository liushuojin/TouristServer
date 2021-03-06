package entity;

import entity.Route;
import entity.RouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int countByExample(RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int deleteByExample(RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int insert(Route record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int insertSelective(Route record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    List<Route> selectByExampleWithBLOBs(RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    List<Route> selectByExample(RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    Route selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int updateByExampleSelective(@Param("record") Route record, @Param("example") RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") Route record, @Param("example") RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int updateByExample(@Param("record") Route record, @Param("example") RouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int updateByPrimaryKeySelective(Route record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(Route record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbggenerated Tue Apr 05 23:24:41 CST 2016
     */
    int updateByPrimaryKey(Route record);
}