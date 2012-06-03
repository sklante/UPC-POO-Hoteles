/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Hotel {
    
private String nombreHotel;
private String direccionClerk;
private String nombre;
Scanner in = new Scanner(System.in);


    public Hotel(String nombreHotel, String direccionClerk) {
        this.nombreHotel = nombreHotel;
        this.direccionClerk = direccionClerk;
    }
    
    public Hotel(String nombreHotel, String direccionClerk, String nombre) {
        this.nombreHotel = nombreHotel;
        this.direccionClerk = direccionClerk;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccionClerk() {
        return direccionClerk;
    }

    public void setDireccionClerk(String direccionClerk) {
        this.direccionClerk = direccionClerk;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }
   
public boolean verificaNombreHotel(String nombreh){
        boolean valido = false;
       // this.password = null;
        if(nombreh != null){
            valido = true;
        }
        return valido;
    }

    public String seleccionNombre(String nombreHotel){
        String nomPro = "";
        int opcion = 0;
        System.out.println("1.- "+nombreHotel+"1");
        System.out.println("2.- "+nombreHotel+"2");
        System.out.println("3.- "+nombreHotel+"3");
        System.out.println("4.- "+nombreHotel+"4");
        System.out.println("5.- "+nombreHotel+"5");
        System.out.println("Seleccione opciÃ³n = " );
        do {

        opcion = in.nextInt();

        switch(opcion){
             case 1:
                    nomPro = nombreHotel + "1";
                    break;
             case 2:
                    nomPro = nombreHotel + "2";
                    break;
             case 3:
                    nomPro = nombreHotel + "3";
                    break;
             case 4:
                    nomPro = nombreHotel + "4";
                    break;
             case 5:
                    nomPro = nombreHotel + "5";
                    break;

            default:
                    System.out.println("ERROR de ingreso");
                    break;
        }
        if(opcion > 0 && opcion < 6){
            System.out.println(nomPro);
        }else{
            System.out.println("Intente de nuevo.....");

        }
        }while(opcion > 5 || opcion < 1);

        return nomPro;
    }

    
    
    
    
}
