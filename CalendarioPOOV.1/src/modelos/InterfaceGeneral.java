/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


public interface InterfaceGeneral {
    
    boolean isErrorInt();

    boolean isErrorObject();

    boolean validarIgualesObject(Object variable1, Object variable2);

    boolean validarNulos(Object campo);

    boolean validarNumerosValidos(int numero);
    
}
