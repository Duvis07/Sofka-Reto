package Entidades;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Gestion{

    private Conexion conn;
    private PreparedStatement pStm;
    
    public List<pregunta> consultar() {
        List<pregunta> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM jugador";
        conn = new Conexion();
        try {
            Statement st = conn.getCon().createStatement();
            ResultSet rS = st.executeQuery(sql);
            while(rS.next()){
                String id = rS.getString("id");
                String nombre = rS.getString("nombre");
                int puntaje = rS.getInt("puntaje");
                int dinero = rS.getInt("dinero_Ganado");
               
            }
            st.close();
            rS.close();
        } catch (SQLException ex) {
         
        }
        return usuarios;
    }

    public int guardar(pregunta usuario) {
        int resultado = 0;
        conn = new Conexion();
        String sql = "INSERT INTO jugador "
                + "(id,nombre,puntaje,dinero_ganado) " +
                "VALUES (?,?,?,?)";
        try {
            pStm = conn.getCon().prepareStatement(sql);
            pStm.setString(1, usuario.getid());
            pStm.setInt(2, usuario.getnombre());
            pStm.setString(3, usuario.getpuntaje());
            pStm.setString(4, usuario.getdinero_ganado());
            resultado = pStm.executeUpdate();
        } catch (SQLException ex) {
              System.out.println("");
        }
        return resultado;
      
    }
}