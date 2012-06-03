/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import Controladores.ControladorCalendario;
import Modelos.Fecha;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author cgarrido
 */
public class ControladorCalendarioTest {
    
    public ControladorCalendarioTest() {
    }


    @Test
    public void cantidadDeDiasEnLaSemanas() {
        ControladorCalendario calendario = new ControladorCalendario();
        Fecha[] diasDeSemanasFecha = calendario.diasDeSemanasFecha(2, 20, 07, 2012);
        assertEquals(diasDeSemanasFecha.length, 2*7);
                
    }
    
    @Test
    public void verificarSiLosDiasCorrespondes() {
        ControladorCalendario calendario = new ControladorCalendario();
        Date date = new Date();
        int dia1 = date.getDate();
        int mes1 = date.getMonth()+1;
        int anio1 = date.getYear()+1900;
        Fecha[] diasDeSemanasFecha = calendario.diasDeSemanasFecha(2, dia1, mes1, anio1);
        assertEquals(date.getDate(), diasDeSemanasFecha[0].getDiaNumero());
        assertEquals(date.getMonth()+1, diasDeSemanasFecha[0].getMesNumero());
        assertEquals(date.getYear()+1900, diasDeSemanasFecha[0].getAnio());
                
    }
    
    
    
}
