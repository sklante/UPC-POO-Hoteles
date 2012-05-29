
package controladoras;

import java.util.ArrayList;
import modelos.Usuario;
import modelos.Usuario;


public class Usuarios {
    
    private ArrayList<Usuario> datosUsuarios = new ArrayList<Usuario>();
    
    private void simularTabla(){
        this.datosUsuarios.add(new Usuario("001", "Miguel ", "Angel", "sklante_1@hotmail.com", "123456"));
        this.datosUsuarios.add(new Usuario("002", "Alfredo ", "Luyo", "alfredoluy@hotmail.com", "alfred123"));
        this.datosUsuarios.add(new Usuario("003", "Jose", "Rabanal", "josrab@hotmail.com", "josrab333"));
        this.datosUsuarios.add(new Usuario("004", "Gonzalo", "Gutierrez", "gongut@hotmail.com", "gongut444"));
        
    }
    
  
    public Usuario existeCorreoElectronico(String userName){
        simularTabla();
        Usuario usuarioEncontrado = null;
        for(Usuario usuario : datosUsuarios){
            if(usuario.getCorreoe().equals(userName))
                usuarioEncontrado = usuario;
        }
        return usuarioEncontrado;            
    }
    /*    public Usuario asignarCodigo(String codigoUsuario){
        simularTabla();
        Usuario usuarioEncontrado = null;
        for(Usuario usuario : datosUsuarios){
            if(usuario.getCodigoUsuario().equals(codigoUsuario))
                usuarioEncontrado = usuario;
            else 
                String enteroString = "5";
            int entero = Integer.parseInt();
                
        }
        return usuarioEncontrado;            
    }*/

    public boolean validarPassword(String userName, String password){
        boolean acceso = false;
        Usuario usuarioValido = existeCorreoElectronico(userName);
        if(usuarioValido.getPassword().equals(password)){
            acceso = true;
        }
        return acceso;

    }
    
    
}
