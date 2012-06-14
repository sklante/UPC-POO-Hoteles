/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.TipoHabitacion;
import modelos.Habitacion;
import modelos.Fecha;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author operador
 */
public class ControladorHotelTest {

    public ControladorHotelTest() {
    }

    @Test
    public void comprobarCrearReserva() {
        Fecha fecha = new Fecha(12, 6, 2012);
        Habitacion habitacion = new Habitacion(103, new TipoHabitacion("Suite", 50.00));
        ControladorHotel.agregarReservaTabla(habitacion, fecha, 3);
       String habitacion1 = ((Habitacion)ControladorHotel.mapaReservas.get(0).get("habitacion")).getNumHabitacion().toString(); 
        assertEquals(habitacion1, "103");

    }
    @Test
    public void comprobarCrearReserva1() {
        Fecha fecha = new Fecha(12, 6, 2012);
        Habitacion habitacion = new Habitacion(103, new TipoHabitacion("Suite", 50.00));
        int cantidadReservaActuales = ControladorHotel.mapaReservas.size();
        ControladorHotel.agregarReservaTabla(habitacion, fecha, 3);
        int cantidadReservaPosteriores = ControladorHotel.mapaReservas.size();
        ControladorHotel.quitarReservaTabla(habitacion, fecha, 3);
        assertEquals(cantidadReservaActuales+1, cantidadReservaPosteriores);
        assertEquals(cantidadReservaActuales, cantidadReservaPosteriores);

    }
}
