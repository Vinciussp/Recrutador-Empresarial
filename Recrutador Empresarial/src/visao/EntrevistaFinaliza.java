/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.mxrck.autocompleter.TextAutoCompleter;
import controle.AtualizaDia;
import controle.AtualizadoHora;
import controle.ConnectionConsulta;
import controle.ControleLoginUsuario;
import controle.conectar;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloLoginUsuario;
import modelo.ModeloTabela;
import modelo.Usuario;

/**
 *
 * @author vinicius
 */
public class EntrevistaFinaliza extends javax.swing.JFrame {

    ConnectionConsulta conecta = new ConnectionConsulta();
    Usuario mod = new Usuario();
    ModeloLoginUsuario modelo = new ModeloLoginUsuario();
    ControleLoginUsuario control = new ControleLoginUsuario();
    /**
     * Creates new form EntrevistaFinaliza
     */
    public EntrevistaFinaliza() {
        initComponents();
        this.setExtendedState(this.getExtendedState()|EntrevistaFinaliza.MAXIMIZED_BOTH);
        conecta.conectaBanco();
      //  preenchertabela("select * from Projetos order by Instant_Status ASC, Person ASC");
       // preenchertabela1("select * from Clientes order by Person_A_e_B_Encore_2017 ");
        AtualizadoHora.start(jLabelHorario);
        AtualizaDia.start(jLabelDia);
       items();
        itemm();
      //  itemms();
        itemmss();
//        Candidato();
    }
    
    public void items (){
        
        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter( jTextFieldProjeto);
        conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
        
        Statement st=null;
        ResultSet rs=null;
        
        try{
            st = (Statement)minhaconexao.createStatement();
            rs=st.executeQuery("SELECT DISTINCT projeto from projetos"); 
            
            while (rs.next()){
                textAutoAcompleter.addItem(rs.getString("projeto"));
            }
          // conecta.desconecta();
        }catch(Exception de)
        {
          JOptionPane.showMessageDialog(this, de.getMessage());
        }
        
    }
    
