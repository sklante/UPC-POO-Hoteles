/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import java.util.ArrayList;
import modelos.*;
/**
 *
 * @author Miguel
 */
public class Reservas {
 private ArrayList<Reserva>reservas;
    
    public Reservas(){   
        reservas = new ArrayList<Reserva>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
   
    void registrarReserva(Pasajero cliente ,Habitacion habitacion,int dia, int mes,int anio,EstadoReserva estado,boolean check){
        
         Reserva reserva = new Reserva(cliente, habitacion, dia, mes, anio, null, check);
      
        reservas.add(reserva);      
    }
    
      }
    
       
     