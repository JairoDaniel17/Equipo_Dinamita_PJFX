package crudjavafx.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMysql {
    private Connection connection;
    private String usuario = "root";
    private String password = "admin";
    private String servidor = "localhost";
    private String puerto = "3306";
    private String nombreBD = "db_crud_java_fx";
    private String url = "jdbc:mysql://" + servidor + ":" + puerto + "/" + nombreBD + "?serverTimezone=UTC";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public ConexionMysql() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, usuario, password);
            if (connection != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (Exception e) {
            System.err.println("Error de conexion: " + e.getMessage());
            System.err.println("Detalle del error: ");
            e.printStackTrace();
        }
    }
}