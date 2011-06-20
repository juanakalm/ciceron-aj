package es.ise.ciceron.mapper;

import es.ise.ciceron.model.Documentos;
import es.ise.ciceron.model.DocumentosExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface DocumentosMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int countByExample(DocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int deleteByExample(DocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int insert(Documentos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int insertSelective(Documentos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    List<Documentos> selectByExampleWithBLOBs(DocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    List<Documentos> selectByExample(DocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    Documentos selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int updateByExampleSelective(@Param("record") Documentos record, @Param("example") DocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int updateByExampleWithBLOBs(@Param("record") Documentos record, @Param("example") DocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int updateByExample(@Param("record") Documentos record, @Param("example") DocumentosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int updateByPrimaryKeySelective(Documentos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int updateByPrimaryKeyWithBLOBs(Documentos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ISE_DOCUMENTOS
     *
     * @mbggenerated Thu Jun 16 14:02:20 CEST 2011
     */
    int updateByPrimaryKey(Documentos record);
}