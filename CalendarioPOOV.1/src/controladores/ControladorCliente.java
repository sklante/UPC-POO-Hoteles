package controladores;

import java.util.ArrayList;
import java.util.List;

public class ControladorCliente {

    public static boolean validarNoNulos(Object campo) {
        if (campo != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaCorreo(String correoe){
        if(correoe != null){
            return true;
        }
        return false;
    }
    public static boolean validarCorreo(String correo) {

            int posicionArroba = correo.indexOf('@');
            int posicionPunto = correo.indexOf('.');
            if (posicionArroba > 0 && posicionPunto > posicionArroba+1 && posicionPunto < correo.length()) {
                return true;
            } else {
                return false;
            }
    }

        public boolean validaContrasena(String password){
        boolean valido = false;
       // this.password = null;
        if(password != null){
            valido = true;
        }
        return valido;

    }
    public boolean validaSiCoinciden(String password1, String password2){
        boolean valido = false;

       // this.password = null;
        if(password1.equals(password2)){
            valido = true;
        }
        return valido;

    }

    public static boolean validarIguales(String variable1, String variable2){
        if (variable1.equals(variable2)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static List<String> opcionesNombreHotel(String nombre){
        List<String> lista = new ArrayList<String>();
        String formato = nombre.replace("Hotel", "");
        formato = formato.replace("hotel", "");
        formato = formato.replace(",", "");
        formato = formato.replace(";", "");
        formato = formato.replace("\"", "");
        formato = formato.replace("\'", "");
        formato = formato.replace(",", "");
        formato = formato.replace("@", "");
        formato = formato.replace(".", "");
        formato = formato.replace("?", "");
        formato = formato.replace("-", "");
        formato = formato.replace("_", "");
        formato = formato.replace("=", "");
        formato = formato.replace(">", "");
        formato = formato.replace("<", "");
        formato = formato.replace(":", "");
        formato = formato.replace("[", "");
        formato = formato.replace("]", "");
        formato = formato.replace("{", "");
        formato = formato.replace("}", "");
        formato = formato.replace("}", "");
        formato = formato.replace("*", "");
        formato = formato.replace("+", "");
        formato = formato.replace("%", "");
        formato = formato.replace("$", "");
        formato = formato.replace("#", "");
        formato = formato.replace("!", "");
        formato = formato.replace("\\", "");
        formato = formato.replace("/", "");
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

    public static List<String> opcionesUrlHotel(String url){
                
        List<String> lista = new ArrayList<String>();
        url = url.toLowerCase();
        url = url.replace(" ", "");
        lista.add(url);
        lista.add(url+"hotel");
        lista.add("hotel"+url);
        lista.add(url+"insite");
        lista.add(url+"chekin");
        lista.add("checkin"+url);
        lista.add("insite"+url);
        return lista;
    }
    
    public static void main(String[] args) {
        System.out.println(opcionesUrlHotel("El Pueblo"));
        System.out.println(validarCorreo("a@c.c"));
        System.out.println(validarIguales("a@c.c","a@c.c"));
        System.out.println(opcionesNombreHotel("    @ //Hotel,  El Pueblo...? "));
        
    }
}
