package es.ise.ciceron.mapper;

import es.ise.ciceron.model.Menu;
import es.ise.ciceron.model.MenuExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface MenuMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int countByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int deleteByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int insert(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int insertSelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    Menu selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByPrimaryKey(Menu record);
}