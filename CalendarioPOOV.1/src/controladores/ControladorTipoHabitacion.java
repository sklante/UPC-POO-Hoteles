

package controladores;

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

}
