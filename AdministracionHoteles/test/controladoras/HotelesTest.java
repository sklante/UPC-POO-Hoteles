/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import controladoras.Hoteles;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel
 */
public class HotelesTest {
     Hoteles Hoteles = new Hoteles();
     
        @Test
    public void siNoIngesoElNombreDelHotelMeDebeDarHotel(){
         assertFalse(Hoteles.verificarHotel(null));
        System.out.println("Debe ingresar el Nombre del Hotel");
    }
        
       @Test
    public void siNoIngesoElNombreDelHotelDebeMostarunaListaDeNombresSugeridos (){
      
        assertTrue(Hoteles.validarHotel("Los Perdidos","losperdidos.clerk.lm"));
                System.out.println("nombre del hotel correcto");
    }     
        
}
