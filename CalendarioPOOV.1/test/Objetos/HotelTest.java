
package Objetos;

import modelos.Hotel;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HotelTest {

//Test de aceptacion Configure su Cuenta
    @Test
    public void validarQueseIngreseNombreDeHotel(){
        String nameHotel = null;
        Hotel hotel = new Hotel("Hotel rivera", "http://hotelrivera.clerk.im", "Alberto Fernandez");

        assertFalse(hotel.verificaNombreHotel(nameHotel));
        System.out.println("Debe Ingresar nombre de hotel");
    }
 //Test de aceptacion Configure su Cuenta
    @Test
    public void mostrarNombresSugeridos(){
        String nameHotel = "Rivera";
        String recibeNombres[] = new String[5];
        Hotel hotel = new Hotel("Hotel rivera", "http://hotelrivera.clerk.im", "Alberto Fernandez");

        recibeNombres = hotel.sugerirNombres(nameHotel);
        //recibeNombres = null; cuando no hay valores falla
        Assert.assertNotNull(recibeNombres);
        System.out.println("Se sugirió los nombres: ");
        for(int i = 0; i < recibeNombres.length; i++){
            System.out.println((i+1) + ".- " + recibeNombres[i]);
        }
        System.out.println("se seleccionó el nombre " + recibeNombres[2]);
        String nombreWeb = hotel.asignarLink(recibeNombres[2]);
        Assert.assertNotNull(nombreWeb);

        System.out.println(nombreWeb);

    }

}