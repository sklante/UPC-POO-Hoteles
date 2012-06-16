/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import controladores.ControladorHotel;
import controladores.MetodosGenerales;
import modelos.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class ReservaTest {

    public ReservaTest() {
    }
    /*
    @Test
    public void QueLosIdSeanCorrelativos() {

        Persona cliente1 = new Persona("Jorge Chavez", new Documento("45637772", new TipoDocumento("dni")), null, null);
        Persona cliente2 = new Persona("Miguel Grau", new Documento("45637772", new TipoDocumento("dni")), null, null);
        Persona cliente3 = new Persona("Francisco Bolognesi", new Documento("45637772", new TipoDocumento("dni")), null, null);
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        Habitacion habitacion101 = new Habitacion(101, tipoHabitacion);
        Habitacion habitacion102 = new Habitacion(102, tipoHabitacion);
        Habitacion habitacion103 = new Habitacion(103, tipoHabitacion);

        Reserva reserva1 = new Reserva("",cliente1, habitacion101, 27, 5, 2012);
        Reserva reserva2 = new Reserva("",cliente2, habitacion102, 27, 5, 2012);
        Reserva reserva3 = new Reserva("",cliente3, habitacion103, 27, 5, 2012);

        assertEquals(reserva1.getIdReserva(), 1);
        assertEquals(reserva2.getIdReserva(), 2);
        assertEquals(reserva3.getIdReserva(), 3);
    }
*/

    @Test
    public void QueNoSeanNull() {

        Persona cliente1 = new Persona("Jorge Chavez", new Documento("45637772", new TipoDocumento("dni")), null, null);
        Persona cliente2 = new Persona("Miguel Grau", new Documento("45637772", new TipoDocumento("dni")), null, null);
        Persona cliente3 = new Persona("Francisco Bolognesi", new Documento("45637772", new TipoDocumento("dni")), null, null);
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        Habitacion habitacion101 = new Habitacion(101, tipoHabitacion);
        Habitacion habitacion102 = new Habitacion(102, tipoHabitacion);
        Habitacion habitacion103 = new Habitacion(103, tipoHabitacion);

        Reserva reserva1 = new Reserva("", cliente1, habitacion101, 27, 5, 2012);
        Reserva reserva2 = new Reserva("", cliente2, habitacion102, 27, 5, 2012);
        Reserva reserva3 = new Reserva("", cliente3, habitacion103, 27, 5, 2012);

        assertNotNull(reserva1.getHabitacion());
        assertNotNull(reserva2.getHabitacion());
        assertNotNull(reserva3.getHabitacion());
        assertNotNull(reserva1.getCliente());
        assertNotNull(reserva2.getCliente());
        assertNotNull(reserva3.getCliente());

    }

    //Test de Aceptacion de Historia CONFIRMACION
    @Test
    public void confirmarSiLaFechaEstaEnElRango() {


        ControladorHotel.monedas.add(new Moneda("SOLES", "S/.", 1, true));
        ControladorHotel.tiposHabitacion.add(new TipoHabitacion("SUITE", 200.0, ControladorHotel.monedas.get(0)));
        ControladorHotel.habitaciones.add(new Habitacion("101", ControladorHotel.tiposHabitacion.get(0)));
        ControladorHotel.personas.add(new Persona("Christopher Garrido", new Documento("456456456", new TipoDocumento("DNI")), "97856456", "cgn@m"));
        Fecha fecha = new Fecha(12, 02, 2012);
        ControladorHotel.AgregarReservaPreliminar(ControladorHotel.habitaciones.get(0), fecha, 3, null);
        
        assertFalse(ControladorHotel.estaEnRangoFecha(12, fecha));
        
    }
   
    
    @Test
    public void confirmarSiYaExisteReserva() {


        ControladorHotel.monedas.add(new Moneda("SOLES", "S/.", 1, true));
        ControladorHotel.tiposHabitacion.add(new TipoHabitacion("SUITE", 200.0, ControladorHotel.monedas.get(0)));
        ControladorHotel.habitaciones.add(new Habitacion("101", ControladorHotel.tiposHabitacion.get(0)));
        ControladorHotel.personas.add(new Persona("Christopher Garrido", new Documento("456456456", new TipoDocumento("DNI")), "97856456", "cgn@m"));
        Fecha fecha = new Fecha(12, 07, 2012);
     //   assertFalse(ControladorHotel.estaEnRangoFecha(12, fecha));
        Habitacion habitacion = ControladorHotel.habitaciones.get(0);
        ControladorHotel.AgregarReservaPreliminar(ControladorHotel.habitaciones.get(0), fecha, 3, ControladorHotel.personas.get(0));
        Fecha.traductoActivado=true;
        for (Reserva object : ControladorHotel.reservas) {
            System.out.println("CONFIRMADO: " + object +" HABITACIONES: "+ object.getHabitacion() +" FECHAS: " + object.getFecha());
        }

        
        boolean reservaRepetida = ControladorHotel.reservaRepetida(habitacion.toString(), fecha.toFechaCompleta(), 3, "");
        assertFalse(reservaRepetida);
        
     
    }


    @Test
    public void CheckIn() {
        
        


    }

    //Test de Aceptacion de Historia CHECK-IN
    //Toma la reserva que esta confirmada
    @Test
    public void tomarReservaDeHabitacion() {
        boolean confirma = false;
        boolean checkInEnviado = true;


    }
    //Test de Aceptacion de Historia CHECK-IN
    //Toma la reserva que esta confirmada

    @Test
    public void liberaReservaDeHabitacion() {
        boolean confirma = true;
        boolean checkInEsperado = false;
        boolean reservaEsperada = true;


    }
}
