
package Model;

public class Productos {
    private int id_producto;
    private String codigo;
    private String descripcion;
    private int cantidad;
    private String marca;
    private String modelo;
    private double precio;
    private int stock;
    private int estado;
    private int id_categoria;

    public Productos() {
        this.id_producto = 0;
        this.codigo = "";
        this.descripcion = "";
        this.cantidad = 0;
        this.marca = "";
        this.modelo = "";
        this.precio = 0.0;
        this.stock = 0;
        this.estado = 0;
        this.id_categoria = 0;
    }

    public Productos(int id_producto, String codigo, String descripcion, int cantidad, String marca, String modelo, double precio, int stock, int estado, int id_categoria) {
        this.id_producto = id_producto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
        this.id_categoria = id_categoria;
    }
    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    
    
    
}
