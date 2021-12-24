package Entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // atributos
    private Connection con;
    
    // constructor
    public Conexion(){
        //Direccion  de la base de datos con su  respectivo nombre
        String URL = "jdbc:mysql://localhost:3306/juego";
        String USUARIO = "root";
        String PASSWORD = "";
        // como getConnection y createStatement lanza una excepción
        // de tipo SQLException, entonces obligatoriamente se debe
        // colocar dentro de try catch o el método lance un exception
        try {
            // Obtiene una conexión con los parámetros anteriores
            // debe haber un driver
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            // crea una declaración de la conexión con el gestor
            con.createStatement();
        } catch (SQLException ex) {
            // imprime cuando hay un mensaje de la excepcion
            // puede ser en conexion
            System.out.println("Error: "+ ex.getMessage());
        }
    }
    // métodos
    // devuelve la conexión
    public Connection getCon() {
        return con;
    }
    
}
