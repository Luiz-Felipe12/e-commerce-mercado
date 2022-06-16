/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulários;

import Classes.Cliente;
import Classes.Dados;
import Classes.Informações;
import Classes.Produto;
import Classes.Usuarios;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Luiz Felipe
 * Este é o formulario para o cadastro de um Cliente.
 * Codigo dos botões: cadastrar, excluir, Salvar, editar e visualizar um Cliente.
 * Botões para o primeiro,ultimo,proximo e anterior Cliente.
 * Além do código para o preenchimento da tabela com os Clientes já cadastrados.
 */
public class frmClientes extends javax.swing.JInternalFrame {
 private Dados clsDados;
 private int clienteAtual=0;
 private boolean cmdNovo=false;
 private DefaultTableModel userTable;
    
    public void setDados(Dados clsDados){
        this.clsDados=clsDados;
    }
    
    public frmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSobrenomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxDocumento = new javax.swing.JComboBox<>();
        bntAdicionar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        bntPesquisar = new javax.swing.JButton();
        bntEditarCadastro = new javax.swing.JButton();
        bntSalvar1 = new javax.swing.JButton();
        bntUltimo = new javax.swing.JButton();
        bntAnterior = new javax.swing.JButton();
        bntProximo = new javax.swing.JButton();
        bntPrimeiro = new javax.swing.JButton();
        bntApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        txtEndereço = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxCidade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DateNasc = new com.toedter.calendar.JDateChooser();
        DateAtual = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Clientes");
        setToolTipText("");
        setEnabled(false);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        txtCodCliente.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Indentificação:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Cod. Cliente:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nome:");

        txtNomeCliente.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Sobrenome:");

        txtSobrenomeCliente.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Endereço:");

        ComboBoxDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Documento de indentificão", "Carteira de Motorista", "Indentidade", "Passaporte", " ", " " }));
        ComboBoxDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDocumentoActionPerformed(evt);
            }
        });

        bntAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/adiconar.png"))); // NOI18N
        bntAdicionar.setToolTipText("Novo Cadastro");
        bntAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAdicionarActionPerformed(evt);
            }
        });

        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/cancelar.png"))); // NOI18N
        bntCancelar.setToolTipText("Cancelar Cadastro");
        bntCancelar.setEnabled(false);
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        bntPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/lupa.png"))); // NOI18N
        bntPesquisar.setToolTipText("Pesquisar Cadastro");
        bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarActionPerformed(evt);
            }
        });

        bntEditarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/editar.png"))); // NOI18N
        bntEditarCadastro.setToolTipText("Editar Cadastro");
        bntEditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarCadastroActionPerformed(evt);
            }
        });

        bntSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/file.png"))); // NOI18N
        bntSalvar1.setToolTipText("Salvar Cadastro");
        bntSalvar1.setEnabled(false);
        bntSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvar1ActionPerformed(evt);
            }
        });

        bntUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/ultimo.png"))); // NOI18N
        bntUltimo.setToolTipText("Ultimo Cadastro");
        bntUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUltimoActionPerformed(evt);
            }
        });

        bntAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/anterior.png"))); // NOI18N
        bntAnterior.setToolTipText("Cadastro Anterior");
        bntAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAnteriorActionPerformed(evt);
            }
        });

        bntProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/proximo.png"))); // NOI18N
        bntProximo.setToolTipText("Proximo Cadastro");
        bntProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntProximoActionPerformed(evt);
            }
        });

        bntPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/primeiro.png"))); // NOI18N
        bntPrimeiro.setToolTipText("Primeiro Cadastro");
        bntPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPrimeiroActionPerformed(evt);
            }
        });

        bntApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/lixeira.png"))); // NOI18N
        bntApagar.setToolTipText("Apagar Cadastro");
        bntApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntApagarActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTabela.setEnabled(false);
        jScrollPane1.setViewportView(tblTabela);

        txtEndereço.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Cidade:");

        ComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Cidade", "Venturosa", "Garanhus", "Recife", " ", " " }));
        ComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCidadeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Data de Nascimento:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Data Atual:");

        DateNasc.setEnabled(false);

        DateAtual.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Telefone:");

        txtTelefone.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(60, 60, 60)
                                                .addComponent(DateAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DateNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                            .addComponent(txtSobrenomeCliente)
                                            .addComponent(txtEndereço)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bntPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(bntAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntEditarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bntSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSobrenomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ComboBoxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(DateNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(DateAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEditarCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSalvar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPrimeiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntProximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntUltimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntApagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        // Codigo do botão pesquisar cliente.
        String cliente=JOptionPane.showInputDialog("INSIRA O CODIGO DO CLIENTE A SER PESQUISADO");
        if(cliente.equals("")){
            return;
        }
         int pos=clsDados.posiçãoCliente(cliente);
         if(pos==-1){
             JOptionPane.showMessageDialog(rootPane, "ESSE CLIENTE NÃO EXISTE");
             return;
         }
             clienteAtual=pos;
             visualizarCadastros();
         
        
    }//GEN-LAST:event_bntPesquisarActionPerformed

    private void bntAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAdicionarActionPerformed
        // Codigo do botão adicionar do formulario de cadastro de clientes.
        bntEditarCadastro.setEnabled(false);
        bntSalvar1.setEnabled(true);
        bntAdicionar.setEnabled(false);
        bntCancelar.setEnabled(true);
        bntPesquisar.setEnabled(false);
        bntAnterior.setEnabled(false);
        bntUltimo.setEnabled(false);
        bntProximo.setEnabled(false);
        bntPrimeiro.setEnabled(false);
        bntApagar.setEnabled(false);
        
        txtCodCliente.setEnabled(true);
        txtNomeCliente.setEnabled(true);
        txtSobrenomeCliente.setEnabled(true);
        txtEndereço.setEnabled(true);
        txtTelefone.setEnabled(true);
        
        DateNasc.setEnabled(true);
        DateAtual.setEnabled(false);
        
 
        ComboBoxDocumento.setEnabled(true);
        ComboBoxCidade.setEnabled(true);
        
        txtCodCliente.setText("");
        txtNomeCliente.setText("");
        txtSobrenomeCliente.setText("");
        txtEndereço.setText("");
        txtTelefone.setText("");
        
        DateNasc.setDate(new Date());
        DateAtual.setDate(new Date());
       
        ComboBoxDocumento.setSelectedIndex(0);
        ComboBoxCidade.setSelectedIndex(0);
        
        cmdNovo=true;
        txtCodCliente.requestFocusInWindow();
        
    }//GEN-LAST:event_bntAdicionarActionPerformed

    private void bntSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvar1ActionPerformed
//Validando Campo no formulario de cadastro de clientes;
        if(txtCodCliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CODIGO PARA PROSSEGUIR COM O CADASTRO");
            txtCodCliente.requestFocusInWindow();
            return;
        }
        
        if(ComboBoxDocumento.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE UM DOCUMENTO DE INDETIFICAÇÃO PARA PROSSEGUIR COM O CADASTRO");
            ComboBoxDocumento.requestFocusInWindow();
            return;
        }
        if(txtNomeCliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O NOME PARA PROSSEGUIR COM O CADASTRO");
            txtNomeCliente.requestFocusInWindow();
            return;
        }
        
         if(txtSobrenomeCliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O SOBRENOME PARA PROSSEGUIR COM O CADASTRO");
            txtSobrenomeCliente.requestFocusInWindow();
            return;
        }
        
        if(DateNasc.getDate().after(new Date())){
            JOptionPane.showMessageDialog(rootPane, "DIGITE UMA DATA DE NASCIMENTO VALIDA PARA PROSSEGUIR COM O CADASTRO");
            DateNasc.requestFocusInWindow();
            return;
        }
      
       
        int pcsLinha=clsDados.posiçãoCliente(txtCodCliente.getText());
        if(cmdNovo){
            if(pcsLinha != -1){
                JOptionPane.showMessageDialog(rootPane, "CLIENTE JÁ CADASTRADO NO BANCO DE DADOS");
                txtCodCliente.requestFocusInWindow();
                return;
            }else{
                if(pcsLinha==1){
                JOptionPane.showMessageDialog(rootPane, "CLIENTE     NÃO ESTÁ CADASTRADO NO BANCO DE DADOS");
                txtCodCliente.requestFocusInWindow();
                return;
             }
            
             }
        }
        
       Cliente mCliente=new Cliente(txtCodCliente.getText(),ComboBoxDocumento.getSelectedIndex(),txtNomeCliente.getText(),txtSobrenomeCliente.getText(),txtEndereço.getText(),txtTelefone.getText(),ComboBoxCidade.getSelectedIndex(),DateNasc.getDate(),DateAtual.getDate());
       String msg;
       
       if(cmdNovo){
            msg=clsDados.adicionarCliente(mCliente);
            JOptionPane.showMessageDialog(rootPane, msg);
            
       }else{
            msg=clsDados.editarCliente(mCliente,pcsLinha);
            JOptionPane.showMessageDialog(rootPane, msg);
       } 
       
//Codigo do botão salvar cadastro do formulario de cadastro de clientes.
        
        bntEditarCadastro.setEnabled(true);
        bntSalvar1.setEnabled(false);
        bntAdicionar.setEnabled(true);
        bntCancelar.setEnabled(false);
        bntPesquisar.setEnabled(true);
        bntAnterior.setEnabled(true);
        bntUltimo.setEnabled(true);
        bntProximo.setEnabled(true);
        bntPrimeiro.setEnabled(true);
        bntApagar.setEnabled(true);
        
        txtCodCliente.setEnabled(false);
        txtNomeCliente.setEnabled(false);
        txtSobrenomeCliente.setEnabled(false);
        txtEndereço.setEnabled(false);
        txtTelefone.setEnabled(false);
        
        DateNasc.setEnabled(false);
        DateAtual.setEnabled(false);
        
 
        ComboBoxDocumento.setEnabled(true);
        ComboBoxCidade.setEnabled(true);
        
        carregarTable();
            
        
    }//GEN-LAST:event_bntSalvar1ActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // Codigo do botão cancelar do formulario de cadastro de produtos.
        bntEditarCadastro.setEnabled(true);
        bntSalvar1.setEnabled(false);
        bntAdicionar.setEnabled(true);
        bntCancelar.setEnabled(false);
        bntPesquisar.setEnabled(true);
        bntAnterior.setEnabled(true);
        bntUltimo.setEnabled(true);
        bntProximo.setEnabled(true);
        bntPrimeiro.setEnabled(true);
        bntApagar.setEnabled(true);
        
        txtCodCliente.setEnabled(false);
        txtNomeCliente.setEnabled(false);
        txtSobrenomeCliente.setEnabled(false);
        txtEndereço.setEnabled(false);
        txtTelefone.setEnabled(false);
        
        DateNasc.setEnabled(false);
        DateAtual.setEnabled(false);
       
        ComboBoxDocumento.setEnabled(true);
        ComboBoxCidade.setEnabled(true);
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void bntEditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarCadastroActionPerformed
        // Codigo do botão editar cadastro do formulario de cadastro de produtos.
        
        bntEditarCadastro.setEnabled(false);
        bntSalvar1.setEnabled(true);
        bntAdicionar.setEnabled(false);
        bntCancelar.setEnabled(true);
        bntPesquisar.setEnabled(false);
        bntAnterior.setEnabled(false);
        bntUltimo.setEnabled(false);
        bntProximo.setEnabled(false);
        bntPrimeiro.setEnabled(false);
        bntApagar.setEnabled(false);
      
        txtNomeCliente.setEnabled(true);
        txtSobrenomeCliente.setEnabled(true);
        txtEndereço.setEnabled(true);
        txtTelefone.setEnabled(true);
        
        DateNasc.setEnabled(true);
 
        ComboBoxDocumento.setEnabled(true);
        ComboBoxCidade.setEnabled(true);
        
        
        cmdNovo=false;
        txtNomeCliente.requestFocusInWindow();
    }//GEN-LAST:event_bntEditarCadastroActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        visualizarCadastros();
        carregarTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void bntUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUltimoActionPerformed
        //Codigo do botão ultimo cadastro do formulario de cadastro de clientes. 
        clienteAtual=clsDados.numeroClientes()-1;
        visualizarCadastros();
    }//GEN-LAST:event_bntUltimoActionPerformed

    private void bntAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAnteriorActionPerformed
        // Codigo do botão cadastro anterior do formulario de cadastro de clientes.
        clienteAtual--;
        if(clienteAtual==-1){
         clienteAtual=clsDados.numeroClientes()-1;
        }
        visualizarCadastros();  
    }//GEN-LAST:event_bntAnteriorActionPerformed
        
    private void bntProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntProximoActionPerformed
        //Codigo do botão proximo.
        clienteAtual++;
        if(clienteAtual==clsDados.numeroClientes()){
            clienteAtual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_bntProximoActionPerformed

    private void bntPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPrimeiroActionPerformed
        //  Codigo do botão primeiro cadastro do formulario de cadastro de clientes.
        clienteAtual=0;
        visualizarCadastros();
    }//GEN-LAST:event_bntPrimeiroActionPerformed

    private void bntApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntApagarActionPerformed
        // Codigo do botão apagar cadastro.
        int del=JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esse cadastro?");
        if(del!=0){
            return;
        }
        
        String msg=clsDados.deletarCliente(clienteAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        clienteAtual=0;
        
        visualizarCadastros();
        carregarTable();
    }//GEN-LAST:event_bntApagarActionPerformed

    private void ComboBoxDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDocumentoActionPerformed

    private void ComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCidadeActionPerformed
     private void visualizarCadastros(){
        txtCodCliente.setText(clsDados.getClientes()[clienteAtual].getCodCliente());
        ComboBoxDocumento.setSelectedIndex(clsDados.getClientes()[clienteAtual].getDocumento());
        txtNomeCliente.setText(clsDados.getClientes()[clienteAtual].getNomeCliente());
        txtSobrenomeCliente.setText(clsDados.getClientes()[clienteAtual].getSobrenomeCliente());
        txtEndereço.setText(clsDados.getClientes()[clienteAtual].getEndereço());
        txtTelefone.setText(clsDados.getClientes()[clienteAtual].getTelefone());
        ComboBoxCidade.setSelectedIndex(clsDados.getClientes()[clienteAtual].getCidade());
        DateNasc.setDate(clsDados.getClientes()[clienteAtual].getDataNasc());
        DateAtual.setDate(clsDados.getClientes()[clienteAtual].getDataAtual());
     }
     
     private void carregarTable(){
         String tituloCabeçalho[]={"COD. CLIENTE","DOC.","NOME","SOBRENOME","END.","TEL.","CIDADE","DATA NAS.","DATA DO REGITRO"};
         String registro[]=new String[9];
         userTable= new DefaultTableModel(null,tituloCabeçalho);
         for(int i=0;i<clsDados.numeroClientes();i++){
             registro[0]= clsDados.getClientes()[i].getCodCliente();
             registro[1]= documento(clsDados.getClientes()[i].getDocumento());
             registro[2]= clsDados.getClientes()[i].getNomeCliente();
             registro[3]= clsDados.getClientes()[i].getSobrenomeCliente();
             registro[4]= clsDados.getClientes()[i].getEndereço();
             registro[5]= clsDados.getClientes()[i].getTelefone();
             registro[6]= cidade(clsDados.getClientes()[i].getCidade());
             registro[7]= ""+clsDados.getClientes()[i].getDataNasc();
             registro[8]= ""+clsDados.getClientes()[i].getDataAtual();
            
             userTable.addRow(registro);
         }
         tblTabela.setModel(userTable);
         
     }
     private String documento(int codDocumento){
         switch(codDocumento){
             case 0:return "Carteira de Motorista";
             case 1:return "Identidade";
             case 2:return "Passaporte";
             default:return "NÃO DEFENIDO";
         }
     }
     private String cidade(int codCidade){
         switch(codCidade){
             case 0:return "Venturosa";
             case 1:return "Garanhus";
             case 2:return "Recife";
             default:return "NÃO DEFENIDO";
         }
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCidade;
    private javax.swing.JComboBox<String> ComboBoxDocumento;
    private com.toedter.calendar.JDateChooser DateAtual;
    private com.toedter.calendar.JDateChooser DateNasc;
    private javax.swing.JButton bntAdicionar;
    private javax.swing.JButton bntAnterior;
    private javax.swing.JButton bntApagar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntEditarCadastro;
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JButton bntPrimeiro;
    private javax.swing.JButton bntProximo;
    private javax.swing.JButton bntSalvar1;
    private javax.swing.JButton bntUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtSobrenomeCliente;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
