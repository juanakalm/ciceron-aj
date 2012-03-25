package es.ise.ciceron.spring.services;

import java.math.BigDecimal;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

@Service
public class ProceduresService
{
	private SimpleJdbcCall estadoInformeCall;
	
	private SimpleJdbcCall actualizarInformeCall;
	
	private SimpleJdbcCall estadoPliegoCall;
	
	@Autowired
	public void setDataSource(DataSource dataSource)
	{
		estadoInformeCall = new SimpleJdbcCall(dataSource)
			.withCatalogName("PKG_AJ_COMPROBACIONES")
			.withFunctionName("ESTADO_INFORME")
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
					new SqlOutParameter("P_ESTADO", java.sql.Types.VARCHAR),
					new SqlParameter("P_INF_ID", java.sql.Types.INTEGER)
			);
		
		actualizarInformeCall = new SimpleJdbcCall(dataSource)
			.withProcedureName("AJ_ACTUALIZA_INFORME")
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(new SqlParameter("P_DOC_ID_N", java.sql.Types.INTEGER)
							  ,new SqlParameter("P_ESTADO_V", java.sql.Types.VARCHAR)
							  ,new SqlParameter("P_DNI_V", java.sql.Types.VARCHAR)
			);
		
		estadoPliegoCall =new SimpleJdbcCall(dataSource)
			.withCatalogName("PK_VALIDAR")
			.withFunctionName("FU_ELIMINA_VERSION_PLIEGO")
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
					new SqlOutParameter("V_L_ELIMINA", java.sql.Types.VARCHAR),
					new SqlParameter("P_VP_ID", java.sql.Types.INTEGER),
					new SqlParameter("P_US_ID", java.sql.Types.INTEGER)
			);
	}
	
	public String estadoInforme(BigDecimal idInforme)
	{
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("P_INF_ID", idInforme);
		Map<String, Object> result = estadoInformeCall.execute(params);
		return result.get("P_ESTADO").toString();
	}
	
	public void actualizaInforme(BigDecimal idDocumento, String estado, String dni){
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("P_DOC_ID_N", idDocumento);
		map.addValue("P_ESTADO_V", estado);
		map.addValue("P_DNI_V", dni);
		actualizarInformeCall.execute(map);
	}
	
	public String estadoPliego(BigDecimal idVersionesPliego, BigDecimal idUsuario)
	{
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("P_VP_ID", idVersionesPliego);
		params.addValue("P_US_ID", idUsuario);
		Map<String, Object> result = estadoPliegoCall.execute(params);
		return result.get("V_L_ELIMINA").toString();
	}
}
