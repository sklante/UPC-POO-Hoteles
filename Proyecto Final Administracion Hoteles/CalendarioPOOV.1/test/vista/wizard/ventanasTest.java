
package vista.wizard;

import controladores.ControladorCliente;
import controladores.ControladorHotel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alfredol
 */
public class ventanasTest {

    public ventanasTest() {
    }



    @Test
    public void testDeValidacionDefinirMoneda() {

        String tCambio = "1.2";
        String nMoneda = "Soles";

        boolean tipoCambio;
        boolean nombreMoneda;
        boolean numeroDecimal;

        tipoCambio = ControladorHotel.esNulos(tCambio);
        nombreMoneda = ControladorHotel.esNulos(nMoneda);

        assertFalse(tipoCambio);
        assertFalse(nombreMoneda);

        numeroDecimal = ControladorHotel.esNumeroDecimal(tCambio);
        assertTrue(numeroDecimal);
    }

    @Test
    public void validarWizarHotel(){
        String nHotel = "Rivera";
        boolean nombreHotel;

        nombreHotel = ControladorCliente.esNulos(nHotel);
        assertFalse(nombreHotel);
    }

    @Test
    public void validarWizardPaso1(){
        String nHabitacion = "105";
        int nLicencias = 30;
        boolean numeroHabitacion;
        boolean numeroLicencias;

        numeroHabitacion = ControladorHotel.esNumeroHabValido(nHabitacion);
        numeroLicencias = ControladorHotel.esNumeroHabLicencia(nLicencias);
        assertTrue(numeroHabitacion);
        assertTrue(numeroLicencias);
    }

    @Test
    public void validarWizardPersonal(){
        String correoEnviado = "alfredo@hotmail.com";
        boolean correoRecibido;

        String pass1 = "123456";
        String pass2 = "123456";
        boolean passRecibido;

        correoRecibido = ControladorCliente.esCorreo(correoEnviado);
        assertTrue(correoRecibido);

        passRecibido = ControladorCliente.validarIguales(pass1, pass2);
        assertTrue(passRecibido);

    }


}