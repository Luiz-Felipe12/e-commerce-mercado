/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulários;

import Classes.Dados;
import Classes.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Luiz Felipe
 * Codigo dos botões: cadastrar, excluir, Salvar, editar e visualizar um Usuario/Adm.
 * Botões para o primeiro,ultimo,proximo e anterior Usuario/Adm.
 * Além do código para o preenchimento da tabela com os Usuarios/Adms já cadastrados.
 */
public class frmUsuarios  extends javax.swing.JInternalFrame{
 private Dados clsDados;
 private int usuarioAtual=0;
 private boolean cmdNovo=false;
 private DefaultTableModel userTable;
    
    public void setDados(Dados clsDados){
        this.clsDados=clsDados;
    }
    
    public frmUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaCad = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        ComboBoxPerfil = new javax.swing.JComboBox<>();
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

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Usuarios");
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

        txtCod.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Perfil:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Cod. Usuario:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nome:");

        txtNome.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Sobrenome:");

        txtSobrenome.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Senha:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Confirmar Senha:");

        txtSenhaCad.setEnabled(false);

        txtConfirmarSenha.setEnabled(false);

        ComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Perfil", "Administrador", "Usuario" }));
        ComboBoxPerfil.setEnabled(false);
        ComboBoxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPerfilActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBoxPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtSenhaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(bntUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(ComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtSenhaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bntAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bntAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bntEditarCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bntCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bntSalvar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(bntApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bntPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        // Codigo do botão pesquisar usuario.
        
        String usuario=JOptionPane.showInputDialog("INSIRA O CODIGO DO USAUARIO A SER PESQUISADO");
        if(usuario.equals("")){
            return;
        }
         int pos=clsDados.posiçãoUsuario(usuario);
         if(pos==-1){
             JOptionPane.showMessageDialog(rootPane, "ESSE USUARIO NÃO EXISTE");
             return;
         }
             usuarioAtual=pos;
             visualizarCadastros();
         
        
    }//GEN-LAST:event_bntPesquisarActionPerformed

    private void bntAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAdicionarActionPerformed
        // Codigo do botão adicionar cadastro do formulario de cadastro de usuarios.
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
        
        txtCod.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenhaCad.setEnabled(true);
        txtConfirmarSenha.setEnabled(true);
        ComboBoxPerfil.setEnabled(true);
        
        txtCod.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        txtSenhaCad.setText("");
        txtConfirmarSenha.setText("");
        ComboBoxPerfil.setSelectedIndex(0);
        
        cmdNovo=true;
        txtCod.requestFocusInWindow();
        
    }//GEN-LAST:event_bntAdicionarActionPerformed

    private void bntSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvar1ActionPerformed
//Validando Campo no formulario de cadastro de usuarios.
        if(txtCod.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CODIGO PARA PROSSEGUIR COM O CADASTRO");
            txtCod.requestFocusInWindow();
            return;
        }
        
        if(ComboBoxPerfil.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE UM PERFIL PARA PROSSEGUIR COM O CADASTRO");
            ComboBoxPerfil.requestFocusInWindow();
            return;
        }
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O NOME PARA PROSSEGUIR COM O CADASTRO");
            txtNome.requestFocusInWindow();
            return;
        }
         if(txtSobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O SOBRENOME PARA PROSSEGUIR COM O CADASTRO");
            txtSobrenome.requestFocusInWindow();
            return;
        }
         String senha=new String(txtSenhaCad.getPassword());
         String confiSenha=new String(txtConfirmarSenha.getPassword());
         
         
        if(new String(txtSenhaCad.getPassword()).equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE A SENHA PARA PROSSEGUIR COM O CADASTRO");
            txtSenhaCad.requestFocusInWindow();
            return;
        }
        
        if(new String (txtConfirmarSenha.getPassword()).equals("")){
            JOptionPane.showMessageDialog(rootPane, "CONFIRME A SENHA PARA PROSSEGUIR COM O CADASTRO");
            txtConfirmarSenha.requestFocusInWindow();
            return;
        }
        
        if(!senha.equals(confiSenha)){
            JOptionPane.showMessageDialog(rootPane, "AS SENHAS NÃO SÃO IGUAIS");
            txtSenhaCad.setText("");
            txtConfirmarSenha.setText("");
            txtSenhaCad.requestFocusInWindow();
            return;
        }
        
        int pcsLinha=clsDados.posiçãoUsuario(txtCod.getText());
        if(cmdNovo){
            if(pcsLinha != -1){
                JOptionPane.showMessageDialog(rootPane, "USUARIO JÁ CADASTRADO NO BANCO DE DADOS");
                txtCod.requestFocusInWindow();
                return;
            }else{
                if(pcsLinha==1){
                JOptionPane.showMessageDialog(rootPane, "USUARIO NÃO ESTÁ CADASTRADO NO BANCO DE DADOS");
                txtCod.requestFocusInWindow();
                return;
             }
            
             }
        }
        
