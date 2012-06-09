/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import modelos.Habitacion;
import java.util.ArrayList;
import modelos.Hotel;
/**
 *
 * @author Angel
 */
public class Habitaciones {
    
 private ArrayList<Habitacion> dbHabitaciones = new ArrayList<Habitacion>();

 
    private void simularTabla(){
        
        this.dbHabitaciones.add(new Habitacion( "A001", "single",null));       
          this.dbHabitaciones.add(new Habitacion( "A002", "double",null));
          this.dbHabitaciones.add(new Habitacion( "A003", "suite",null)); 
    
         
    }    
    
    public boolean verificarHabitacion(String nombreHabitacion){
        if(nombreHabitacion != null){
            return true;
        }
        return false;
    }   
    
    public Habitacion existeHabitacion(String nombreHabitacion){
        simularTabla();
        Habitacion habitacionEncontrado = null;
        for(Habitacion habitacion : dbHabitaciones){
            if(habitacion.getNombreHabitacion().equals(nombreHabitacion))
                habitacionEncontrado = habitacion;
        }
        return habitacionEncontrado;            
    }
    
   
    
    
   
 
    
}
