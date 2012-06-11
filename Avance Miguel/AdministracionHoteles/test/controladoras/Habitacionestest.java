/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;
import controladoras.Habitaciones;
import modelos.*;

/**
 *
 * @author Angel
 */
public class Habitacionestest {

    Hoteles Hotel = new Hoteles();
    TipoHabitaciones TipoHabitacion = new TipoHabitaciones();
    Monedas moneda = new Monedas();

    @Test
    public void siNoIngresoElNumerodeHabitacionesoMeDebeDarError() {
        assertFalse(Hotel.verificarNumeroDeHabitaciones(null));
        System.out.println("Ingresar numero de habitaciones");
    }
    Clientes cliente = new Clientes();

    @Test
    public void hotelSinHabitaciones() {
        assertEquals(0, cliente.getHabitaciones().size());
        System.out.println("hotel con" + " " + cliente.getHabitaciones().size() + " " + "habitaciones");
    }

    @Test
    public void hotelConUnaHabitacion() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");

        Moneda moneda1 = new Moneda("01", "soles");
        Moneda moneda2 = new Moneda("02", "Dolares");
        Moneda moneda3 = new Moneda("03", "Yen");

        TipoHabitacion tipoHabitacion1 = new TipoHabitacion("Single", 50, moneda1);



        cliente.registrarHabitacion("A001", tipoHabitacion1, Hotel1);
        assertEquals(1, cliente.getHabitaciones().size());
        System.out.println("hotel con" + " " + cliente.getHabitaciones().size() + " " + "habitaciones");
    }

    @Test
    public void hotelConVariasHabitaciones() {



        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");
        Moneda moneda1 = new Moneda("01", "soles");
        Moneda moneda2 = new Moneda("02", "Dolares");
        Moneda moneda3 = new Moneda("03", "Yen");

        TipoHabitacion tipoHabitacion1 = new TipoHabitacion("Single", 50, moneda1);
        TipoHabitacion tipoHabitacion2 = new TipoHabitacion("Double", 100, moneda1);
        TipoHabitacion tipoHabitacion3 = new TipoHabitacion("Suite", 150, moneda2);


        cliente.registrarHabitacion("A001", tipoHabitacion1, Hotel1);
        cliente.registrarHabitacion("A002", tipoHabitacion2, Hotel1);
        cliente.registrarHabitacion("A003", tipoHabitacion3, Hotel1);


        assertEquals(3, cliente.getHabitaciones().size());


        System.out.println("hotel con" + " " + cliente.getHabitaciones().size() + " " + "habitaciones");

    }

    @Test
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
        /*
        if (esperado == devuelto){
        
        System.out.println("La cantidad de Habitaciones ingresados del hotel " + Hotel1.getNombreHotel() + "son : "+ " "+ devuelto);
        
        }else{
        System.out.println("debe ingresar núnmero de habitaciones valido"); 
        }
        
         */

        assertFalse(cliente.verificarTotalHabitaciones(esperado, devuelto));
        System.out.println("debe ingresar un número de habitacion valido");

    }
    /*
    @Test
    public void SeDebePoderCambiarElNombreDeHabitacionyTipoDeHabitacion() {
    
    Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");
    Hotel Hotel2 = new Hotel("Hotel TDG", "tdg.clerk.lm");
    Hotel Hotel3 = new Hotel("Hotel SMA", "sma.clerk.lm");
    
    
    assertEquals(0, cliente.getHabitaciones().size());
    cliente.registrarHabitacion("A001", "single", Hotel1);
    assertEquals(1, cliente.getHabitaciones().size());
    cliente.registrarHabitacion("A002", "double", Hotel1);
    assertEquals(2, cliente.getHabitaciones().size());
    cliente.registrarHabitacion("A003", "suite", Hotel1);
    assertEquals(3, cliente.getHabitaciones().size());
    
    
    
    try {
    cliente.registrarHabitacion("A001", "double", Hotel1);
    fail();
    } catch (Exception ex) {
    assertEquals("Cliente ya registrado", ex.getMessage());
    }
    
    }   
     */
}
