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
      /*  
 @Test
    public void siAsignoMasDeTresMonedasMeDebeDarError(){
     
     
      cuenta.registrarCliente("01", "sklante_1@hotmail.com", "123456");
        cuenta.registrarCliente("02", "alfredo@hotmail.com", "1234");
        cuenta.registrarCliente("03", "ana@hotmail.com", "1234");
        assertEquals(3, cuenta.getClientes().size());
     

        int esperado;
        esperado = 3;
        


        Habitaciones habitacion = new Habitaciones();
        int esperado;
        esperado = 3;
        int devuelto = cliente.getHabitaciones().size();
        assertEquals(esperado, devuelto);
        System.out.println("La cantidad de Habitaciones ingresados del hotel " + Hotel1.getNombreHotel() + "  " + " " + " son : " + " " + devuelto);

    }
    }  
   */
  
}
