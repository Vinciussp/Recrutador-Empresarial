/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import com.mxrck.autocompleter.TextAutoCompleter;
import controle.AtualizaDia;
import controle.AtualizadoHora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import controle.ConnectionConsulta;
import controle.ControleLoginUsuario;
import controle.conectar;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import modelo.ModeloTabela;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.ModeloLoginUsuario;
import modelo.Usuario;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


/**
 *
 * @author vinicius
 */
public class Consultador extends javax.swing.JFrame {
    
    ConnectionConsulta conecta = new ConnectionConsulta();
    Usuario mod = new Usuario();
    ModeloLoginUsuario modelo = new ModeloLoginUsuario();
    ControleLoginUsuario control = new ControleLoginUsuario();
    Consultador enviatexto;
    /**
     * Creates new form Consultador
     */
    public Consultador() {
        initComponents();
        //items();
        itemm();
        itemns();
        itemnss();
        iitemnss();
       // conecta.conectaBanco();
     //  preenchertabela("select * from usuarios where Usuario ='" + jTextField1log.getText()+"' order by id");
        //preenchertabela("select * from usuarios order by id");
        AtualizadoHora.start(jLabelHorario);  
        AtualizaDia.start(jLabelDia);
       
    }

//    public void items (){
//        
//        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter( jTextFieldSobrenome);
//        conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//        Statement st=null;
//        ResultSet rs=null;
//        
//        try{
//            st = (Statement)minhaconexao.createStatement();
//            rs=st.executeQuery("SELECT DISTINCT Person_A_e_B_Encore_2017 from clientes"); 
//            
//            while (rs.next()){
//                textAutoAcompleter.addItem(rs.getString("Person_A_e_B_Encore_2017"));
//            }
//          // conecta.desconecta();
//        }catch(Exception de)
//        {
//          JOptionPane.showMessageDialog(this, de.getMessage());
//        }
//        
//    }

        public void itemm (){
        
        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(jTextFieldEmpresaatual);
        conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
        
        Statement st=null;
        ResultSet rs=null;
        
        try{
            st = (Statement)minhaconexao.createStatement();
            rs=st.executeQuery("SELECT DISTINCT Empresa from clientes"); 
            
            while (rs.next()){
                textAutoAcompleter.addItem(rs.getString("Empresa"));
            }
           // conecta.desconecta();
        }catch(Exception de)
        {
          JOptionPane.showMessageDialog(this, de.getMessage());
        }
        
    }
        
        public void itemns (){
        
        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(jTextFieldCargoatual);
        conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
        
        Statement st=null;
        ResultSet rs=null;
        
        try{
            st = (Statement)minhaconexao.createStatement();
            rs=st.executeQuery("SELECT DISTINCT Titulo_oficial from clientes"); 
            
            while (rs.next()){
                textAutoAcompleter.addItem(rs.getString("Titulo_oficial"));
            }
           // conecta.desconecta();
        }catch(Exception de)
        {
          JOptionPane.showMessageDialog(this, de.getMessage());
        }
        
    }
        
