/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import modelos.Habitacion;
import java.util.ArrayList;
/**
 *
 * @author Angel
 */
public class Habitaciones {
 private ArrayList<Habitacion> dbHabitaciones = new ArrayList<Habitacion>();
    
    private void simularTabla(){
        this.dbHabitaciones.add(new Habitacion( "A001", "single"));       
          this.dbHabitaciones.add(new Habitacion( "A002", "double"));
          this.dbHabitaciones.add(new Habitacion( "A003", "suite")); 
            this.dbHabitaciones.add(new Habitacion( "A004", "Departament"));       
          this.dbHabitaciones.add(new Habitacion( "A005", "Cabin"));
         
    }    
    public boolean verificarHabitaciono(String nombreHabitacion){
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
