

package modelos;

public class Hotel {
    private String nombre;
    private String direccionClerk;
    private Usuario codigoUsuario;

    public Hotel(String nombre, String direccionClerk, String codigoUsuario) {
        this.nombre = nombre;
        this.direccionClerk = direccionClerk;
        this.codigoUsuario = new Usuario(codigoUsuario);
    }

    public Usuario getCodigoUsuario() {
        return codigoUsuario;
    }



    public String getDireccion() {
        return direccionClerk;
    }

    public void setDireccion(String direccion) {
        this.direccionClerk = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean verificaNombreHotel(String nombreh){
        boolean valido = false;
       // this.password = null;
        if(nombreh != null){
            valido = true;
        }
        return valido;
    }
    

}
