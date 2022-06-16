
package Classes;

/**
 * 
 * @author david e Luiz
 * Esta é a Classe responsável por converter as informações para serem colocados nos combobox na classe frmFatura.
 * 
 */

public class Opções {
  private String valor;
  private String descrição;

    public Opções(String valor, String descrição) {
        this.valor = valor;
        this.descrição = descrição;
    }

    public String getValor() {
        return valor;
    }

    public String getDescrição() {
        return descrição;
    }

    @Override
    public String toString() {
        return descrição ;
    }
    
  
}
