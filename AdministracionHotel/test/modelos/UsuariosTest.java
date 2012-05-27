/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import controladoras.Usuarios;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuariosTest {
   Usuarios Usuarios = new Usuarios();
    
    
    @Test
    public void siNoIngresoElCorreoElectronicoMeDebeDarError(){
        assertFalse(Usuarios.verificarCorreoElectronico(null));
        System.out.println("El correo Electronico no debe vacío");
    }  
            
    @Test
    public void siIngresoElCorreoElectronicoDebeAceptarlo(){
        assertTrue(Usuarios.verificarCorreoElectronico("sklante_1@hotmail.com"));
        System.out.println("correo Electronico Ingresado");
    }
    /*Verificar que Password no es null*/
    
    @Test
    public void siElCorreoElectronicoNoExisteDebeMandarMensaje(){
        assertNull(Usuarios.existeCorreoElectronico("legna@hotmail.com"));
        System.out.println("Este correo elctronico no existe o es incorrecto");
    }
    
    @Test
    public void siElCorreoElectronicoExisteDebeMandarMensaje(){
        assertNotNull(Usuarios.existeCorreoElectronico("sklante_1@hotmail.com"));
        System.out.print("correo electronico aceptado");
    }
    
    @Test
    public void siElPassWordEsValidoDebeDarmeAcceso(){
        assertTrue(Usuarios.validarPassword("sklante_1@hotmail.com","123456"));
        System.out.println("Acceso Aceptado");
    }
    
    @Test
    public void siElPassWordNoEsValidoNoDebeDarmeAcceso(){
        assertFalse(Usuarios.validarPassword("sklante_1@hotmail.com", "1234567"));
        System.out.println("Acceso Denegado");
    }
    
}
