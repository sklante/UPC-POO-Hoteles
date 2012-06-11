/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import modelos.*;
import java.util.ArrayList;
/**
 *
 * @author Angel
 */
public class Monedas {
 private ArrayList<Moneda>monedas;
    
    public Monedas(){   
        monedas = new ArrayList<Moneda>();
    }    
    public ArrayList<Moneda>getMonedas(){
        return monedas;  
    }
    
    
  
    void registrarMoneda(String codigoMoneda, String nombreMoneda){
        
        buscarMoneda(codigoMoneda, nombreMoneda);
        
         Moneda moneda = new Moneda(codigoMoneda, nombreMoneda);
        monedas.add(moneda);      
    }
    
      private void buscarMoneda (String codigoMoneda, String nombreMoneda)throws RuntimeException{
          for (Moneda moneda: monedas){
          if (moneda.getNombreMoneda().equals(nombreMoneda)) {       
                throw new RuntimeException("moneda registrada");   
        }   
      }
      }
       
      }
          