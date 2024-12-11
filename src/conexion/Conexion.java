package conexion;

import java.sql.*;

public class Conexion {
    public static Connection conectar() {
        try {
            // Intenta conectar a MySQL
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_parqueadero", "root", "");
            System.out.println("Conexión exitosa a MySQL");
            return cn;
        } catch (SQLException e) {
            // Simulación de base de datos
            System.out.println("Error en la conexión a MySQL: " + e);
            System.out.println("Simulando conexión...");
            return null; // Retornar null para indicar fallo
        }
    }
}
