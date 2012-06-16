/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package calendarioTest;

import controladores.MetodosGenerales;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class MetodosGeneralesTest {
    
    public MetodosGeneralesTest() {
    }

    @Test
    public void ProbarQueSeAgreganPalabras() {
        MetodosGenerales.llenadoPalabras("Play", "Juegos");
        assertEquals("Juegos", MetodosGenerales.traduccion("Juegos",true));
    }
    
    @Test
    public void ProbarQueCorrespondanLosDias() {
        assertEquals("Lunes", MetodosGenerales.traduccion("Monday",true));
    }
    
    @Test
    public void ProbarQueCorrespondanLosMeses() {
        assertEquals("Enero", MetodosGenerales.traduccion("January",true));
    }
    
    @Test
    public void SiNoSeEncuentraDevuelvaLaMisma() {
        assertEquals("january", MetodosGenerales.traduccion("january",true));
    }
}
