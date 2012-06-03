/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import Modelos.TipoCliente;
import Modelos.Cliente;
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
    public void QueSePuedaAgregarLosDemasAtributos() {
        Cliente cliente = new Cliente("Jorge", "Chavez");
        assertNotNull(cliente.toString());
        cliente.setCorreoElectronico("jchavez@hotmail.com");
        assertEquals(cliente.getCorreoElectronico(),"jchavez@hotmail.com");
        cliente.setTel("jchavez@hotmail.com");
        assertEquals(cliente.getTel(),"jchavez@hotmail.com");
        cliente.setFax("562-2323 Anexo 32");
        assertEquals(cliente.getFax(),"562-2323 Anexo 32");
    }

    @Test
    public void QueElToStringSeaNombreYApellido() {
        Cliente cliente = new Cliente("Jorge", "Chavez");
        assertEquals(cliente.toString(),"Jorge Chavez");
    }

   
}
