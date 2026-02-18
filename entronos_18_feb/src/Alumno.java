public class Alumno {
    //atributos
    private String nombre;
    private String curso;
    //gets y sets
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //contructor

    public Alumno(String curso, String nombre) {
        this.curso = curso;
        this.nombre = nombre;
    }
    //to string

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    //metodos
    public boolean esDelCurso(String curso){
        boolean esDelCurso=false;
        if (curso.equalsIgnoreCase(this.curso)){
            esDelCurso=true;
        }
        return esDelCurso;
    }
    public  String nombreEnMayusculas(){
        String nombreEnMayusculas=this.nombre.toUpperCase();
        return nombreEnMayusculas;
    }
}
