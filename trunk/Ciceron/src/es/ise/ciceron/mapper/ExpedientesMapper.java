package es.ise.ciceron.mapper;

import es.ise.ciceron.model.Expedientes;
import es.ise.ciceron.model.ExpedientesExample;
import java.math.BigDecimal;
import java.util.List;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface ExpedientesMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPEDIENTES
     *
     * @mbggenerated Fri Jun 17 11:53:43 CEST 2011
     */
    int countByExample(ExpedientesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPEDIENTES
     *
     * @mbggenerated Fri Jun 17 11:53:43 CEST 2011
     */
    List<Expedientes> selectByExample(ExpedientesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXPEDIENTES
     *
     * @mbggenerated Fri Jun 17 11:53:43 CEST 2011
     */
    Expedientes selectByPrimaryKey(BigDecimal expId);
}