/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteMr;
import bean.FunionarioMr;
import bean.VendasMr;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.UsuariosDAO;
import dao.VendasAnimaisDAO;
import dao.VendasDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import view.controle.AniVendasControle;
import view.pesquisar.JDLgVenda_pesquisar;
import view.tools.Util;

/**
 *
 * @author u13766540670
 */
public class JDLgVendas extends javax.swing.JDialog {
  AniVendasControle vendasControle;
   boolean incl; 
     MaskFormatter maskdata;
     VendasAnimaisDAO vendaAniDAO;
    /**
     * Creates new form JDlgUsuarios
     */
    public JDLgVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Fornecedores");
        setLocationRelativeTo(null);
        
           vendasControle = new  AniVendasControle();
           vendaAniDAO = new VendasAnimaisDAO();
           
           List listo = vendaAniDAO.listAll();
           
           vendasControle.setList(listo);
        jTable1.setModel(vendasControle);
        
         Util.habilitar(false, jBtnCancelar, jBtnConfirmar, jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo,JTxttotalV);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar,jBtnAlterar1,jBtnIncluir1,jBtnExcluir1,jTable1);
       
        
       ClienteDAO clienteDAO = new ClienteDAO();
        List lista = clienteDAO.listAll();
        for (int i = 0; i < lista.size(); i++) {
           jCboClientes.addItem((ClienteMr) lista.get(i)); 
           
           FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        List listaa = funcionarioDAO.listAll();
        for (int j = 0; j < listaa.size(); j++) {
           jCboVendedor.addItem((FunionarioMr) listaa.get(i)); 
           
    }
    
    }
    try {
            maskdata = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(maskdata));
    }
      public VendasMr beanviaw(VendasMr vendas){
      
       
       JTxtCodigo.setText(Util.intStr(vendas.getIdVendasMr()));
         //string\/
       
         JTxttotalV.setText(Util.intStr((int) vendas.getValorTotalMr()));
         JTxttotaQl.setText(Util.intStr( vendas.getQuantidadeTotalMr()));
           jCboVendedor.setSelectedItem(vendas.getFunionarioMr());
                    jCboClientes.setSelectedItem(vendas.getClienteMr());

             SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        
      jFmtData.setText(formato.format(vendas.getDataMr()));
         
        return vendas;
  
     
        
     
     
     
    }
 public  VendasMr viawbean(){
      VendasMr vendas = new VendasMr();
       
      vendas.setIdVendasMr(Util.strInt(JTxtCodigo.getText()));
        vendas.setValorTotalMr(Util.strDouble(JTxttotalV.getText()));
        vendas.setQuantidadeTotalMr(Util.strInt(JTxttotaQl.getText()));
       
        vendas.setClienteMr((ClienteMr) jCboClientes.getSelectedItem());
          vendas.setFunionarioMr((FunionarioMr) jCboVendedor.getSelectedItem());
           vendas.setDataMr(Util.strData(jFmtData.getText()));
      return vendas;
 } 
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTxtCodigo = new javax.swing.JTextField();
        jFmtData = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jCboClientes = new javax.swing.JComboBox<ClienteMr>();
        jLabel3 = new javax.swing.JLabel();
        jCboVendedor = new javax.swing.JComboBox<FunionarioMr>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTxttotaQl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnAlterar1 = new javax.swing.JButton();
        jBtnExcluir1 = new javax.swing.JButton();
        jBtnIncluir1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTxttotalV = new javax.swing.JTextField();

        jLabel4.setText("Apelido");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok_1.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar_1.png"))); // NOI18N
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("codigo");

        JTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtCodigoActionPerformed(evt);
            }
        });

        jFmtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        jCboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboClientesActionPerformed(evt);
            }
        });

        jLabel3.setText("Cliente");

        jCboVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboVendedorActionPerformed(evt);
            }
        });

        jLabel5.setText("Vendedor");

        jLabel6.setText("Quantidade total");

        JTxttotaQl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxttotaQlActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBtnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar1ActionPerformed(evt);
            }
        });

        jBtnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir1ActionPerformed(evt);
            }
        });

        jBtnIncluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir1ActionPerformed(evt);
            }
        });

        jLabel7.setText("valor  total");

        JTxttotalV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxttotalVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir)
                        .addGap(10, 10, 10)
                        .addComponent(jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelar)
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBtnAlterar1)
                                        .addComponent(jBtnIncluir1))
                                    .addComponent(jBtnExcluir1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jCboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jCboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTxttotaQl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTxttotalV, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jBtnIncluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTxttotaQl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTxttotalV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnConfirmar)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
       incl =  true; 
         
        
        
        Util.habilitar(true, jBtnCancelar, jBtnConfirmar, jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo,JTxttotalV);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar,jBtnAlterar1,jBtnIncluir1,jBtnExcluir1,jTable1);
        Util.limp(jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
         Util.habilitar(true, jBtnCancelar, jBtnConfirmar, jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo,JTxttotalV);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar,jBtnAlterar1,jBtnIncluir1,jBtnExcluir1,jTable1);
         incl = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
     if( Util.perguntar("Excluir", "Deseja excluir?") == YES_NO_OPTION){
             VendasMr vendas = viawbean();
        VendasDAO vendasDAO = new VendasDAO();
        vendasDAO.delete(vendas);
       Util.msg("Exclusão efetuada");
      }else{
           Util.msg("Exclusão cancela");
         
          
       }
       
        Util.limp(jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo,JTxttotalV);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
      if (incl ==true) {
                 VendasMr vendas = viawbean();
        VendasDAO vendasDAO = new VendasDAO();
        vendasDAO.insert(vendas);
          Util.habilitar(false, jBtnCancelar, jBtnConfirmar, jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo,JTxttotalV);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar,jBtnAlterar1,jBtnIncluir1,jBtnExcluir1,jTable1);
          Util.limp(jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo);
        }else{ 
                 VendasMr vendas = viawbean();
        VendasDAO vendasDAO = new VendasDAO();
        vendasDAO.update(vendas);
                 Util.habilitar(false, jBtnCancelar, jBtnConfirmar, jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo,JTxttotalV);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar,jBtnAlterar1,jBtnIncluir1,jBtnExcluir1,jTable1);
          Util.limp(jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo,JTxttotalV);
          }
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:    
        Util.habilitar(false, jBtnCancelar, jBtnConfirmar, jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar,jBtnAlterar1,jBtnIncluir1,jBtnExcluir1,jTable1);
        Util.limp(jCboClientes, jCboVendedor, JTxttotaQl, jFmtData, JTxtCodigo,JTxttotalV);
         Util.msg("Operação cancelada");
       
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
       JDLgVenda_pesquisar jDLgVenda_pesquisar = new JDLgVenda_pesquisar(null, true);
       
       
                
          jDLgVenda_pesquisar.setTelaAnterior(this);
        jDLgVenda_pesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void JTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtCodigoActionPerformed

    private void jFmtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataActionPerformed

    private void jCboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboClientesActionPerformed

    private void jCboVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboVendedorActionPerformed

    private void JTxttotaQlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxttotaQlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxttotaQlActionPerformed

    private void jBtnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterar1ActionPerformed

    private void jBtnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluir1ActionPerformed

    private void jBtnIncluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnIncluir1ActionPerformed

    private void JTxttotalVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxttotalVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxttotalVActionPerformed

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
            java.util.logging.Logger.getLogger(JDLgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDLgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDLgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDLgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDLgVendas dialog = new JDLgVendas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxtCodigo;
    private javax.swing.JTextField JTxttotaQl;
    private javax.swing.JTextField JTxttotalV;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterar1;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnExcluir1;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluir1;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<ClienteMr> jCboClientes;
    private javax.swing.JComboBox<FunionarioMr> jCboVendedor;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
