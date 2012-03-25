package es.ise.ciceron.mapper;

import es.ise.ciceron.model.TipoOperacion;
import es.ise.ciceron.model.TipoOperacionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface TipoOperacionMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int countByExample(TipoOperacionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int deleteByExample(TipoOperacionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int insert(TipoOperacion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int insertSelective(TipoOperacion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    List<TipoOperacion> selectByExample(TipoOperacionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    TipoOperacion selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByExampleSelective(@Param("record") TipoOperacion record, @Param("example") TipoOperacionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByExample(@Param("record") TipoOperacion record, @Param("example") TipoOperacionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByPrimaryKeySelective(TipoOperacion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_TIPOS_OPERACION
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByPrimaryKey(TipoOperacion record);
}