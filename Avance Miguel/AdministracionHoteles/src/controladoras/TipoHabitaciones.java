/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import java.util.ArrayList;
import modelos.TipoHabitacion;
import modelos.Moneda;
/**
 *
 * @author Angel
 */
public class TipoHabitaciones {
    private ArrayList<TipoHabitacion> dbTipoHabitaciones = new ArrayList<TipoHabitacion>();

    private void simularTabla() {
   
        this.dbTipoHabitaciones.add(new TipoHabitacion("single", 50, null ));
        this.dbTipoHabitaciones.add(new TipoHabitacion("double", 100, null ));
          this.dbTipoHabitaciones.add(new TipoHabitacion("suite", 150, null ));
          this.dbTipoHabitaciones.add(new TipoHabitacion("Departament", 200, null ));
        this.dbTipoHabitaciones.add(new TipoHabitacion("Cabin", 250, null ));
          this.dbTipoHabitaciones.add(new TipoHabitacion("Meeting Room", 300, null ));

    }    
    
    public boolean verificarnombreTipoHabitacion(String nombreTipo) {
        if (nombreTipo != null) {
            return true;
        }
        return false;
    }
    
    
     public boolean verificarPrecio(String precio) {
        if (precio != null) {
            return true;
        }
        return false;
    }
    
    
    
     void registrarPrecioHabitacion(String nombreTipo, double precio) {

        buscarTipoDeHabitacion(nombreTipo);

        TipoHabitacion tipoHabitacion = new TipoHabitacion(nombreTipo, precio, null);
        dbTipoHabitaciones.add(tipoHabitacion);
    }
    
    
    

    private void buscarTipoDeHabitacion(String nombreHabitacion) throws RuntimeException{
        for (TipoHabitacion tipoHabitacion : dbTipoHabitaciones) {
            if (tipoHabitacion.getNombreTipo().equals(nombreHabitacion)) {
                throw new RuntimeException("Tipo Habitacion registrado");
            }
        }
    }
    
    
    
    public TipoHabitacion existenombreHabitacion(String nombreHabitacion) {
        simularTabla();
        TipoHabitacion tipoHabitacionEncontrado = null;
        for (TipoHabitacion tipoHabitacion : dbTipoHabitaciones) {
            if (tipoHabitacionEncontrado.getNombreTipo().equals(nombreHabitacion)) {
                tipoHabitacionEncontrado = tipoHabitacion;
            }
        }
        return tipoHabitacionEncontrado;
    }

 
   
}
