
package Controladoras;
import controladoras.Hoteles;
import org.junit.Test;
import static org.junit.Assert.*;


public class HotelesTest {
     Hoteles Hoteles = new Hoteles();
     
        @Test
    public void siNoIngesoElNombreDelHotelMeDebeDarHotel(){
         assertFalse(Hoteles.verificarSiExisteHoteles(null));
        System.out.println("Debe ingresar el Nombre del Hotel");
    }
}
