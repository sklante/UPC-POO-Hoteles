/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import modelos.TipoPasajero;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class TipoClienteTest {

    public TipoClienteTest() {
    }

    @Test
    public void QueElTipoCorrespondaAlCreado() {
        TipoPasajero tipoCliente = new TipoPasajero("VIP");
        String expResult = "VIP";
        String result = tipoCliente.getTipoCliente();
        assertEquals(expResult, result);
    }
    
}