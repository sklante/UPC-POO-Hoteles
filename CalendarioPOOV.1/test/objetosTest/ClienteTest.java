/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package objetosTest;

import modelos.Persona;
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
        Persona cliente1 = new Persona("Jorge", "Chavez");
        Persona cliente2 = new Persona("Miguel", "Grau");
        Persona cliente3 = new Persona("Francisco", "Bolognesi");
        assertEquals(cliente1.getIdCliente(), 1);
        assertEquals(cliente2.getIdCliente(), 2);
        assertEquals(cliente3.getIdCliente(), 3);
    }
    
    @Test
    public void QueTodosTenganTipo() {
        TipoPasajero tipoCliente = new TipoPasajero("VIP");
        Persona cliente = new Persona("Jorge", "Chavez", tipoCliente);
        assertNotNull(cliente.getTipoCliente());
        assertEquals(cliente.getTipoCliente().getTipoCliente(), "VIP");
    } 
     
    @Test
    public void QueTodosTenganNombre() {
        Persona cliente = new Persona("Jorge", "Chavez");
        assertNotNull(cliente.toString());
    }
    
    @Test
    public void QueSePuedaAgregarLosDemasAtributos() {
        Persona cliente = new Persona("Jorge", "Chavez");
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
        Persona cliente = new Persona("Jorge", "Chavez");
        assertEquals(cliente.toString(),"Jorge Chavez");
    }

   
}
