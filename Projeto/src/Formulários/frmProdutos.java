
package Formulários;

import Classes.Dados;
import Classes.Informações;
import Classes.Produto;
import Classes.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 * @author David Cavalcanti
 * Este é o formulario para o cadastro de um produto.
 * Codigo dos botões: cadastrar, excluir, Salvar, editar e visualizar um produto.
 * Botões para o primeiro,ultimo,proximo e anterior produto.
 * Além do código para o preenchimento da tabela com os produtos já cadastrados.
 */
public class frmProdutos extends javax.swing.JInternalFrame {
 private Dados clsDados;
 private int produtoAtual=0;
 private boolean cmdNovo=false;
 private DefaultTableModel userTable;
    
    public void setDados(Dados clsDados){
        this.clsDados=clsDados;
    }
    
    public frmProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescrição = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPreço = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxImposto = new javax.swing.JComboBox<>();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotações = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Produtos");
        setToolTipText("");
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

        txtCodProduto.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Imposto:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Cod. Produto:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Descrição:");

        txtDescrição.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Preço:");

        txtPreço.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Anotação:");

        ComboBoxImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione um valor de imposto", "0%", "10%", "15%" }));
        ComboBoxImposto.setEnabled(false);
        ComboBoxImposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxImpostoActionPerformed(evt);
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

        txtAnotações.setColumns(20);
        txtAnotações.setRows(5);
        txtAnotações.setEnabled(false);
        jScrollPane2.setViewportView(txtAnotações);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDescrição)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(ComboBoxImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(99, 99, 99))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescrição, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
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
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        // Codigo do botão pesquisar produto.
        String produto=JOptionPane.showInputDialog("INSIRA O CODIGO DO PRODUTO A SER PESQUISADO");
        if(produto.equals("")){
            return;
        }
         int pos=clsDados.posiçãoProduto(produto);
         if(pos==-1){
             JOptionPane.showMessageDialog(rootPane, "ESSE PRODUTO NÃO EXISTE");
             return;
         }
             produtoAtual=pos;
             visualizarCadastros();
         
        
    }//GEN-LAST:event_bntPesquisarActionPerformed

    private void bntAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAdicionarActionPerformed
        // Codigo do botão adicionar do formulario de cadastro de produtos.
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
        
        txtCodProduto.setEnabled(true);
        txtDescrição.setEnabled(true);
        txtPreço.setEnabled(true);
        txtAnotações.setEnabled(true);
 
        ComboBoxImposto.setEnabled(true);
        
        txtCodProduto.setText("");
        txtDescrição.setText("");
        txtPreço.setText("");
        txtAnotações.setText("");
       
        ComboBoxImposto.setSelectedIndex(0);
        
        cmdNovo=true;
        txtCodProduto.requestFocusInWindow();
        
    }//GEN-LAST:event_bntAdicionarActionPerformed

    private void bntSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvar1ActionPerformed
//Validando Campo no formulario de cadastro de produtos
        if(txtCodProduto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CODIGO PARA PROSSEGUIR COM O CADASTRO");
            txtCodProduto.requestFocusInWindow();
            return;
        }
        
        if(ComboBoxImposto.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE UM VALOR DE IMPOSTO PARA PROSSEGUIR COM O CADASTRO");
            ComboBoxImposto.requestFocusInWindow();
            return;
        }
        if(txtDescrição.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE A DESCRIÇÃO PARA PROSSEGUIR COM O CADASTRO");
            txtDescrição.requestFocusInWindow();
            return;
        }
         if(txtPreço.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O PREÇO PARA PROSSEGUIR COM O CADASTRO");
            txtPreço.requestFocusInWindow();
            return;
        }
       
          if(!Informações.isNumeric(txtPreço.getText())){
            JOptionPane.showMessageDialog(rootPane, "DIGITE UM VALOR VALIDO");
            txtPreço.requestFocusInWindow();
            return;
        }
           int preço=Integer.parseInt(txtPreço.getText());
           if(preço<=0){
           JOptionPane.showMessageDialog(rootPane, "DIGITE UM VALOR VALIDO MAIOR QUE 0");
           txtPreço.requestFocusInWindow();
           return;
        }
        
        
        int pcsLinha=clsDados.posiçãoProduto(txtCodProduto.getText());
        if(cmdNovo){
            if(pcsLinha != -1){
                JOptionPane.showMessageDialog(rootPane, "PRODUTO JÁ CADASTRADO NO BANCO DE DADOS");
                txtCodProduto.requestFocusInWindow();
                return;
            }else{
                if(pcsLinha==1){
                JOptionPane.showMessageDialog(rootPane, "PRODUTO NÃO ESTÁ CADASTRADO NO BANCO DE DADOS");
                txtCodProduto.requestFocusInWindow();
                return;
             }
            
             }
        }
        
        Produto mProduto=new Produto(txtCodProduto.getText(),txtDescrição.getText(),preço,ComboBoxImposto.getSelectedIndex(),txtAnotações.getText());
       String msg;
       
       if(cmdNovo){
            msg=clsDados.adicionarProduto(mProduto);
            JOptionPane.showMessageDialog(rootPane, msg);
       }else{
            msg=clsDados.editarProduto(mProduto,pcsLinha);
            JOptionPane.showMessageDialog(rootPane, msg);
       } 
       
