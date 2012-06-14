/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package objetosTest;

import modelos.Persona;
import modelos.Habitacion;
import modelos.TipoHabitacion;
import modelos.Reserva;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Pc
 */
public class ReservaTest {

    public ReservaTest() {
    }

    @Test
    public void QueLosIdSeanCorrelativos() {

        Persona cliente1 = new Persona("Jorge", "Chavez");
        Persona cliente2 = new Persona("Miguel", "Grau");
        Persona cliente3 = new Persona("Francisco", "Bolognesi");
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        Habitacion habitacion101 = new Habitacion(101, tipoHabitacion);
        Habitacion habitacion102 = new Habitacion(102, tipoHabitacion);
        Habitacion habitacion103 = new Habitacion(103, tipoHabitacion);

        Reserva reserva1 = new Reserva(cliente1, habitacion101, 27, 5, 2012);
        Reserva reserva2 = new Reserva(cliente2, habitacion102, 27, 5, 2012);
        Reserva reserva3 = new Reserva(cliente3, habitacion103, 27, 5, 2012);

        assertEquals(reserva1.getIdReserva(), 1);
        assertEquals(reserva2.getIdReserva(), 2);
        assertEquals(reserva3.getIdReserva(), 3);
    }

    @Test
    public void QueNoSeanNull() {

        Persona cliente1 = new Persona("Jorge", "Chavez");
        Persona cliente2 = new Persona("Miguel", "Grau");
        Persona cliente3 = new Persona("Francisco", "Bolognesi");
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        Habitacion habitacion101 = new Habitacion(101, tipoHabitacion);
        Habitacion habitacion102 = new Habitacion(102, tipoHabitacion);
        Habitacion habitacion103 = new Habitacion(103, tipoHabitacion);

        Reserva reserva1 = new Reserva(cliente1, habitacion101, 27, 5, 2012);
        Reserva reserva2 = new Reserva(cliente2, habitacion102, 27, 5, 2012);
        Reserva reserva3 = new Reserva(cliente3, habitacion103, 27, 5, 2012);

        assertNotNull(reserva1.getHabitacion());
        assertNotNull(reserva2.getHabitacion());
        assertNotNull(reserva3.getHabitacion());
        assertNotNull(reserva1.getCliente());
        assertNotNull(reserva2.getCliente());
        assertNotNull(reserva3.getCliente());

    }
}
