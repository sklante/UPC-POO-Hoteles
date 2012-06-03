/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import Modelos.TipoHabitacion;
import Modelos.Habitacion;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class HabitacionTest {
    
    public HabitacionTest() {
    }

    @Test
    public void validarQueTodasTenganNumero() {
        Habitacion habitacion = new Habitacion(101);
        assertNotNull(habitacion.getNumHabitacion());
    }
    
    @Test
    public void validarQueTodasTenganTipo() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        Habitacion habitacion = new Habitacion(101, tipoHabitacion);
        assertNotNull(habitacion.getTipoHabitacion());
    }
    
    @Test
    public void validarQueSiSeCreaTipoQueCorresponda() {
        Habitacion habitacion = new Habitacion(101);
        habitacion.setTipoHabitacion(new TipoHabitacion("Suite"));
        assertSame(habitacion.getTipoHabitacion().toString(),"Suite");
    }
}