//Codigo do botão salvar cadastro do formulario de cadastro de produtos.
        
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
        
        txtCodProduto.setEnabled(false);
        txtDescrição.setEnabled(false);
        txtPreço.setEnabled(false);
        txtAnotações.setEnabled(false);
        ComboBoxImposto.setEnabled(false);
        
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
        
        txtCodProduto.setEnabled(false);
        txtDescrição.setEnabled(false);
        txtPreço.setEnabled(false);
        txtAnotações.setEnabled(false);
        ComboBoxImposto.setEnabled(false);
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
       
        txtDescrição.setEnabled(true);
        txtPreço.setEnabled(true);
        txtAnotações.setEnabled(true);
        ComboBoxImposto.setEnabled(true);
        
        
        cmdNovo=false;
        txtDescrição.requestFocusInWindow();
    }//GEN-LAST:event_bntEditarCadastroActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        visualizarCadastros();
        carregarTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void bntUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUltimoActionPerformed
        //Codigo do botão ultimo cadastro do formulario de cadastro de produtos. 
        produtoAtual=clsDados.numeroProdutos()-1;
        visualizarCadastros();
    }//GEN-LAST:event_bntUltimoActionPerformed

    private void bntAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAnteriorActionPerformed
        // Codigo do botão cadastro anterior do formulario de cadastro de produtos.
        produtoAtual--;
        if(produtoAtual==-1){
         produtoAtual=clsDados.numeroProdutos()-1;
        }
        visualizarCadastros();  
    }//GEN-LAST:event_bntAnteriorActionPerformed
        
    private void bntProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntProximoActionPerformed
        //Codigo do botão proximo.
        produtoAtual++;
        if(produtoAtual==clsDados.numeroProdutos()){
            produtoAtual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_bntProximoActionPerformed

    private void bntPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPrimeiroActionPerformed
        //  Codigo do botão primeiro cadastro do formulario de cadastro de produtos.
        produtoAtual=0;
        visualizarCadastros();
    }//GEN-LAST:event_bntPrimeiroActionPerformed

    private void bntApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntApagarActionPerformed
        // Codigo do botão apagar cadastro.
        int del=JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esse cadastro?");
        if(del!=0){
            return;
        }
        
        String msg=clsDados.deletarProduto(produtoAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        produtoAtual=0;
        
        visualizarCadastros();
        carregarTable();
    }//GEN-LAST:event_bntApagarActionPerformed

    private void ComboBoxImpostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxImpostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxImpostoActionPerformed
     private void visualizarCadastros(){
        txtCodProduto.setText(clsDados.getProdutos()[produtoAtual].getCodProduto());
        txtDescrição.setText(clsDados.getProdutos()[produtoAtual].getDescrição());
        txtPreço.setText(""+clsDados.getProdutos()[produtoAtual].getPreço());
        txtAnotações.setText(clsDados.getProdutos()[produtoAtual].getAnotaçoes());
        ComboBoxImposto.setSelectedIndex(clsDados.getProdutos()[produtoAtual].getImposto());
        
     }
     
     private void carregarTable(){
         String tituloCabeçalho[]={"COD. PRODUTO","DESCRIÇÃO","PREÇO","IMPOSTO","ANOTAÇÃO"};
         String registro[]=new String[5];
         userTable= new DefaultTableModel(null,tituloCabeçalho);
         for(int i=0;i<clsDados.numeroProdutos();i++){
             registro[0]= clsDados.getProdutos()[i].getCodProduto();
             registro[1]= clsDados.getProdutos()[i].getDescrição();
             registro[2]=""+ clsDados.getProdutos()[i].getPreço();
             registro[3]= imposto(clsDados.getProdutos()[i].getImposto());
             registro[4]= clsDados.getProdutos()[i].getAnotaçoes();
             userTable.addRow(registro);
         }
         tblTabela.setModel(userTable);
         
     }
     private String imposto(int codImposto){
         switch(codImposto){
             case 0:return "0%";
             case 1:return "10%";
             case 2:return "15%";
             default:return "NÃO DEFENIDO";
         }
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxImposto;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtAnotações;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtDescrição;
    private javax.swing.JTextField txtPreço;
    // End of variables declaration//GEN-END:variables
}
