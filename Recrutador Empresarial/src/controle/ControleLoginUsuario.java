/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloLoginUsuario;

/**
 *
 * @author vinicius
 */
public class ControleLoginUsuario {

    ConnectionConsulta conecta = new ConnectionConsulta();
    ModeloLoginUsuario modelo = new ModeloLoginUsuario();

    public void salvar(ModeloLoginUsuario mod) {
        conecta.conectaBanco();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into login (nome,senha,login)values(?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getLogin());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuário!!\n ERRO:" + ex);
        }
       // conecta.desconecta();
    }

    public void alterar(ModeloLoginUsuario mod) {
        conecta.conectaBanco();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update login set nome=?, senha=?,login=? where id_login=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getLogin());
            pst.setInt(4, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o  usuario!!\n ERRO:" + ex);
        }
      //  conecta.desconecta();
    }

    public ModeloLoginUsuario Primeiro() {
        conecta.conectaBanco();
        try {
            conecta.executaSQL("select * from login where login = 'Talita'");
            conecta.rs.first();
            modelo.setId(conecta.rs.getInt("id_login"));
            modelo.setLogin(conecta.rs.getString("login"));
            modelo.setNome(conecta.rs.getString("nome"));
            modelo.setSenha(conecta.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o primeiro registro!\n ERRO:" + ex);
            //
        }
        return modelo;       
    }
}

