/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mac
 */
public class conexion {
    Connection conect=null;
    public Connection getConexion() {
        try {
            System.out.println("Estoy intentando conectarme a la base de datos");
            Class.forName("com.mysql.jdbc.Driver");
            conect =DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliothek","root", "root");
            System.out.println("Conexion exitosa");
        }catch(SQLException e) {
            System.out.println("Error de MySQL");           
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(Exception e) {
            System.out.println("Se ha encontrado el siguiente error: "+e.getMessage());
        }
        return conect;      
    } 
}