        public void itemm (){
        
        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(jTextFieldEmpresa);
        conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
        
        Statement st=null;
        ResultSet rs=null;
        
        try{
            st = (Statement)minhaconexao.createStatement();           
          //  rs=st.executeQuery("SELECT DISTINCT Empresa from projetos"); 
            rs=st.executeQuery("SELECT DISTINCT Company from Empresas");
            
            while (rs.next()){
                textAutoAcompleter.addItem(rs.getString("Company"));
            //    textAutoAcompleter.addItem(rs.getString("Empresa"));
            }
           // conecta.desconecta();
        }catch(Exception de)
        {
          JOptionPane.showMessageDialog(this, de.getMessage());
        }
        
    }
        
        
//        public void Candidato(){
//            
//        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(jTextFieldCandidato);
//        conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//        Statement st=null;
//        ResultSet rs=null;
//        
//        try{
//            st = (Statement)minhaconexao.createStatement();            
//            rs=st.executeQuery("SELECT DISTINCT Person_A_e_B_Encore_2017 from Clientes");
//            
//            while (rs.next()){
//                textAutoAcompleter.addItem(rs.getString("Person_A_e_B_Encore_2017"));
//            }
//           // conecta.desconecta();
//        }catch(Exception de)
//        {
//          JOptionPane.showMessageDialog(this, de.getMessage());
//        }
//        
//    }
        
        
        public void itemmss (){
            Statement st=null;
            ResultSet rs=null;
            conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
            try{
                
                st = (Statement)minhaconexao.createStatement();                   
                rs=st.executeQuery("SELECT DISTINCT Projeto from Projetos where Estatus_Geral = 'Aberto' order by Projeto");
                
                while(rs.next()){
                    String projeto =rs.getString("projeto");
                    jComboBoxProjetos.addItem(projeto);
                          
            }
     //    conecta.desconecta();
        }catch(Exception e){
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

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldHorario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldProjeto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jLabelDia = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxProjetos = new javax.swing.JComboBox<>();
        jTextFieldEndereço = new javax.swing.JTextField();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldLoginUsuario = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxStatusGeral = new javax.swing.JComboBox<>();
        jButtonFinalizar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEntrevista = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPaneResumo = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneNotasCliente = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldSalario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCandidato = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldOutros = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEmpresa2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldTelefoneTra = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneNotasComp = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableEntrevista1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados projeto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel22.setText("Telefone:");

        jTextFieldHorario.setEnabled(false);

        jLabel3.setText("Data de criação:");

        jLabel1.setText("Nome do Projeto:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Abertos.png"))); // NOI18N
        jButton2.setText("Abertos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldUsuario.setEnabled(false);

        jTextFieldData.setEnabled(false);
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        jTextFieldProjeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProjetoKeyPressed(evt);
            }
        });

        jLabel21.setText("Endereço:");

        jLabel2.setText("Empresa projeto:");

        jLabelDia.setText("jLabel20");

        jLabel19.setText("Usuário:");

        jLabelHorario.setText("jLabel20");

        jLabel6.setText("Usuário criador:");

        jComboBoxProjetos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProjetosItemStateChanged(evt);
            }
        });
        jComboBoxProjetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxProjetosMouseClicked(evt);
            }
        });
        jComboBoxProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProjetosActionPerformed(evt);
            }
        });

        jTextFieldEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpresaKeyPressed(evt);
            }
        });

        jLabel4.setText("Horário de criação:");

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("Projetos:");

        jTextFieldLoginUsuario.setEnabled(false);

        jLabel23.setText("CNPJ:");

        jTextFieldId.setEnabled(false);

        jLabel10.setText("Id:");

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novoprojeto.png"))); // NOI18N
        jButtonNovo.setText("Novo Projeto");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jLabel16.setText("Status do projeto:");

        jComboBoxStatusGeral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem seleção", "Aberto", "Fechado" }));

        jButtonFinalizar.setText("Alterar status do projeto");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jLabel26.setText("Código:");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechados.png"))); // NOI18N
        jButton5.setText("Fechados");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTableEntrevista.setBackground(new java.awt.Color(102, 255, 255));
        jTableEntrevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEntrevista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEntrevistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEntrevista);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("Profissionais do projeto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(361, 361, 361))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel21)))
                                    .addGap(1, 1, 1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel23)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addComponent(jButtonNovo))
                                    .addComponent(jTextFieldEndereço))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxStatusGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonFinalizar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(230, 230, 230)
                                .addComponent(jLabelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jComboBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDia)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelHorario)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextFieldProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jComboBoxStatusGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonFinalizar)
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel19)
                            .addComponent(jTextFieldLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jTextFieldEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNovo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados profissionais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel15.setText("Notas de entrevista:");

        jScrollPane4.setViewportView(jTextPaneResumo);

        jScrollPane2.setViewportView(jTextPaneNotasCliente);

        jLabel13.setText(" Notas do cliente:");

        jLabel17.setText("Salário:");

        jLabel7.setText("Profissional:");

        jTextFieldCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCandidatoMouseClicked(evt);
            }
        });
        jTextFieldCandidato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCandidatoKeyPressed(evt);
            }
        });

        jLabel18.setText("Celular:");

        jLabel8.setText("Empresa atual:");

        jTextFieldEmpresa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpresa2KeyPressed(evt);
            }
        });

        jLabel14.setText("Telefone:");

        jScrollPane3.setViewportView(jTextPaneNotasComp);

        jLabel11.setText(" Notas de benefício:");

        jLabel5.setText("Email:");

        jLabel9.setText("Cargo atual:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novocand.png"))); // NOI18N
        jButton1.setText("Novo Candidato");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Status:");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem seleção", "Aguardando CV", "Analisando", "Bloqueado", "Contatando", "Controle Referências", "Desistiu do Processo", "Entrevista Cliente", "Entrevista Consultor", "Finalista", "Indicado", "Indicou Pessoas", "Junior", "Não Interessado", "Não Localizado", "Pedida Indicação", "Perfil Enviado", "Recado", "Recrutado", "Reenvio de Perfil", "Rejeitado Cliente", "Rejeitado Consultor", "Relatório Cliente", "Reprovado Entrevista", "Reserva", "Sobre-qualificado", "Source", "Via Site" }));

        jTableEntrevista1.setBackground(new java.awt.Color(102, 255, 255));
        jTableEntrevista1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEntrevista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEntrevista1MouseClicked(evt);
            }
        });
        jTableEntrevista1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableEntrevista1KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTableEntrevista1);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Adicionar botao.png"))); // NOI18N
        jButton3.setText("Add Profissional existe");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Addsem.png"))); // NOI18N
        jButton4.setText("Add Profissional inexistente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir dado.png"))); // NOI18N
        jButtonExcluir.setText("Excluir Profissional do projeto");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        Alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Alterar dados.png"))); // NOI18N
        Alterar.setText("Alterar dados do projeto");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("Resultado Pesquisa:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(Alterar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExcluir)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTelefoneTra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel12)))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextFieldTelefoneTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonExcluir)
                            .addComponent(Alterar)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1363, 766));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextFieldId.setText("");
        jTextFieldProjeto.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldEmpresa.setText("");
        jTextFieldTelefone.setText("Nulo");
        jTextFieldEndereço.setText("Nulo");
        jTextFieldCNPJ.setText("Nulo");
        jTextFieldData.setText("");
        jTextFieldHorario.setText("");
        jTextFieldData.setText("");
        jTextFieldUsuario.setText("");
        jComboBoxStatusGeral.setSelectedItem("Aberto");
        
        //jTextFieldCandidato.setText("");
       // jTextFieldEmpresa2.setText("");
        //jTextFieldCargo.setText("");
        //jTextFieldSalario.setText("R$0");
       // jTextFieldTelefoneTra.setText("Nulo");
       // jTextFieldOutros.setText("Nulo");
        //jTextFieldEmail.setText("Nulo");
       // jComboBoxStatus.setSelectedItem("Sem seleção");
       // jComboBoxStatusGeral.setSelectedItem("Aberto");
      //  jTextPaneResumo.setText("Nulo");
      // jTextPaneNotasCliente.setText("Nulo");
       // jTextPaneNotasComp.setText("Nulo");
    //    jTableEntrevista.clearSelection(this);
	
        //jTextFieldSobrenome.setEnabled(true);
       // jTextFieldEmpresaatual.setEnabled(true);
      //  jTextFieldCargoatual.setEnabled(true);
       // jComboBoxDepartamento.setEnabled(true);
       // jTextFieldData.setEnabled(false);
       // jTextFieldDataEntrega.setEnabled(true);
      //  jTextFieldHorario.setEnabled(false);
       // jComboBoxEntrega.setEnabled(true);
      //  jComboBoxCorreios.setEnabled(true);
       // jButtonAlterar.setEnabled(true);
      //  jButtonExcluir.setEnabled(false);
      // jButtonSalvar.setEnabled(true);
      //  jButtonNovo.setEnabled(false);
      //  jButtonReset.setEnabled(true);
    // conecta.conectaBanco();
     // preenchertabela("select * from Projetos order by Instant_Status ASC, Person ASC");
      // where Usuario ='" + jTextField1log.getText()+"' order by id ");
               // conecta.desconecta(); 
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldProjetoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProjetoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldProjeto.getText());
            preenchertabela("select * from projetos where Projeto Like '%" + jTextFieldProjeto.getText() + "%' order by Instant_Status ASC, Person ASC");
        }
    }//GEN-LAST:event_jTextFieldProjetoKeyPressed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        // TODO add your handling code here:
         try {
            PreparedStatement pst = conecta.conn.prepareStatement("update Projetos set Empresa=?, Telefone=?, Endereço=?, Cnpj=?, Data_criacao=?, Horario_criacao=?, Criador=?, Person=?, Company=?, Official_Title=?, Salary=?, Work_Phone=?, Other_Phone_1=?, Work_Email=?, Instant_Status=?, Summary_Notes=?, For_Client_Notes=?, Compensation_Notes=?  where Projetos_id=?");
         //   pst.setString(1, (String) jComboBoxCompareceu.getSelectedItem());
         //   pst.setString(2, (String) jComboBoxCorrigiu.getSelectedItem());
         //   pst.setString(3,(String) jComboBoxRetorno.getSelectedItem());
        // pst.setString(1,jTextFieldProjeto.getText());
         pst.setString(1,jTextFieldEmpresa.getText());
         pst.setString(2,jTextFieldTelefone.getText());
         pst.setString(3,jTextFieldEndereço.getText());
         pst.setString(4,jTextFieldCNPJ.getText());
         pst.setString(5,jTextFieldData.getText());
         pst.setString(6,jTextFieldHorario.getText());
         pst.setString(7,jTextFieldUsuario.getText());
         pst.setString(8,jTextFieldCandidato.getText());
         pst.setString(9,jTextFieldEmpresa2.getText());
         pst.setString(10,jTextFieldCargo.getText());
         pst.setString(11,jTextFieldSalario.getText());
         pst.setString(12,jTextFieldTelefoneTra.getText());
         pst.setString(13,jTextFieldOutros.getText());
         pst.setString(14,jTextFieldEmail.getText());
         pst.setString(15,(String) jComboBoxStatus.getSelectedItem());
        // pst.setString(14,(String) jComboBoxStatusGeral.getSelectedItem());
         pst.setString(16,jTextPaneResumo.getText());
         pst.setString(17,jTextPaneNotasCliente.getText());
         pst.setString(18,jTextPaneNotasComp.getText());        
         pst.setInt(19,Integer.parseInt(jTextFieldId.getText()));           
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Alterado com sucesso");
            //preenchertabela("select * from usuarios order by id");
           // preenchertabela("select * from entrevistas where Usuario ='" + jTextFieldUsuario.getText()+"' order by idEntrevistas ");
      //  preenchertabela("select * from Projetos order by Instant_Status ASC, Person ASC ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao alterar!\n Erro: "+ex);
        }
         
         
           try {
             conecta.conectaBanco();
        PreparedStatement pst = conecta.conn.prepareStatement("update Projetos set Codigo=? where Projeto=? and Empresa=? ");

        pst.setString(1,jTextFieldCodigo.getText());
//        pst.setString(14,jTextPaneResumo.getText());
//        pst.setString(15,jTextPaneNotasCliente.getText());
//        pst.setString(16,jTextPaneNotasComp.getText());
        pst.setString(2,jTextFieldProjeto.getText());
        pst.setString(3,jTextFieldEmpresa.getText());

            pst.execute();
            //JOptionPane.showMessageDialog(rootPane,"Alterado com sucesso");

            //conecta.desconecta();
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao alterar!\n Erro: "+ex);
           }
         
         
         
         try {
             conecta.conectaBanco();
        PreparedStatement pst = conecta.conn.prepareStatement("update Projetos set Projeto=? where Codigo=? and Empresa=?");

        pst.setString(1,jTextFieldProjeto.getText());
//        pst.setString(14,jTextPaneResumo.getText());
//        pst.setString(15,jTextPaneNotasCliente.getText());
//        pst.setString(16,jTextPaneNotasComp.getText());
        pst.setString(2,jTextFieldCodigo.getText());
        pst.setString(3,jTextFieldEmpresa.getText());

            pst.execute();
           // JOptionPane.showMessageDialog(rootPane,"Alterado com sucesso");

            //conecta.desconecta();
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao alterar!\n Erro: "+ex);
           }
