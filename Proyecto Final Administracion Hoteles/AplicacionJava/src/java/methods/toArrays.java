package methods;

import entities.sipEntity;
import java.util.ArrayList;
import java.util.List;

public class toArrays {
    
    public List<sipEntity> toSipEntity(List<String> cli) {
// reemplazando espacios en blanco por comas.        
        int i = 0;
        List<sipEntity> list = new ArrayList<sipEntity>();
        for (String string : cli) {
            String sip = string;
            sip = sip.replace(' ', ',');
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            cli.set(i, sip);
            i++;
        }
//verificando....
        for (String string : cli) {
            System.out.println(string);
        }
//extrayendo datos....
        i = 0;
        for (String string : cli) {
            if ((i != 0)) {
                if ((i != cli.size() - 1)) {
                    System.out.println(i);
                    String aux = "";
                    String userName = "";
                    String ip = "";
                    String dyn = "";
                    String nat = "";
                    String acl = "";
                    String port = "";
                    String status = "";
                    String gif="";
                    userName = string.substring(0, string.indexOf(','));
                    aux = string.substring(string.indexOf(',') + 1, string.length());
                    if (aux.substring(0, aux.indexOf(',')).equals("(Unspecified)")) {
                        ip = "";
                        gif = gif(true);
                    } else {
                        gif = gif(false);
                        ip = aux.substring(0, aux.indexOf(','));
                    }
                    aux = aux.substring(aux.indexOf(',') + 1, aux.length());
                    if(aux.substring(0, aux.indexOf(',')).equals("D")){
                        dyn = aux.substring(0, aux.indexOf(','));
                        aux = aux.substring(aux.indexOf(',') + 1, aux.length());
                    }else{
                        dyn="";
                    }
                    if(aux.substring(0, aux.indexOf(',')).equals("N")){
                        nat = aux.substring(0, aux.indexOf(','));
                        aux = aux.substring(aux.indexOf(',') + 1, aux.length());
                    }else{
                        nat="";
                    }
                    if(aux.substring(0, aux.indexOf(',')).equals("A")){
                        acl = aux.substring(0, aux.indexOf(','));
                        aux = aux.substring(aux.indexOf(',') + 1, aux.length());
                    }else{
                        acl="";
                    }
//                    else if (aux.substring(0, aux.indexOf(',')).equals("N")){
//                        nat = aux.substring(0, aux.indexOf(','));
//                    }else if (aux.substring(0, aux.indexOf(',')).equals("A")){
//                        acl = aux.substring(0, aux.indexOf(','));
//                    }
//                    aux = aux.substring(aux.indexOf(',') + 1, aux.length());
//                    nat = aux.substring(0, aux.indexOf(','));
//                    aux = aux.substring(aux.indexOf(',') + 1, aux.length());
//                    acl = aux.substring(0, aux.indexOf(','));
//                    aux = aux.substring(aux.indexOf(',') + 1, aux.length());
                    port = aux.substring(0, aux.indexOf(','));
                    aux = aux.substring(aux.indexOf(',') + 1, aux.length());
                    status = aux.replace(',', ' ');
                    sipEntity sip = new sipEntity();
                    sip.setName(userName);
                    sip.setUserName(userName);
                    sip.setHost(ip);
                    sip.setDyn(dyn);
                    sip.setNat(nat);
                    sip.setAcl(acl);
                    sip.setPort(port);
                    sip.setStatus(status);
                    list.add(sip);
                } else {
                }
            } else {
            }
//Asignando los datos a la entidad y listandolos
            i++;
        }
        return list;
    }

    public String messageSip() {

        return "";
    }
    
    public String gif(boolean status){
        if(status){
        return "resources/acept_16x16.png";
        }else{
        return "resources/cancel16x16.png";
        }
    }
}
