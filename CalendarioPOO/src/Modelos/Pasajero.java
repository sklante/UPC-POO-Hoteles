package modelos;

import javax.swing.JOptionPane;

public class Pasajero implements InterfaceGeneral{

    private static int id = 1;
    private int idCliente;
    private String nombre;
    private String apellido;
    private TipoPasajero tipoCliente;
    private boolean estadoCheck;
    private String email;
    private String tel;
    private String fax;
    public boolean errorObject;
    public boolean errorInt;

    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido) {
        if (validarNulos(nombre) && validarNulos(apellido)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.idCliente = id;
            id++;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido: " + nombre + "," + apellido + ">>>" + getClass());
        }
    }

    public void setEstadoCheck(boolean estadoCheck) {
        this.estadoCheck = estadoCheck;
    }

    public boolean isEstadoCheck() {
        return estadoCheck;
    }
    
    public Pasajero(String nombre, String apellido, TipoPasajero tipoCliente) {
        if (validarNulos(nombre) && validarNulos(apellido)
                &&validarNulos(tipoCliente)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.tipoCliente = tipoCliente;
            this.idCliente = id;
            id++;
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido: " + nombre + "," + apellido + ">>>" + getClass());
        }
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

    public String toString() {
        return this.nombre + " " + this.apellido;
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
    
    @Override
    public boolean isErrorInt() {
        return this.errorInt;
    }

    @Override
    public boolean isErrorObject() {
        return this.errorObject;
    }
}
