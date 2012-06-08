

package controladores;

import java.util.Scanner;


public class ControladorHotel {
    Scanner in = new Scanner(System.in);
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

    public String[] sugerirNombres(String nombreHotel){
        boolean sugerir = false;
        String nombres[] = new String[5];
        for(int i=0; i < nombres.length; i++){
            nombres[i] = nombreHotel + (i+1);
        }
        return nombres;
    }

    public String asignarLink(String nombreHotel){
        String link;
        link = "La dirección Web es http://" + nombreHotel + ".clerk.im";

        return link;
    }

}
