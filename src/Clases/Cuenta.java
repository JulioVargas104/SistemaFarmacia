package Clases;
import Formularios.Login;
import java.util.ArrayList;

/**
 *
 * @author Julio Vargas
 */
public class Cuenta {

    public static ArrayList<ClaseCuenta> c = new ArrayList<ClaseCuenta>();
    
    public static void main(String[] args) {
        Login objetoLogin = new Login();
        objetoLogin.setVisible(true);
    }
    
}
