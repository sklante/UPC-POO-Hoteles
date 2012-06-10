/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package controladoras;

import junit.framework.Assert;
import modelos.EstadoReserva;
import modelos.Pasajero;
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

        Pasajero cliente1 = new Pasajero("Jorge", "Chavez");
        Pasajero cliente2 = new Pasajero("Miguel", "Grau");
        Pasajero cliente3 = new Pasajero("Francisco", "Bolognesi");

        
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite", 50.00, null);
      //  TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        Habitacion habitacion101 = new Habitacion("101", tipoHabitacion, null);
         Habitacion habitacion102 = new Habitacion("102", tipoHabitacion, null);
          Habitacion habitacion103 = new Habitacion("103", tipoHabitacion, null);
          
     

        Reserva reserva1 = new Reserva(cliente1, habitacion101, 27, 5, 2012);
        Reserva reserva2 = new Reserva(cliente2, habitacion102, 27, 5, 2012);
        Reserva reserva3 = new Reserva(cliente3, habitacion103, 27, 5, 2012);

        assertEquals(reserva1.getIdReserva(), 1);
        assertEquals(reserva2.getIdReserva(), 2);
        assertEquals(reserva3.getIdReserva(), 3);
    }

    @Test
    public void QueNoSeanNull() {

        Pasajero cliente1 = new Pasajero("Jorge", "Chavez");
        Pasajero cliente2 = new Pasajero("Miguel", "Grau");
        Pasajero cliente3 = new Pasajero("Francisco", "Bolognesi");
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite", 50.00, null);
        
        Habitacion habitacion101 = new Habitacion("101", tipoHabitacion, null);
         Habitacion habitacion102 = new Habitacion("102", tipoHabitacion, null);
          Habitacion habitacion103 = new Habitacion("103", tipoHabitacion, null);

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

    //Test de Aceptacion de Historia CONFIRMACION
    @Test
    public void confirmarReservaHastaQueCheckIn() {

        String confirma = "NO CONFIRMADO";
        String verifica = "CONFIRMADO";
        String resultado = " ";
        Pasajero pasajero = new Pasajero("Alfredo", "Luyo");

            TipoHabitacion tipoHabitacion = new TipoHabitacion("single", 150.00, null);

        Habitacion habitacion = new Habitacion("101", tipoHabitacion, null);
        

        EstadoReserva estadoReserva = new EstadoReserva(confirma);

        Reserva reserva = new Reserva(pasajero, habitacion, 8, 6, 2012, estadoReserva.getEstado());

        resultado = reserva.confirmarReserva(estadoReserva.getEstado());

        Assert.assertEquals(verifica, resultado);

        /*System.out.println(reserva.getCliente());
        System.out.println(reserva.getHabitacion());
        System.out.println(habitacion.getTipoHabitacion());
        System.out.println(estadoReserva.getEstado());*/
    }

    //Test de Aceptacion de Historia CONFIRMACION
    //Verifica que el estado sea CONFIRMADO,check-in  sea falso y la fecha sea mayor que la actual
    //si es asi, lo convierte el estado automaticamente a CANCELADO AUTOMATICO
    @Test
    public void validarAutomaticoSiNoConfirmaReserva() {
        String confirma = "CONFIRMADO";
        String validado = " ";

        Pasajero pasajero = new Pasajero("Alfredo", "Luyo");
        
         TipoHabitacion tipoHabitacion = new TipoHabitacion("single", 150.00, null);
       
     Habitacion habitacion = new Habitacion("101", tipoHabitacion, null);

        EstadoReserva estadoReserva = new EstadoReserva(confirma);

        Reserva reserva = new Reserva(pasajero, habitacion, 8, 6, 2012, estadoReserva.getEstado(), false);

        validado = reserva.validaAutomaticoFecha(9, 6, 2012, estadoReserva.getEstado(), false);

        Assert.assertEquals(confirma, validado);
        System.out.println("Confirmación sigue vigente");
    }
}
