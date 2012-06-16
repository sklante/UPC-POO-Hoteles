/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Objetos;

import controladores.ControladorHotel;
import modelos.TipoHabitacion;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class TipoHabitacionTest {
    
    public TipoHabitacionTest() {
    }

    @Test
    public void QueElTipoCorrespondaAlCreado() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        String expResult = "Suite";
        String result = tipoHabitacion.getTipo();
        assertEquals(expResult, result);
    }
        //Test de aceptacion Definir PRECIO

    @Test
    public void debeIngresarUnPrecioValido(){
        String price = "3.5t";
        assertFalse(ControladorHotel.esNumeroDecimal(price));
        System.out.println("Usted debe ingresar un precio valido");

    }

    //Test de aceptacion Definir PRECIO

    @Test
    public void soloPuedeIngresarTresMonedas(){
        int tamanoRecibido = 0;
        int tamanoEnviado = 3;
        ControladorHotel.agregarMoneda("Nuevo sol", "S/.",  1, true);
        ControladorHotel.agregarMoneda("Dolar", "$.",  2, true);
        ControladorHotel.agregarMoneda("Euro sol", "E/.",  3, true);
        //ControladorHotel.agregarMoneda("Euro sol", "E/.",  3, true);

        tamanoRecibido = ControladorHotel.monedas.size();
        //System.out.println(tamanoRecibido);
        Assert.assertEquals(tamanoRecibido, tamanoEnviado);

    }

}
