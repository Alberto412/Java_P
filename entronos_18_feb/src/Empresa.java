public class Empresa {
    //atributos
    private String nombre;
    private String direccion;
    //gets y sets

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //to String

    @Override
    public String toString() {
        return "Empresa{" +
                "direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    //contructor

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    //metodos
    public boolean esDelaciudad(String ciudad){
        boolean esDelaciudad=false;
        if (ciudad.contains(this.direccion)){
            esDelaciudad=true;
        }
        return esDelaciudad;
    }
}
