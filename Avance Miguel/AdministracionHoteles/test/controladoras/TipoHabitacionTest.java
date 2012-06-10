/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;
import modelos.Moneda;
import modelos.TipoHabitacion;
import  controladoras.TipoHabitaciones;
/**
 *
 * @author Angel
 */
public class TipoHabitacionTest {
  TipoHabitaciones tipoHabitacion = new TipoHabitaciones();
   

 @Test
    public void siNoIngresoElPrecioMeDebeDarError(){
      assertFalse(tipoHabitacion.verificarPrecio(null));

        System.out.println("Ud. debe ingresar un precio valido");
    }  
        

}
