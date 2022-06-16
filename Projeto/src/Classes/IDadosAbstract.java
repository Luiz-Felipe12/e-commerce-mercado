
package Classes;


/**
 * 
 * @author david e Luiz
 * Esta é a Classe responsável por ser o contrato da classe Dados.
 * 
 */
public interface   IDadosAbstract {

  
    void salvarUsuarios();
    void salvarClientes();
    void salvarProdutos();
    void salvarConfiguracao();
     
    void preencherUsuarios();
    void preencherProdutos();
    void preencherClientes();
    void preencherConfiguracao();


    String adicionarUsuario(Usuarios mUsuarios);
    String adicionarProduto(Produto mProduto); 
    String adicionarCliente(Cliente mCliente);
      
    String editarUsuario(Usuarios mUsuarios, int posi);
    String editarProduto(Produto mProduto, int posi);
    String editarCliente(Cliente mCliente, int posi);

    String deletarUsuario(int posi);
    String deletarProduto(int posi);
    String deletarCliente(int posi);

        
    
    
}
    

