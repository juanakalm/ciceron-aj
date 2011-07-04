package es.ise.ciceron.mapper;

import es.ise.ciceron.model.Punto;
import es.ise.ciceron.model.PuntoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface PuntoMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int countByExample(PuntoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int deleteByExample(PuntoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int insert(Punto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int insertSelective(Punto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    List<Punto> selectByExample(PuntoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    Punto selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByExampleSelective(@Param("record") Punto record, @Param("example") PuntoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByExample(@Param("record") Punto record, @Param("example") PuntoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByPrimaryKeySelective(Punto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_PUNTOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByPrimaryKey(Punto record);
}