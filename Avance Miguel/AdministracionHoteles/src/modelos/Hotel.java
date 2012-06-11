
package modelos;

public class Hotel implements InterfaceGeneral {
    
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
 public String[] sugerirNombres(String nombreHotel){
        boolean sugerir = false;
        String nombres[] = new String[5];
        for(int i=0; i < nombres.length; i++){
            nombres[i] = nombreHotel + (i+1);
        }
        return nombres;
    }
public String asignarLink(String nombreHotel){
        String link;
        link = "La dirección Web es http://" + nombreHotel + ".clerk.im";

        return link;
    }

    @Override
    public boolean isErrorInt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isErrorObject() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarIgualesObject(Object variable1, Object variable2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarNulos(Object campo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarNumerosValidos(int numero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
   
       
