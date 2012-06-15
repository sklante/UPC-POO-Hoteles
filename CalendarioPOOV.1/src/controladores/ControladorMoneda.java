
package controladores;

import java.util.ArrayList;
import modelos.Moneda;

public class ControladorMoneda {

    public ArrayList<Moneda> dataMoneda = new ArrayList<Moneda>();


    public void variasMonedas(){

        this.dataMoneda.add(new Moneda("Soles", "S/.", 1, true));
        this.dataMoneda.add(new Moneda( "Dolares", "$.", 1, true));
        this.dataMoneda.add(new Moneda("Euros", "E/.", 1, true));
        //this.dataMoneda.add(new Moneda( "Y.", 12, true, true, true));
    }



}
