package es.ise.ciceron.mapper;

import es.ise.ciceron.model.DocumentosES;
import es.ise.ciceron.model.DocumentosESExample;
import java.util.List;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface DocumentosESMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_ESDOCUMENTOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int countByExample(DocumentosESExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_ESDOCUMENTOS_V
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    List<DocumentosES> selectByExample(DocumentosESExample example);
}