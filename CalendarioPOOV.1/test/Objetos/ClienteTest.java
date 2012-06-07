/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import modelos.Pasajero;
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

   
}
