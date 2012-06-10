package controladoras;

import java.util.ArrayList;
import java.util.List;
import modelos.Habitacion;
import modelos.TipoHabitacion;

public class ControlesGenerales {

    private static List<String[]> palabras = new ArrayList<String[]>();
    public boolean errorObject=false;
    public boolean errorInt=false;
    

    public static void llenadoPalabras() {

        String[] idem = {"January", "Enero"};
        palabras.add(idem);
        String[] idem1 = {"February", "Febrero"};
        palabras.add(idem1);
        String[] idem2 = {"March", "Marzo"};
        palabras.add(idem2);
        String[] idem3 = {"April", "Abril"};
        palabras.add(idem3);
        String[] idem4 = {"May", "Mayo"};
        palabras.add(idem4);
        String[] idem5 = {"June", "Junio"};
        palabras.add(idem5);
        String[] idem6 = {"July", "Julio"};
        palabras.add(idem6);
        String[] idem7 = {"August", "Agosto"};
        palabras.add(idem7);
        String[] idem8 = {"September", "Setiembre"};
        palabras.add(idem8);
        String[] idem9 = {"October", "Octubre"};
        palabras.add(idem9);
        String[] idem10 = {"November", "Noviembre"};
        palabras.add(idem10);
        String[] idem11 = {"December", "Diciembre"};
        palabras.add(idem11);
        String[] idem12 = {"Monday", "Lunes"};
        palabras.add(idem12);
        String[] idem13 = {"Tuesday", "Martes"};
        palabras.add(idem13);
        String[] idem14 = {"Wednesday", "Miercoles"};
        palabras.add(idem14);
        String[] idem15 = {"Thursday", "Jueves"};
        palabras.add(idem15);
        String[] idem16 = {"Friday", "Viernes"};
        palabras.add(idem16);
        String[] idem17 = {"Saturday", "Sabado"};
        palabras.add(idem17);
        String[] idem18 = {"Sunday", "Domingo"};
        palabras.add(idem18);
    }

    public static String traduccion(String palabra, boolean activado) {
        String palabraSp = palabra;
        if (palabras.isEmpty()) {
            llenadoPalabras();
        }
        for (int i = 0; i < ControlesGenerales.palabras.size(); i++) {
            if (palabras.get(i)[0].equals(palabra) && activado) {
                palabraSp = palabras.get(i)[1];
                break;
            }
        }
        return palabraSp;
    }

    public static void llenadoPalabras(String en, String sp) {
        if (palabras.isEmpty()) {
            llenadoPalabras();
        }
        String idem[] = {en, sp};
        palabras.add(idem);
    }

    public static boolean validarNulos(Object campo) {
        if (campo != null) {
            return true;
        } else {
            new ControlesGenerales().errorObject=true;
            return false;
        }
    }

    public static boolean validarIgualesObject(Object variable1, Object variable2) {
        if (variable1.equals(variable2)) {
            return true;
        } else {
            new ControlesGenerales().errorObject=true;
            return false;
        }
    }
    
    public static boolean validarNumerosValidos(int numero){
        if(numero<=0){
             new ControlesGenerales().errorInt=true;
            return false;
        }
        return true;
    }

}
