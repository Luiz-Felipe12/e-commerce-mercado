
 
package Classes;

import java.util.Date;
/**
 * 
 * @author Luiz Felipe
 * Classe onde é criado o objeto Clientes.
 * 
 */

public class Cliente {
    private String codCliente;
    private int documento;
    private String nomeCliente;
    private String sobrenomeCliente;
    private String endereço;
    private String telefone;
    private int cidade;
    private Date dataNasc;
    private Date dataAtual;

    public Cliente(String codCliente, int documento, String nomeCliente, String sobrenomeCliente, String endereço, String telefone, int cidade, Date dataNasc, Date dataAtual) {
        this.codCliente = codCliente;
        this.documento = documento;
        this.nomeCliente = nomeCliente;
        this.sobrenomeCliente = sobrenomeCliente;
        this.endereço = endereço;
        this.telefone = telefone;
        this.cidade = cidade;
        this.dataNasc = dataNasc;
        this.dataAtual = dataAtual;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente) {
        this.sobrenomeCliente = sobrenomeCliente;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    @Override
    public String toString() {
        return codCliente+ "|"+documento+"|"+nomeCliente+"|"+sobrenomeCliente+"|"+endereço+"|"+telefone+"|"+cidade+"|"+Informações.formatDate(dataNasc)+"|"+Informações.formatDate(dataAtual);
    }
    
    
    
}
