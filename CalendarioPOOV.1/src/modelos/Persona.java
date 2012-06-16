

package modelos;


public class Persona implements InterfaceGeneral{
    
    private String nombre;
    private Documento documento;
    private String direccion;
    private String ciudad;
    private String estado;
    private String pais;
    private String cumpleanios;
    private TipoPasajero tipoCliente;
    private String email;
    private String tel;
    private String fax;
    private boolean esEmpleado;
    private boolean errorInt;
    private boolean errorObject;
    
    public Persona(){
    }
    
    public Persona(String nombre, Documento documento, String telefono, String correo){
        this.nombre = nombre;
        this.documento= documento;
        this.email = correo;
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }
    
    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
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
    
    public void setTipoCliente(TipoPasajero tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPasajero getTipoCliente() {
        return tipoCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String toString(){
        return this.nombre;
    }
    
    
    @Override
    public boolean isErrorInt() {
        return errorInt;
    }

    @Override
    public boolean isErrorObject() {
        return errorObject;
    }

    @Override
    public boolean validarNulos(Object campo) {
        if (campo != null) {
            return true;
        } else {
            errorObject = true;
            return false;
        }
    }

    @Override
    public boolean validarIgualesObject(Object variable1, Object variable2) {
        if (variable1.equals(variable2)) {
            return true;
        } else {
            errorObject = true;
            return false;
        }
    }

    @Override
    public boolean validarNumerosValidos(int numero) {
        if (numero <= 0) {
            errorInt = true;
            return false;
        }
        return true;
    }
}
