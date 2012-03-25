package es.ise.ciceron.mapper;

import es.ise.ciceron.model.InformeJuridicoModificado;
import es.ise.ciceron.model.InformeJuridicoModificadoExample;
import java.util.List;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface InformeJuridicoModificadoMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORME_AJ_MOD_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int countByExample(InformeJuridicoModificadoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INFORME_AJ_MOD_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    List<InformeJuridicoModificado> selectByExample(InformeJuridicoModificadoExample example);
}