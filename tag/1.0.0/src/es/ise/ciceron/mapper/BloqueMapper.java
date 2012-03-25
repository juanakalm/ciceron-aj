package es.ise.ciceron.mapper;

import es.ise.ciceron.model.Bloque;
import es.ise.ciceron.model.BloqueExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface BloqueMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int countByExample(BloqueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int deleteByExample(BloqueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int insert(Bloque record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int insertSelective(Bloque record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    List<Bloque> selectByExample(BloqueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    Bloque selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByExampleSelective(@Param("record") Bloque record, @Param("example") BloqueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByExample(@Param("record") Bloque record, @Param("example") BloqueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByPrimaryKeySelective(Bloque record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_BLOQUES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByPrimaryKey(Bloque record);
}