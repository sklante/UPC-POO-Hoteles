

package controladoras;
import modelos.Hotel;
import controladoras.Clientes;
import modelos.Habitacion;
import java.util.ArrayList;

public class Hoteles {
      
    private ArrayList<Hotel> dbHoteles = new ArrayList<Hotel>();
    
    private void simularTabla() {
        this.dbHoteles.add(new Hotel("Los Perdidos","losperdidos.clerk.lm"));
        this.dbHoteles.add(new Hotel("Hotel TDG","tdg.clerk.lm"));
        this.dbHoteles.add(new Hotel("Hotel SMA","sma.clerk.lm"));
        this.dbHoteles.add(new Hotel("Hotel AAA","aaa.clerk.lm"));
    }
    
    
    
    public boolean verificarHotel(String nombreHotel) {
        if (nombreHotel != null) {
            return true;
        }
        return false;
    }
    
      public boolean verificarNumeroDeHabitaciones(String numeroDeHabitaciones) {
        if (numeroDeHabitaciones != null) {
            return true;
        }
        return false;
    }
    
    public Hotel existeHotel(String nombreHotel) {
        simularTabla();
        Hotel hotelEncontrado = null;
        for (Hotel hotel : dbHoteles) {
            if (hotel.getNombreHotel().equals(nombreHotel)) {
                hotelEncontrado = hotel;
            }
        }
        return hotelEncontrado;
    }
    
   
    
    
    public boolean validarHotel(String nombreHotel, String direccionClerk){
        boolean acceso = false;
        
        Hotel hotelValido = existeHotel(nombreHotel);
        if(hotelValido.getNombreHotel().equals(nombreHotel)){
            acceso = true;
        }
        return acceso;
    }
  

   /*
     public Habitacion existeNumeroDeHabitaciones(String numeroDeHabitaciones) {
         
         
        simularTabla();
        Habitacion HabitacionEncontrado = null;
        
            
            assertEquals(3, cliente.getHabitaciones().size());
            
            
            
            if (cliente.getHabitaciones().size().equals(numeroDeHabitaciones)) {
                hotelEncontrado = hotel;
            }
        }
        return hotelEncontrado;
    }
   
  
     */
    
}
