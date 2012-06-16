package controladores;

import java.util.ArrayList;
import java.util.List;

public class ControladorCliente {

    public static boolean esNulos(Object campo) {
        if (campo.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esCorreo(String correo) {

        int posicionArroba = correo.indexOf('@');
        if (posicionArroba > 0 && esPalabraCaracteres(correo.substring(0, posicionArroba))
                && esPalabraCaracteres(correo.substring(posicionArroba + 1))) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean esPalabra(String palabra) {
        palabra = palabra.trim();
        palabra = palabra.replace(" ", "");
        
        for (int i = 0; i < palabra.length(); i++) {
            if (!((palabra.charAt(i) > 64 && palabra.charAt(i) < 91 )
                    || (palabra.charAt(i) > 96 && palabra.charAt(i) < 123 ))) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean esPalabraCaracteres(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (!((palabra.charAt(i) > 64 && palabra.charAt(i) < 91 || palabra.charAt(i) == 95
                    || palabra.charAt(i) == 46 || palabra.charAt(i) == 45 || (palabra.charAt(i) > 47 && palabra.charAt(i) < 58))
                    || (palabra.charAt(i) > 96 && palabra.charAt(i) < 123 || palabra.charAt(i) == 95
                    || palabra.charAt(i) == 46 || palabra.charAt(i) == 45 || (palabra.charAt(i) > 47 && palabra.charAt(i) < 58)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validarIguales(String variable1, String variable2) {
        if (variable1.equals(variable2)) {
            return true;
        } else {
            return false;
        }
    }

    public static List<String> opcionesNombreHotel(String nombre) {
        List<String> lista = new ArrayList<String>();
        String formato = nombre.replace("Hotel", "");
        formato = formato.replace("hotel", "");

        formato = formato.trim();
        lista.add(formato);
        lista.add(formato + " Starts");
        lista.add(formato + " Dream");
        lista.add(formato + " Rest");
        lista.add(formato + " Relax");
        lista.add(formato + " Club");
        lista.add(formato + " Vip");
        lista.add(formato + " Kings");
        lista.add(formato + " Princes");
        lista.add(formato + " Rooms");

        return lista;

    }

    public static List<String> opcionesUrlHotel(String url) {

        List<String> lista = new ArrayList<String>();
        url = url.toLowerCase();
        url = url.replace(" ", "");
        lista.add(url);
        lista.add(url + "hotel");
        lista.add("hotel" + url);
        lista.add(url + "insite");
        lista.add(url + "chekin");
        lista.add("checkin" + url);
        lista.add("insite" + url);
        return lista;
    }
    
    public static String[] listaString(List<String> listas){
        String[] lista = new String[listas.size()];
        for (int i = 0; i < listas.size(); i++) {
            lista[i] = listas.get(i);
        }
        return lista;
    }
    public static boolean validaContrasena(String password){
        boolean valido = false;
       // this.password = null;
        if(password != null){
            valido = true;
        }
        return valido;
    }
    public static String asignarLink(String nombreHotel){
        String link;
        link = "La dirección Web es http://" + nombreHotel + ".clerk.im";

    return link;
    }

}
