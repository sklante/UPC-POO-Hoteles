/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Controladores.Traductor;
import java.util.Date;

public class Mes {
  
    private Fecha fecha;
    
    public Mes(){
   }

    public Fecha getFecha() {
        return fecha;
    }
    
   public Mes(Date date){
       this.fecha = new Fecha(date);
   }
   
    @Override
   public String toString(){
       return Traductor.traduccion(this.fecha.getMes(), true) + " \n" + this.fecha.getAnio();
   }
   
}
