/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.ArrayList;
import Modelos.Cliente;

/**
 *
 * @author Angel
 */
public class Cuentas {

    private ArrayList<Cliente> clientes;

    public Cuentas() {
        clientes = new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;

    }

    public void registrarCliente(String codigo, String correoElectronico, 
            String contrasena, String contrasena2, String estado) {

        buscarCliente(codigo, contrasena, contrasena2);

        Cliente cliente = new Cliente(codigo, correoElectronico, contrasena, contrasena2,estado);
        clientes.add(cliente);

    }

    private void buscarCliente(String codigo, String contrasena, String contrasena2) throws RuntimeException {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equals(codigo)) {
                throw new RuntimeException("Cliente ya registrado");
            }


        }


    }
}
