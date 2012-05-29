/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Angel
 */
public class Cliente {
    private String codigo;
     private String correoElectronico;
    private String contrasena;
   private String contrasena2;

   

    public Cliente(String codigo,String correoElectronico, String contrasena, String contrasena2) {
        this.codigo = codigo;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.contrasena2 = contrasena2;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getContrasena2() {
        return contrasena2;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    

  
   
    
}
