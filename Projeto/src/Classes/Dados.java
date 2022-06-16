    
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

/**
 * 
 * @author david e Luiz
 * Esta é a Classe responsável por Adicinar, criar, editar, Salvar e lê os dados.
 * 
 */

public class Dados implements IDadosAbstract{
    private int maxUser=50;
    private int maxProdutos=100;
    private int maxClientes=100;
    private Usuarios msUsuario[]= new Usuarios[maxUser];
    private Produto msProduto[]= new Produto[maxProdutos];
    private Cliente msCliente[]= new Cliente[maxClientes];
    private int contusuario = 0;
    private int contProdutos=0;
    private int contClientes=0;
    private int contVendas=0;
    
    public Dados(){
        preencherUsuarios();
              
        preencherProdutos();
        
        preencherClientes();
        
        preencherConfiguracao();
    }
    
    public int getContVendas(){
        return contVendas;
    }
    
    public void setContVendas(int contVendas){
        this.contVendas=contVendas;
    }
  
    public Usuarios[]getUsuarioses(){
        return msUsuario;
    }
     public Produto[]getProdutos(){
        return msProduto;
    }
     public Cliente[]getClientes(){
        return msCliente;
    }
    //codigo para validação de usuario
    public boolean validarUsuario(String usuario, String senha){
        boolean aux= false;
        for(int i=0;i<contusuario;i++){
            if(msUsuario[i].getCodUsuario().equals(usuario)&& msUsuario[i].getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
    //retorna se é um usuario ou administrador
     public int getPerfil(String usuario){
        for(int i=0;i<contusuario;i++){
            if(msUsuario[i].getCodUsuario().equals(usuario)){
                return msUsuario[i].getPerfil();
            } 
        }
        return -1;
    }
     //Codigo pra trocar senha
      public void trocarSenha(String usuario,String senha){
        for(int i=0;i<contusuario;i++){
            if(msUsuario[i].getCodUsuario().equals(usuario)){
                msUsuario[i].setSenha(senha);
                return;
            }
        }
      
    }
    //retorna a posição do usuario para verificar cadastro existente
    public int posiçãoUsuario(String usuario){
        for(int i=0;i<contusuario;i++){
            if(msUsuario[i].getCodUsuario().equals(usuario)){
                return i;
            }
        }
        return -1;
    }
    //retorna a posição do produto para verificar cadastro existente
     public int posiçãoProduto(String produto){
        for(int i=0;i<contProdutos;i++){
            if(msProduto[i].getCodProduto().equals(produto)){
                return i;
            }
        }
        return -1;
    }
     //retorna a posição do cliente para verificar cadastro existente
     public int posiçãoCliente(String cliente){
        for(int i=0;i<contClientes;i++){
            if(msCliente[i].getCodCliente().equals(cliente)){
                return i;
            }
        }
        return -1;
    }
     //Codigo para Adicionar usuarios
    @Override
    public String adicionarUsuario(Usuarios mUsuarios){
        if(contusuario == maxUser){
            return "NÃO É POSSIVEL MAIS CADASTRAR USUARIOS, LIMITE ATINGIDO";
        }
        msUsuario[contusuario]=mUsuarios;
        contusuario++;
        return "USUARIO CADASTRADO COM SUCESSO";
    }
    //Codigo para Adicionar produtos
    @Override
     public String adicionarProduto(Produto mProduto){
        if(contProdutos == maxProdutos){
            return "NÃO É POSSIVEL MAIS CADASTRAR PRODUTO, LIMITE ATINGIDO";
        }
        msProduto[contProdutos]=mProduto;
        contProdutos++;
        return"PRODUTO CADASTRADO COM SUCESSO";
    }
     //Codigo para Adicionar Clientes
    @Override
     public String adicionarCliente(Cliente mCliente){
        if(contClientes == maxClientes){
            return "NÃO É POSSIVEL MAIS CADASTRAR CLIENTE, LIMITE ATINGIDO";
        }
        msCliente[contClientes]=mCliente;
        contClientes++;
        return"CLIENTE CADASTRADO COM SUCESSO";
    }
    
    // Codigo para Editar usuario
    @Override
    public String editarUsuario(Usuarios mUsuarios, int posi){
        msUsuario[posi].setNome(mUsuarios.getNome());
        msUsuario[posi].setSobrenome(mUsuarios.getSobrenome());
        msUsuario[posi].setSenha(mUsuarios.getSenha());
        msUsuario[posi].setPerfil(mUsuarios.getPerfil());
        
        return "USUARIO EDITADO COM SUCESSO";
    }
    // Codigo para Editar produto
    @Override
    public String editarProduto(Produto mProduto, int posi){
        msProduto[posi].setDescrição(mProduto.getDescrição());
        msProduto[posi].setPreço(mProduto.getPreço());
        msProduto[posi].setAnotaçoes(mProduto.getAnotaçoes());
        msProduto[posi].setImposto(mProduto.getImposto());
        
        return "PRODUTO EDITADO COM SUCESSO";
    }
    //Codigo para Editar Cliente
    @Override
    public String editarCliente(Cliente mCliente, int posi){
        msCliente[posi].setCodCliente(mCliente.getCodCliente());
        msCliente[posi].setNomeCliente(mCliente.getNomeCliente());
        msCliente[posi].setSobrenomeCliente(mCliente.getSobrenomeCliente());
        msCliente[posi].setEndereço(mCliente.getEndereço());
        msCliente[posi].setTelefone(mCliente.getTelefone());
        msCliente[posi].setCidade(mCliente.getCidade());
        msCliente[posi].setDataNasc(mCliente.getDataNasc());
        msCliente[posi].setDataAtual(mCliente.getDataAtual());
       
        return "CLIENTE EDITADO COM SUCESSO";
    }
    //Codigo para deletar usuario
    @Override
    public String deletarUsuario(int posi){
        for(int i=posi;i<contusuario-1;i++){
            msUsuario[i]=msUsuario[i+1];
        }
        contusuario--;
        return "USUARIO DELETADO COM SUCESSO";
    }
    //Codigo para deletar produto
    @Override
     public String deletarProduto(int posi){
        for(int i=posi;i<contProdutos-1;i++){
            msProduto[i]=msProduto[i+1];
        }
        contProdutos--;
        return "PRODUTO DELETADO COM SUCESSO";
    }
    //Codigo para deletar Cliente
    @Override
    public String deletarCliente(int posi){
        for(int i=posi;i<contClientes-1;i++){
            msCliente[i]=msCliente[i+1];
        }
        contClientes--;
        return "CLIENTE DELETADO COM SUCESSO";
    }
    public int numeroDeUsuarios(){
        return contusuario;
    }
     public int numeroProdutos(){
        return contProdutos;
    }
      public int numeroClientes(){
        return contClientes;
    }
    
     public void salvarTudo(){
         salvarUsuarios();
         salvarClientes();
         salvarProdutos();
         salvarConfiguracao();
     }
    @Override
    public void salvarUsuarios(){
        FileWriter fw= null;
        PrintWriter pw=null;
        try {
            fw=new FileWriter("Data/usuarios.txt");
            pw=new PrintWriter(fw);
            
            for(int i=0;i<contusuario;i++){
                pw.println(msUsuario[i].toString());
            }
                
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fw!=null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    //Salva os dados
    @Override
    public void salvarClientes(){
         FileWriter fw= null;
        PrintWriter pw=null;
        try {
            fw=new FileWriter("Data/clientes.txt");
            pw=new PrintWriter(fw);
            
            for(int i=0;i<contClientes;i++){
                pw.println(msCliente[i].toString());
            }
                
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fw!=null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    @Override
    public void salvarProdutos(){
        FileWriter fw= null;
        PrintWriter pw=null;
        try {
            fw=new FileWriter("Data/produtos.txt");
            pw=new PrintWriter(fw);
            
            for(int i=0;i<contProdutos;i++){
                pw.println(msProduto[i].toString());
            }
                
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fw!=null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    @Override
     public void salvarConfiguracao(){
        FileWriter fw= null;
        PrintWriter pw=null;
        try {
            fw=new FileWriter("Data/Configuracao.ini");
            pw=new PrintWriter(fw);
            
            pw.println("[Geral]");
            pw.println("FaturaAtual="+contVendas);
            
                
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if(fw!=null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    //lê os dados salvos de usuarios
    @Override
    public void preencherUsuarios(){
        File arquivo=null;
        FileReader fr=null;
        BufferedReader br=null;
        
        try {
            arquivo=new File("Data/usuarios.txt");
            fr=new FileReader(arquivo);
            br= new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            
            String codUsuario;
            String nome;
            String sobrenome;
            String senha;
            int perfil;
            
            while((linha=br.readLine())!= null){
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                codUsuario=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                nome=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                sobrenome=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                senha=aux;
                linha=linha.substring(pos+1);
         
                perfil=new Integer(linha);
                
                Usuarios muUsuarios=new Usuarios(codUsuario, nome, sobrenome, senha, perfil);
                msUsuario[contusuario]=muUsuarios;
                contusuario++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        
    }
    
   
    
    //lê os dados salvos de produtos
    @Override
    public void preencherProdutos(){
        File arquivo=null;
        FileReader fr=null;
        BufferedReader br=null;
        
        try {
            arquivo=new File("Data/produtos.txt");
            fr=new FileReader(arquivo);
            br= new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            
            String codProduto;
            String descrição;
            int preço;
            int imposto;
            String Anotaçoes;

            
            while((linha=br.readLine())!= null){
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                codProduto=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                descrição=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                preço=new Integer(aux);
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                imposto=new Integer(aux);
                linha=linha.substring(pos+1);
         
                Anotaçoes=linha;
                
                Produto muProduto=new Produto(codProduto, descrição, preço, imposto,Anotaçoes);
                msProduto[contProdutos]=muProduto;
                contProdutos++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        
    }
        //lê os dados salvos de clientes
    @Override
        public void preencherClientes(){
        File arquivo=null;
        FileReader fr=null;
        BufferedReader br=null;
        
        try {
            arquivo=new File("Data/clientes.txt");
            fr=new FileReader(arquivo);
            br= new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            
            String codCliente;
            int documento;
            String nomeCliente;
            String sobrenomeCliente;
            String endereço;
            String telefone;
            int cidade;
            Date dataNasc;
            Date dataAtual;

            
            while((linha=br.readLine())!= null){
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                codCliente=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                documento=new Integer(aux);
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                nomeCliente=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                sobrenomeCliente=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                endereço=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                telefone=aux;
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                cidade=new Integer(aux);
                linha=linha.substring(pos+1);
                
                pos=linha.indexOf('|');
                aux=linha.substring(0,pos);
                dataNasc=Informações.stringtoDate(aux);
                linha=linha.substring(pos+1);
         
                dataAtual=Informações.stringtoDate(linha);
                
                Cliente muCliente=new Cliente(codCliente, documento, nomeCliente, sobrenomeCliente, endereço, telefone, cidade, dataNasc, dataAtual);
                msCliente[contClientes]=muCliente;
                contClientes++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        
    }
        //lê os dados salvos de configuracao
    @Override
        public void preencherConfiguracao(){
        File arquivo=null;
        FileReader fr=null;
        BufferedReader br=null;
        
        try {
            arquivo=new File("Data/Configuracao.ini");
            fr=new FileReader(arquivo);
            br= new BufferedReader(fr);
            
            
            String linha;
            
            while((linha=br.readLine())!= null){
                if(linha.startsWith("FaturaAtual=")){
                    contVendas=new Integer(linha.substring(12));
                
                }
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        
    }

   
        
    
    
}
    

