/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author SOPORTE-IT 03
 */
public class sipEntity {

    private String Name;
    private String UserName;
    private String Host;
    private String Dyn;
    private String Nat;
    private String Acl;
    private String Port;
    private String status;
    private String gif;

    public String getGif() {
        return gif;
    }

    public void setGif(String gif) {
        this.gif = gif;
    }

    public String getAcl() {
        return Acl;
    }

    public void setAcl(String Acl) {
        this.Acl = Acl;
    }

    public String getDyn() {
        return Dyn;
    }

    public void setDyn(String Dyn) {
        this.Dyn = Dyn;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNat() {
        return Nat;
    }

    public void setNat(String Nat) {
        this.Nat = Nat;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String Port) {
        this.Port = Port;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return getUserName();
    }
}
