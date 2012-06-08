
package modelos;

public class Cliente {
    private String codigo;
     private String correoElectronico;
    private String contrasena;
  

   

    public Cliente(String codigo,String correoElectronico, String contrasena) {
        this.codigo = codigo;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
       
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

   
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    
}
