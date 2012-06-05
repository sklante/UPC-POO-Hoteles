
package controladoras;
import java.util.ArrayList;
import modelos.Hotel;

public class Hoteles {
    private ArrayList<Hotel> dbHoteles = new ArrayList<Hotel>();
    
    private void simularTabla() {
        this.dbHoteles.add(new Hotel("Los Perdidos","losperdidos.clerk.lm","25"));
        this.dbHoteles.add(new Hotel("Hotel TDG","tdg.clerk.lm","35"));
        this.dbHoteles.add(new Hotel("Hotel SMA","sma.clerk.lm","20"));
        this.dbHoteles.add(new Hotel("Hotel AAA","aaa.clerk.lm","50"));
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
    
    
     public Hotel existeNumeroDeHabitaciones(String numeroDeHabitaciones) {
        simularTabla();
        Hotel hotelEncontrado = null;
        for (Hotel hotel : dbHoteles) {
            if (hotel.getNumeroDeHabitaciones().equals(numeroDeHabitaciones)) {
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
  
}
