
package Controller;

import Config.Conexion;
import Model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CtrCategoria {
    
    public  Connection cn = Conexion.Conectar();
    
    public boolean Guardar(Categoria cat) {
        boolean res =  false;
        try {
            PreparedStatement st = cn.prepareStatement("insert into categoria"
                    + "(descripcion, estado) values(?,?)");
            st.setString(1, cat.getDescripcion());
            st.setInt(2, cat.getEstado());
            
            if (st.executeUpdate()>0) {
                res=true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al guardar categorias: "+ e);
        }
        
        return res;
    }
    
    public List<Categoria> listarCategoria() {
        List<Categoria> categoria= new ArrayList<>();
        
        String sql = "select * from categoria";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setId_categoria(rs.getInt("id_categoria"));
                cat.setDescripcion(rs.getString("descripcion"));
                cat.setEstado(rs.getInt("estado"));
                categoria.add(cat);
            }
        } catch (SQLException e) {
            System.out.println("Error: al consultar categorias: "+ e);
        }
        
        return categoria;
    }
    
    
    //Eliminar
    public boolean  Eliminar(int id){
        boolean res=false;
        try {
            PreparedStatement st = cn.prepareStatement("delete from categoria where id_categoria=?");
            st.setInt(1, id);
            if (st.executeUpdate()>0) {
                res=true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al eliminar categoria: "+ e);
        }
        return res;
    }
    
    public boolean Actualizar(Categoria cat){
        boolean res = false;
        System.out.println("Data: "+ cat.getDescripcion() + "-"+ cat.getEstado() + " - "+cat.getId_categoria());
            
        try {
            
            PreparedStatement st = cn.prepareStatement("update categoria set  descripcion=?, estado=? where id_categoria=?");
            st.setString(1, cat.getDescripcion());
            st.setInt(2, cat.getEstado());
            st.setInt(3, cat.getId_categoria());
            if (st.executeUpdate()>0) {
                res=true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al actualizar categoria: "+ e);
        }
        
        return res;
    }
    
}
