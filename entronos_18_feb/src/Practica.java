public class Practica {
    //atributos
    private String estado;
    private String fecha_inicio;
    private String fecha_fin;
    private Alumno alumno;
    private Empresa empresa;
//gets y sets
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    //to string

    @Override
    public String toString() {
        return "Practica{" +
                "alumno=" + alumno +
                ", estado='" + estado + '\'' +
                ", fecha_inicio='" + fecha_inicio + '\'' +
                ", fecha_fin='" + fecha_fin + '\'' +
                ", empresa=" + empresa +
                '}';
    }
    //contructor
    public Practica(Alumno alumno, Empresa empresa, String estado, String fecha_fin, String fecha_inicio) {
        this.alumno = alumno;
        this.empresa = empresa;
        this.estado = estado;
        this.fecha_fin = fecha_fin;
        this.fecha_inicio = fecha_inicio;
    }
    //metodos
    public boolean  estaActiva(){
        if (this.estado.equalsIgnoreCase("ACTIVA")){
            return true;
        }
        else return false;
    }
    public  void iniciar(){
        this.estado="ACTIVA";

    }
    public  void finalizar(){
        this.estado="FINALIZADA";

    }
    public String resumen(){
        return this.alumno.getNombre()+"  realiza prácticas en "+this.empresa.getNombre()+" ("+this.estado+")";
    }
}
