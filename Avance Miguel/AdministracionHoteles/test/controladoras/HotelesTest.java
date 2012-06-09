package controladoras;

import controladoras.Hoteles;
import org.junit.Test;
import static org.junit.Assert.*;
import controladoras.Habitaciones;
import modelos.Hotel;
import modelos.Cuenta;

public class HotelesTest {

    Hoteles Hotel = new Hoteles();

    @Test
    public void siNoIngesoElNombreDelHotelMeDebeDarHotel() {
        assertFalse(Hotel.verificarHotel(null));
        System.out.println("Debe ingresar el Nombre del Hotel");
    }

    @Test
    public void siNoIngesoElNombreDelHotelDebeMostarunaListaDeNombresSugeridos() {

        assertTrue(Hotel.validarHotel("Los Perdidos", "losperdidos.clerk.lm"));
        System.out.println("nombre del hotel correcto");
    }

    @Test
    public void siNoIngresoElNumerodeHabitacionesoMeDebeDarError() {
        assertFalse(Hotel.verificarNumeroDeHabitaciones(null));
        System.out.println("Ingresar numero de habitaciones");
    }

    @Test
    public void siIElnumerodeHabitacionEsIncorrectoMeDebeDarError() {

        assertTrue(Hotel.validarHotel("Los Perdidos", "losperdidos.clerk.lm"));
        System.out.println("nombre del hotel correcto");

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


        cliente.registrarHabitacion("A001", "single", Hotel1);
        assertEquals(1, cliente.getHabitaciones().size());
        System.out.println("hotel con" + " " + cliente.getHabitaciones().size() + " " + "habitaciones");
    }

    @Test
    public void hotelConVariasHabitaciones() {


        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");

        cliente.registrarHabitacion("A001", "single", Hotel1);
        cliente.registrarHabitacion("A002", "double", Hotel1);
        cliente.registrarHabitacion("A003", "suite", Hotel1);
        cliente.registrarHabitacion("A004", "Departament", Hotel1);
        cliente.registrarHabitacion("A005", "Cabin", Hotel1);

        assertEquals(5, cliente.getHabitaciones().size());


        System.out.println("hotel con" + " " + cliente.getHabitaciones().size() + " " + "habitaciones");

    }

    @Test
    public void registrarHabitaciones() {

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
        cliente.registrarHabitacion("A004", "Departament", Hotel1);
        assertEquals(4, cliente.getHabitaciones().size());
        cliente.registrarHabitacion("A005", "Cabin", Hotel1);
        assertEquals(5, cliente.getHabitaciones().size());


        try {
            cliente.registrarHabitacion("A005", "suite", Hotel1);
            fail();
        } catch (Exception ex) {
            assertEquals("Habitacion registrado", ex.getMessage());

        }

    }

    @Test
    public void siElNumerodeHabitacionesExisteMedebeDarTotalDeHabitaciones() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");
        Hotel Hotel2 = new Hotel("Hotel TDG", "tdg.clerk.lm");
        Hotel Hotel3 = new Hotel("Hotel SMA", "sma.clerk.lm");

        cliente.registrarHabitacion("A001", "single", Hotel1);
        cliente.registrarHabitacion("A002", "double", Hotel1);
        cliente.registrarHabitacion("A003", "suite", Hotel1);
      
        Habitaciones habitacion = new Habitaciones();
        int esperado;
        esperado = 3;
        int devuelto = cliente.getHabitaciones().size();
        assertEquals(esperado, devuelto);
        System.out.println("La cantidad de Habitaciones ingresados del hotel " + Hotel1.getNombreHotel()+ "  " + " " +" son : "+ " "+ devuelto);

    }
    
    
    @Test
    public void siElNumerodeHabitacionesNoExisteMedebeDarError() {

        Hotel Hotel1 = new Hotel("Los Perdidos", "losperdidos.clerk.lm");
        Hotel Hotel2 = new Hotel("Hotel TDG", "tdg.clerk.lm");
        Hotel Hotel3 = new Hotel("Hotel SMA", "sma.clerk.lm");

        cliente.registrarHabitacion("A001", "single", Hotel1);
        cliente.registrarHabitacion("A002", "double", Hotel1);
        cliente.registrarHabitacion("A003", "suite", Hotel1);
      
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
}
