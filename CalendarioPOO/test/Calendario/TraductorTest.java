/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Calendario;

import controladores.ControlesGenerales;
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
        ControlesGenerales.llenadoPalabras("Play", "Juegos");
        assertEquals("Juegos", ControlesGenerales.traduccion("Juegos",true));
    }
    
    @Test
    public void ProbarQueCorrespondanLosDias() {
        assertEquals("Lunes", ControlesGenerales.traduccion("Monday",true));
    }
    
    @Test
    public void ProbarQueCorrespondanLosMeses() {
        assertEquals("Enero", ControlesGenerales.traduccion("January",true));
    }
    
    @Test
    public void SiNoSeEncuentraDevuelvaLaMisma() {
        assertEquals("january", ControlesGenerales.traduccion("january",true));
    }
}
