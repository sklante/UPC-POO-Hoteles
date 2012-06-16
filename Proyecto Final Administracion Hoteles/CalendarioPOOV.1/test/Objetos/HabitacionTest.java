/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import controladores.ControladorHotel;
import modelos.Cliente;
import modelos.Habitacion;
import modelos.Hotel;
import modelos.Moneda;
import modelos.TipoHabitacion;
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
        Habitacion habitacion = new Habitacion(101, null);
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
        Habitacion habitacion = new Habitacion(101, null);
        habitacion.setTipoHabitacion(new TipoHabitacion("Suite"));
        assertSame(habitacion.getTipoHabitacion().toString(),"Suite");
    }
// Test Configurar numero de habitaciones y definir tipos de habitaciones


    @Test
    public void siNoIngresoElNumerodeHabitacionesoMeDebeDarError() {
        assertFalse(!ControladorHotel.habitaciones.isEmpty());
        System.out.println("Ingresar numero de habitaciones");
    }
    Cliente cliente = new Cliente("Miguel","123456","alfredhotmail.com", true);

    @Test
    public void hotelSinHabitaciones() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Single", 120.25, new Moneda("Soles", "S/.", 1, true));
        Habitacion habitacion = new Habitacion(5, tipoHabitacion);
        
        assertEquals(0, ControladorHotel.habitaciones.size());
        System.out.println("hotel con" + " " + habitacion.getNumHabitacion() + " " + "habitaciones");
    }

    @Test
    public void hotelConUnaHabitacion() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");

        Moneda moneda1 = new Moneda("Nuevo sol", "S/.",  1, true);
        Moneda moneda2 = new Moneda("Dolar", "$.",  2, true);
        Moneda moneda3 = new Moneda("Euro sol", "E/.",  3, true);
        ControladorHotel.monedas.add(moneda1);
        ControladorHotel.monedas.add(moneda2);
        ControladorHotel.monedas.add(moneda3);
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Single", 120.25, moneda1);
        Habitacion habitacion = new Habitacion(5, tipoHabitacion);
        ControladorHotel.habitaciones.add(habitacion);
        assertEquals(1, ControladorHotel.habitaciones.size());
        System.out.println("hotel con" + " " + ControladorHotel.habitaciones.size() + " " + "habitaciones");
        ControladorHotel.habitaciones.remove(0);
    }

    @Test
    public void hotelConVariasHabitaciones() {



        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");
        Moneda moneda1 = new Moneda("Nuevo sol", "S/.",  1, true);
        Moneda moneda2 = new Moneda("Dolar", "$.",  2, true);
        Moneda moneda3 = new Moneda("Euro sol", "E/.",  3, true);

        TipoHabitacion tipoHabitacion1 = new TipoHabitacion("Single", 50, moneda1);
        TipoHabitacion tipoHabitacion2 = new TipoHabitacion("Double", 100, moneda2);
        TipoHabitacion tipoHabitacion3 = new TipoHabitacion("Suite", 150, moneda3);

        TipoHabitacion tipoHabitacion = new TipoHabitacion("Single", 120.25);
        Habitacion habitacion = new Habitacion(5, tipoHabitacion);
        Habitacion habitacion1 = new Habitacion(6, tipoHabitacion2);
        Habitacion habitacion2 = new Habitacion(7, tipoHabitacion3);
        ControladorHotel.habitaciones.add(habitacion);
        ControladorHotel.habitaciones.add(habitacion1);
        ControladorHotel.habitaciones.add(habitacion2);
        assertEquals(3, ControladorHotel.habitaciones.size());


        System.out.println("hotel con" + " " + ControladorHotel.habitaciones.size() + " " + "habitaciones");

    }

    /*@Test
    public void registrarHabitaciones() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");


        Moneda moneda1 = new Moneda("01", "soles");
        Moneda moneda2 = new Moneda("02", "Dolares");
        Moneda moneda3 = new Moneda("03", "Yen");

        TipoHabitacion tipoHabitacion1 = new TipoHabitacion("Single", 50, moneda1);
        TipoHabitacion tipoHabitacion2 = new TipoHabitacion("Double", 100, moneda1);
        TipoHabitacion tipoHabitacion3 = new TipoHabitacion("Suite", 150, moneda2);



        assertEquals(0, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A001", tipoHabitacion1, Hotel1);
        assertEquals(1, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A002", tipoHabitacion2, Hotel1);
        assertEquals(2, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A003", tipoHabitacion3, Hotel1);
        assertEquals(3, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A004", tipoHabitacion1, Hotel1);
  assertEquals(4, cliente.getHabitaciones().size());


        try {
            cliente.registrarHabitacion("A004", tipoHabitacion3, Hotel1);
            //fail();
        } catch (Exception ex) {
           assertEquals("Habitacion registrado", ex.getMessage());

        }

    }




     @Test
    public void deboPoderCambiarElNombreyTipoDeHabitacionCuantasVecesSeaNecesario() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");


        Moneda moneda1 = new Moneda("01", "soles");
        Moneda moneda2 = new Moneda("02", "Dolares");
        Moneda moneda3 = new Moneda("03", "Yen");

        TipoHabitacion tipoHabitacion1 = new TipoHabitacion("Single", 50, moneda1);
        TipoHabitacion tipoHabitacion2 = new TipoHabitacion("Double", 100, moneda1);
        TipoHabitacion tipoHabitacion3 = new TipoHabitacion("Suite", 150, moneda2);



        assertEquals(0, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A001", tipoHabitacion1, Hotel1);
        assertEquals(1, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A002", tipoHabitacion2, Hotel1);
        assertEquals(2, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A003", tipoHabitacion3, Hotel1);
        assertEquals(3, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A004", tipoHabitacion1, Hotel1);
  assertEquals(4, cliente.getHabitaciones().size());


        try {
            cliente.registrarHabitacion("A004", tipoHabitacion3, Hotel1);
            cliente.registrarHabitacion("A004", tipoHabitacion2, Hotel1);
              cliente.registrarHabitacion("A003", tipoHabitacion2, Hotel1);
              System.out.println("nombre y tipo habitacion Actualizado");

            //fail();
        } catch (Exception ex) {
           assertEquals("Habitacion registrado", ex.getMessage());

        }


    }


    @Test
    public void eliminarHabitaciones() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");
        Moneda moneda1 = new Moneda("01", "soles");
        Moneda moneda2 = new Moneda("02", "Dolares");
        Moneda moneda3 = new Moneda("03", "Yen");

        TipoHabitacion tipoHabitacion1 = new TipoHabitacion("Single", 50, moneda1);
        TipoHabitacion tipoHabitacion2 = new TipoHabitacion("Double", 100, moneda1);
        TipoHabitacion tipoHabitacion3 = new TipoHabitacion("Suite", 150, moneda2);


        cliente.registrarHabitacion("A001", tipoHabitacion1, Hotel1);
        assertEquals(1, cliente.getHabitaciones().size());

        cliente.eliminaHabitaciones("A001");
        assertEquals(0, cliente.getHabitaciones().size());

        cliente.registrarHabitacion("B001", tipoHabitacion1, Hotel1);
        assertEquals(1, cliente.getHabitaciones().size());


        System.out.println("hotel con" + " " + cliente.getHabitaciones().size() + " " + "habitaciones");


    }

    @Test
    public void siElNumerodeHabitacionesExisteMedebeDarTotalDeHabitaciones() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");
        Hotel Hotel2 = new Hotel("Hotel TDG", "tdg.clerk.lm");
        Hotel Hotel3 = new Hotel("Hotel SMA", "sma.clerk.lm");

        Moneda moneda1 = new Moneda("01", "soles");
        Moneda moneda2 = new Moneda("02", "Dolares");
        Moneda moneda3 = new Moneda("03", "Yen");

        TipoHabitacion tipoHabitacion1 = new TipoHabitacion("Single", 50, moneda1);
        TipoHabitacion tipoHabitacion2 = new TipoHabitacion("Double", 100, moneda1);
        TipoHabitacion tipoHabitacion3 = new TipoHabitacion("Suite", 150, moneda2);




        cliente.registrarHabitacion("A001", tipoHabitacion1, Hotel1);
        cliente.registrarHabitacion("A002", tipoHabitacion2, Hotel1);
        cliente.registrarHabitacion("A003", tipoHabitacion3, Hotel1);

        Habitaciones habitacion = new Habitaciones();
        int esperado;
        esperado = 3;
        int devuelto = cliente.getHabitaciones().size();
        assertEquals(esperado, devuelto);
        System.out.println("La cantidad de Habitaciones ingresados del hotel " + Hotel1.getNombreHotel() + "  " + " " + " son : " + " " + devuelto);

    }

    @Test
    public void siElNumerodeHabitacionesNoExisteMedebeDarError() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");
        Hotel Hotel2 = new Hotel("Hotel TDG", "tdg.clerk.lm");
        Hotel Hotel3 = new Hotel("Hotel SMA", "sma.clerk.lm");

        Moneda moneda1 = new Moneda("01", "soles");
        Moneda moneda2 = new Moneda("02", "Dolares");
        Moneda moneda3 = new Moneda("03", "Yen");

        TipoHabitacion tipoHabitacion1 = new TipoHabitacion("Single", 50, moneda1);
        TipoHabitacion tipoHabitacion2 = new TipoHabitacion("Double", 100, moneda1);
        TipoHabitacion tipoHabitacion3 = new TipoHabitacion("Suite", 150, moneda2);


        cliente.registrarHabitacion("A001", tipoHabitacion1, Hotel1);
        cliente.registrarHabitacion("A002", tipoHabitacion2, Hotel1);
        cliente.registrarHabitacion("A003", tipoHabitacion3, Hotel1);

        Habitaciones habitacion = new Habitaciones();
        int esperado;
        esperado = 4;

        int devuelto = cliente.getHabitaciones().size();

        assertFalse(cliente.verificarTotalHabitaciones(esperado, devuelto));
        System.out.println("debe ingresar un número de habitacion valido");

    }*/
   

}
