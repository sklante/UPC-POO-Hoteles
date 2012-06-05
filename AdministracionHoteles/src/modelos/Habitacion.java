/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Angel
 */
public class Habitacion {
 
     private String nombreHabitacion;
     private String tipoHabitacion;

    public Habitacion(String nombreHabitacion, String tipoHabitacion) {
      
        this.nombreHabitacion = nombreHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

  

  
    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
     
}
