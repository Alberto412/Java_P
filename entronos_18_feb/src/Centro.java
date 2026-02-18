import java.util.ArrayList;

public class Centro {
    //atributos
    private String nombre;
    private ArrayList<Alumno> alumnos=new ArrayList<>();
    private ArrayList<Empresa> empresas=new ArrayList<>();
    private ArrayList<Practica> practicas=new ArrayList<>();
    //gets y sets

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Practica> getPracticas() {
        return practicas;
    }

    public void setPracticas(ArrayList<Practica> practicas) {
        this.practicas = practicas;
    }
    //to string
    @Override
    public String toString() {
        return "Centro{" +
                "alumnos=" + alumnos +
                ", nombre='" + nombre + '\'' +
                ", empresas=" + empresas +
                ", practicas=" + practicas +
                '}';
    }
    //contructor
    public Centro() {
    }
    //metodos
    public int totalPracticasActivas(){
        int activas=0;
        for (Practica p:practicas){
            if (p.getEstado().equals("ACTIVA")){
                activas++;
            }
        }
        return activas;
    }
    public ArrayList<Alumno> alumnosConPractica() {
        ArrayList<Alumno> alumnosConPractica=new ArrayList<>();
        for (Practica p: practicas){
            alumnosConPractica.add(p.getAlumno());
        }
        return alumnosConPractica;
    }
    public void add_alumnos(Alumno a){
        alumnos.add(a);
    }
    public void add_empresa(Empresa e){
        empresas.add(e);
    }
    public void add_Practica(Practica p){
        practicas.add(p);
    }
    public void Listado(){
        for (Alumno a:alumnos){
            System.out.println(a.getNombre());
        }
    }
    public void ListadoP(){
        for (Practica p:practicas){
            System.out.println(p.resumen());
        }
    }
    public void ListadoC(String c){
        for (Empresa e:empresas){
            if (e.esDelaciudad(c)){
                System.out.println(e.getNombre());
            }
        }
    }
    public ArrayList<Alumno> alumnosSinPractica(){
        ArrayList<Alumno> alumnosSinPractica= new ArrayList<>();
        boolean practica=false;
        for (Alumno a : alumnos){
            for (Practica p :practicas){
                if (a.getNombre().equalsIgnoreCase(p.getAlumno().getNombre())){
                    practica=true;
                }
            }
            if (practica==false){alumnosSinPractica.add(a);}
        }
        return alumnosSinPractica;
    }

}
