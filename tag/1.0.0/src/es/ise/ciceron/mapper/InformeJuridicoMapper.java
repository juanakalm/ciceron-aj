package es.ise.ciceron.mapper;

import es.ise.ciceron.model.InformeJuridico;
import es.ise.ciceron.model.InformeJuridicoExample;
import java.util.List;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface InformeJuridicoMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORME_AJ_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int countByExample(InformeJuridicoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORME_AJ_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    List<InformeJuridico> selectByExample(InformeJuridicoExample example);
}