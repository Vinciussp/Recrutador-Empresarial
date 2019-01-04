/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloLogin;

/**
 *
 * @author vinicius
 */
public class ControleLogin {
    
    ConnectionConsulta conecta = new ConnectionConsulta();
    ModeloLogin modelo = new ModeloLogin();
            
    public void salvar(ModeloLogin mod){
    conecta.conectaBanco();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into login (nome,senha,permissao,permissao2,login,area,subarea,depart)values(?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getSenha());
            pst.setString(3,mod.getPermissao());
            pst.setString(4,mod.getPermissao2());
            pst.setString(5,mod.getLogin());
            pst.setString(6,mod.getArea());
            pst.setString(7,mod.getSubarea());
            pst.setString(8,mod.getDepart());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuario cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir usuário!!\n ERRO:"+ ex);
        }
  //  conecta.desconecta();
    }
    
    public void excluir(ModeloLogin mod){
        conecta.conectaBanco();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("delete from login where id_login = ?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuario excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir usuário!!\n ERRO:"+ ex);
        }
       // conecta.desconecta();
        
    }
    
    public void alterar(ModeloLogin mod){
        conecta.conectaBanco();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update login set nome=?, senha=?,permissao=?,login=? where id_login=?");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getSenha());
            pst.setString(3,mod.getPermissao());
            pst.setString(4,mod.getLogin());
            pst.setInt(5,mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuario alterado com sucesso!");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Erro ao alterar o  usuario!!\n ERRO:"+ ex);
        }
      //  conecta.desconecta();
    }
    
    public ModeloLogin Primeiro(){
        conecta.conectaBanco();       
        try {
            conecta.executaSQL("select * from login");
            conecta.rs.first();
            modelo.setId(conecta.rs.getInt("id_login"));
            modelo.setLogin(conecta.rs.getString("login"));
            modelo.setNome(conecta.rs.getString("nome"));
            modelo.setPermissao(conecta.rs.getString("permissao"));
            modelo.setSenha(conecta.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao setar o primeiro registro!\n ERRO:"+ ex);
        }
        return modelo;  
    }
          public ModeloLogin Anterior(){
        //conecta.conectaBanco();       
        try {
            //conecta.executaSQL("select * from login");
            conecta.rs.previous();
            modelo.setId(conecta.rs.getInt("id_login"));
            modelo.setLogin(conecta.rs.getString("login"));
            modelo.setNome(conecta.rs.getString("nome"));
            modelo.setPermissao(conecta.rs.getString("permissao"));
            modelo.setSenha(conecta.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao setar o primeiro registro!\n ERRO:"+ ex);
        }
        
        return modelo;
        
    }
            public ModeloLogin Proximo(){
        //conecta.conectaBanco();       
        try {
           // conecta.executaSQL("select * from login");
            conecta.rs.next();
            modelo.setId(conecta.rs.getInt("id_login"));
            modelo.setLogin(conecta.rs.getString("login"));
            modelo.setNome(conecta.rs.getString("nome"));
            modelo.setPermissao(conecta.rs.getString("permissao"));
            modelo.setSenha(conecta.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao setar o primeiro registro!\n ERRO:"+ ex);
        }
        
        return modelo;
        
    }
       public ModeloLogin Ultimo(){
        conecta.conectaBanco();       
        try {
            conecta.executaSQL("select * from login");
            conecta.rs.last();
            modelo.setId(conecta.rs.getInt("id_login"));
            modelo.setLogin(conecta.rs.getString("login"));
            modelo.setNome(conecta.rs.getString("nome"));
            modelo.setPermissao(conecta.rs.getString("permissao"));
            modelo.setSenha(conecta.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao setar o primeiro registro!\n ERRO:"+ ex);
        }
        
        return modelo;
        
    }
}
 
