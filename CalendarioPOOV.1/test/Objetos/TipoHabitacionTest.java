
package Objetos;

import controladores.ControladorMoneda;
import modelos.Moneda;
import modelos.TipoHabitacion;
import org.junit.*;
import static org.junit.Assert.*;


public class TipoHabitacionTest {
    
    public TipoHabitacionTest() {
    }

    @Test
    public void QueElTipoCorrespondaAlCreado() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        String expResult = "Suite";
        String result = tipoHabitacion.getTipo();
        assertEquals(expResult, result);
    }

    @Test
    public void debeIngresarUnPrecioValido(){
        double price = 0.0;
        TipoHabitacion tipohabitacion = new TipoHabitacion(null);
        assertTrue(tipohabitacion.verificaPrecio(price));
        System.out.println("Usted debe ingresar un precio valido");

    }

    @Test
    public void soloPuedeIngresarTresMonedas(){
        ControladorMoneda controladormoneda = new ControladorMoneda();

        controladormoneda.variasMonedas();
        
        assertFalse(controladormoneda.verificaTresMonedas());
        //assertEquals(3, con);


    }

}
