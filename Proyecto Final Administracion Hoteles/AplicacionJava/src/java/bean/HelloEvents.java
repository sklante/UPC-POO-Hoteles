package bean;

import java.util.List;
import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.live.ManagerCommunicationException;

public class HelloEvents {

    private AsteriskServer asteriskServer;

    public HelloEvents() {
        asteriskServer = new DefaultAsteriskServer("192.168.6.106", "AstAmi", "123456");
    }

    public void run() throws ManagerCommunicationException {
        asteriskServer.initialize();
        List<String> cli = asteriskServer.executeCliCommand("sip show peers");
        for (String string : cli) {
            String sip = string;
            sip = sip.replace(' ', ',');
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            sip = sip.replace(",,", ",");
            System.out.println(sip);
        }
    }

    public static void main(String[] args) throws Exception {
        HelloEvents helloLive = new HelloEvents();
        helloLive.run();
    }
}
