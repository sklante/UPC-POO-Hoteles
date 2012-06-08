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
     public  Hotel Hotel;

    public Habitacion(String nombreHabitacion, String tipoHabitacion,Hotel hotel) {
      
        this.nombreHabitacion = nombreHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.Hotel = hotel;
    }

    public modelos.Hotel getHotel() {
        return Hotel;
    }

    public void setHotel(modelos.Hotel Hotel) {
        this.Hotel = Hotel;
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
