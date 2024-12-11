package modelo;

/**
 *
 * @author Asus
 */
public class Usuario {
    
    private int idUsuario;
    private String usuario;
    private String contraseña;
    private String estado;
    
    //Constructor 
    public Usuario(){
        this.idUsuario =0;
        this.usuario = "";
        this.contraseña = "";
        this.estado = "";
    }
    
    //Setters y Getters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //toString

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", estado=" + estado + '}';
    }
    
}
