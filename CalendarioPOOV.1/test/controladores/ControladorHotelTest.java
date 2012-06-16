/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.TipoHabitacion;
import modelos.Habitacion;
import modelos.Fecha;
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
        ControladorHotel.agregarReservaTabla(habitacion, fecha, 3,0.0,null);
       String habitacion1 = ((Habitacion)ControladorHotel.mapaReservas.get(0).get("habitacion")).getNumHabitacion().toString(); 
        assertEquals(habitacion1, "103");

    }
    @Test
    public void comprobarCrearReserva1() {
        Fecha fecha = new Fecha(12, 6, 2012);
        Habitacion habitacion = new Habitacion(103, new TipoHabitacion("Suite", 50.00));
        int cantidadReservaActuales = ControladorHotel.mapaReservas.size();
        ControladorHotel.agregarReservaTabla(habitacion, fecha, 3, 0.0,null);
        int cantidadReservaPosteriores = ControladorHotel.mapaReservas.size();
        String id = ControladorHotel.generarId(habitacion, fecha, 3);
        ControladorHotel.quitarReservaTabla(id);
        int cantidadReservaPosteriores2 = ControladorHotel.mapaReservas.size();
        assertEquals(cantidadReservaActuales+1, cantidadReservaPosteriores);
        assertEquals(cantidadReservaPosteriores, cantidadReservaPosteriores2);

    }
}
