public class Prestamo {
    //atributos
    private String codigo;
    private String dias;
    private boolean ACTIVO;
    //gets
    public boolean isACTIVO() {
        return ACTIVO;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDias() {
        return dias;
    }
    //sets

    public void setACTIVO(boolean ACTIVO) {
        this.ACTIVO = ACTIVO;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
    public void renovar(){
        this.dias+=7;
    }
    public void cerrar(){
        this.ACTIVO=false;
        System.out.println("prestamo cerrado");    }

}
