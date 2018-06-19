/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Gardez
 */
public class Conexion {

    Connection cx;
  
    public Connection conexion() {
        try {
     Class.forName("com.mysql.jdbc.Driver");
           cx = DriverManager.getConnection("jdbc:mysql://localhost/laboratorio","root","");
       

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        return cx;
    }
    public static void main (String []args){
    Conexion m = new Conexion();
    m.conexion();
        
    }

}
