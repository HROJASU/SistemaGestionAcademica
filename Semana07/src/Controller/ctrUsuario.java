package Controller;

import Config.Conexion;
import Model.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ctrUsuario {

    public Connection cn = Conexion.Conectar();

    public boolean LoginUsuario(Usuario usuario) {
        boolean res = false;
        try {
            PreparedStatement st = cn.prepareStatement("select * from usuario where usuario=? and password=?");
            st.setString(1, usuario.getUsuario());
            st.setString(2, usuario.getPassword());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                res = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al logear: " + e);
        }
        return res;
    }
}
