/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

import controladores.ControladorCliente;
import controladores.ControladorHotel;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import modelos.Hotel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alfredol
 */
public class HotelTest {

    //Test de aceptacion Configure su Cuenta
    @Test
    public void validarQueseIngreseNombreDeHotel(){
        String nameHotel = "";
        Hotel hotel = new Hotel("", "http://hotelrivera.clerk.im");

        assertFalse(!ControladorCliente.esNulos(hotel.getNombreHotel()));
        System.out.println("Debe Ingresar nombre de hotel");
    }

     //Test de aceptacion Configure su Cuenta
    @Test
    public void mostrarNombresSugeridos(){
        String nameHotel = "Rivera";
        String recibeNombres[] = new String[5];
        //Hotel hotel = new Hotel("Hotel rivera", "http://hotelrivera.clerk.im", "Alberto Fernandez");
        List<String> lista = new ArrayList<String>();
        lista = ControladorCliente.opcionesNombreHotel(nameHotel);
        //recibeNombres = null; cuando no hay valores falla
        Assert.assertNotNull(lista);
        System.out.println("Se sugirió los nombres: " + lista);

        System.out.println("se seleccionó el nombre " + nameHotel);
        String nombreWeb = lista.get(2);
        Assert.assertNotNull(nombreWeb);

        System.out.println(nombreWeb);

    }



}