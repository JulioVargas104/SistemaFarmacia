package Clases;
import static Clases.Cuenta.c;

/**
 *
 * @author Julio Vargas
 */
public class ClaseCuenta {
    String Nombre;
    String Apellido;
    String Usuario;
    String Contraseña;

    public ClaseCuenta(String Nombre, String Apellido, String Usuario, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public String getNombre() {return Nombre;}
    public void setNombre(String Nombre) {this.Nombre = Nombre;}
    public String getApellido() {return Apellido;}
    public void setApellido(String Apellido) {this.Apellido = Apellido;}
    public String getUsuario() {return Usuario;}
    public void setUsuario(String Usuario) {this.Usuario = Usuario;}
    public String getContraseña() {return Contraseña;}
    public void setContraseña(String Contraseña) {this.Contraseña = Contraseña;}
    
    public static int BuscarUsuario(String user,String clave){
       
        for (int i = 0 ; i < c.size() ; i++){
            if(c.get(i).getUsuario().equals(user)&& c.get(i).getContraseña().equals(clave)){
                 
                return i;
            }
        }
        return -1; 
    }
}
