/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package controladoras;

import Controladores.Traductor;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Pc
 */
public class TraductorTest {
    
    public TraductorTest() {
    }

    @Test
    public void ProbarQueSeAgreganPalabras() {
        Traductor.llenadoPalabras("Play", "Juegos");
        assertEquals("Juegos", Traductor.traduccion("Juegos",true));
    }
    
    @Test
    public void ProbarQueCorrespondanLosDias() {
        assertEquals("Lunes", Traductor.traduccion("Monday",true));
    }
    
    @Test
    public void ProbarQueCorrespondanLosMeses() {
        assertEquals("Enero", Traductor.traduccion("January",true));
    }
    
    @Test
    public void SiNoSeEncuentraDevuelvaLaMisma() {
        assertEquals("january", Traductor.traduccion("january",true));
    }
}