        public void itemnss (){
        
        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(jTextFieldEmpresa);
        conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
        
        Statement st=null;
        ResultSet rs=null;
        
        try{
            st = (Statement)minhaconexao.createStatement();
            rs=st.executeQuery("SELECT DISTINCT Company from empresas"); 
            
            while (rs.next()){
                textAutoAcompleter.addItem(rs.getString("Company"));
            }
          //  conecta.desconecta();
        }catch(Exception de)
        {
          JOptionPane.showMessageDialog(this, de.getMessage());
        }
        
    }
        
        
        public void iitemnss (){
        
        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(jTextFieldRamo);
        conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
        
        Statement st=null;
        ResultSet rs=null;
        
        try{
            st = (Statement)minhaconexao.createStatement();
            rs=st.executeQuery("SELECT DISTINCT Ramo from empresas"); 
            
            while (rs.next()){
                textAutoAcompleter.addItem(rs.getString("Ramo"));
            }
         //   conecta.desconecta();
        }catch(Exception de)
        {
          JOptionPane.showMessageDialog(this, de.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldCod = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jTextFieldData = new javax.swing.JFormattedTextField();
        jTextFieldHorario = new javax.swing.JFormattedTextField();
        jLabelHorario = new javax.swing.JLabel();
        jTextField1log = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonReset = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jTextFieldEmpresaatual = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldCargoatual = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldRamo = new javax.swing.JTextField();
        jButtonReset1 = new javax.swing.JButton();
        jButtonExcluir1 = new javax.swing.JButton();
        jButtonAlterar1 = new javax.swing.JButton();
        jButtonSalvar1 = new javax.swing.JButton();
        jButtonNovo1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTeltrabalho = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldEmailtrabalho = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldOutros = new javax.swing.JTextField();
        jTextFieldLog = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstado1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jTableEstado.setBackground(new java.awt.Color(204, 255, 255));
        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEstado.setOpaque(false);
        jTableEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstado);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciador"));

        jLabel3.setText("Código:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Data:");

        jLabel7.setText("Tipo de empresa:");

        jLabel10.setText("Horario:");

        jTextFieldSobrenome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldSobrenome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSobrenomeMouseClicked(evt);
            }
        });
        jTextFieldSobrenome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldSobrenomeCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldSobrenomeInputMethodTextChanged(evt);
            }
        });
        jTextFieldSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSobrenomeActionPerformed(evt);
            }
        });
        jTextFieldSobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSobrenomeKeyPressed(evt);
            }
        });

        jTextFieldCod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_2.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_1.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Editar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_3.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Deletar");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/error.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        try {
            jTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldData.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldData.setEnabled(false);
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        try {
            jTextFieldHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldHorario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldHorario.setEnabled(false);

        jLabelHorario.setText("jLabel2");

        jTextField1log.setEnabled(false);
        jTextField1log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1logActionPerformed(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem seleção", "Cliente", "Cliente antigo", "Off limit", "prospect client" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user3.png"))); // NOI18N
        jButtonReset.setToolTipText("Atualizar");
        jButtonReset.setEnabled(false);
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel13.setText("Usuário criador:");

        jLabelDia.setText("jLabel14");

        jTextFieldEmpresaatual.setToolTipText("");
        jTextFieldEmpresaatual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpresaatualKeyPressed(evt);
            }
        });

        jLabel14.setText("Empresa atual:");

        jLabel15.setText("Novo");
        jLabel15.setPreferredSize(new java.awt.Dimension(20, 14));

        jLabel16.setText("Salvar");

        jLabel17.setText("Editar");

        jLabel18.setText("Atualizar");

        jLabel19.setText("Sair");

        jLabel20.setText("Cargo atual:");

        jTextFieldCargoatual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCargoatualKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Cadastro profissionais");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Cadastro de empresa");

        jLabel23.setText("Empresa:");

        jTextFieldEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpresaKeyPressed(evt);
            }
        });

        jLabel24.setText("Ramo de:");

        jTextFieldRamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRamoKeyPressed(evt);
            }
        });

        jButtonReset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user3.png"))); // NOI18N
        jButtonReset1.setToolTipText("Atualizar");
        jButtonReset1.setEnabled(false);
        jButtonReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReset1ActionPerformed(evt);
            }
        });

        jButtonExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_3.png"))); // NOI18N
        jButtonExcluir1.setToolTipText("Deletar");
        jButtonExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluir1ActionPerformed(evt);
            }
        });

        jButtonAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_1.png"))); // NOI18N
        jButtonAlterar1.setToolTipText("Editar");
        jButtonAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterar1ActionPerformed(evt);
            }
        });

        jButtonSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_2.png"))); // NOI18N
        jButtonSalvar1.setToolTipText("Salvar");
        jButtonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar1ActionPerformed(evt);
            }
        });

        jButtonNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jButtonNovo1.setToolTipText("Novo");
        jButtonNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo1ActionPerformed(evt);
            }
        });

        jLabel25.setText("Novo");
        jLabel25.setPreferredSize(new java.awt.Dimension(20, 14));

        jLabel26.setText("Salvar");

        jLabel27.setText("Editar");

        jLabel28.setText("Atualizar");

        jLabel1.setText("Excluir");

        jLabel2.setText("Excluir");

        jLabel8.setText("Salário:");

        jLabel9.setText("Telefone trabalho:");

        jLabel11.setText("Email trabalho:");

        jTextFieldId.setEnabled(false);

        jLabel6.setText("Código:");

        jLabel12.setText("Telefone outros:");

        jTextFieldLog.setEnabled(false);

        jLabel29.setText("Usuário:");

        jLabel30.setText("Endereço:");

        jLabel31.setText("Telefone:");

        jLabel32.setText("Cnpj:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldEmpresaatual, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldCargoatual, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel9))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel12)))
                                                .addGap(4, 4, 4))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(174, 174, 174)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 273, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel26)
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel27)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1)
                                                .addGap(16, 16, 16))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(11, 11, 11)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jButtonReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(232, 232, 232))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(208, 208, 208))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldTeltrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel24))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldRamo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEndereco)
                                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCNPJ))
                                .addGap(4, 4, 4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmailtrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5))
                                    .addComponent(jLabelHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelDia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1log, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSair))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldTeltrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextFieldEmpresaatual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCargoatual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHorario))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextFieldEmailtrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonNovo)
                                .addComponent(jButtonSalvar)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonAlterar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButtonExcluir)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonReset)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonNovo1)
                                    .addComponent(jButtonSalvar1)
                                    .addComponent(jButtonAlterar1)
                                    .addComponent(jButtonExcluir1)
                                    .addComponent(jButtonReset1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel26)))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTableEstado1.setBackground(new java.awt.Color(204, 255, 255));
        jTableEstado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEstado1.setOpaque(false);
        jTableEstado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstado1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEstado1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1346, 723));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstadoMouseClicked
        // TODO add your handling code here:
        String Person_A_e_B_Encore_2017_id = ""+jTableEstado.getValueAt(jTableEstado.getSelectedRow(), 0);
        conecta.conectaBanco();
        conecta.executaSQL("select * from clientes where Person_A_e_B_Encore_2017='"+ Person_A_e_B_Encore_2017_id +"'");
        
        try {
        conecta.rs.first();     
        jTextFieldSobrenome.setText(conecta.rs.getString("Person_A_e_B_Encore_2017"));
//       jTextFieldNome.setText(conecta.rs.getString("descricao"));
        jTextFieldEmpresaatual.setText(conecta.rs.getString("Empresa"));
        jTextFieldCargoatual.setText(conecta.rs.getString("Titulo_oficial"));
        jTextFieldSalario.setText(conecta.rs.getString("Salary"));
        jTextFieldTeltrabalho.setText(conecta.rs.getString("Work_Phone"));
        jTextFieldOutros.setText(conecta.rs.getString("Outros")); 
        jTextFieldEmailtrabalho.setText(conecta.rs.getString("Work_Email"));
        jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("Clientes_id")));
        jTextFieldData.setText(conecta.rs.getString("Dia")); 
        jTextFieldHorario.setText(conecta.rs.getString("horario"));
        jTextField1log.setText(conecta.rs.getString("criador"));
        jButtonAlterar.setEnabled(true);
        //jButtonExcluir.setEnabled(false);
        jTextFieldSobrenome.setEnabled(true);
