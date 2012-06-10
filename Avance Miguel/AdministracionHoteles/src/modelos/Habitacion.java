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
     private TipoHabitacion tipoHabitacion;
     private  Hotel Hotel;
    
     

    public Habitacion(String nombreHabitacion, TipoHabitacion tipoHabitacion,Hotel hotel) {
      
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

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

}