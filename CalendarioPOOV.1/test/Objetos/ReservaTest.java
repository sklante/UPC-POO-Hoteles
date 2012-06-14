/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import controladores.ControladorReserva;
import junit.framework.Assert;
import modelos.EstadoReserva;
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
        //Test de Aceptacion de Historia CONFIRMACION

    @Test
    public void confirmarReservaHastaAntesDeCheckIn() {

        String confirma = "NO CONFIRMADO";
        String verifica = "CONFIRMADO";
        String resultado = " ";
        Persona pasajero = new Persona("Alfredo", "Luyo");
        TipoHabitacion tipoHabitacion = new TipoHabitacion("SINGLE", 150.00);
        Habitacion habitacion = new Habitacion(101, tipoHabitacion);

        EstadoReserva estadoReserva = new EstadoReserva(confirma);

        Reserva reserva = new Reserva(pasajero, habitacion, 8, 6, 2012, estadoReserva.getEstado());

        resultado = ControladorReserva.confirmarReserva(estadoReserva.getEstado());

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
    public void validarAutomaticoSiNoConfirmaReserva(){
        String confirma = "CONFIRMADO";
        String validado = " ";

        Persona pasajero = new Persona("Alfredo", "Luyo");
        TipoHabitacion tipoHabitacion = new TipoHabitacion("SINGLE", 150.00);
        Habitacion habitacion = new Habitacion(101, tipoHabitacion);

        EstadoReserva estadoReserva = new EstadoReserva(confirma);

        Reserva reserva = new Reserva(pasajero, habitacion, 8, 6, 2012, estadoReserva.getEstado(), false);

        validado = ControladorReserva.validaAutomaticoFecha(9, 6, 2012, estadoReserva.getEstado(), false);

        Assert.assertEquals(confirma, validado);
        System.out.println("Confirmación sigue vigente");
    }

    //Test de Aceptacion de Historia CHECK-IN
    //Toma la reserva que esta confirmada

    @Test
    public void tomarReservaDeHabitacion(){
        String confirma = "CONFIRMADO";
        boolean checkInEnviado = true;

        Persona pasajero = new Persona("Alfredo", "Luyo");
        TipoHabitacion tipoHabitacion = new TipoHabitacion("SINGLE", 150.00);
        Habitacion habitacion = new Habitacion(101, tipoHabitacion);

        EstadoReserva estadoReserva = new EstadoReserva(confirma);

        Reserva reserva = new Reserva(pasajero, habitacion, 8, 6, 2012, estadoReserva.getEstado(), false);

        boolean checkInEsperado = ControladorReserva.realizaCheckInOut(reserva.isCheck());

        Assert.assertEquals(checkInEnviado,checkInEsperado);
        System.out.println("Se realizó el Check-In de la Reserva confirmada");
    }
    //Test de Aceptacion de Historia CHECK-IN
    //Toma la reserva que esta confirmada

    @Test
    public void liberaReservaDeHabitacion(){
        String confirma = "CONFIRMADO";
        boolean checkInEsperado = false;
        String reservaEsperada = "CANCELADO";

        Persona pasajero = new Persona("Alfredo", "Luyo");
        TipoHabitacion tipoHabitacion = new TipoHabitacion("SINGLE", 150.00);
        Habitacion habitacion = new Habitacion(101, tipoHabitacion);

        EstadoReserva estadoReserva = new EstadoReserva(confirma);

        Reserva reserva = new Reserva(pasajero, habitacion, 8, 6, 2012, estadoReserva.getEstado(), true);

        boolean checkInEnviado = ControladorReserva.realizaCheckInOut(reserva.isCheck());
        String reservaEnviada = ControladorReserva.liberarReserva(estadoReserva.getEstado(), reserva.isCheck());

        Assert.assertEquals(checkInEsperado,checkInEnviado);
        Assert.assertEquals(reservaEsperada, reservaEnviada);
        System.out.println("Se liberó el Check-Out");
    }
}
