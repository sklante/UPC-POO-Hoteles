/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Angel
 */
public class TipoHabitacion implements InterfaceGeneral {

    private String nombreTipo;
    private double precio;
    private Moneda nombreMoneda;
    private boolean errorInt;
    private boolean errorObject;

    public TipoHabitacion(String nombreTipo, double precio, Moneda nombreMoneda) {
        this.nombreTipo = nombreTipo;
        this.precio = precio;
        this.nombreMoneda = nombreMoneda;
    }

    public Moneda getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(Moneda nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     public String toString() {
        return this.nombreTipo;
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
    public boolean verificaPrecio(double precio){
        if(precio <= 0){
            return true;
        }
        return false;
    }

}

    

    
    
    
