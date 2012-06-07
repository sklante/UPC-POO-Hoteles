
package controladores;

import java.util.ArrayList;
import modelos.Moneda;

public class ControladorMoneda {

    public ArrayList<Moneda> dataMoneda = new ArrayList<Moneda>();


    public void variasMonedas(){
        this.dataMoneda.add(new Moneda( "S/.", 12, true, true, true));
        this.dataMoneda.add(new Moneda( "$/.", 12, true, true, true));
        this.dataMoneda.add(new Moneda( "€/.", 12, true, true, true));
        this.dataMoneda.add(new Moneda( "Y.", 12, true, true, true));
    }

    public boolean verificaTresMonedas(){

        if(dataMoneda.size() < 4){

            
        return false;
    }
        else{
            System.out.println("Solo se ingresa hasta 3 moneda por Tipo de habitación");
            return true;
        }
    }

}
