/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.mxrck.autocompleter.TextAutoCompleter;
import controle.ConnectionConsulta;
import controle.conectar;
import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableRowSorter;
import modelo.ModeloTabela;
import modelo.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ModeloTabela;
import modelo.Usuario;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author vinicius
 */
public class VisualizadorPro extends javax.swing.JFrame {
    
     private final String ruta = System.getProperties().getProperty("user.dir");
      ConnectionConsulta conecta = new ConnectionConsulta();
      Usuario mod = new Usuario();
    /**
     * Creates new form VisualizadoreEx
     */
    public VisualizadorPro() {
        initComponents();
        this.setExtendedState(this.getExtendedState()|VisualizadorPro.MAXIMIZED_BOTH);
        conecta.conectaBanco();
        preenchertabela("select * from Projetos order by Instant_Status ASC, Person ASC");
        jTableEstado.setAutoCreateRowSorter(true);
        //ModeloTabela modelo = (ModeloTabela) jTableEstado.getModel();
       //jTableEstado.setRowSorter(new TableRowSorter(modelo)); 
       items();
       itemmss();
    }
    
    public void items (){
        
        TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(jTextFieldProjeto);
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
    
    public void itemmss (){
            Statement st=null;
            ResultSet rs=null;
            conecta.conectaBanco();
        Connection minhaconexao = conectar.GetConnection();
            try{
                
                st = (Statement)minhaconexao.createStatement();                   
                rs=st.executeQuery("SELECT DISTINCT Projeto from Projetos order by Projeto");
                
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldProjeto = new javax.swing.JTextField();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jTextFieldEmprego = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSalario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        Reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxProjetos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jScrollPane2.setViewportView(jTableEstado);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));
        jPanel2.setOpaque(false);

        jTextFieldProjeto.setToolTipText("Empresa");
        jTextFieldProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProjetoActionPerformed(evt);
            }
        });
        jTextFieldProjeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProjetoKeyPressed(evt);
            }
        });

        jTextFieldEmpresa.setToolTipText("Descrição");
        jTextFieldEmpresa.setPreferredSize(new java.awt.Dimension(9, 20));
        jTextFieldEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpresaActionPerformed(evt);
            }
        });
        jTextFieldEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpresaKeyPressed(evt);
            }
        });

        jTextFieldEmprego.setToolTipText("Destinatário");
        jTextFieldEmprego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmpregoKeyPressed(evt);
            }
        });

        jLabel1.setText("Projeto:");

        jLabel2.setText("Empresa:");

        jLabel3.setText("Profissional:");

        jLabel4.setText("Salario:");

        jTextFieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalarioActionPerformed(evt);
            }
        });
        jTextFieldSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSalarioKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/xls.png"))); // NOI18N
        jButton1.setText("Criar Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jProgressBar1.setStringPainted(true);

        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user3.png"))); // NOI18N
        Reset.setToolTipText("Resetar");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel5.setText("Projetos:");

        jComboBoxProjetos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProjetosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(656, 656, 656)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(497, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextFieldProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmprego, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{

            Thread t = new Thread(){
                public void run(){
                    XSSFWorkbook workbook = new XSSFWorkbook();
                    XSSFSheet hoja = workbook.createSheet();

                    XSSFRow fila = hoja.createRow(0);
                    fila.createCell(0).setCellValue("PROFISSIONAIS");
                    fila.createCell(1).setCellValue("EMPRESAATUAL");
                    fila.createCell(2).setCellValue("DATEON");
                    fila.createCell(3).setCellValue("STATUSATUAL");
                    fila.createCell(4).setCellValue("SALARIO");
                    fila.createCell(5).setCellValue("TELEFONE1");
                    fila.createCell(6).setCellValue("TELEFONE2");
                    fila.createCell(7).setCellValue("E-MAIL");
                    fila.createCell(8).setCellValue("TIMEIN");
                    fila.createCell(9).setCellValue("STATUSPROJETO");
                    fila.createCell(10).setCellValue("ENDEREÇO");
                    fila.createCell(11).setCellValue("CNPJ");
                    fila.createCell(12).setCellValue("TELEFONE");
                    fila.createCell(13).setCellValue("CRIADOR");
                    fila.createCell(14).setCellValue("NOTASENTREVISTA");
                    fila.createCell(15).setCellValue("NOTASCLIENTE");
                    fila.createCell(16).setCellValue("NOTASBENEFICIO");
                    fila.createCell(17).setCellValue("EMPRESA");
                    fila.createCell(18).setCellValue("PROJETO");
                    jProgressBar1.setMaximum(jTableEstado.getRowCount());
                    XSSFRow filas;
                    Rectangle rect;
                    for(int i=0; i<jTableEstado.getRowCount(); i++){

                        rect = jTableEstado.getCellRect(i, 0, true);
                        try{
                            jTableEstado.scrollRectToVisible(rect);
                        }catch(java.lang.ClassCastException e){}
                        jTableEstado.setRowSelectionInterval(i, i);
                        jProgressBar1.setValue((i+1));

                        filas = hoja.createRow((i+1));
                        filas.createCell(0).setCellValue(jTableEstado.getValueAt(i, 0).toString());
                        filas.createCell(1).setCellValue(jTableEstado.getValueAt(i, 1).toString());
                        filas.createCell(2).setCellValue(jTableEstado.getValueAt(i, 2).toString());
                        filas.createCell(3).setCellValue(jTableEstado.getValueAt(i, 3).toString());
                        filas.createCell(4).setCellValue(jTableEstado.getValueAt(i, 4).toString());
                        filas.createCell(5).setCellValue(jTableEstado.getValueAt(i, 5).toString());
                        filas.createCell(6).setCellValue(jTableEstado.getValueAt(i, 6).toString());
                        filas.createCell(7).setCellValue(jTableEstado.getValueAt(i, 7).toString());
                        filas.createCell(8).setCellValue(jTableEstado.getValueAt(i, 8).toString());
                        filas.createCell(9).setCellValue(jTableEstado.getValueAt(i, 9).toString());
                        filas.createCell(10).setCellValue(jTableEstado.getValueAt(i, 10).toString());
                        filas.createCell(11).setCellValue(jTableEstado.getValueAt(i, 11).toString());
                        filas.createCell(12).setCellValue(jTableEstado.getValueAt(i, 12).toString());
                        filas.createCell(13).setCellValue(jTableEstado.getValueAt(i, 13).toString());
                        filas.createCell(14).setCellValue(jTableEstado.getValueAt(i, 14).toString());
                        filas.createCell(15).setCellValue(jTableEstado.getValueAt(i, 15).toString());
                        filas.createCell(16).setCellValue(jTableEstado.getValueAt(i, 16).toString());
                        filas.createCell(17).setCellValue(jTableEstado.getValueAt(i, 17).toString());
                        filas.createCell(18).setCellValue(jTableEstado.getValueAt(i, 18).toString());
                        // try{
                            //           Thread.sleep(20);
                            //      } catch (InterruptedException ex){
                            //         Logger.getLogger(Visualizador.class.getName ()).log(Level.SEVERE, null, ex);
                            //     }
                    }
                    jProgressBar1.setValue(0);
                    //jProgressBar1.setString("Abrindo Excel...");
                    //this.dispose();
                    //dispose();
                    try{
                        workbook.write(new FileOutputStream(new File(ruta+"//Excel.xlsx")));
                        Desktop.getDesktop().open(new File(ruta+"//Excel.xlsx"));
                    } catch (Exception ex) {
                        Logger.getLogger(VisualizadorPro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            t.start();
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalarioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldSalario.getText());
            preenchertabela("select * from projetos where Salary like '%" + jTextFieldSalario.getText() + "%' order by Instant_Status ASC, Person ASC");
        }
    }//GEN-LAST:event_jTextFieldSalarioKeyPressed

    private void jTextFieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalarioActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        jTextFieldProjeto.setText("");
        jTextFieldEmpresa.setText("");
        jTextFieldEmprego.setText("");
        jTextFieldSalario.setText("");
       // jTextField4.setText("");
       // jTextField6.setText("");
        preenchertabela("select * from projetos order by Instant_Status ASC, Person ASC");
    }//GEN-LAST:event_ResetActionPerformed

    private void jTextFieldEmpregoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpregoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldEmprego.getText());
            preenchertabela("select * from projetos where Person like '%" + jTextFieldEmprego.getText() + "%' order by Instant_Status ASC, Person ASC");
        }
    }//GEN-LAST:event_jTextFieldEmpregoKeyPressed

    private void jTextFieldEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmpresaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldEmpresa.getText());
            preenchertabela("select * from projetos where Empresa like '%" + jTextFieldEmpresa.getText() + "%' order by Instant_Status ASC, Person ASC");
            //conecta.desconecta();
        }
    }//GEN-LAST:event_jTextFieldEmpresaKeyPressed

    private void jTextFieldEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpresaActionPerformed

    private void jTextFieldProjetoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProjetoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            mod.setPesquisa(jTextFieldProjeto.getText());
            preenchertabela("select * from Projetos where Projeto like '%" + jTextFieldProjeto.getText() + "%' order by Instant_Status ASC, Person ASC");
        }
    }//GEN-LAST:event_jTextFieldProjetoKeyPressed

    private void jTextFieldProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProjetoActionPerformed

    private void jTableEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstadoMouseClicked
        // TODO add your handling code here:
        String IdProjeto = ""+jTableEstado.getValueAt(jTableEstado.getSelectedRow(), 19);
        conecta.conectaBanco();
        conecta.executaSQL("select * from Projetos where Projetos_id='"+ IdProjeto +"'order by Instant_Status ASC, Person ASC");
        
        try {
        conecta.rs.first();
//        jTextFieldCandidato.setText(conecta.rs.getString("Person"));
//        jTextFieldEmpresa2.setText(conecta.rs.getString("Company"));
//        jTextFieldTelefone.setText(conecta.rs.getString("Telefone"));
//        jTextFieldEndereço.setText(conecta.rs.getString("Endereço"));
//        jTextFieldCNPJ.setText(conecta.rs.getString("Cnpj"));
//        jTextFieldCargo.setText(conecta.rs.getString("Official_Title"));
          jTextFieldProjeto.setText(conecta.rs.getString("Projeto"));
          jTextFieldEmpresa.setText(conecta.rs.getString("Empresa"));
          jTextFieldSalario.setText(conecta.rs.getString("Salary")); 
          jTextFieldEmprego.setText(conecta.rs.getString("Person")); 
//        jComboBoxStatus.setSelectedItem(conecta.rs.getString("Instant_Status"));
//        jTextFieldOutros.setText(conecta.rs.getString("Other_Phone_1"));
//        jTextFieldTelefoneTra.setText(conecta.rs.getString("Work_Phone"));
//        jTextFieldEmail.setText(conecta.rs.getString("Work_Email")); 
//        jTextFieldUsuario.setText(conecta.rs.getString("Criador"));
//        jTextPaneResumo.setText(conecta.rs.getString("Summary_Notes"));
//        jTextPaneNotasCliente.setText(conecta.rs.getString("For_Client_Notes"));
//        jTextPaneNotasComp.setText(conecta.rs.getString("Compensation_Notes"));
//        jComboBoxStatusGeral.setSelectedItem(conecta.rs.getString("Estatus_Geral"));
//        jTextFieldData.setText(conecta.rs.getString("Data_criacao"));
//        jTextFieldHorario.setText(conecta.rs.getString("Horario_criacao"));
        
   //     jTextFieldId.setText(String.valueOf(conecta.rs.getInt("Projetos_id")));
       // jComboBoxRetorno.setSelectedItem(conecta.rs.getString("Retorno"));
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao selecionar os dados!\n Erro: "+ex);
        }
        
    }//GEN-LAST:event_jTableEstadoMouseClicked

    private void jComboBoxProjetosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProjetosItemStateChanged
        // TODO add your handling code here:
        jTextFieldProjeto.setText((String) jComboBoxProjetos.getSelectedItem());
    }//GEN-LAST:event_jComboBoxProjetosItemStateChanged

    
    public void preenchertabela(String SQL){
        ArrayList dados = new ArrayList();
        
        
        String [] Colunas = new String[]{"PROFISSIONAIS","EMPRESAATUAL","DATEON","STATUSATUAL","SALARIO","TELEFONE1","TELEFONE2","E-MAIL","TIMEIN","STATUSPROJETO","ENDEREÇO","CNPJ","TELEFONE","CRIADOR","NOTASENTREVISTA","NOTASCLIENTE","NOTASBENEFICIO","EMPRESA","PROJETO","ID"};
        conecta.conectaBanco();
        conecta.executaSQL(SQL);
        try {
           conecta.rs.first(); 
        do{
        dados.add(new Object[]{conecta.rs.getString("Person"),conecta.rs.getString("Official_Title"),conecta.rs.getString("Data_criacao"),conecta.rs.getString("Instant_Status"),conecta.rs.getString("Salary"),conecta.rs.getString("Other_Phone_1"),conecta.rs.getString("Work_Phone"),conecta.rs.getString("Work_Email"),conecta.rs.getString("Horario_criacao"),conecta.rs.getString("Estatus_Geral"),conecta.rs.getString("Endereço"),conecta.rs.getString("Cnpj"),conecta.rs.getString("Telefone"),conecta.rs.getString("Criador"),conecta.rs.getString("Summary_Notes"),conecta.rs.getString("For_Client_Notes"),conecta.rs.getString("Compensation_Notes"),conecta.rs.getString("Empresa"),conecta.rs.getString("Projeto"),conecta.rs.getString("Projetos_id")}); 
        }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pesquisa inexistente!");
        }             
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEstado.setModel(modelo);
        jTableEstado.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTableEstado.getColumnModel().getColumn(0).setResizable(false);
        jTableEstado.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableEstado.getColumnModel().getColumn(1).setResizable(false);
        jTableEstado.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableEstado.getColumnModel().getColumn(2).setResizable(false);
        jTableEstado.getColumnModel().getColumn(3).setPreferredWidth(130);
        jTableEstado.getColumnModel().getColumn(3).setResizable(false);
        jTableEstado.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTableEstado.getColumnModel().getColumn(4).setResizable(false);
        jTableEstado.getColumnModel().getColumn(5).setPreferredWidth(140);
        jTableEstado.getColumnModel().getColumn(5).setResizable(false);
        jTableEstado.getColumnModel().getColumn(6).setPreferredWidth(140);
        jTableEstado.getColumnModel().getColumn(6).setResizable(false);
        jTableEstado.getColumnModel().getColumn(7).setPreferredWidth(200);
        jTableEstado.getColumnModel().getColumn(7).setResizable(false);
        jTableEstado.getColumnModel().getColumn(8).setPreferredWidth(60);
        jTableEstado.getColumnModel().getColumn(8).setResizable(false);
        jTableEstado.getColumnModel().getColumn(9).setPreferredWidth(100);
        jTableEstado.getColumnModel().getColumn(9).setResizable(false);
        jTableEstado.getColumnModel().getColumn(10).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(10).setResizable(false);
        jTableEstado.getColumnModel().getColumn(11).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(11).setResizable(false);
        jTableEstado.getColumnModel().getColumn(12).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(12).setResizable(false);
        jTableEstado.getColumnModel().getColumn(13).setPreferredWidth(60);
        jTableEstado.getColumnModel().getColumn(13).setResizable(false);  
        jTableEstado.getColumnModel().getColumn(14).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(14).setResizable(false);
        jTableEstado.getColumnModel().getColumn(15).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(15).setResizable(false);
        jTableEstado.getColumnModel().getColumn(16).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(16).setResizable(false);
        jTableEstado.getColumnModel().getColumn(17).setPreferredWidth(120);
        jTableEstado.getColumnModel().getColumn(17).setResizable(false);
        jTableEstado.getColumnModel().getColumn(18).setPreferredWidth(120);
        jTableEstado.getColumnModel().getColumn(18).setResizable(false);
         jTableEstado.getColumnModel().getColumn(19).setPreferredWidth(60);
        jTableEstado.getColumnModel().getColumn(19).setResizable(false);
        jTableEstado.getTableHeader().setReorderingAllowed(true);
        jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);
        jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);       
        
    }
    /*
    public Usuario buscaProduto(Usuario modelo){
       conecta.conectaBanco();
       conecta.executaSQL("select * from usuarios where descricao like '%" + modelo.getPesquisa() + "%'");
       try  {
           conecta.rs.first();
            mod.setId(conecta.rs.getInt("id"));
            mod.setEmpresa(conecta.rs.getString("empresa"));
            mod.setDescricao(conecta.rs.getString("descricao"));
            mod.setDestinatario(conecta.rs.getString("destinatario"));
            mod.setDepartamento(conecta.rs.getString("departamento"));
            mod.setData(conecta.rs.getString("data"));
            mod.setDataentrega(conecta.rs.getString("dataentrega"));
            mod.setHorario(conecta.rs.getString("horario")); 
            mod.setEntrega(conecta.rs.getString("entrega"));
            mod.setUsuario(conecta.rs.getString("usuario"));
            mod.setRecebimento(conecta.rs.getString("recebimento"));
            mod.setCorreios(conecta.rs.getString("correio")); 
            mod.setBaixa(conecta.rs.getString("baixa"));
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao buscar a data!\nErro" + ex);   
       }
   
       return mod;
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
            java.util.logging.Logger.getLogger(VisualizadorPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizadorPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizadorPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizadorPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizadorPro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxProjetos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField jTextFieldEmprego;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldProjeto;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
