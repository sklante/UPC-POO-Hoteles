/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author operador
 */
public class Agencia {
    
    private String nombreAgencia;
    private Documento identificacion;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private String ciudad;
    private String estado;
    private String pais;
    private Persona contacto;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Persona getContacto() {
        return contacto;
    }

    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Documento getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Documento identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString(){
        return this.nombreAgencia;
    }

}
