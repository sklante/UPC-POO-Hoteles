

package controladores;

import java.util.ArrayList;
import modelos.TipoHabitacion;


public class ControladorTipoHabitacion {

    private ArrayList<TipoHabitacion> tipos;

      public boolean registrarPrecioHabitacion(String tipo, double precio) {
         if  (buscar(tipo) == null){
             // Crear un nuevo tipo de habitacion y registrarlo en la coleccion
             tipos.add(new TipoHabitacion(tipo, precio));
             return true;
         }
         return false;
    }
        public TipoHabitacion buscar(String tipoh) {
        // Buscar el tipo de habitacion por codigo
        for(TipoHabitacion tipo : tipos)
            if (tipo.getTipo().equals(tipo))
               return tipo;
        return null;
    }

}
