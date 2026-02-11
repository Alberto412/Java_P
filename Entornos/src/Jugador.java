public class Jugador {
    //atributos
    private String nombre;
    private int dorsal;
    private int numGoles;
    //gets y sets


    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }
    //contructor


    public Jugador() {
    }

    public Jugador(int dorsal, String nombre, int numGoles) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.numGoles = numGoles;
    }
    public void MarcarGoles (){
        this.setNumGoles(getNumGoles()+1);
    }

    //to string

    @Override
    public String toString() {
        return "Jugador{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", numGoles=" + numGoles +
                '}';
    }
}
