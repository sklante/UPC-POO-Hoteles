/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import Modelos.TipoCliente;
import Modelos.Cliente;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @Test
    public void QueLosIdSeanCorrelativos() {
        Cliente cliente1 = new Cliente("Jorge", "Chavez");
        Cliente cliente2 = new Cliente("Miguel", "Grau");
        Cliente cliente3 = new Cliente("Francisco", "Bolognesi");
        assertEquals(cliente1.getIdCliente(), 1);
        assertEquals(cliente2.getIdCliente(), 2);
        assertEquals(cliente3.getIdCliente(), 3);
    }
    
    @Test
    public void QueTodosTenganTipo() {
        TipoCliente tipoCliente = new TipoCliente("VIP");
        Cliente cliente = new Cliente("Jorge", "Chavez", tipoCliente);
        assertNotNull(cliente.getTipoCliente());
        assertEquals(cliente.getTipoCliente().getTipoCliente(), "VIP");
    } 
     
    @Test
    public void QueTodosTenganNombre() {
        Cliente cliente = new Cliente("Jorge", "Chavez");
        assertNotNull(cliente.toString());
    }
    

    @Test
    public void validarQueSeIngreseLasDosContrasenas(){
        String contras1 = null;
        String contras2 = null;
        Cliente contrasena = new Cliente("01","alfred@hotmail.com", "123456", "123456","A");
        Assert.assertFalse(contrasena.validaContrasena(contras1));
        Assert.assertFalse(contrasena.validaContrasena(contras2));
        System.out.println("Debe ingresar contraseña");
    }

    @Test
    public void validarQueLasDosContrasenasNoCoincidan(){
        String contras1 = "123456";
        String contras2 = "123450";
        boolean valor = false;
        Cliente contrasena = new Cliente("01","alfred@hotmail.com","123456", "123456","A");
        valor = contrasena.validaSiCoinciden(contras1, contras2);
        Assert.assertFalse(valor);
        System.out.println("Las contraseñas no coincidem");
    }
   
}
