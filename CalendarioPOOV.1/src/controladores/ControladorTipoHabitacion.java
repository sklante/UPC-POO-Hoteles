

package controladores;

import modelos.Habitacion;
import modelos.Hotel;
import modelos.TipoHabitacion;

/**
 *
 * @author alfredol
 */
public class ControladorTipoHabitacion {

    public static boolean verificaPrecio(double precio){
        if(precio <= 0){
            return true;
        }
        return false;
    }
    public static boolean verificarNumeroDeHabitaciones(String numeroDeHabitaciones) {
        if (numeroDeHabitaciones != null) {
            return true;
        }
        return false;
    }

 }
