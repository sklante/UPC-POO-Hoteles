
package modelos;


public class Usuario {
    private String codigoUsuario;
    private String nombre;
    private String apellido;
    private String correoe;
    private String password;

    public Usuario(String codigoUsuario, String nombre, String apellido, String correoe, String password) {
        this.codigoUsuario = codigoUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoe = correoe;
        this.password = password;
    }
    public Usuario(String correoe, String password) {
        this.correoe = correoe;
        this.password = password;
    }


    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreoe() {
        return correoe;
    }

    public void setCorreoe(String correoe) {
        this.correoe = correoe;
    }

    public boolean verificaCorreo(String correoe){
        if(correoe != null){
            return true;
        }
        return false;
    }

    public boolean validarCorreo(String correoe){
        boolean valido = false;
        char acomparar='@';
	int veces=0;
	char []caracteres=correoe.toCharArray();
	for(int i=0;i<=caracteres.length-1;i++){
            if(acomparar ==caracteres[i]){
		veces++;
		}
	}
        if(veces == 1){
            valido = true;
        }
        return valido;

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
    
}
