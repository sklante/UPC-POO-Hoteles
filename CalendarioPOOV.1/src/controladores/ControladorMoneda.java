
package controladores;

import java.util.ArrayList;
import modelos.Moneda;

public class ControladorMoneda {

    public ArrayList<Moneda> dataMoneda = new ArrayList<Moneda>();


    public void variasMonedas(){
        this.dataMoneda.add(new Moneda( "S/.", 12, true, true, true));
        this.dataMoneda.add(new Moneda( "$/.", 12, true, true, true));
        this.dataMoneda.add(new Moneda( "€/.", 12, true, true, true));
        //this.dataMoneda.add(new Moneda( "Y.", 12, true, true, true));
    }



}
