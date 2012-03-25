package es.ise.ciceron.mapper;

import es.ise.ciceron.model.Observaciones;
import es.ise.ciceron.model.ObservacionesExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface ObservacionesMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int countByExample(ObservacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int deleteByExample(ObservacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int insert(Observaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int insertSelective(Observaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    List<Observaciones> selectByExample(ObservacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    Observaciones selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int updateByExampleSelective(@Param("record") Observaciones record, @Param("example") ObservacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int updateByExample(@Param("record") Observaciones record, @Param("example") ObservacionesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int updateByPrimaryKeySelective(Observaciones record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_OBSERVACIONES
     *
     * @mbggenerated Fri Aug 26 10:50:15 CEST 2011
     */
    int updateByPrimaryKey(Observaciones record);
}