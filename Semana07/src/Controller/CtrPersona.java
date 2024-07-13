package Controller;

//Neftali -3 puntos

import Config.Conexion;
import Model.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CtrPersona {
    
    public Connection cn = Conexion.Conectar();
    
    public boolean Guardar(Persona per){
        boolean res=false;
        try {
            PreparedStatement st = cn.prepareStatement("INSERT INTO persona (codigo, nombres, apellidos, direccion, telefono, correo)VALUES(?, ?, ?, ?, ?, ?)");
            st.setString(1, per.getCodigo());
            st.setString(2, per.getNombres());
            st.setString(3, per.getApellidos());
            st.setString(4, per.getDireccion());
            st.setInt(5, per.getTelefono());
            st.setString(6, per.getCorreo());
            
            if (st.executeUpdate()>0) {
                res=true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error: al guardar persona: "+ e);
        }
        
        return res;
    }
    
    public List<Persona> listarPersona() {
        List<Persona> persona = new ArrayList<>();
        String sql = "select * from persona";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Persona per = new Persona();
                per.setId_persona(rs.getInt("id_persona"));
                per.setCodigo(rs.getString("codigo"));
                per.setNombres(rs.getString("nombres"));
                per.setApellidos(rs.getString("apellidos"));
                per.setDireccion(rs.getString("direccion"));
                per.setTelefono(rs.getInt("telefono"));
                per.setCorreo(rs.getString("correo"));
                persona.add(per);
            }
        } catch (SQLException e) {
            System.out.println("Erro: al consultar persona. " + e);
        }
        
        return persona;
    }
    
    
    public boolean eliminar(int id) {
        boolean res = false;
        try {
            PreparedStatement st = cn.prepareStatement("delete from persona where id_persona=?");
            st.setInt(1, id);
            if (st.executeUpdate()>0) {
                res =true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al eliminar persona. " + e);
        }
        return res;
    }
    
    public boolean actualizar(Persona per) {
        boolean res = false;
        try {
            PreparedStatement st = cn.prepareStatement("update persona set codigo=?, nombres=?, apellidos=?, direccion=?, telefono=?, correo=? where id_persona=?");
            st.setString(1, per.getCodigo());
            st.setString(2, per.getNombres());
            st.setString(3, per.getApellidos());
            st.setString(4, per.getDireccion());
            st.setInt(5, per.getTelefono());
            st.setString(6, per.getCorreo());
            st.setInt(7, per.getId_persona());
            if (st.executeUpdate()>0) {
                res=true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al actualizar persona. " + e);
        }
        
        return res;
    }
    
    
}
