
package Objetos;

import Modelos.Hotel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HotelTest {


    @Test
    public void validarQueseIngreseNombreDeHotel(){
        Hotel hotel = new Hotel("Hotel rivera", "http://hotelrivera.clerk.im", "Alberto Fernandez");
        assertFalse(hotel.verificaNombreHotel(null));
        System.out.println("Debe Ingresar nombre de hotel");
    }
}