//         Statement st=null;
//            ResultSet rs=null;
//            conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//            try{
//                jComboBoxProjetos.removeAllItems();
//                st = (Statement)minhaconexao.createStatement();                   
//                rs=st.executeQuery("SELECT DISTINCT Projeto from Projetos order by Projeto");
//                
//                while(rs.next()){
//                    String projeto =rs.getString("projeto");
//                    jComboBoxProjetos.addItem(projeto);
//                          
//            }
//     //    conecta.desconecta();
//        }catch(Exception e){
//}
    }//GEN-LAST:event_AlterarActionPerformed

    private void jTableEntrevistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEntrevistaMouseClicked
        // TODO add your handling code here:
        String IdProjetos = ""+jTableEntrevista.getValueAt(jTableEntrevista.getSelectedRow(), 6);
        conecta.conectaBanco();
        conecta.executaSQL("select * from Projetos where Projetos_id='"+ IdProjetos +"'order by Instant_Status ASC, Person ASC");
        
        try {
        conecta.rs.first();
        jTextFieldCandidato.setText(conecta.rs.getString("Person"));
        jTextFieldEmpresa2.setText(conecta.rs.getString("Company"));
        jTextFieldTelefone.setText(conecta.rs.getString("Telefone"));
        jTextFieldEndereço.setText(conecta.rs.getString("Endereço"));
        jTextFieldCNPJ.setText(conecta.rs.getString("Cnpj"));
        jTextFieldCargo.setText(conecta.rs.getString("Official_Title"));
        jTextFieldSalario.setText(conecta.rs.getString("Salary")); 
        jComboBoxStatus.setSelectedItem(conecta.rs.getString("Instant_Status"));
        jTextFieldOutros.setText(conecta.rs.getString("Other_Phone_1"));
        jTextFieldTelefoneTra.setText(conecta.rs.getString("Work_Phone"));
        jTextFieldEmail.setText(conecta.rs.getString("Work_Email")); 
        jTextFieldUsuario.setText(conecta.rs.getString("Criador"));
        jTextPaneResumo.setText(conecta.rs.getString("Summary_Notes"));
        jTextPaneNotasCliente.setText(conecta.rs.getString("For_Client_Notes"));
        jTextPaneNotasComp.setText(conecta.rs.getString("Compensation_Notes"));
        jComboBoxStatusGeral.setSelectedItem(conecta.rs.getString("Estatus_Geral"));
        jTextFieldData.setText(conecta.rs.getString("Data_criacao"));
        jTextFieldHorario.setText(conecta.rs.getString("Horario_criacao"));
        jTextFieldProjeto.setText(conecta.rs.getString("Projeto"));
        jTextFieldCodigo.setText(conecta.rs.getString("Codigo"));
        jTextFieldEmpresa.setText(conecta.rs.getString("Empresa"));
        jTextFieldId.setText(String.valueOf(conecta.rs.getInt("Projetos_id")));
       // jComboBoxRetorno.setSelectedItem(conecta.rs.getString("Retorno"));
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao selecionar os dados!\n Erro: "+ex);
        }
    }//GEN-LAST:event_jTableEntrevistaMouseClicked

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jTextFieldEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpresaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

           mod.setPesquisa(jTextFieldEmpresa.getText());
           preenchertabela2("select * from empresas where Company like '%" + jTextFieldEmpresa.getText() + "%' ");
        }
    }//GEN-LAST:event_jTextFieldEmpresaKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jTextFieldProjeto.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Projeto!");}
