

package modelos;


public class Pasajero implements InterfaceGeneral{
    
    private static int id=1;
    private int idCliente;
    private String nombre;
    private String apellido;
    private TipoPasajero tipoCliente;
    private String email;
    private String tel;
    private String fax;
    private boolean errorInt;
    private boolean errorObject;
    
    public Pasajero(){
    }
    
    public Pasajero(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido= apellido;
        this.idCliente = id;
        id++;
    }
    
    public Pasajero(String nombre, String apellido, TipoPasajero tipoCliente){
        this.nombre = nombre;
        this.apellido= apellido;
        this.tipoCliente = tipoCliente;
        this.idCliente = id;
        id++;
    }

    public void setTipoCliente(TipoPasajero tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPasajero getTipoCliente() {
        return tipoCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
        return this.nombre + " " + this.apellido;
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
