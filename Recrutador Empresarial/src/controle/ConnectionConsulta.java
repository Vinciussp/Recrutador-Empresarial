/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class ConnectionConsulta {
    
    
    public Statement stm;
    public ResultSet rs;
    public final static String DRIVER = "com.mysql.jdbc.Driver";
    public final static String URL = "jdbc:mysql://192.168.15.13:3306/projetojava";
    public final static String USER = "todos";
    public final static String PASSWD = "1234";
    public Connection conn = null;

    public void conectaBanco () {
        
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWD);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar banco de dados!");
            e.printStackTrace();
            System.exit(0);
        }
    }

    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de executaSQL!\n Erro:" + ex.getMessage());
        }

    }

    public void desconecta() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão:\n Erro" + ex.getMessage());
        }
    }
}
