
package Classes;
/**
 * 
 * @author Luiz Felipe
 * Classe onde é criado o objeto Usuario/adm.
 * 
 */

public class Usuarios {
    private String codUsuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private int perfil;

    public Usuarios(String codUsuario, String nome, String sobrenome, String senha ,int perfil) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSenha() {
        return senha;
    }
    
    public int getPerfil() {
        return perfil;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return codUsuario+ "|"+nome+"|"+sobrenome+"|"+senha+"|"+perfil;
    }

   
    
    
    
    
}
