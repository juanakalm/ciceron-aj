package es.ise.ciceron.mapper;

import es.ise.ciceron.model.MenusUsuario;
import es.ise.ciceron.model.MenusUsuarioExample;
import java.util.List;
import org.mybatis.spring.annotation.Mapper;

@Mapper
public interface MenusUsuarioMapper extends CiceronMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS_USUARIO_V
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    int countByExample(MenusUsuarioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AJ_MENUS_USUARIO_V
     *
     * @mbggenerated Thu Jun 09 13:50:46 CEST 2011
     */
    List<MenusUsuario> selectByExample(MenusUsuarioExample example);
}