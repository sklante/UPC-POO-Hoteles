

package modelos;

import java.util.ArrayList;
import java.util.List;



public class Empresa {
    
    private String empresa;
    private Documento identificacion;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private String ciudad;
    private String estado;
    private String pais;
    private Medios medioDePago;
    private String Convenio;
    private List<Persona> contacto;
    
    public Empresa(String nombre, Documento documento, String telefono, String correo, Medios medioDePago){
        this.contacto = new ArrayList<Persona>();
        this.empresa=nombre;
        this.identificacion=documento;
        this.telefono=telefono;
        this.correoElectronico=correo;
        this.medioDePago=medioDePago;
    }

    public String getConvenio() {
        return Convenio;
    }

    public void setConvenio(String Convenio) {
        this.Convenio = Convenio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setContacto(List<Persona> contacto) {
        this.contacto = contacto;
    }

    public List<Persona> getContacto() {
        return contacto;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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

    public Medios getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(Medios medioDePago) {
        this.medioDePago = medioDePago;
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
        return this.empresa;
    }

}
