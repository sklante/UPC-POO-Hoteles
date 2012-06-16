/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import controladores.MetodosGenerales;
import java.util.Date;

public class Mes implements InterfaceGeneral{

    private Fecha fecha;
    private boolean errorInt;
    private boolean errorObject;

    public Mes() {
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Mes(Date date) {
        this.fecha = new Fecha(date);
    }

    @Override
    public String toString() {
        return MetodosGenerales.traduccion(this.fecha.getMes(), true) + " \n" + this.fecha.getAnio();
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
