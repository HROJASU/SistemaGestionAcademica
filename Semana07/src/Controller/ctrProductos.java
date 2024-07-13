
package Controller;

import Config.Conexion;
import Model.Productos;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class ctrProductos {
    
    public Connection cn = Conexion.Conectar();
    
    //Guardar
    public boolean Guardar(Productos prod){
        boolean res = false;
        try {
            PreparedStatement st = cn.prepareStatement("INSERT INTO productos (codigo, descripcion, cantidad, marca, modelo, precio, stock, estado, id_categoria) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, prod.getCodigo());
            st.setString(2, prod.getDescripcion());
            st.setInt(3, prod.getCantidad());
            st.setString(4, prod.getMarca());
            st.setString(5, prod.getModelo());
            st.setDouble(6, prod.getPrecio());
            st.setInt(7, prod.getStock());
            st.setInt(8, prod.getEstado());
            st.setInt(9, prod.getId_categoria());
            if (st.executeUpdate()>0) {
                res=true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al guardar producto:" + e);
        }
        return res;
    }
    
    //Listar
    public List<Productos> listarProductos(){
        List<Productos> product= new ArrayList<>();
        String sql = "select * from productos";
        try {
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                Productos prod = new Productos();
                prod.setId_producto(res.getInt("id_productos"));
                prod.setCodigo(res.getString("codigo"));
                prod.setDescripcion(res.getString("descripcion"));
                prod.setCantidad(res.getInt("cantidad"));
                prod.setMarca(res.getString("marca"));
                prod.setModelo(res.getString("modelo"));
                prod.setPrecio(res.getDouble("precio"));
                prod.setStock(res.getInt("stock"));
                prod.setEstado(res.getInt("estado"));
                prod.setId_categoria(res.getInt("id_categoria"));
                product.add(prod);
            }
        } catch (SQLException e) {
            System.out.println("Error: al consultar producto:" + e);
        }
        return product;
    }
    
    //Actualizar
    
    public boolean Actualizar(Productos prod){
        boolean res = false;
        try {
            PreparedStatement st = cn.prepareStatement("update productos set codigo=?, descripcion=?, cantidad=?, marca=?, modelo=?, precio=?, stock=?, estado=?, id_categoria=? where id_productos=?");
            st.setString(1, prod.getCodigo());
            st.setString(2, prod.getDescripcion());
            st.setInt(3, prod.getCantidad());
            st.setString(4, prod.getMarca());
            st.setString(5, prod.getModelo());
            st.setDouble(6, prod.getPrecio());
            st.setInt(7, prod.getStock());
            st.setInt(8, prod.getEstado());
            st.setInt(9, prod.getId_categoria());
            st.setInt(10, prod.getId_producto());
            if (st.executeUpdate()>0) {
                res= true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al actualizar producto:" + e);
        }
        return res;
    }
    
    //Eliminar
    
    public boolean  Eliminar(int id){
        boolean res = false;
        try {
            PreparedStatement st = cn.prepareStatement("delete from productos where id_productos=?");
            st.setInt(1, id);
            if (st.executeUpdate()>0) {
                res=true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al Eliminar producto:" + e);
        }
        return res;
    }
    
    //Codigo Producto Existe
    public boolean Existe(String codigo){
        boolean res= false;
        String sql="select * from productos where codigo="+codigo+"";
        try {
            Statement st = cn.createStatement();
            ResultSet rest = st.executeQuery(sql);
            while (rest.next()) {
                res = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: al consultar producto existente:" + e);
        }
        return res;
    }
    
    
    
    
    
    
}
