/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import controladores.ControladorCliente;
import controladores.ControladorHotel;
import junit.framework.Assert;
import modelos.Cliente;
import modelos.Documento;
import modelos.Persona;
import modelos.TipoDocumento;
import modelos.TipoPasajero;
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
        Persona cliente1 = new Persona("Jorge Chavez", new Documento("45637772", new TipoDocumento("dni")), null, null);
        Persona cliente2 = new Persona("Miguel Grau",new Documento("45637772", new TipoDocumento("dni")), null, null);
        Persona cliente3 = new Persona("Francisco Bolognesi",new Documento("45637772", new TipoDocumento("dni")), null, null);
  
    }
    
   /* @Test
    public void QueTodosTenganTipo() {
        TipoPasajero tipoCliente = new TipoPasajero("VIP");
        Persona cliente = new Persona("Jorge Chavez", new Documento("45637772", new TipoDocumento("dni")), null, null);
        assertNotNull(cliente.getTipoCliente());
        assertEquals(cliente.getTipoCliente().getTipoCliente(), "VIP");
    }*/
     
    @Test
    public void QueTodosTenganNombre() {
        Persona cliente = new Persona("Jorge Chavez", new Documento("45637772", new TipoDocumento("dni")), null, null);
        assertNotNull(cliente.toString());
    }
    
    @Test
    public void QueSePuedaAgregarLosDemasAtributos() {
        Persona cliente = new Persona("Jorge Chavez", new Documento("45637772", new TipoDocumento("dni")), null, null);
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
        Persona cliente = new Persona("Jorge Chavez", new Documento("45637772", new TipoDocumento("dni")), null, null);
        assertEquals(cliente.toString(),"Jorge Chavez");
    }
            @Test
    public void validarQueseIngreseCorreoElectronico(){
        Cliente cliente = new Cliente("Alfredo","123456","alfred@hotmail.com", true);
        assertFalse(ControladorHotel.esNulos(cliente.getCorreoElectronico()));
        System.out.println("Debe Ingresar Correo Electronico");
    }
    //Test de aceptacion Configure su Cuenta

    @Test
    public void siElCorreoElectronicoEsIncorrectoDebeMandarMensaje2(){
        Cliente cliente = new Cliente("Alfredo","123456","alfredhotmail.com", true);

        assertFalse(ControladorCliente.esCorreo(cliente.getCorreoElectronico()));
        System.out.println("Este correo electronico es incorrecto");
    }

    //Test de aceptacion Configure su Cuenta
    @Test
    public void validarQueSeIngreseLasDosContrasenas(){
        String contras1 = "";
        String contras2 = "";
        //Cliente contrasena = new Cliente("Alfredo","123456","alfred@hotmail.com", true);
        Assert.assertFalse(!ControladorCliente.esNulos(contras1));
        Assert.assertFalse(!ControladorCliente.esNulos(contras2));
        System.out.println("Debe ingresar contraseña");
    }
    //Test de aceptacion Configure su Cuenta
    @Test
    public void validarQueLasDosContrasenasNoCoincidan(){
        String contras1 = "123456";
        String contras2 = "123450";
        boolean valor = false;
        //Cliente contrasena = new Cliente("01","alfred@hotmail.com","123456", "A");

        valor = ControladorCliente.validarIguales(contras1, contras2);
        Assert.assertFalse(valor);
        System.out.println("Las contraseñas no coincidem");
    }

   
}