//        jTextFieldNome.setEnabled(true);
      //  jComboBoxTipo.setEnabled(true);
     //   jComboBoxDepartamento.setEnabled(true);
        jTextFieldData.setEnabled(false);
      //  jTextFieldDataEntrega.setEnabled(false);
        jTextFieldHorario.setEnabled(false);
       // jComboBoxEntrega.setEnabled(true);
       // jComboBoxCorreios.setEnabled(true);
       // conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao selecionar os dados!\n Erro: "+ex);
        }
        // JOptionPane.showMessageDialog(rootPane, empresa);
    }//GEN-LAST:event_jTableEstadoMouseClicked

    private void jTableEstado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstado1MouseClicked
        // TODO add your handling code here:
        
            String Empresas_id = ""+jTableEstado1.getValueAt(jTableEstado1.getSelectedRow(), 0);
        conecta.conectaBanco();
        conecta.executaSQL("select * from empresas where Empresas_id='"+ Empresas_id +"'");
        
        try {
        conecta.rs.first();
        jTextFieldId.setText(String.valueOf(conecta.rs.getInt("Empresas_id")));
        jTextFieldEmpresa.setText(conecta.rs.getString("Company"));
//       jTextFieldNome.setText(conecta.rs.getString("descricao"));
        jTextFieldRamo.setText(conecta.rs.getString("Ramo"));
        jComboBoxTipo.setSelectedItem(conecta.rs.getString("Tipo"));
        jTextFieldEndereco.setText(conecta.rs.getString("Endereco"));
        jTextFieldTelefone.setText(conecta.rs.getString("Telefone"));
        jTextFieldCNPJ.setText(conecta.rs.getString("Cnpj"));
        jTextFieldData.setText(conecta.rs.getString("Data"));
        jTextFieldHorario.setText(conecta.rs.getString("Horario"));
        jTextField1log.setText(conecta.rs.getString("Usuario"));   
        jButtonAlterar1.setEnabled(true);
        //jButtonExcluir.setEnabled(false);
       // jTextFieldSobrenome.setEnabled(true);
//        jTextFieldNome.setEnabled(true);
        //jComboBoxTipo.setEnabled(true);
        //jTextFieldEmpresa.setEnabled(true);
        //jTextFieldRamo.setEnabled(true);
      //  jTextFieldDataEntrega.setEnabled(false);
      //  jTextFieldHorario.setEnabled(false);
       // jComboBoxEntrega.setEnabled(true);
       // jComboBoxCorreios.setEnabled(true);
       preenchertabela("select * from empresas order by Company");
      //  conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao selecionar os dados!\n Erro: "+ex);
        }
    }//GEN-LAST:event_jTableEstado1MouseClicked

    private void jButtonNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo1ActionPerformed
        // TODO add your handling code here:
        jTextFieldEmpresa.setText("");
        jTextFieldRamo.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldCNPJ.setText("");
        //jTextFieldNome.setText("");
        jComboBoxTipo.setSelectedItem("Sem seleção");
        // jComboBoxDepartamento.setSelectedItem("Sem seleção");
        //   jTextFieldData.setText("");
        // jTextFieldDataEntrega.setText("");
        //  jTextFieldHorario.setText("");
        // jComboBoxEntrega.setSelectedItem("entregue");
        //jTextField1log.setText("");
        //  jComboBoxRecebimento.setSelectedItem("Não recebido");
        // jComboBoxCorreios.setSelectedItem("Malote");
        //        jTextField1.setText("Aguardando");
        //  jTextFieldSobrenome.setEnabled(true);
//        jTextFieldEmpresa.setEnabled(true);
//        jTextFieldRamo.setEnabled(true);
//        jComboBoxTipo.setEnabled(true);
//        jTextFieldEndereco.setEnabled(true);
//        jTextFieldTelefone.setEnabled(true);
//        jTextFieldCNPJ.setEnabled(true);
        //     jTextFieldData.setEnabled(false);
        // jTextFieldDataEntrega.setEnabled(true);
        //   jTextFieldHorario.setEnabled(false);
        // jComboBoxEntrega.setEnabled(true);
        //  jComboBoxCorreios.setEnabled(true);
