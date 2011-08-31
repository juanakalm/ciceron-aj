package es.ise.ciceron.mapper;

import es.ise.ciceron.model.Solicitudes;
import es.ise.ciceron.model.SolicitudesExample;
import java.math.BigDecimal;
import java.util.List;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface SolicitudesMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int countByExample(SolicitudesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    List<Solicitudes> selectByExample(SolicitudesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONTA.SOLICITUDES
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    Solicitudes selectByPrimaryKey(BigDecimal id);
}