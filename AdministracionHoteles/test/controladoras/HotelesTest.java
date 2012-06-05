
package controladoras;
import controladoras.Hoteles;
import org.junit.Test;
import static org.junit.Assert.*;

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
  
       
       
       
       
         @Test
    public void siNoIngresoElNumerodeHabitacionesoMeDebeDarError(){
        assertFalse(Hoteles.verificarNumeroDeHabitaciones(null));
        System.out.println("Ingresar numero de habitaciones");
    }  
            
    
    @Test
    public void siElNumerodeHabitacionesNoExisteMedebeDarError(){
        assertNull(Hoteles.existeNumeroDeHabitaciones("10"));
        System.out.println("debe ingresar un numero de habitaciones Valido");
    }
     
       
       
       
       
       
       
       
       
         @Test
    public void siIElnumerodeHabitacionEsIncorrectoMeDebeDarError (){
      
        assertTrue(Hoteles.validarHotel("Los Perdidos","losperdidos.clerk.lm"));
                System.out.println("nombre del hotel correcto");
    }       
       
       
       
}
