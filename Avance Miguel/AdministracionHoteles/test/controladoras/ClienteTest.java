
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;
import  controladoras.Clientes;

public class ClienteTest {
   Clientes Clientes = new Clientes();
    
    @Test
    public void siNoIngresoElCorreoElectronicoMeDebeDarError(){
        assertFalse(Clientes.verificarCorreoElectronico(null));
        System.out.println("El correo Electronico no debe estar vacío");
    }  
            
    @Test
    public void siIngresoElCorreoElectronicoDebeAceptarlo(){
        assertTrue(Clientes.verificarCorreoElectronico("sklante_1@hotmail.com"));
        System.out.println("correo Electronico ingresado es correto");
    }
    /*Verificar que Password no es null*/
    
    @Test
    public void siElCorreoElectronicoNoExisteDebeMandarMensaje(){
        assertNull(Clientes.existeCorreoElectronico("sklante_12@hotmail.com"));
        System.out.println("Este correo elctronico no existe o es incorrecto");
    }
    
   @Test
    public void siElPassWordEsValidoDebeDarmeAcceso(){
        assertTrue(Clientes.validarPassword("sklante_1@hotmail.com","123456","123456"));
        System.out.println("Acceso Aceptado");
    }
    
    @Test
    public void siElPassWordNoEsValidoNoDebeDarmeAcceso(){
        assertFalse(Clientes.validarPassword("sklante_1@hotmail.com","123456","1123456"));
        System.out.println("Acceso Denegado, verificar correo electronico");
    }
    
 
      @Test
    public void sinoIngresoLaContrasenaDosVecesMeDebeDarError(){
        assertFalse(Clientes.validarPassword("sklante_1@hotmail.com","123456",null));
        System.out.println("debe ingresar contraseña");
    }
    
    
 
    
}
