package controlador;

import conexion.Conexion;
import modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author katel
 */
public class UsuarioController {
    //Metodo para iniciar sesion 

    public boolean login(Usuario objeto) {
    boolean respuesta = false;
    String sql = "SELECT usuario, contraseña FROM td_usuarios WHERE usuario = ? AND contraseña = ?";
    try (Connection cn = Conexion.conectar();
         PreparedStatement pst = cn.prepareStatement(sql)) {
        pst.setString(1, objeto.getUsuario());
        pst.setString(2, objeto.getContraseña());
        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                respuesta = true;
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al iniciar sesión: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
    }
    return respuesta;
}

}
