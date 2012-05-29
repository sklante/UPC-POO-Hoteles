
package modelos;

public class Cuenta {
    private String IdCuenta;
    private String estado;
    private String plan;
    private String hora;
    private int ano;
    private int mes;
    private int dia;
    private Usuario codigoUsuario;

    public Cuenta(String IdCuenta, String estado, String plan, String hora, int dia,String codigoUsuario) {
        this.IdCuenta = IdCuenta;
        this.estado = estado;
        this.plan = plan;
        this.hora = hora;
        this.dia = dia;
        this.codigoUsuario = new Usuario(codigoUsuario);
    }

    public String getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(String IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Usuario getCodigoUsuario() {
        return codigoUsuario;
    }



    
    
}
