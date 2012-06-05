
package modelos;

public class Hotel {
    
private String nombreHotel;
private String direccionClerk;
private String numeroDeHabitaciones;

    public Hotel(String nombreHotel, String direccionClerk, String numeroDeHabitaciones) {
        this.nombreHotel = nombreHotel;
        this.direccionClerk = direccionClerk;
        this.numeroDeHabitaciones =numeroDeHabitaciones;
    }

    public String getDireccionClerk() {
        return direccionClerk;
    }

    public void setDireccionClerk(String direccionClerk) {
        this.direccionClerk = direccionClerk;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }
    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }

    public void setNumeroDeHabitaciones(String numeroDeHabitaciones) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }
       
}
