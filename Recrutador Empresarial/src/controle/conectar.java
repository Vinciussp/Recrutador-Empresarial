/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class conectar {
    
    public static Connection GetConnection(){
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://192.168.15.13:3306/projetojava";
            String usuarioDB = "todos";
            String passwordDB = "1234";
            conexion = DriverManager.getConnection(servidor,usuarioDB, passwordDB);
        } catch (ClassNotFoundException e) {
               JOptionPane.showMessageDialog(null, "Erro na conexão");
               e.printStackTrace();
              conexion = null;        
    }finally{
    return conexion;
}
    }
}
            
        
    


