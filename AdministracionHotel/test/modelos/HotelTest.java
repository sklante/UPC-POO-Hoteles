
package modelos;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HotelTest {


    @Test
    public void debeVerificarSiNoIngresoNombre() {
        Hotel hotel = new Hotel("", "http://hotelrivera.clerk.im", "Alberto Fernandez");
        assertNotNull(hotel.getNombre());
        

    }

}