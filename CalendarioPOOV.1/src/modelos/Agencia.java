/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

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
    private String convenio;
    private Medios medioDePago;
    private List<Persona> contacto;

    public Agencia(String nombre, Documento documento, String telefono, String correo, Medios medioDePago) {
        this.contacto = new ArrayList<Persona>();
        this.nombreAgencia = nombre;
        this.identificacion = documento;
        this.telefono = telefono;
        this.correoElectronico = correo;
        this.medioDePago = medioDePago;
    }

    public Medios getMedioDePago() {
        return medioDePago;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setMedioDePago(Medios medioDePago) {
        this.medioDePago = medioDePago;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Persona> getContacto() {
        return contacto;
    }

    public void setContacto(List<Persona> contacto) {
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

    public String toString() {
        return this.nombreAgencia;
    }
}
