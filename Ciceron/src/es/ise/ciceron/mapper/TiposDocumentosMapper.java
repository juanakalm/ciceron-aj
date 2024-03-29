package es.ise.ciceron.mapper;

import es.ise.ciceron.model.TiposDocumentos;
import es.ise.ciceron.model.TiposDocumentosExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface TiposDocumentosMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int countByExample(TiposDocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int deleteByExample(TiposDocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int insert(TiposDocumentos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int insertSelective(TiposDocumentos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    List<TiposDocumentos> selectByExample(TiposDocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    TiposDocumentos selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByExampleSelective(@Param("record") TiposDocumentos record, @Param("example") TiposDocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByExample(@Param("record") TiposDocumentos record, @Param("example") TiposDocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByPrimaryKeySelective(TiposDocumentos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_TIPO_DOCUMENTOS
     *
     * @mbggenerated Wed Aug 24 09:41:32 CEST 2011
     */
    int updateByPrimaryKey(TiposDocumentos record);
}