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

  
}