//        jButtonAlterar1.setEnabled(true);
//        jButtonExcluir1.setEnabled(true);
//        jButtonSalvar1.setEnabled(true);
        // jButtonNovo1.setEnabled(false);
        //  jButtonReset.setEnabled(true);
        //jTextFieldPesquisar.setEnabled(true);
        //jButtonPesquisar.setEnabled(true);
        //  jTextField1log.setText(modelo.getLogin());
        //preenchertabela("select * from usuarios order by id");
        // enviatexto.setState(Consultador.NORMAL);
        //  enviatexto.recebendo(jTextField1log.getText());
        conecta.conectaBanco();
        preenchertabelaa("select * from empresas order by Company ");
        // where Usuario ='" + jTextField1log.getText()+"' order by id ");
      //  conecta.desconecta();
    }//GEN-LAST:event_jButtonNovo1ActionPerformed

    private void jButtonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar1ActionPerformed
        // TODO add your handling code here:
        if(jTextFieldEmpresa.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Empresa!");}
        //else{if(jTextFieldNome.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Nome!");}
            else{if(jTextFieldRamo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Ramo de!");}
                else{if(jComboBoxTipo.getSelectedItem().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Tipo de empresa!");}
                    else{
                        try{
                            conecta.conectaBanco();
                            PreparedStatement pst = conecta.conn.prepareStatement("insert into empresas (Company,Ramo,Tipo,Endereco,Telefone,CNPJ,Data,Horario,Usuario)values (?,?,?,?,?,?,?,?,?)");
                            pst.setString(1,jTextFieldEmpresa.getText());
                            pst.setString(2,jTextFieldRamo.getText());
                            pst.setString(3,(String) jComboBoxTipo.getSelectedItem());
                            pst.setString(4,jTextFieldEndereco.getText());
                            pst.setString(5,jTextFieldTelefone.getText());
                            pst.setString(6,jTextFieldCNPJ.getText());
                            pst.setString(7,jLabelDia.getText());
                            //  pst.setString(5,jTextFieldSalario.getText());
                            pst.setString(8,jLabelHorario.getText());
                            //    pst.setString(7,jTextFieldEmailtrabalho.getText());
                            // pst.setString(8,.getSelectedItem());
                            //  pst.setString(6,.getText());
                            pst.setString(9,jTextFieldLog.getText());
                            // pst.setString(8,jLabelHorario.getText());
                            // pst.setString(9,jTextField1log.getText());
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(rootPane,"Salvo com sucesso");
                            //preenchertabela("select * from usuarios order by id");
                            preenchertabelaa("select * from empresas order by Company ");
                            // usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");    
                          //  conecta.desconecta();
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane,"Erro na Inserção!\n Erro: "+ex);
                        }
                        //         try{
                            //            SimpleEmail emailSimples = new SimpleEmail();
                            //            emailSimples.setHostName("200.170.82.150");
                            //            emailSimples.setSmtpPort(587);
                            //            emailSimples.setFrom(jTextFieldEmpresaatual.getText(),jTextFieldEmpresaatual.getText());
                            //            emailSimples.addTo(jTextFieldEmpresaatual.getText());
                            ////            emailSimples.setSubject(jLabelsubject.getText());
                            //            emailSimples.setMsg(jTextFieldNome.getText());
                            //            emailSimples.setAuthentication("tecnologia@asscont.com.br","Asscont1000");
                            //            emailSimples.send();
                            //            JOptionPane.showMessageDialog(null, "Mensagem enviada");
                            //        } catch (EmailException ex) {
                            //
                        }
                        jTextFieldCod.setText("");
                        jTextFieldEmpresa.setText("");
                        jTextFieldRamo.setText("");
                        jComboBoxTipo.setSelectedItem("Sem seleção");
                        //  jComboBoxDepartamento.setSelectedItem("");
                        jTextFieldData.setText("");
                        //  jTextFieldDataEntrega.setText("");
                        jTextFieldHorario.setText("");
                        //   jComboBoxEntrega.setSelectedItem("");
                        //  jComboBoxCorreios.setSelectedItem("");
                        //   jTextFieldSobrenome.setEnabled(false);
                        //   jTextFieldNome.setEnabled(false);
                        //   jComboBoxTipo.setEnabled(false);
                        // jComboBoxDepartamento.setEnabled(false);
                        jTextFieldData.setEnabled(false);
                        // jTextFieldDataEntrega.setEnabled(false);
                        jTextFieldHorario.setEnabled(false);
                        //  jComboBoxEntrega.setEnabled(false);
                        // jComboBoxCorreios.setEnabled(false);
                        //  jButtonAlterar.setEnabled(false);
                        //  jButtonExcluir.setEnabled(false);
                        //  jButtonSalvar.setEnabled(false);
                        jButtonNovo.setEnabled(true);

                    }
                }
    }//GEN-LAST:event_jButtonSalvar1ActionPerformed

    private void jButtonAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterar1ActionPerformed
        // TODO add your handling code here:

        try {
            conecta.conectaBanco();
            PreparedStatement pst = conecta.conn.prepareStatement("update empresas set Company= ?, Ramo=?, Tipo=?,Endereco=?,Telefone=?,Cnpj=?, Data=?, Horario=?, Usuario=? where Empresas_id=?");
            pst.setString(1,jTextFieldEmpresa.getText());
            pst.setString(2,jTextFieldRamo.getText());
            pst.setString(3, (String) jComboBoxTipo.getSelectedItem());
            pst.setString(4,jTextFieldEndereco.getText());
            pst.setString(5,jTextFieldTelefone.getText());
            pst.setString(6,jTextFieldCNPJ.getText());
            pst.setString(7,jTextFieldData.getText());
            pst.setString(8,jTextFieldHorario.getText());
            pst.setString(9,jTextField1log.getText());
            pst.setInt(10,Integer.parseInt(jTextFieldId.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Alterado com sucesso");
            //preenchertabela("select * from usuarios order by id");
            preenchertabelaa("select * from empresas order by Company ");
          //  conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao alterar!\n Erro: "+ex);
        }
    }//GEN-LAST:event_jButtonAlterar1ActionPerformed

    private void jButtonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir1ActionPerformed
        // TODO add your handling code here:
        try {
            conecta.conectaBanco();
            PreparedStatement pst = conecta.conn.prepareStatement("delete from empresas where Empresas_id= ?");
            pst.setString(1,jTextFieldId.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Excluido com sucesso");
            //preenchertabela("select * from usuarios order by id");
            preenchertabelaa("select * from empresas order by Company ");
           // conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao excluir!\n Erro: "+ex);
        }
        jTextFieldId.setText("");
        jTextFieldEmpresa.setText("");
        jTextFieldRamo.setText("");
        jComboBoxTipo.setSelectedItem("Sem seleção");
        // jComboBoxDepartamento.setSelectedItem("");
        jTextFieldData.setText("");
        //  jTextFieldDataEntrega.setText("");
        jTextFieldHorario.setText("");
        // jTextFieldSobrenome.setEnabled(false);
        //   jTextFieldNome.setEnabled(false);
        //   jComboBoxTipo.setEnabled(false);
        //  jComboBoxDepartamento.setEnabled(false);
        jTextFieldData.setEnabled(false);
        //  jTextFieldDataEntrega.setEnabled(false);
        jTextFieldHorario.setEnabled(false);
        // jButtonAlterar1.setEnabled(false);
        //  jButtonExcluir1.setEnabled(false);
        //jButtonSalvar1.setEnabled(false);
        jButtonNovo1.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluir1ActionPerformed

    private void jButtonReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonReset1ActionPerformed

    private void jTextFieldRamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRamoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldRamo.getText());
            preenchertabelaa("select * from Empresas where Ramo like '%" + jTextFieldRamo.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldRamoKeyPressed

    private void jTextFieldEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpresaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldEmpresa.getText());
            preenchertabelaa("select * from Empresas where Company like '%" + jTextFieldEmpresa.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldEmpresaKeyPressed

    private void jTextFieldCargoatualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCargoatualKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldCargoatual.getText());
            preenchertabela("select * from Clientes where Titulo_oficial like '%" + jTextFieldCargoatual.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldCargoatualKeyPressed

    private void jTextFieldEmpresaatualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpresaatualKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldEmpresaatual.getText());
            preenchertabela("select * from Clientes where Empresa like '%" + jTextFieldEmpresaatual.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldEmpresaatualKeyPressed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jTextFieldCod.setText("");
        jTextFieldSobrenome.setText("");
        //        jTextFieldNome.setText("");
        jComboBoxTipo.setSelectedItem("Sem seleção");
        // jComboBoxDepartamento.setSelectedItem("Sem seleção");
        jTextFieldData.setText("");
        // jTextFieldDataEntrega.setText("");
        jTextFieldHorario.setText("");
        // jComboBoxEntrega.setSelectedItem("Não entregue");
        // jTextField1log.setText("");
        // jComboBoxRecebimento.setSelectedItem("Não recebido");
        // jComboBoxCorreios.setSelectedItem("Malote");
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldSobrenome.setEnabled(false);
        //        jTextFieldNome.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        //  jComboBoxDepartamento.setEnabled(false);
        jTextFieldData.setEnabled(false);
        //  jTextFieldDataEntrega.setEnabled(false);
        jTextFieldHorario.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        // jComboBoxEntrega.setEnabled(false);
        // jComboBoxCorreios.setEnabled(false);
        //preenchertabela("select * from usuarios order by id");
        preenchertabela("select * from usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");

    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
        //        int posicao;
        //
        //        posicao = jComboBoxTipo.getSelectedIndex();
        //
        //        switch (posicao){
            //              case 1:
            //           //   jComboBoxDepartamento.removeAllItems();
            //           //   jComboBoxDepartamento.addItem("Contábil");
            //              jTextFieldEmpresaatual.setText("adriana@asscont.com.br");
            ////              jLabelsubject.setText("Novo Malote Adriana, 24h para baixa!");
            //              break;
            //              case 2:
            //            //  jComboBoxDepartamento.removeAllItems();
            //           //   jComboBoxDepartamento.addItem("Contábil");
            //           //   jComboBoxDepartamento.addItem("Fiscal");
            //              jTextFieldEmpresaatual.setText("acaxias@asscont.com.br");
            //           //   jLabelsubject.setText("Novo Malote Andreia, 24h para baixa!");
            //              break;
            //              case 3:
            //           //   jComboBoxDepartamento.removeAllItems();
            //          //    jComboBoxDepartamento.addItem("Contábil");
            //              jTextFieldEmpresaatual.setText("bruno.lopes@asscont.com.br");
            ////              jLabelsubject.setText("Novo Malote Bruno, 24h para baixa!");
            //              break;
            //              case 4:
            //           //   jComboBoxDepartamento.removeAllItems();
            //           //   jComboBoxDepartamento.addItem("Contábil");
            //              jTextFieldEmpresaatual.setText("edilene@asscont.com.br");
            ////              jLabelsubject.setText("Novo Malote Edilene, 24h para baixa!");
            //              break;
            //              case 5:
            //           //  jComboBoxDepartamento.removeAllItems();
            //            //  jComboBoxDepartamento.addItem("Contábil");
            //            //  jComboBoxDepartamento.addItem("Fiscal");
            //              jTextFieldEmpresaatual.setText("");
            //        //      jLabelsubject.setText("");
            //              break;
            //              case 6:
            //           //   jComboBoxDepartamento.removeAllItems();
            //          //    jComboBoxDepartamento.addItem("Contábil");
            //              jTextFieldEmpresaatual.setText("gustavo@asscont.com.br");
            ////              jLabelsubject.setText("Novo Malote Gustavo, 24h para baixa!");
            //              break;
            //              case 7:
            //           //   jComboBoxDepartamento.removeAllItems();
            //           //   jComboBoxDepartamento.addItem("jurídico");
            //              jTextFieldEmpresaatual.setText("");
            ////              jLabelsubject.setText("");
            //              break;
            //              case 8:
            //            //  jComboBoxDepartamento.removeAllItems();
            //            //  jComboBoxDepartamento.addItem("Contábil");
            //              jTextFieldEmpresaatual.setText("katia@asscont.com.br");
            //           //   jLabelsubject.setText("Novo Malote Katia, 24h para baixa!");
            //              break;
            //              case 9:
            //           //   jComboBoxDepartamento.removeAllItems();
            //           //   jComboBoxDepartamento.addItem("RH");
            //              jTextFieldEmpresaatual.setText("rh@asscont.com.br");
            ////              jLabelsubject.setText("Novo Malote Louise, 24h para baixa!");
            //              break;
            //              case 10:
            //           //   jComboBoxDepartamento.removeAllItems();
            //            //  jComboBoxDepartamento.addItem("DP");
            //              jTextFieldEmpresaatual.setText("danielle.dp@asscont.com.br");
            ////              jLabelsubject.setText("Novo Malote, 24h para baixa!");
            //              break;
            //              case 11:
            //           //   jComboBoxDepartamento.removeAllItems();
            //            //  jComboBoxDepartamento.addItem("Declarações");
            //              jTextFieldEmpresaatual.setText("declaracoes@asscont.com.br");
            //          //    jLabelsubject.setText("Novo Malote Thais ou Rodrigo, 24h para baixa!");
            //              break;
            //              case 12:
            //            //  jComboBoxDepartamento.removeAllItems();
            //            //  jComboBoxDepartamento.addItem("Financeiro");
            //              jTextFieldEmpresaatual.setText("vera@asscont.com.br");
            //           //   jLabelsubject.setText("Novo Malote Vera, 24h para baixa!");
            //              break;
            //        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jTextField1logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1logActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1logActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        //       conecta.executaSQL("delete from usuario where empresa='"+jTextFieldEmpresa.getText()+"'");
        //        JOptionPane.showMessageDialog(rootPane,"Excluido com sucesso");
        try {
            conecta.conectaBanco();
            PreparedStatement pst = conecta.conn.prepareStatement("delete from clientes where Clientes_id= ?");
            pst.setString(1,jTextFieldCod.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Excluido com sucesso");
            //preenchertabela("select * from usuarios order by id");
           // preenchertabela("select * from clientes order by Clientes_id");
            //conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao excluir!\n Erro: "+ex);
        }
        jTextFieldCod.setText("");
        jTextFieldSobrenome.setText("");
        //   jTextFieldNome.setText("");
        //  jComboBoxTipo.setSelectedItem("");
        // jComboBoxDepartamento.setSelectedItem("");
        jTextFieldData.setText("");
        //  jTextFieldDataEntrega.setText("");
        jTextFieldHorario.setText("");
       // jTextFieldSobrenome.setEnabled(false);
        //   jTextFieldNome.setEnabled(false);
        //    jComboBoxTipo.setEnabled(false);
        //  jComboBoxDepartamento.setEnabled(false);
       // jTextFieldData.setEnabled(false);
        //  jTextFieldDataEntrega.setEnabled(false);
      //  jTextFieldHorario.setEnabled(false);
        // jButtonAlterar.setEnabled(false);
        // jButtonExcluir.setEnabled(false);
        // jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        
//        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter( jTextFieldSobrenome);
//        conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//        Statement st=null;
//        ResultSet rs=null;
//        
//        try{
//            st = (Statement)minhaconexao.createStatement();
//            rs=st.executeQuery("SELECT DISTINCT Person_A_e_B_Encore_2017 from clientes"); 
//            
//            while (rs.next()){
//                textAutoAcompleter.addItem(rs.getString("Person_A_e_B_Encore_2017"));
//            }
//          // conecta.desconecta();
//        }catch(Exception de)
//        {
//          JOptionPane.showMessageDialog(this, de.getMessage());
//        }
//        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        try {
            conecta.conectaBanco();
            PreparedStatement pst = conecta.conn.prepareStatement("update clientes set Person_A_e_B_Encore_2017= ?, Empresa=?, Titulo_oficial=?, Salary=?, Work_Phone=?, Outros=?, Work_Email=?, Dia=?, horario=?, criador=? where Clientes_id=?");
            pst.setString(1,jTextFieldSobrenome.getText());
            pst.setString(2,jTextFieldEmpresaatual.getText());
            pst.setString(3,jTextFieldCargoatual.getText());
            pst.setString(4,jTextFieldSalario.getText());
            pst.setString(5,jTextFieldTeltrabalho.getText());
            pst.setString(6,jTextFieldOutros.getText());
            pst.setString(7,jTextFieldEmailtrabalho.getText());
            //  pst.setString(7,jTextFieldHorario.getText());
            pst.setString(8,jTextFieldData.getText());
            pst.setString(9,jTextFieldHorario.getText());
            pst.setString(10,jTextField1log.getText());
            //   pst.setString(11, (String) jComboBoxCorreios.getSelectedItem());
            pst.setInt(11,Integer.parseInt(jTextFieldCod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Alterado com sucesso");
            //preenchertabela("select * from usuarios order by id");
            // preenchertabela("select * from usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");
           // preenchertabela("select * from clientes order by Clientes_id");
           // conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao alterar!\n Erro: "+ex);
        }
        
//        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter( jTextFieldSobrenome);
//        conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//        Statement st=null;
//        ResultSet rs=null;
//        
//        try{
//            st = (Statement)minhaconexao.createStatement();
//            rs=st.executeQuery("SELECT DISTINCT Person_A_e_B_Encore_2017 from clientes"); 
//            
//            while (rs.next()){
//                textAutoAcompleter.addItem(rs.getString("Person_A_e_B_Encore_2017"));
//            }
//          // conecta.desconecta();
//        }catch(Exception de)
//        {
//          JOptionPane.showMessageDialog(this, de.getMessage());
//        }
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldSobrenome.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Sobrenome!");}
        //else{if(jTextFieldNome.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Nome!");}
            else{if(jTextFieldEmpresaatual.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Empresa Atual!");}
                else{if(jTextFieldCargoatual.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Cargo Atual!");}
                    else{
                        try{
                            conecta.conectaBanco();
                            PreparedStatement pst = conecta.conn.prepareStatement("insert into clientes (Person_A_e_B_Encore_2017,Empresa,Titulo_oficial,Salary,Work_Phone,Outros,Work_Email,Dia,horario,criador)values (?,?,?,?,?,?,?,?,?,?)");
                            pst.setString(1,jTextFieldSobrenome.getText());
                            //  pst.setString(2,jTextFieldNome.getText());
                            pst.setString(2,jTextFieldEmpresaatual.getText());
                            pst.setString(3,jTextFieldCargoatual.getText());
                            pst.setString(4,jTextFieldSalario.getText());
                            pst.setString(5,jTextFieldTeltrabalho.getText());
                            pst.setString(6,jTextFieldOutros.getText());
                            pst.setString(7,jTextFieldEmailtrabalho.getText());
                            // pst.setString(8,.getSelectedItem());
                            //  pst.setString(6,.getText());
                            pst.setString(8,jLabelDia.getText());
                            pst.setString(9,jLabelHorario.getText());
                            pst.setString(10,jTextFieldLog.getText());
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(rootPane,"Salvo com sucesso");
                            //preenchertabela("select * from usuarios order by id");
                         //   preenchertabela("select * from clientes order by Clientes_id");
                            // usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");    
                           // conecta.desconecta();
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane,"Erro na Inserção!\n Erro: "+ex);
                        }
                        //         try{
                            //            SimpleEmail emailSimples = new SimpleEmail();
                            //            emailSimples.setHostName("200.170.82.150");
                            //            emailSimples.setSmtpPort(587);
                            //            emailSimples.setFrom(jTextFieldEmpresaatual.getText(),jTextFieldEmpresaatual.getText());
                            //            emailSimples.addTo(jTextFieldEmpresaatual.getText());
                            ////            emailSimples.setSubject(jLabelsubject.getText());
                            //            emailSimples.setMsg(jTextFieldNome.getText());
                            //            emailSimples.setAuthentication("tecnologia@asscont.com.br","Asscont1000");
                            //            emailSimples.send();
                            //            JOptionPane.showMessageDialog(null, "Mensagem enviada");
                            //        } catch (EmailException ex) {
                            //
                        }
                        jTextFieldCod.setText("");
                        jTextFieldSobrenome.setText("");
                        jTextFieldEmpresaatual.setText("");
                        // jComboBoxTipo.setSelectedItem("");
                        jTextFieldCargoatual.setText("");
                        jTextFieldData.setText("");
                        jTextFieldSalario.setText("");
                        jTextFieldHorario.setText("");
                        jTextFieldEmailtrabalho.setText("");
                        jTextFieldTeltrabalho.setText("");
                        jTextFieldOutros.setText("");
                        //   jComboBoxEntrega.setSelectedItem("");
                        //  jComboBoxCorreios.setSelectedItem("");
                        //   jTextFieldSobrenome.setEnabled(false);
                        //   jTextFieldNome.setEnabled(false);
                        //   jComboBoxTipo.setEnabled(false);
                        // jComboBoxDepartamento.setEnabled(false);
                        //  jTextFieldData.setEnabled(false);
                        // jTextFieldDataEntrega.setEnabled(false);
                        //  jTextFieldHorario.setEnabled(false);
                        //  jComboBoxEntrega.setEnabled(false);
                        // jComboBoxCorreios.setEnabled(false);
                        // jButtonAlterar.setEnabled(false);
                        //jButtonExcluir.setEnabled(false);
                        //jButtonSalvar.setEnabled(false);
                        jButtonNovo.setEnabled(true);
                        // jButtonAlterar.setEnabled(false);
                        //jButtonExcluir.setEnabled(false);

                    }
                }
        
//        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter( jTextFieldSobrenome);
//        conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//        Statement st=null;
//        ResultSet rs=null;
//        
//        try{
//            st = (Statement)minhaconexao.createStatement();
//            rs=st.executeQuery("SELECT DISTINCT Person_A_e_B_Encore_2017 from clientes"); 
//            
//            while (rs.next()){
//                textAutoAcompleter.addItem(rs.getString("Person_A_e_B_Encore_2017"));
//            }
//          // conecta.desconecta();
//        }catch(Exception de)
//        {
//          JOptionPane.showMessageDialog(this, de.getMessage());
//        }
        
    
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        // modelo = control.Primeiro();
        jTextFieldCod.setText("");
        jTextFieldSobrenome.setText("");
        //jTextFieldNome.setText("");
        //jComboBoxTipo.setSelectedItem("Sem seleção");
        // jComboBoxDepartamento.setSelectedItem("Sem seleção");
        jTextFieldEmpresaatual.setText("");
        jTextFieldCargoatual.setText("");
        jTextFieldEmailtrabalho.setText("nulo");
        jTextFieldSalario.setText("R$0");
        // jComboBoxEntrega.setSelectedItem("entregue");
        jTextFieldTeltrabalho.setText("nulo");
        jTextFieldOutros.setText("nulo");
        //  jComboBoxRecebimento.setSelectedItem("Não recebido");
        // jComboBoxCorreios.setSelectedItem("Malote");
        //        jTextField1.setText("Aguardando");
//        jTextFieldSobrenome.setEnabled(true);
//        jTextFieldEmpresaatual.setEnabled(true);
//        jTextFieldCargoatual.setEnabled(true);
//        jTextFieldEmailtrabalho.setEnabled(true);
//        jTextFieldSalario.setEnabled(true);
//        jTextFieldTeltrabalho.setEnabled(true);
//        jTextFieldOutros.setEnabled(true);
        //        jTextFieldHorario.setEnabled(false);
        //       // jComboBoxEntrega.setEnabled(true);
        //      //  jComboBoxCorreios.setEnabled(true);
        //        jButtonAlterar.setEnabled(true);
//        jButtonExcluir.setEnabled(true);
//        jButtonSalvar.setEnabled(true);
        //        jButtonNovo.setEnabled(false);
        //        jButtonReset.setEnabled(true);
        //jTextFieldPesquisar.setEnabled(true);
        //jButtonPesquisar.setEnabled(true);
        //  jTextField1log.setText(modelo.getLogin());
        //preenchertabela("select * from usuarios order by id");
        // enviatexto.setState(Consultador.NORMAL);
        //  enviatexto.recebendo(jTextField1log.getText());
        conecta.conectaBanco();
        preenchertabela("select * from clientes order by Clientes_id ");
        // where Usuario ='" + jTextField1log.getText()+"' order by id ");
       // conecta.desconecta();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jTextFieldSobrenomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldSobrenome.getText());
            preenchertabela("select * from Clientes where Person_A_e_B_Encore_2017 like '%" + jTextFieldSobrenome.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldSobrenomeKeyPressed

    private void jTextFieldSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSobrenomeActionPerformed

    private void jTextFieldSobrenomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeInputMethodTextChanged
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_jTextFieldSobrenomeInputMethodTextChanged

    private void jTextFieldSobrenomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeMouseClicked
        // TODO add your handling code here:
//         TextAutoCompleter textAutoAcompleter = new TextAutoCompleter( jTextFieldSobrenome);
//        conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//        Statement st=null;
//        ResultSet rs=null;
//        
//        try{
//            st = (Statement)minhaconexao.createStatement();
//            rs=st.executeQuery("SELECT DISTINCT Person_A_e_B_Encore_2017 from clientes"); 
//            
//            while (rs.next()){
//                textAutoAcompleter.addItem(rs.getString("Person_A_e_B_Encore_2017"));
//            }
//          // conecta.desconecta();
//        }catch(Exception de)
//        {
//          JOptionPane.showMessageDialog(this, de.getMessage());
//        }
      
    }//GEN-LAST:event_jTextFieldSobrenomeMouseClicked

    private void jTextFieldSobrenomeCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeCaretPositionChanged
        // TODO add your handling code here:
            
    }//GEN-LAST:event_jTextFieldSobrenomeCaretPositionChanged

    public void preenchertabela(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"PESSOA","EMPRESA","CARGOATUAL","SALARIO","TELEFONE","TELEFONEOUTROS","EMAIL","ID"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first();      
        do{
          dados.add(new Object[]{conecta.rs.getString("Person_A_e_B_Encore_2017"),conecta.rs.getString("Empresa"),conecta.rs.getString("Titulo_oficial"),conecta.rs.getString("Salary"),conecta.rs.getString("Work_Phone"),conecta.rs.getString("Outros"),conecta.rs.getString("Work_Email"),conecta.rs.getInt("Clientes_id")});
        }while(conecta.rs.next());
       // conecta.desconecta();
        } catch (SQLException ex) {
       //     JOptionPane.showMessageDialog(null, "Não existe dados cadastrados!");
        }
        
      
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEstado.setModel(modelo);
        jTableEstado.getColumnModel().getColumn(0).setPreferredWidth(165);
        jTableEstado.getColumnModel().getColumn(0).setResizable(false);
        jTableEstado.getColumnModel().getColumn(1).setPreferredWidth(165);
        jTableEstado.getColumnModel().getColumn(1).setResizable(false);
        jTableEstado.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableEstado.getColumnModel().getColumn(2).setResizable(false);
        jTableEstado.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTableEstado.getColumnModel().getColumn(3).setResizable(false);
        jTableEstado.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTableEstado.getColumnModel().getColumn(4).setResizable(false);
        jTableEstado.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTableEstado.getColumnModel().getColumn(5).setResizable(false);
        jTableEstado.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTableEstado.getColumnModel().getColumn(6).setResizable(false);
        jTableEstado.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTableEstado.getColumnModel().getColumn(7).setResizable(false);
        jTableEstado.getTableHeader().setReorderingAllowed(true);
        jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);
        jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }
    
     public void preenchertabelaa(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"ID","EMPRESA","RAMO","TIPO","DATA","HORARIO","CRIADOR"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first();      
        do{
          dados.add(new Object[]{conecta.rs.getInt("Empresas_id"),conecta.rs.getString("Company"),conecta.rs.getString("Ramo"),conecta.rs.getString("Tipo"),conecta.rs.getString("Data"),conecta.rs.getString("Horario"),conecta.rs.getString("Usuario")});
        }while(conecta.rs.next());
       // conecta.desconecta();
        } catch (SQLException ex) {
       //     JOptionPane.showMessageDialog(null, "Não existe dados cadastrados!");
        }
        
      
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEstado1.setModel(modelo);
        jTableEstado1.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableEstado1.getColumnModel().getColumn(0).setResizable(false);
        jTableEstado1.getColumnModel().getColumn(1).setPreferredWidth(165);
        jTableEstado1.getColumnModel().getColumn(1).setResizable(false);
        jTableEstado1.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableEstado1.getColumnModel().getColumn(2).setResizable(false);
        jTableEstado1.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableEstado1.getColumnModel().getColumn(3).setResizable(false);
        jTableEstado1.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTableEstado1.getColumnModel().getColumn(4).setResizable(false);
        jTableEstado1.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTableEstado1.getColumnModel().getColumn(5).setResizable(false);
        jTableEstado1.getColumnModel().getColumn(6).setPreferredWidth(80);
        jTableEstado1.getColumnModel().getColumn(6).setResizable(false);
        jTableEstado1.getTableHeader().setReorderingAllowed(true);
        jTableEstado1.setAutoResizeMode(jTableEstado1.AUTO_RESIZE_OFF);
        jTableEstado1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }
    
    
    
    
    
    
    
    
//    public Usuario buscaProduto(Usuario modelo){
//       conecta.conectaBanco();
//       conecta.executaSQL("select * from usuarios where data like '%" + modelo.getPesquisa() + "%' and Usuario ='" + jTextField1log.getText()+"'");
//       try  {
//           conecta.rs.first();
//            mod.setId(conecta.rs.getInt("id"));
//            mod.setEmpresa(conecta.rs.getString("empresa"));
//            mod.setDescricao(conecta.rs.getString("descricao"));
//            mod.setDestinatario(conecta.rs.getString("destinatario"));
//            mod.setDepartamento(conecta.rs.getString("departamento"));
//            mod.setData(conecta.rs.getString("data"));
//            mod.setDataentrega(conecta.rs.getString("dataentrega"));
//            mod.setHorario(conecta.rs.getString("horario")); 
//            mod.setEntrega(conecta.rs.getString("entrega"));
//            mod.setRecebimento(conecta.rs.getString("recebimento"));
//            mod.setCorreios(conecta.rs.getString("correio")); 
//            mod.setUsuario(conecta.rs.getString("usuario"));  
//       } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "Erro ao buscar a data!\nErro" + ex);  
//          // preenchertabela("select * from usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");
//       }
//      
//       return mod;
//        
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAlterar1;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonExcluir1;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonNovo1;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonReset1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSalvar1;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTable jTableEstado1;
    private javax.swing.JTextField jTextField1log;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCargoatual;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JFormattedTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEmailtrabalho;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldEmpresaatual;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JFormattedTextField jTextFieldHorario;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLog;
    private javax.swing.JTextField jTextFieldOutros;
    private javax.swing.JTextField jTextFieldRamo;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldSobrenome;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTeltrabalho;
    // End of variables declaration//GEN-END:variables

    public void recebendo(String recebe){
        jTextFieldLog.setText(recebe);
    }
}
