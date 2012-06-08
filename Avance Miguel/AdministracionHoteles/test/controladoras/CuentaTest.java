
package controladoras;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Angel
 */
public class CuentaTest {

    Cuentas cuenta = new Cuentas();

    @Test
    public void cuentaSinClientes() {
        assertEquals(0, cuenta.getClientes().size());
    }

    @Test
    public void cuentaConUnCliente() {
        cuenta.registrarCliente("01", "sklante_1@hotmail.com", "123456");
        assertEquals(1, cuenta.getClientes().size());
    }

    @Test
    public void cuentaConVariosClientes() {
        cuenta.registrarCliente("01", "sklante_1@hotmail.com", "123456");
        cuenta.registrarCliente("02", "alfredo@hotmail.com", "1234");
        cuenta.registrarCliente("03", "ana@hotmail.com", "1234");
        assertEquals(3, cuenta.getClientes().size());
        
             
    }

    @Test
    public void registrarCLientes() {
        assertEquals(0, cuenta.getClientes().size());
        cuenta.registrarCliente("01", "sklante_1@hotmail.com", "123456");
        assertEquals(1, cuenta.getClientes().size());
        cuenta.registrarCliente("02", "alfredo@hotmail.com", "1234");
        assertEquals(2, cuenta.getClientes().size());
        cuenta.registrarCliente("03", "ana@hotmail.com", "1234");
        assertEquals(3, cuenta.getClientes().size());

        try {
            cuenta.registrarCliente("03", "sklante_12@hotmail.com", "1234546");
            fail();
        } catch (Exception ex) {
            assertEquals("Cliente ya registrado", ex.getMessage());
        }

    }   
   
}