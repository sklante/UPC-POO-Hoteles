/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.Date;
/**
 *
 * @author Miguel
 */
public class Cuenta {
     private String codigo;
     private Date hora;
    private String nombreDelPlan;
      private boolean terminos;

    public Cuenta(String codigo, Date hora, String nombreDelPlan, boolean terminos) {
        this.codigo = codigo;
        this.hora = hora;
        this.nombreDelPlan = nombreDelPlan;
        this.terminos = terminos;
    }
    

}
