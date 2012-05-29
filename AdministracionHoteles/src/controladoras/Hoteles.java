
package controladoras;

import java.util.ArrayList;
import modelos.Hotel;


public class Hoteles {

    private ArrayList<Hotel> datosHoteles = new ArrayList<Hotel>();

    private void simularTabla() {
        this.datosHoteles.add(new Hotel("Los Perdidos", "http://hotelrivera.clerk.im", "Alberto Fernandez"));
        this.datosHoteles.add(new Hotel("Hotel TDG", "http://hotelTDG.clerk.im", "Alfredo Fernandez"));
        this.datosHoteles.add(new Hotel("Hotel SMA", "http://hotelSMA.clerk.im", "Jorge Fernandez"));
        this.datosHoteles.add(new Hotel("Hotel AAA","http://hotelAAA.clerk.im", "Matias Fernandez"));

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
        for (Hotel hotel : datosHoteles) {
            if (hotel.getNombre().equals(nombreHotel)) {
                hotelEncontrado = hotel;
            }
        }
        return hotelEncontrado;
    }
  
}
