
package modelos;
import controladoras.Usuarios;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioTest {

    @Test
    public void validarQueseIngreseCorreoElectronico(){
        Usuario usuario = new Usuario("alfred@hotmaol.com", "123456");
        assertFalse(usuario.verificaCorreo(null));
        System.out.println("Debe Ingresar Correo Electronico");
    }  
    
    @Test
    public void siElCorreoElectronicoEsIncorrectoDebeMandarMensaje(){
        Usuario usuario = new Usuario("asjajco", "123456");
        assertFalse(usuario.validarCorreo(usuario.getCorreoe()));
        System.out.println("Este correo electronico es incorrecto");
    }

    @Test
    public void validarQueSeIngreseLasDosContrasenas(){
        Usuario contrasena1 = new Usuario("alfred@hotmaol.com", "123456");
        Usuario contrasena2 = new Usuario("alfred@hotmaol.com", "123456");
        Assert.assertFalse(contrasena1.validaContrasena(null));
        Assert.assertFalse(contrasena2.validaContrasena(null));
        System.out.println("Debe ingresar contraseña");
    }

    @Test
    public void validarQueLasDosContrasenasNoCoincidan(){
        boolean valor = false;
        Usuario contrasena1 = new Usuario("alfred@hotmaol.com", "123656");
        Usuario contrasena2 = new Usuario("alfred@hotmaol.com", "123456");
        valor = contrasena1.validaSiCoinciden(contrasena1.getPassword(),contrasena2.getPassword());
        Assert.assertFalse(valor);
        System.out.println("Las contraseñas no coincidem");
    }

    
}
