/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import modelos.TipoPasajero;
import modelos.Pasajero;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class PasajeroTest {
    
    public PasajeroTest() {
    }
    
    @Test
    public void QueLosIdSeanCorrelativos() {
        Pasajero cliente1 = new Pasajero("Jorge", "Chavez");
        Pasajero cliente2 = new Pasajero("Miguel", "Grau");
        Pasajero cliente3 = new Pasajero("Francisco", "Bolognesi");

        assertEquals(cliente2.getIdCliente(), cliente1.getIdCliente()+1);
        assertEquals(cliente3.getIdCliente(), cliente2.getIdCliente()+1);
        assertFalse(cliente1.errorObject&&cliente2.errorObject&&
                cliente3.errorObject);
    }
    
    @Test
    public void QueTodosTenganTipo() {
        TipoPasajero tipoCliente = new TipoPasajero("VIP");
        Pasajero cliente = new Pasajero("Jorge", "Chavez", tipoCliente);
        assertNotNull(cliente.getTipoCliente());
        assertEquals(cliente.getTipoCliente().getTipoPasajero(), "VIP");
        assertFalse(cliente.errorObject);
    } 
     
    @Test
    public void QueTodosTenganNombre() {
        Pasajero cliente = new Pasajero("Jorge", "Chavez");
        assertNotNull(cliente.toString());
        assertFalse(cliente.errorObject);
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
        assertFalse(cliente.errorObject);
    }

    @Test
    public void QueElToStringSeaNombreYApellido() {
        Pasajero cliente = new Pasajero("Jorge", "Chavez");
        assertEquals(cliente.toString(),"Jorge Chavez");
        assertFalse(cliente.errorObject);
    }
    
    @Test
    public void QueLogeeLosValoresNull1() {
        Pasajero cliente = new Pasajero(null, "Chavez");
        assertTrue(cliente.errorObject);
    }
    
    @Test
    public void QueLogeeLosValoresNull2() {
        Pasajero cliente = new Pasajero("Jorge", null);
        assertTrue(cliente.errorObject);
    }
    
    @Test
    public void QueLogeeLosValoresNull3() {
        Pasajero cliente = new Pasajero(null, null, null);
        assertTrue(cliente.errorObject);
    }
   
}
