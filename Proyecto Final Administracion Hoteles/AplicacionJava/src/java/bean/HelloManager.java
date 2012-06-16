/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.ManagerConnectionFactory;
import org.asteriskjava.manager.TimeoutException;
import org.asteriskjava.manager.action.OriginateAction;
import org.asteriskjava.manager.action.SipShowPeerAction;
import org.asteriskjava.manager.event.PeerEntryEvent;
import org.asteriskjava.manager.event.PeerStatusEvent;
import org.asteriskjava.manager.response.ManagerResponse;

public class HelloManager
{
    private ManagerConnection managerConnection;

    public HelloManager() throws IOException
    {
        ManagerConnectionFactory factory = new ManagerConnectionFactory("192.168.6.106", "AstAmi", "123456");
        this.managerConnection=factory.createManagerConnection();
        
    }

    public void run() throws IOException, AuthenticationFailedException,
            TimeoutException
    {
//        OriginateAction originateAction;
//        ManagerResponse originateResponse;
//
//        originateAction = new OriginateAction();
//        originateAction.setChannel("SIP/1300");
//        originateAction.setContext("from-internal");
//        originateAction.setExten("1200");
//        originateAction.setPriority(new Integer(1));
//        originateAction.setTimeout(new Integer(30000));
        SipShowPeerAction sspa = new SipShowPeerAction("1300");
        PeerEntryEvent pee = new PeerEntryEvent(sspa);
        PeerStatusEvent pse = new PeerStatusEvent(sspa);
        OriginateAction oria = new OriginateAction();
        
        // connect to Asterisk and log in
        managerConnection.login();

        // send the originate action and wait for a maximum of 30 seconds for Asterisk
        // to send a reply
//        originateResponse = managerConnection.sendAction(sspa, 30000);

        // print out whether the originate succeeded or not
        System.out.println(pee.getStatus()+" - "+pse.getPeerStatus());

        // and finally log off and disconnect
        managerConnection.logoff();
    }

    public static void main(String[] args) throws Exception
    {
        HelloManager helloManager;

        helloManager = new HelloManager();
        helloManager.run();
    }
}
