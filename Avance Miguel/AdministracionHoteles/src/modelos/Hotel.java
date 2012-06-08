
package modelos;

public class Hotel {
    
private String nombreHotel;
private String direccionClerk;


    public Hotel(String nombreHotel, String direccionClerk) {
        this.nombreHotel = nombreHotel;
        this.direccionClerk = direccionClerk;
      
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

   
       
}
