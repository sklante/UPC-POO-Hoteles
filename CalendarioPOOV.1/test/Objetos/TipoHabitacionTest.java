
package Objetos;

import controladores.ControladorMoneda;
import modelos.Moneda;
import modelos.TipoHabitacion;
import org.junit.*;
import static org.junit.Assert.*;


public class TipoHabitacionTest {
    
    public TipoHabitacionTest() {
    }

    @Test
    public void QueElTipoCorrespondaAlCreado() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion("Suite");
        String expResult = "Suite";
        String result = tipoHabitacion.getTipo();
        assertEquals(expResult, result);
    }
    //Test de aceptacion Definir PRECIO
    @Test
    public void debeIngresarUnPrecioValido(){
        double price = 0.0;
        TipoHabitacion tipohabitacion = new TipoHabitacion(null);
        assertTrue(tipohabitacion.verificaPrecio(price));
        System.out.println("Usted debe ingresar un precio valido");

    }
    //Test de aceptacion Definir PRECIO
    @Test
    public void soloPuedeIngresarTresMonedas(){
        int tamano;
        ControladorMoneda controladormoneda = new ControladorMoneda();
        Moneda moneda = new Moneda("S/.", 0.0, true);

        controladormoneda.variasMonedas();
        tamano = controladormoneda.dataMoneda.size();
        assertFalse(moneda.verificaTresMonedas(tamano));
       
    }
  //PENDIENTE
    @Test
    public void ingresarPrecioEnMonedas(){
        double TipoCambio = 0.0;
        TipoHabitacion thabitacion = new TipoHabitacion("Single", 250.00);

        Moneda moneda = new Moneda("S/.", 12, true);


    }
    //por revisar
   /*     @Test
    public void debeRegistrarPrecioPorTipoHabitacion(){

        String tipoh  = "Single";
        double preciop = 500.0;
        String moneda = "S/.";

        ControladorTipoHabitacion admin = new ControladorTipoHabitacion(tipoh, preciop);
        assertTrue(admin.verificaPrecio(preciop));

        System.out.println("Usted debe ingresar un precio valido");
        admin.registrarPrecioHabitacion(tipoh, preciop, moneda);

        TipoHabitacion tipo = admin.buscar(codigo);
        // Assert
        assertNotNull(tipo);
        assertEquals(codigo, tipo.getCodigo());
        assertEquals(descripcion, tipo.getDescripcion());
        assertEquals(precio, tipo.getPrecio(), 0.0);
    }*/


}
