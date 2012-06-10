/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

public class Habitacion implements InterfaceGeneral {

    private int numHabitacion;
    private String denominacion;
    
    private String nombreHabitacion;
    private TipoHabitacion tipoHabitacion;
    private Hotel Hotel;
    private boolean errorInt;
    private boolean errorObject;

    public Habitacion(String nombreHabitacion, TipoHabitacion tipoHabitacion, Hotel hotel) {

        this.nombreHabitacion = nombreHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.Hotel = hotel;
        
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    
    public modelos.Hotel getHotel() {
        return Hotel;
    }

    public void setHotel(modelos.Hotel Hotel) {
        this.Hotel = Hotel;
    }

    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public String toString() {
        return String.valueOf(this.nombreHabitacion);
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
