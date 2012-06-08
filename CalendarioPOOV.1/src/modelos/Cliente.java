

package modelos;


public class Cliente implements InterfaceGeneral{
    
    private static int id=1;
    private int idCliente;
    private String nombre;
    private String apellido;
    private TipoCliente tipoCliente;
    private String correoElectronico;
    private String tel;
    private String fax;
    private String codigo;
    private String contrasena;
    private String estado;
    
    public Cliente(){
    }
    
    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido= apellido;
        this.idCliente = id;
        id++;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    

    
    public Cliente(String nombre, String apellido, TipoCliente tipoCliente){
        this.nombre = nombre;
        this.apellido= apellido;
        this.tipoCliente = tipoCliente;
        this.idCliente = id;
        id++;
    }
    
    public Cliente(String codigo, String correo, String contrasenia, String estado){
        this.codigo=codigo;
        this.correoElectronico=correo;
        this.contrasena=contrasenia;
        this.estado=estado;
    }
    
/*   public boolean validarCorreo(String correoe){
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

    }*/

    
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String toString(){
        return this.nombre + " " + this.apellido;
    }

    @Override
    public boolean isErrorInt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isErrorObject() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarIgualesObject(Object variable1, Object variable2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarNulos(Object campo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarNumerosValidos(int numero) {
        throw new UnsupportedOperationException("Not supported yet.");
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
}
