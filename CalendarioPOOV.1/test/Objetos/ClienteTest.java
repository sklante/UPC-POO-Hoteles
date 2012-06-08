
package Objetos;

import controladores.ControladorCliente;
import junit.framework.Assert;
import modelos.Cliente;
import modelos.Pasajero;
import modelos.TipoPasajero;
import org.junit.Test;
import static org.junit.Assert.*;


public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @Test
    public void QueLosIdSeanCorrelativos() {
        Pasajero cliente1 = new Pasajero("Jorge", "Chavez");
        Pasajero cliente2 = new Pasajero("Miguel", "Grau");
        Pasajero cliente3 = new Pasajero("Francisco", "Bolognesi");
        assertEquals(cliente1.getIdCliente(), 1);
        assertEquals(cliente2.getIdCliente(), 2);
        assertEquals(cliente3.getIdCliente(), 3);
    }
    
    @Test
    public void QueTodosTenganTipo() {
        TipoPasajero tipoCliente = new TipoPasajero("VIP");
        Pasajero cliente = new Pasajero("Jorge", "Chavez", tipoCliente);
        assertNotNull(cliente.getTipoCliente());
        assertEquals(cliente.getTipoCliente().getTipoCliente(), "VIP");
    } 
     
    @Test
    public void QueTodosTenganNombre() {
        Pasajero cliente = new Pasajero("Jorge", "Chavez");
        assertNotNull(cliente.toString());
    }
    
    @Test
    public void QueSePuedaAgregarLosDemasAtributos() {
        Pasajero cliente = new Pasajero("Jorge", "Chavez");
        assertNotNull(cliente.toString());
        cliente.setEmail("jchavez@hotmail.com");
        assertEquals(cliente.getEmail(),"jchavez@hotmail.com");
        cliente.setTel("jchavez@hotmail.com");
        assertEquals(cliente.getTel(),"jchavez@hotmail.com");
        cliente.setFax("562-2323 Anexo 32");
        assertEquals(cliente.getFax(),"562-2323 Anexo 32");
    }

    @Test
    public void QueElToStringSeaNombreYApellido() {
        Pasajero cliente = new Pasajero("Jorge", "Chavez");
        assertEquals(cliente.toString(),"Jorge Chavez");
    }
     //Test de aceptacion Configure su Cuenta
        @Test
    public void validarQueseIngreseCorreoElectronico(){
        Cliente cliente = new Cliente("01","alfred@hotmail.com", "123456", "A");
        //ControladorCliente controladorcliente = new ControladorCliente();
        assertFalse(cliente.verificaCorreo(null));
        System.out.println("Debe Ingresar Correo Electronico");
    }
    //Test de aceptacion Configure su Cuenta

    @Test
    public void siElCorreoElectronicoEsIncorrectoDebeMandarMensaje2(){
        Cliente cliente = new Cliente("01","alfredhotmail.com", "123456", "A");
        
        assertFalse(cliente.validarCorreo(cliente.getCorreoElectronico()));
        System.out.println("Este correo electronico es incorrecto");
    }

    //Test de aceptacion Configure su Cuenta
    @Test
    public void validarQueSeIngreseLasDosContrasenas(){
        String contras1 = null;
        String contras2 = null;
        Cliente contrasena = new Cliente("01","alfred@hotmail.com", "123456", "A");
        
        Assert.assertFalse(contrasena.validaContrasena(contras1));
        Assert.assertFalse(contrasena.validaContrasena(contras2));
        System.out.println("Debe ingresar contraseña");
    }
    //Test de aceptacion Configure su Cuenta
    @Test
    public void validarQueLasDosContrasenasNoCoincidan(){
        String contras1 = "123456";
        String contras2 = "123450";
        boolean valor = false;
        Cliente contrasena = new Cliente("01","alfred@hotmail.com","123456", "A");
        
        valor = contrasena.validaSiCoinciden(contras1, contras2);
        Assert.assertFalse(valor);
        System.out.println("Las contraseñas no coincidem");
    }
   
}