else{if(jTextFieldCodigo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Codigo!");}
else{if(jTextFieldEmpresa.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Empresa!");}
else{if(jTextFieldCandidato.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Candidato!");}
else{if(jTextFieldEmpresa2.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Empresa!");}
else{if(jTextFieldCargo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Cargo!");}
else{if(jTextFieldSalario.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Salario!");}
else{if(jTextFieldTelefoneTra.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Telefone Trabalho!");}
else{if(jTextFieldOutros.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Outros!");}
else{if(jTextFieldEmail.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Email!");}
else{if(jTextPaneResumo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Resumo!");}
else{if(jTextPaneNotasCliente.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Notas cliente!");}
else{if(jTextPaneNotasComp.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Notas de compensação!");}
else{
        try{
            conecta.conectaBanco();
        PreparedStatement pst = conecta.conn.prepareStatement("insert into Projetos (Projeto, Empresa, Codigo, Telefone, Endereço, Cnpj, Data_criacao, Horario_criacao, Criador, Person, Company, Official_Title, Salary, Work_Phone, Other_Phone_1, Work_Email, Instant_Status, Estatus_Geral, Summary_Notes, For_Client_Notes, Compensation_Notes)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1,jTextFieldProjeto.getText());
        pst.setString(2,jTextFieldCodigo.getText());
        pst.setString(3,jTextFieldEmpresa.getText());
        pst.setString(4,jTextFieldTelefone.getText());
        pst.setString(5,jTextFieldEndereço.getText());
        pst.setString(6,jTextFieldCNPJ.getText());
        pst.setString(7,jLabelDia.getText());
        pst.setString(8,jLabelHorario.getText());
        pst.setString(9,jTextFieldLoginUsuario.getText());
        pst.setString(10,jTextFieldCandidato.getText());
        pst.setString(11,jTextFieldEmpresa2.getText());
        pst.setString(12,jTextFieldCargo.getText());
        pst.setString(13,jTextFieldSalario.getText());
        pst.setString(14,jTextFieldTelefoneTra.getText());
        pst.setString(15,jTextFieldOutros.getText());
        pst.setString(16,jTextFieldEmail.getText());
        pst.setString(17,(String) jComboBoxStatus.getSelectedItem());
        pst.setString(18,(String)jComboBoxStatusGeral.getSelectedItem());
        pst.setString(19,jTextPaneResumo.getText());
        pst.setString(20,jTextPaneNotasCliente.getText());
        pst.setString(21,jTextPaneNotasComp.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(rootPane,"Salvo com sucesso, Profissional Existente");
        //preenchertabela("select * from usuarios order by id");
        preenchertabela("select * from Projetos where projeto ='" + jTextFieldProjeto.getText()+"' order by Instant_Status ASC, Person ASC");
            // usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");    
       //conecta.desconecta(); 
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
//        jTextFieldId.setText("");
//        jTextFieldProjeto.setText("");
//        jTextFieldEmpresa.setText("");
//        jTextFieldData.setText("");
//        jTextFieldHorario.setText("");
//        jTextFieldData.setText("");
//        jTextFieldUsuario.setText("");
//        jTextFieldCandidato.setText("");
//        jTextFieldEmpresa2.setText("");
//        jTextFieldCargo.setText("");
//        jTextFieldSalario.setText("R$0");
//        jTextFieldTelefoneTra.setText("Nulo");
//        jTextFieldOutros.setText("Nulo");
//        jTextFieldEmail.setText("Nulo");
//        jComboBoxStatus.setSelectedItem("Sem seleção");
//        jComboBoxStatusGeral.setSelectedItem("Sem seleção");
//        jTextPaneResumo.setText("Nulo");
//        jTextPaneNotasCliente.setText("Nulo");
//        jTextPaneNotasComp.setText("Nulo");       
}
}
}
}
}
}
}
}
}
}
}
}
        
//        Statement st=null;
//            ResultSet rs=null;
//            conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//            try{
//                jComboBoxProjetos.removeAllItems();
//                st = (Statement)minhaconexao.createStatement();                   
//                rs=st.executeQuery("SELECT DISTINCT Projeto from Projetos order by Projeto");
//                
//                while(rs.next()){
//                    String projeto =rs.getString("projeto");
//                    jComboBoxProjetos.addItem(projeto);
//                          
//            }
//     //    conecta.desconecta();
//        }catch(Exception e){
//}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        // TODO add your handling code here:
//           if(jTextFieldProjeto.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Projeto!");}
//else{if(jTextFieldEmpresa.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Empresa!");}
//else{if(jTextFieldCandidato.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Candidato!");}
//else{if(jTextFieldEmpresa2.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Empresa!");}
//else{if(jTextFieldCargo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Cargo!");}
//else{if(jTextFieldSalario.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Salario!");}
//else{if(jTextFieldTelefoneTra.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Telefone Trabalho!");}
//else{if(jTextFieldOutros.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Outros!");}
//else{if(jTextFieldEmail.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Email!");}
//else{if(jTextPaneResumo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Resumo!");}
//else{if(jTextPaneNotasCliente.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Notas cliente!");}
//else{if(jTextPaneNotasComp.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Notas de compensação!");}
//else{
         try {
             conecta.conectaBanco();
        PreparedStatement pst = conecta.conn.prepareStatement("update Projetos set Estatus_Geral=? where Projeto=?");
//        pst.setString(1,jTextFieldEmpresa.getText());
//        pst.setString(2,jLabelDia.getText());
//        pst.setString(3,jLabelHorario.getText());
//        pst.setString(4,jTextFieldUsuario.getText());
//        pst.setString(5,jTextFieldCandidato.getText());
//        pst.setString(6,jTextFieldEmpresa2.getText());
//        pst.setString(7,jTextFieldCargo.getText());
//        pst.setString(8,jTextFieldSalario.getText());
//        pst.setString(9,jTextFieldTelefoneTra.getText());
//        pst.setString(10,jTextFieldOutros.getText());
//        pst.setString(11,jTextFieldEmail.getText());
//        pst.setString(12,(String) jComboBoxStatus.getSelectedItem());
        pst.setString(1,(String)jComboBoxStatusGeral.getSelectedItem());
//        pst.setString(14,jTextPaneResumo.getText());
//        pst.setString(15,jTextPaneNotasCliente.getText());
//        pst.setString(16,jTextPaneNotasComp.getText());
        pst.setString(2,jTextFieldProjeto.getText());

            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Alterado com sucesso");
           // preenchertabela("select * from Projetos order by Instant_Status ASC, Person ASC");
           // preenchertabela("select usuarios.* from usuarios INNER JOIN login on usuarios.destinatario = login.area where login = '" + jTextFieldBaixa.getText()+"' and recebimento = 'Não recebido' order by id");
//             jTextFieldId.setText("");
//        jTextFieldProjeto.setText("");
//        jTextFieldEmpresa.setText("");
//        jTextFieldData.setText("");
//        jTextFieldHorario.setText("");
//        jTextFieldData.setText("");
//        jTextFieldUsuario.setText("");
//        jTextFieldCandidato.setText("");
//        jTextFieldEmpresa2.setText("");
//        jTextFieldCargo.setText("");
//        jTextFieldSalario.setText("R$0");
//        jTextFieldTelefoneTra.setText("Nulo");
//        jTextFieldOutros.setText("Nulo");
//        jTextFieldEmail.setText("Nulo");
//        jComboBoxStatus.setSelectedItem("Sem seleção");
//        jComboBoxStatusGeral.setSelectedItem("Sem seleção");
//        jTextPaneResumo.setText("Nulo");
//        jTextPaneNotasCliente.setText("Nulo");
//        jTextPaneNotasComp.setText("Nulo");   
      
            //conecta.desconecta();
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao alterar!\n Erro: "+ex);
           }
          
           
//}
//}
//}
//}
//}
//}
//}
//}
//}
//}
//}
//}
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jTableEntrevista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEntrevista1MouseClicked
        // TODO add your handling code here:
          String IdClientes = ""+jTableEntrevista1.getValueAt(jTableEntrevista1.getSelectedRow(), 0);
        conecta.conectaBanco();
        conecta.executaSQL("select * from Clientes where Person_A_e_B_Encore_2017='"+ IdClientes +"'");
        
        try {
        conecta.rs.first();
        //jTextFieldId.setText(String.valueOf(conecta.rs.getInt("Projetos_id")));
        jTextFieldCandidato.setText(conecta.rs.getString("Person_A_e_B_Encore_2017"));
        jTextFieldEmpresa2.setText(conecta.rs.getString("Empresa"));
        jTextFieldCargo.setText(conecta.rs.getString("Titulo_oficial"));
        jTextFieldSalario.setText(conecta.rs.getString("Salary"));
        jTextFieldTelefoneTra.setText(conecta.rs.getString("Work_Phone")); 
        jTextFieldOutros.setText(conecta.rs.getString("Outros"));   
        jTextFieldEmail.setText(conecta.rs.getString("Work_Email")); 
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você deve pressionar ENTER!\n Erro: "+ex);
        }
        jComboBoxStatus.setSelectedItem("Sem seleção");
        
    }//GEN-LAST:event_jTableEntrevista1MouseClicked

    private void jTextFieldCandidatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCandidatoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldCandidato.getText());
            preenchertabela1("select * from Clientes where Person_A_e_B_Encore_2017 like '%" + jTextFieldCandidato.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldCandidatoKeyPressed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        try {
            conecta.conectaBanco();
            PreparedStatement pst = conecta.conn.prepareStatement("delete from projetos where Projetos_id= ?");
            pst.setString(1,jTextFieldId.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Excluido com sucesso");
            //preenchertabela("select * from usuarios order by id");
           // preenchertabela("select * from Projetos order by Instant_Status ASC, Person ASC ");
          //  conecta.desconecta(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao excluir!\n Erro: "+ex);
        }
       // jTextFieldCod.setText("");
       // jTextFieldSobrenome.setText("");
     //   jTextFieldNome.setText("");
      //  jComboBoxTipo.setSelectedItem("");
       // jComboBoxDepartamento.setSelectedItem("");
      //  jTextFieldData.setText("");
      //  jTextFieldDataEntrega.setText("");
      //  jTextFieldHorario.setText("");
      //  jTextFieldSobrenome.setEnabled(false);
     //   jTextFieldNome.setEnabled(false);
    //    jComboBoxTipo.setEnabled(false);
      //  jComboBoxDepartamento.setEnabled(false);
      //  jTextFieldData.setEnabled(false);
      //  jTextFieldDataEntrega.setEnabled(false);
       // jTextFieldHorario.setEnabled(false);
       // jButtonAlterar.setEnabled(false);
       // jButtonExcluir.setEnabled(false);
       // jButtonSalvar.setEnabled(false);
       // jButtonNovo.setEnabled(true);
       
//       Statement st=null;
//            ResultSet rs=null;
//            conecta.conectaBanco();
//        Connection minhaconexao = conectar.GetConnection();
//        
//            try{
//                jComboBoxProjetos.removeAllItems();
//                st = (Statement)minhaconexao.createStatement();                   
//                rs=st.executeQuery("SELECT DISTINCT Projeto from Projetos order by Projeto");
//                
//                while(rs.next()){
//                    String projeto =rs.getString("projeto");
//                    jComboBoxProjetos.addItem(projeto);
//                          
//            }
//     //    conecta.desconecta();
//        }catch(Exception e){
//}
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jComboBoxProjetosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProjetosItemStateChanged
        
   // if(evt.getStateChange () == ItemEvent.SELECTED) { 
//        conecta.conectaBanco();
//        preenchertabela("select * from Projetos where Projeto like '%" + jComboBoxProjetos.getSelectedItem() + "%' order by Instant_Status ASC, Person ASC");
        jTextFieldProjeto.setText((String) jComboBoxProjetos.getSelectedItem());
      //  conecta.desconecta();     
    //}
    }//GEN-LAST:event_jComboBoxProjetosItemStateChanged

    private void jComboBoxProjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxProjetosMouseClicked
        // TODO add your handling code here:
           
    }//GEN-LAST:event_jComboBoxProjetosMouseClicked

    private void jComboBoxProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProjetosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProjetosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
            Statement st=null;
            ResultSet rs=null;
            conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
        
            try{
                jComboBoxProjetos.removeAllItems();
                st = (Statement)minhaconexao.createStatement();                   
                rs=st.executeQuery("SELECT DISTINCT Projeto from Projetos where Estatus_Geral = 'Aberto' order by Projeto");
                
                while(rs.next()){
                    String projeto =rs.getString("projeto");
                    jComboBoxProjetos.addItem(projeto);
                          
            }
     //    conecta.desconecta();
        }catch(Exception e){
}
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableEntrevista1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableEntrevista1KeyPressed
        // TODO add your handling code here:
         String IdEmpresas = ""+jTableEntrevista1.getValueAt(jTableEntrevista1.getSelectedRow(), 4);
        conecta.conectaBanco();
        conecta.executaSQL("select * from empresas where Empresas_id='"+ IdEmpresas +"'");
        
        try {
        conecta.rs.first();
        //jTextFieldId.setText(String.valueOf(conecta.rs.getInt("Projetos_id")));
//        jTextFieldCandidato.setText(conecta.rs.getString("Person_A_e_B_Encore_2017"));
          jTextFieldEmpresa.setText(conecta.rs.getString("Company"));
//        jTextFieldCargo.setText(conecta.rs.getString("Titulo_oficial"));
          jTextFieldTelefone.setText(conecta.rs.getString("Telefone"));
          jTextFieldEndereço.setText(conecta.rs.getString("Endereco"));
          jTextFieldCNPJ.setText(conecta.rs.getString("Cnpj"));
//        jTextFieldTelefoneTra.setText(conecta.rs.getString("Work_Phone")); 
//        jTextFieldOutros.setText(conecta.rs.getString("Outros"));   
//        jTextFieldEmail.setText(conecta.rs.getString("Work_Email")); 
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao selecionar os dados!\n Erro: "+ex);
        }
    }//GEN-LAST:event_jTableEntrevista1KeyPressed

    private void jTextFieldCandidatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCandidatoMouseClicked
        // TODO add your handling code here:
//        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(jTextFieldCandidato);
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
    }//GEN-LAST:event_jTextFieldCandidatoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          jTextFieldId.setText("");
        //jTextFieldProjeto.setText("");
        //jTextFieldEmpresa.setText("");
        //jTextFieldTelefone.setText("Nulo");
       // jTextFieldEndereço.setText("Nulo");
      //  jTextFieldCNPJ.setText("Nulo");
      //  jTextFieldData.setText("");
      //  jTextFieldHorario.setText("");
    //    jTextFieldData.setText("");
      //  jTextFieldUsuario.setText("");
        jTextFieldCandidato.setText("");
        jTextFieldEmpresa2.setText("");
        jTextFieldCargo.setText("");
        jTextFieldSalario.setText("R$0");
        jTextFieldTelefoneTra.setText("Nulo");
        jTextFieldOutros.setText("Nulo");
        jTextFieldEmail.setText("Nulo");
        jComboBoxStatus.setSelectedItem("Sem seleção");
        
        jTextPaneResumo.setText("Nulo");
        jTextPaneNotasCliente.setText("Nulo");
        jTextPaneNotasComp.setText("Nulo");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         if(jTextFieldProjeto.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Projeto!");}
else{if(jTextFieldCodigo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Código!");}
else{if(jTextFieldEmpresa.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Empresa!");}
else{if(jTextFieldCandidato.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Candidato!");}
else{if(jTextFieldEmpresa2.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Empresa!");}
else{if(jTextFieldCargo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Cargo!");}
else{if(jTextFieldSalario.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Salario!");}
else{if(jTextFieldTelefoneTra.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Telefone Trabalho!");}
else{if(jTextFieldOutros.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Outros!");}
else{if(jTextFieldEmail.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Email!");}
else{if(jTextPaneResumo.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Resumo!");}
else{if(jTextPaneNotasCliente.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Notas cliente!");}
else{if(jTextPaneNotasComp.getText().equals("")){JOptionPane.showMessageDialog(null,"Preencha o campo Notas de compensação!");}
else{
        try{
            conecta.conectaBanco();
        PreparedStatement pst = conecta.conn.prepareStatement("insert into Projetos (Projeto, Codigo, Empresa, Telefone, Endereço, Cnpj, Data_criacao, Horario_criacao, Criador, Person, Company, Official_Title, Salary, Work_Phone, Other_Phone_1, Work_Email, Instant_Status, Estatus_Geral, Summary_Notes, For_Client_Notes, Compensation_Notes)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1,jTextFieldProjeto.getText());
        pst.setString(2,jTextFieldCodigo.getText());
        pst.setString(3,jTextFieldEmpresa.getText());
        pst.setString(4,jTextFieldTelefone.getText());
        pst.setString(5,jTextFieldEndereço.getText());
        pst.setString(6,jTextFieldCNPJ.getText());
        pst.setString(7,jLabelDia.getText());
        pst.setString(8,jLabelHorario.getText());
        pst.setString(9,jTextFieldLoginUsuario.getText());
        pst.setString(10,jTextFieldCandidato.getText());
        pst.setString(11,jTextFieldEmpresa2.getText());
        pst.setString(12,jTextFieldCargo.getText());
        pst.setString(13,jTextFieldSalario.getText());
        pst.setString(14,jTextFieldTelefoneTra.getText());
        pst.setString(15,jTextFieldOutros.getText());
        pst.setString(16,jTextFieldEmail.getText());
        pst.setString(17,(String) jComboBoxStatus.getSelectedItem());
        pst.setString(18,(String)jComboBoxStatusGeral.getSelectedItem());
        pst.setString(19,jTextPaneResumo.getText());
        pst.setString(20,jTextPaneNotasCliente.getText());
        pst.setString(21,jTextPaneNotasComp.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(rootPane,"Salvo com sucesso, Profissional novo");
        //preenchertabela("select * from usuarios order by id");
        preenchertabela("select * from Projetos where projeto ='" + jTextFieldProjeto.getText()+"' order by Instant_Status ASC, Person ASC");
            // usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");    
       //conecta.desconecta(); 
        } catch (SQLException ex) {                        
            JOptionPane.showMessageDialog(rootPane,"Erro na Inserção!\n Erro: "+ex);
        }
        
        try{
            conecta.conectaBanco();
        PreparedStatement pst = conecta.conn.prepareStatement("insert into Clientes (Dia, horario, Criador, Person_A_e_B_Encore_2017, Empresa, Titulo_oficial, Salary, Work_Phone, Outros, Work_Email)values (?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1,jLabelDia.getText());
        pst.setString(2,jLabelHorario.getText());
        pst.setString(3,jTextFieldLoginUsuario.getText());
        pst.setString(4,jTextFieldCandidato.getText());
        pst.setString(5,jTextFieldEmpresa2.getText());
        pst.setString(6,jTextFieldCargo.getText());
        pst.setString(7,jTextFieldSalario.getText());
        pst.setString(8,jTextFieldTelefoneTra.getText());
        pst.setString(9,jTextFieldOutros.getText());
        pst.setString(10,jTextFieldEmail.getText());
        pst.executeUpdate();
       // JOptionPane.showMessageDialog(rootPane,"Salvo com sucesso");
        //preenchertabela("select * from usuarios order by id");
        //preenchertabela("select * from Projetos where projeto ='" + jTextFieldProjeto.getText()+"' order by Instant_Status ASC, Person ASC");
            // usuarios where Usuario ='" + jTextField1log.getText()+"' order by id ");    
       //conecta.desconecta(); 
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
//        jTextFieldId.setText("");
//        jTextFieldProjeto.setText("");
//        jTextFieldEmpresa.setText("");
//        jTextFieldData.setText("");
//        jTextFieldHorario.setText("");
//        jTextFieldData.setText("");
//        jTextFieldUsuario.setText("");
//        jTextFieldCandidato.setText("");
//        jTextFieldEmpresa2.setText("");
//        jTextFieldCargo.setText("");
//        jTextFieldSalario.setText("R$0");
//        jTextFieldTelefoneTra.setText("Nulo");
//        jTextFieldOutros.setText("Nulo");
//        jTextFieldEmail.setText("Nulo");
//        jComboBoxStatus.setSelectedItem("Sem seleção");
//        jComboBoxStatusGeral.setSelectedItem("Sem seleção");
//        jTextPaneResumo.setText("Nulo");
//        jTextPaneNotasCliente.setText("Nulo");
//        jTextPaneNotasComp.setText("Nulo");       
}
}
}
}
}
}
}
}
}
}
}
}   
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          Statement st=null;
            ResultSet rs=null;
            conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
        
            try{
                jComboBoxProjetos.removeAllItems();
                st = (Statement)minhaconexao.createStatement();                   
                rs=st.executeQuery("SELECT DISTINCT Projeto from Projetos where Estatus_Geral = 'Fechado' order by Projeto");
                
                while(rs.next()){
                    String projeto =rs.getString("projeto");
                    jComboBoxProjetos.addItem(projeto);
                          
            }
     //    conecta.desconecta();
        }catch(Exception e){
}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldEmpresa2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpresa2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldEmpresa2.getText());
            preenchertabela1("select * from Clientes where Empresa like '%" + jTextFieldEmpresa2.getText() + "%'");
        }
    }//GEN-LAST:event_jTextFieldEmpresa2KeyPressed

     public void preenchertabela(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"PROFISSIONAL","EMPRESAATUAL","CARGOATUAL","SALARIO","STATUS","PROJETO","ID"};
            //"OUTROSTELEFONES","TELEFONETRABALHO","EMAILTRABALHO","CRIADOR","NOTASENTREVISTA","NOTASCLIENTE","NOTASCOMPENSAÇÃO","STATUSGERAL","DATACRIAÇÃO","HORARIOCRIAÇAO","PROJETO","EMPRESA","ID"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first();      
        do{
          dados.add(new Object[]{conecta.rs.getString("Person"),conecta.rs.getString("Company"),conecta.rs.getString("Official_Title"),conecta.rs.getString("Salary"),conecta.rs.getString("Instant_Status"),conecta.rs.getString("Projeto"),conecta.rs.getString("Projetos_id")});
              //conecta.rs.getString("Other_Phone_1"),conecta.rs.getString("Work_Phone"),conecta.rs.getString("Work_Email"),conecta.rs.getString("Criador"),conecta.rs.getString("Summary_Notes"),conecta.rs.getString("For_Client_Notes"),conecta.rs.getString("Compensation_Notes"),conecta.rs.getString("Estatus_Geral"),conecta.rs.getString("Data_criacao"),conecta.rs.getString("Horario_criacao"),conecta.rs.getString("Projeto"),conecta.rs.getString("Empresa"),conecta.rs.getInt("Projetos_id")});
        }while(conecta.rs.next());
        } catch (SQLException ex) {
       //     JOptionPane.showMessageDialog(null, "Não existe dados cadastrados!");
        }
        
      
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEntrevista.setModel(modelo);
        jTableEntrevista.getColumnModel().getColumn(0).setPreferredWidth(230);
        jTableEntrevista.getColumnModel().getColumn(0).setResizable(false);
        jTableEntrevista.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableEntrevista.getColumnModel().getColumn(1).setResizable(false);
        jTableEntrevista.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTableEntrevista.getColumnModel().getColumn(2).setResizable(false);
        jTableEntrevista.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTableEntrevista.getColumnModel().getColumn(3).setResizable(false);
        jTableEntrevista.getColumnModel().getColumn(4).setPreferredWidth(140);
        jTableEntrevista.getColumnModel().getColumn(4).setResizable(false);
        jTableEntrevista.getColumnModel().getColumn(5).setPreferredWidth(140);
        jTableEntrevista.getColumnModel().getColumn(5).setResizable(false);
        jTableEntrevista.getColumnModel().getColumn(6).setPreferredWidth(60);
        jTableEntrevista.getColumnModel().getColumn(6).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(5).setPreferredWidth(130);
//        jTableEntrevista.getColumnModel().getColumn(5).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(6).setPreferredWidth(130);
//        jTableEntrevista.getColumnModel().getColumn(6).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(7).setPreferredWidth(230);
//        jTableEntrevista.getColumnModel().getColumn(7).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(8).setPreferredWidth(60);
//        jTableEntrevista.getColumnModel().getColumn(8).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(9).setPreferredWidth(75);
//        jTableEntrevista.getColumnModel().getColumn(9).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(10).setPreferredWidth(120);
//        jTableEntrevista.getColumnModel().getColumn(10).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(11).setPreferredWidth(120);
//        jTableEntrevista.getColumnModel().getColumn(11).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(12).setPreferredWidth(120);
//        jTableEntrevista.getColumnModel().getColumn(12).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(13).setPreferredWidth(110);
//        jTableEntrevista.getColumnModel().getColumn(13).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(14).setPreferredWidth(100);
//        jTableEntrevista.getColumnModel().getColumn(14).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(15).setPreferredWidth(100);
//        jTableEntrevista.getColumnModel().getColumn(15).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(16).setPreferredWidth(100);
//        jTableEntrevista.getColumnModel().getColumn(16).setResizable(false);
//        jTableEntrevista.getColumnModel().getColumn(17).setPreferredWidth(100);
//        jTableEntrevista.getColumnModel().getColumn(17).setResizable(false);
        jTableEntrevista.getTableHeader().setReorderingAllowed(true);
        jTableEntrevista.setAutoResizeMode(jTableEntrevista.AUTO_RESIZE_OFF);
        jTableEntrevista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }
     
     public void preenchertabela1(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"PESSOA","EMPRESAATUAL","CARGOATUAL","SALARIO"};
            //"TELEFONE","TELEFONEOUTROS","EMAIL"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first();      
        do{
          dados.add(new Object[]{conecta.rs.getString("Person_A_e_B_Encore_2017"),conecta.rs.getString("Empresa"),conecta.rs.getString("Titulo_oficial"),conecta.rs.getString("Salary")});
                  //,conecta.rs.getString("Work_Phone"),conecta.rs.getString("Outros"),conecta.rs.getString("Work_Email")});
        }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe dados cadastrados!");
        }
        
      
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEntrevista1.setModel(modelo);
        jTableEntrevista1.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTableEntrevista1.getColumnModel().getColumn(0).setResizable(false);
        jTableEntrevista1.getColumnModel().getColumn(1).setPreferredWidth(165);
        jTableEntrevista1.getColumnModel().getColumn(1).setResizable(false);
        jTableEntrevista1.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTableEntrevista1.getColumnModel().getColumn(2).setResizable(false);
        jTableEntrevista1.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableEntrevista1.getColumnModel().getColumn(3).setResizable(false);
//        jTableEntrevista1.getColumnModel().getColumn(4).setPreferredWidth(200);
//        jTableEntrevista1.getColumnModel().getColumn(4).setResizable(false);
//        jTableEntrevista1.getColumnModel().getColumn(5).setPreferredWidth(120);
//        jTableEntrevista1.getColumnModel().getColumn(5).setResizable(false);
//        jTableEntrevista1.getColumnModel().getColumn(6).setPreferredWidth(200);
//        jTableEntrevista1.getColumnModel().getColumn(6).setResizable(false);
        jTableEntrevista1.getTableHeader().setReorderingAllowed(true);
        jTableEntrevista1.setAutoResizeMode(jTableEntrevista1.AUTO_RESIZE_OFF);
        jTableEntrevista1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }
     
       public void preenchertabela2(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"EMPRESA","TELEFONE","ENDEREÇO","CNPJ","ID"};
            //"TELEFONE","TELEFONEOUTROS","EMAIL"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first();      
        do{
          dados.add(new Object[]{conecta.rs.getString("Company"),conecta.rs.getString("Telefone"),conecta.rs.getString("Endereco"),conecta.rs.getString("Cnpj"),conecta.rs.getString("Empresas_id")});
                  //,conecta.rs.getString("Work_Phone"),conecta.rs.getString("Outros"),conecta.rs.getString("Work_Email")});
        }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe dados cadastrados!");
        }
        
      
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEntrevista1.setModel(modelo);
        jTableEntrevista1.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTableEntrevista1.getColumnModel().getColumn(0).setResizable(false);
        jTableEntrevista1.getColumnModel().getColumn(1).setPreferredWidth(165);
        jTableEntrevista1.getColumnModel().getColumn(1).setResizable(false);
        jTableEntrevista1.getColumnModel().getColumn(2).setPreferredWidth(165);
        jTableEntrevista1.getColumnModel().getColumn(2).setResizable(false);
        jTableEntrevista1.getColumnModel().getColumn(3).setPreferredWidth(165);
        jTableEntrevista1.getColumnModel().getColumn(3).setResizable(false);
        jTableEntrevista1.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTableEntrevista1.getColumnModel().getColumn(4).setResizable(false);
//        jTableEntrevista1.getColumnModel().getColumn(2).setPreferredWidth(250);
//        jTableEntrevista1.getColumnModel().getColumn(2).setResizable(false);
//        jTableEntrevista1.getColumnModel().getColumn(3).setPreferredWidth(100);
//        jTableEntrevista1.getColumnModel().getColumn(3).setResizable(false);
//        jTableEntrevista1.getColumnModel().getColumn(4).setPreferredWidth(200);
//        jTableEntrevista1.getColumnModel().getColumn(4).setResizable(false);
//        jTableEntrevista1.getColumnModel().getColumn(5).setPreferredWidth(120);
//        jTableEntrevista1.getColumnModel().getColumn(5).setResizable(false);
//        jTableEntrevista1.getColumnModel().getColumn(6).setPreferredWidth(200);
//        jTableEntrevista1.getColumnModel().getColumn(6).setResizable(false);
        jTableEntrevista1.getTableHeader().setReorderingAllowed(true);
        jTableEntrevista1.setAutoResizeMode(jTableEntrevista1.AUTO_RESIZE_OFF);
        jTableEntrevista1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }
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
            java.util.logging.Logger.getLogger(EntrevistaFinaliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntrevistaFinaliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntrevistaFinaliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntrevistaFinaliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntrevistaFinaliza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JComboBox<String> jComboBoxProjetos;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxStatusGeral;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableEntrevista;
    private javax.swing.JTable jTableEntrevista1;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCandidato;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldEmpresa2;
    private javax.swing.JTextField jTextFieldEndereço;
    private javax.swing.JTextField jTextFieldHorario;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLoginUsuario;
    private javax.swing.JTextField jTextFieldOutros;
    private javax.swing.JTextField jTextFieldProjeto;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTelefoneTra;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextPane jTextPaneNotasCliente;
    private javax.swing.JTextPane jTextPaneNotasComp;
    private javax.swing.JTextPane jTextPaneResumo;
    // End of variables declaration//GEN-END:variables
public void recebendo(String recebe){
        jTextFieldLoginUsuario.setText(recebe);
    }   
}
