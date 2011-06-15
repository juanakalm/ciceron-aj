package es.ise.ciceron.mapper;

import es.ise.ciceron.model.AccesoContratos;
import es.ise.ciceron.model.AccesoContratosExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface AccesoContratosMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int countByExample(AccesoContratosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int deleteByExample(AccesoContratosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int insert(AccesoContratos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int insertSelective(AccesoContratos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    List<AccesoContratos> selectByExample(AccesoContratosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    AccesoContratos selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByExampleSelective(@Param("record") AccesoContratos record, @Param("example") AccesoContratosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByExample(@Param("record") AccesoContratos record, @Param("example") AccesoContratosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByPrimaryKeySelective(AccesoContratos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCESOS_CONTRATOS
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int updateByPrimaryKey(AccesoContratos record);
}