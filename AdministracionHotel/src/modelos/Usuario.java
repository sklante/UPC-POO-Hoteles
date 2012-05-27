/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Angel
 */
public class Usuario {
 private String nombre;
    private String apellido;
    private String correoElectronico;
    private String password;

    public Usuario(String nombre, String apellido, String correoElectronico, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getcorreoElectronico() {
        return correoElectronico;
    }

    public void setUserName(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
}
