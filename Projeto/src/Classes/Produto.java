
package Classes;
/**
 * 
 * @author David Cavalcanti
 * Classe onde é criado o objeto produto.
 * 
 */

public class Produto {
    private String codProduto;
    private String descrição;
    private int preço;
    private int imposto;
    private String Anotaçoes;

    public Produto(String codProduto, String descrição, int preço, int imposto, String Anotaçoes) {
        this.codProduto = codProduto;
        this.descrição = descrição;
        this.preço = preço;
        this.imposto = imposto;
        this.Anotaçoes = Anotaçoes;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public String getAnotaçoes() {
        return Anotaçoes;
    }

    public void setAnotaçoes(String Anotaçoes) {
        this.Anotaçoes = Anotaçoes;
    }

    @Override
    public String toString() {
        return codProduto+ "|"+descrição+"|"+preço+"|"+imposto+"|"+Anotaçoes;
    }
    
    
    
    
}
