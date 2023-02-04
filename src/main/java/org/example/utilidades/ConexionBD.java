package org.example.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static String url = "jdbc:mysql://localhost:3306/morfeo";
    private static String user = "root";
    private static String clave = "123456789";
    private static Connection conn;

    public static Connection abreConexion() throws SQLException {
        if(conn == null) {
            conn = DriverManager.getConnection(url, user, clave);
        }
        return conn;
    }
}