       Usuarios mUsuario=new Usuarios(txtCod.getText(),txtNome.getText(),txtSobrenome.getText(), senha,ComboBoxPerfil.getSelectedIndex());
       String msg;
       
       if(cmdNovo){
            msg=clsDados.adicionarUsuario(mUsuario);
            JOptionPane.showMessageDialog(rootPane, msg);
       }else{
            msg=clsDados.editarUsuario(mUsuario,pcsLinha);
            JOptionPane.showMessageDialog(rootPane, msg);
       } 
       
//Codigo do botão salvar cadastro do formulario de cadastro de usuarios.
        
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
        
        txtCod.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenhaCad.setEnabled(false);
        txtConfirmarSenha.setEnabled(false);
        ComboBoxPerfil.setEnabled(false);
        
        carregarTable();
            
        
    }//GEN-LAST:event_bntSalvar1ActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // Codigo do botão cancelar do formulario de cadastro de usuarios.
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
        
        txtCod.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenhaCad.setEnabled(false);
        txtConfirmarSenha.setEnabled(false);
        ComboBoxPerfil.setEnabled(false);
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void bntEditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarCadastroActionPerformed
        // Codigo do botão editar cadastro do formulario de cadastro de usuarios.
        
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
       
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenhaCad.setEnabled(true);
        txtConfirmarSenha.setEnabled(true);
        ComboBoxPerfil.setEnabled(true);
        
        
        cmdNovo=false;
        txtNome.requestFocusInWindow();
    }//GEN-LAST:event_bntEditarCadastroActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        visualizarCadastros();
        carregarTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void bntUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUltimoActionPerformed
        //Codigo do botão ultimo cadastro do formulario de cadastro de usuarios. 
        usuarioAtual=clsDados.numeroDeUsuarios()-1;
        visualizarCadastros();
    }//GEN-LAST:event_bntUltimoActionPerformed

    private void bntAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAnteriorActionPerformed
        // Codigo do botão cadastro anterior do formulario de cadastro de usuari    os.
        usuarioAtual--;
        if(usuarioAtual==-1){
         usuarioAtual=clsDados.numeroDeUsuarios()-1;
        }
        visualizarCadastros();  
    }//GEN-LAST:event_bntAnteriorActionPerformed
        
    private void bntProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntProximoActionPerformed
        //Codigo do botão proximo.
        usuarioAtual++;
        if(usuarioAtual==clsDados.numeroDeUsuarios()){
            usuarioAtual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_bntProximoActionPerformed

    private void bntPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPrimeiroActionPerformed
        //  Codigo do botão primeiro cadastro do formulario de cadastro de usuarios.
        usuarioAtual=0;
        visualizarCadastros();
    }//GEN-LAST:event_bntPrimeiroActionPerformed

    private void bntApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntApagarActionPerformed
        // Codigo do botão apagar cadastro.
        int del=JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esse cadastro?");
        if(del!=0){
            return;
        }
        
        String msg=clsDados.deletarUsuario(usuarioAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        usuarioAtual=0;
        
        visualizarCadastros();
        carregarTable();
    }//GEN-LAST:event_bntApagarActionPerformed

    private void ComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxPerfilActionPerformed
     private void visualizarCadastros(){
        txtCod.setText(clsDados.getUsuarioses()[usuarioAtual].getCodUsuario());
        txtNome.setText(clsDados.getUsuarioses()[usuarioAtual].getNome());
        txtSobrenome.setText(clsDados.getUsuarioses()[usuarioAtual].getSobrenome());
        txtSenhaCad.setText(clsDados.getUsuarioses()[usuarioAtual].getSenha());
        txtConfirmarSenha.setText(clsDados.getUsuarioses()[usuarioAtual].getSenha());
        ComboBoxPerfil.setSelectedIndex(clsDados.getUsuarioses()[usuarioAtual].getPerfil());
        
     }
     
     private void carregarTable(){
         String tituloCabeçalho[]={"COD. USUARIO","NOME","SOBRENOME","PERFIL"};
         String registro[]=new String[4];
         userTable= new DefaultTableModel(null,tituloCabeçalho);
         for(int i=0;i<clsDados.numeroDeUsuarios();i++){
             registro[0]= clsDados.getUsuarioses()[i].getCodUsuario();
             registro[1]= clsDados.getUsuarioses()[i].getNome();
             registro[2]= clsDados.getUsuarioses()[i].getSobrenome();
             registro[3]= perfil(clsDados.getUsuarioses()[i].getPerfil());
             userTable.addRow(registro);
         }
         tblTabela.setModel(userTable);
         
     }
     private String perfil(int codPerfil){
         if(codPerfil==1){
             return"ADMINISTRADOR";
         }else{
             return"USUARIO";
         }
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxPerfil;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtCod;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenhaCad;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
