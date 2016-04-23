package entity;

import entity.SpotRating;
import entity.SpotRatingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpotRatingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int countByExample(SpotRatingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int deleteByExample(SpotRatingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int insert(SpotRating record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int insertSelective(SpotRating record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    List<SpotRating> selectByExampleWithBLOBs(SpotRatingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    List<SpotRating> selectByExample(SpotRatingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    SpotRating selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int updateByExampleSelective(@Param("record") SpotRating record, @Param("example") SpotRatingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") SpotRating record, @Param("example") SpotRatingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int updateByExample(@Param("record") SpotRating record, @Param("example") SpotRatingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int updateByPrimaryKeySelective(SpotRating record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(SpotRating record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_rating
     *
     * @mbggenerated Sun Apr 24 02:08:19 CST 2016
     */
    int updateByPrimaryKey(SpotRating record);
}