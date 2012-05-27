
package controladoras;

import java.util.ArrayList;
import modelos.Hotel;


public class Hoteles {

    private ArrayList<Hotel> dbHoteles = new ArrayList<Hotel>();

    private void simularTabla() {
        this.dbHoteles.add(new Hotel("Los Perdidos"));
        this.dbHoteles.add(new Hotel("Hotel TDG"));
        this.dbHoteles.add(new Hotel("Hotel SMA"));
        this.dbHoteles.add(new Hotel("Hotel AAA"));

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
            if (hotel.getNombreHotel().equals(nombreHotel)) {
                hotelEncontrado = hotel;
            }
        }
        return hotelEncontrado;
    }
  
}
