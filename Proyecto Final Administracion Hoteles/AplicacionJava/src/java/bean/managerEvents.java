package bean;

import entities.sipEntity;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import methods.toArrays;
import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.DefaultAsteriskServer;

@SessionScoped
@ManagedBean
public class managerEvents {

    private AsteriskServer asteriskServer;
    private String host;
    private String user;
    private String password;
    private String commands;
    private String message;
    private String busqueda;
    private List<sipEntity> sipList = new ArrayList<sipEntity>();

    public List<sipEntity> getSipList() {
        List<String> cli = run();
        List<sipEntity> list = new toArrays().toSipEntity(cli);
        setSipList(list);
        return sipList;
    }

    public void setSipList(List<sipEntity> sipList) {
        this.sipList = sipList;
    }

    public String getBusqueda() {

        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public AsteriskServer getAsteriskServer() {
        return asteriskServer;
    }

    public void setAsteriskServer(AsteriskServer asteriskServer) {
        this.asteriskServer = asteriskServer;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public managerEvents() {
        asteriskServer = new DefaultAsteriskServer("192.168.6.106", "AstAmi", "123456");
    }

    public String doSearch() {
        if (this.busqueda.length() != 0) {
            List<sipEntity> list1 = getSipList();
            List<sipEntity> listFilter = new ArrayList<sipEntity>();
            String busqueda1 = this.busqueda;
            int s = busqueda1.length();
            for (sipEntity entity : list1) {
                String eq = entity.getName().substring(0, s-1);
                if (busqueda1.equals(eq)) {
                    listFilter.add(entity);
                }
            }
            setSipList(listFilter);
        }
        return "index";
    }

    /*******Metodos********/
    public List<String> run() {
        asteriskServer = new DefaultAsteriskServer("192.168.6.106", "AstAmi", "123456");
        asteriskServer.initialize();
        List<String> cli = asteriskServer.executeCliCommand("sip show peers");
        asteriskServer.shutdown();
        return cli;
    }

    public String doSipShowPeers() {
        List<String> cli = run();
        List<sipEntity> list = new toArrays().toSipEntity(cli);
        setSipList(list);
        return "index";
    }
    public static void main(String[] args) {
        managerEvents me = new managerEvents();
        List<String> cli = me.run();
        me.setBusqueda("12");
        List<sipEntity> list = me.getSipList();
        for (sipEntity entity : list) {
            System.out.println(entity.getName());
        }
        me.doSearch();
        list = me.getSipList();
        for (sipEntity entity : list) {
            System.out.println(entity.getName());
        }
    }
}