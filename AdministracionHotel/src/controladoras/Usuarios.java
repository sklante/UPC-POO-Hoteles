
package controladoras;

import java.util.ArrayList;
import modelos.Usuario;
import modelos.Usuario;


public class Usuarios {
    
    private ArrayList<Usuario> dbUsuarios = new ArrayList<Usuario>();
    
    private void simularTabla(){
        this.dbUsuarios.add(new Usuario("001", "Miguel ", "Angel", "sklante_1@hotmail.com", "123456"));
        this.dbUsuarios.add(new Usuario("002", "Alfredo ", "Luyo", "alfredoluy@hotmail.com", "alfred123"));
        this.dbUsuarios.add(new Usuario("003", "Jose", "Rabanal", "josrab@hotmail.com", "josrab333"));
        this.dbUsuarios.add(new Usuario("004", "Gonzalo", "Gutierrez", "gongut@hotmail.com", "gongut444"));
        
    }
    
  
    public Usuario existeCorreoElectronico(String userName){
        simularTabla();
        Usuario usuarioEncontrado = null;
        for(Usuario usuario : dbUsuarios){
            if(usuario.getCorreoe().equals(userName))
                usuarioEncontrado = usuario;
        }
        return usuarioEncontrado;            
    }
    
    public boolean validarPassword(String userName, String password){
        boolean acceso = false;
        Usuario usuarioValido = existeCorreoElectronico(userName);
        if(usuarioValido.getPassword().equals(password)){
            acceso = true;
        }
        return acceso;

    }
    
    
}
