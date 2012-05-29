

package modelos;

import java.util.Scanner;

public class Hotel {
    private String nombre;
    private String direccionClerk;
    private Usuario codigoUsuario;
    Scanner in = new Scanner(System.in);

    public Hotel(String nombre, String direccionClerk, String codigoUsuario) {
        this.nombre = nombre;
        this.direccionClerk = direccionClerk;
        this.codigoUsuario = new Usuario(codigoUsuario);
    }

    public Usuario getCodigoUsuario() {
        return codigoUsuario;
    }



    public String getDireccion() {
        return direccionClerk;
    }

    public void setDireccion(String direccion) {
        this.direccionClerk = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        System.out.println("Seleccione opción = " );
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
