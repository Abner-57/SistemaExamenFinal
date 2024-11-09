/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateriasistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class conexion {
    
    public Connection con;
    conexion(){
        conectarBD();
    }
    public void conectarBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/BDNegocio","root","hdhyXKU952");
            System.out.println("Conexion Establecida");       
        }catch (ClassNotFoundException e) {
            System.out.println("Erro al cargar la libreria" +e.getMessage()); 
        }catch (SQLException e) {
            System.out.println("Servidor no encontrado."+e.getMessage());
        }
    }
    
    
}
