/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Miguel
 */
public class TipoPlan {
       private String planGratuito;
     private String planConCosto;

    public TipoPlan(String planGratuito, String planConCosto) {
        this.planGratuito = planGratuito;
        this.planConCosto = planConCosto;
    }

    public String getPlanConCosto() {
        return planConCosto;
    }

    public void setPlanConCosto(String planConCosto) {
        this.planConCosto = planConCosto;
    }

    public String getPlanGratuito() {
        return planGratuito;
    }

    public void setPlanGratuito(String planGratuito) {
        this.planGratuito = planGratuito;
    }
 
}
