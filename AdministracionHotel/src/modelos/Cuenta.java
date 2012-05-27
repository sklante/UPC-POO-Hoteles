
package modelos;

public class Cuenta {
    private String correo;
    private String passWord;
    private String repetirPassword;
    private String nombreHotel;
    

    public Cuenta(String correo, String passWord, String repetirPassword, String nombreHotel) {
        this.correo = correo;
        this.passWord = passWord;
        this.repetirPassword = repetirPassword;
        this.nombreHotel = nombreHotel;
        
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }


    public String getPassWord() {
        return passWord;
    }

    public String getRepetirPassword() {
        return repetirPassword;
    }
    
    
}
