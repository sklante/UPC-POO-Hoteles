/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import modelos.TipoHabitacion;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
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

}
