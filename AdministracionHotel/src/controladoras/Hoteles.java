
package controladoras;

import java.util.ArrayList;
import modelos.Hotel;


public class Hoteles {

    private ArrayList<Hotel> dbHoteles = new ArrayList<Hotel>();

    private void simularTabla() {
        this.dbHoteles.add(new Hotel("Los Perdidos", "http://hotelrivera.clerk.im", "Alberto Fernandez"));
        this.dbHoteles.add(new Hotel("Hotel TDG", "http://hotelTDG.clerk.im", "Alfredo Fernandez"));
        this.dbHoteles.add(new Hotel("Hotel SMA", "http://hotelSMA.clerk.im", "Jorge Fernandez"));
        this.dbHoteles.add(new Hotel("Hotel AAA","http://hotelAAA.clerk.im", "Matias Fernandez"));

    }

    public boolean verificarSiExisteHoteles(String nombreHotel) {
        if (nombreHotel != null) {
            return true;
        }
        return false;
    }

    public Hotel existeHotel(String nombreHotel) {
        simularTabla();
        Hotel hotelEncontrado = null;
        for (Hotel hotel : dbHoteles) {
            if (hotel.getNombre().equals(nombreHotel)) {
                hotelEncontrado = hotel;
            }
        }
        return hotelEncontrado;
    }
  
}
