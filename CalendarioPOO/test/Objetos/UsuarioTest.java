
package Objetos;
import Modelos.Cliente;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioTest {

    @Test
    public void validarQueseIngreseCorreoElectronico(){
        Cliente usuario = new Cliente("01","alfred@hotmail.com","123456", "123456","A");
        assertFalse(usuario.verificaCorreo(null));
        System.out.println("Debe Ingresar Correo Electronico");
    }  
    
    @Test
    public void siElCorreoElectronicoEsIncorrectoDebeMandarMensaje(){
        Cliente usuario = new Cliente("01","alfredhotmail.com","123456", "123456","A");
        assertFalse(usuario.validarCorreo(usuario.getCorreoElectronico()));
        System.out.println("Este correo electronico es incorrecto");
    }

    @Test
    public void validarQueSeIngreseLasDosContrasenas(){
        Cliente contrasena1 = new Cliente("01","alfred@hotmail.com","123456", "123456","A");
        Cliente contrasena2 = new Cliente("02","alfred@hotmail.com","123456", "123456","A");
        Assert.assertFalse(contrasena1.validaContrasena(null));
        Assert.assertFalse(contrasena2.validaContrasena(null));
        System.out.println("Debe ingresar contraseña");
    }

    @Test
    public void validarQueLasDosContrasenasNoCoincidan(){
        boolean valor = false;
        Cliente contrasena1 = new Cliente("01","alfred@hotmail.com","123456", "123456","A");
        Cliente contrasena2 = new Cliente("02","alfred@hotmail.com","123s56", "123s56","A");
        valor = contrasena1.validaSiCoinciden(contrasena1.getContrasena(),contrasena2.getContrasena2());
        Assert.assertFalse(valor);
        System.out.println("Las contraseñas no coincidem");
    }

    
}
