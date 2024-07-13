package Model;

public class Persona {
    private int id_persona;
    private String codigo;
    private String nombres;
    private String apellidos;
    private String direccion;
    private int telefono;
    private String correo;

    public Persona() {
        this.id_persona = 0;
        this.codigo = "";
        this.nombres = "";
        this.apellidos = "";
        this.direccion = "";
        this.telefono = 0;
        this.correo = "";
    }

    public Persona(int id_persona, String codigo, String nombres, String apellidos, String direccion, int telefono, String correo) {
        this.id_persona = id_persona;
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
