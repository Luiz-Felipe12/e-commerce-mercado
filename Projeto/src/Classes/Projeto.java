
package Classes;

/**
 * 
 * @author Luiz Felipe
 * Classe onde é executado o projeto.
 * 
 */

import Formulários.FrmLogin;

public class Projeto {

    public static void main(String[] args) {
        Dados clsDados= new Dados();
        
        FrmLogin Login= new FrmLogin();
        Login.setDados(clsDados);
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }
    
}
