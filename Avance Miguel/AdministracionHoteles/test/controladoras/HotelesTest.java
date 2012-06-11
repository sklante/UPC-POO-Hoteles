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

       /* assertTrue(Hotel.validarHotel("Los Perdidos", "losperdidos.clerk.lm"));
        System.out.println("nombre del hotel correcto");
        * */
        String nameHotel = "Los Perdidos";
        
        String recibeNombres[] = new String[5];
        
         Hotel hotel = new Hotel("Los Perdidos","losperdidos.clerk.lm");
      //  Hotel hotel = new Hotel("Hotel rivera", "http://hotelrivera.clerk.im", "Alberto Fernandez");

        recibeNombres = hotel.sugerirNombres(nameHotel);
        //recibeNombres = null; cuando no hay valores falla
        assertNotNull(recibeNombres);
        System.out.println("Se sugirió los nombres: ");
        for(int i = 0; i < recibeNombres.length; i++){
            System.out.println((i+1) + ".- " + recibeNombres[i]);
        }
        System.out.println("se seleccionó el nombre " + recibeNombres[2]);
        String nombreWeb = hotel.asignarLink(recibeNombres[2]);
        assertNotNull(nombreWeb);

        System.out.println(nombreWeb);
        
    }

  
}
