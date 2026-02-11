import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String ciudad;
    ArrayList<Jugador> jugadores=new ArrayList<>();
    //gets y sets

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    //contructor

    public Equipo(String ciudad, String nombre) {
        this.ciudad = ciudad;
        this.nombre = nombre;
    }
    //to string

    @Override
    public String toString() {
        String salida= "Equipo{" +
                "ciudad='" + ciudad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", jugadores[";
        for (Jugador j : jugadores) {
            salida+=(" "+j.getNombre()+" ");
        }
        salida+="]}";
        return salida;
    }
    public  void AddJugador( Jugador j){
        jugadores.add(j);
    }
    public void listarJugadores(){
        for (Jugador j:jugadores)
            System.out.println(j);
    }
    public int Golestotaled(){
        int total = 0;
        for (Jugador j:jugadores)
            total+=j.getNumGoles();
        return total;
    }
    public String maximoGoleador(){
        int i=0;
        int max=0;
        for(Jugador j:jugadores) {
            if(j.getNumGoles()>max){
                max=j.getNumGoles();
                i= jugadores.lastIndexOf(j);
            }
        }
        return jugadores.get(i).getNombre();
    }
    public void mostrarJuagdoresConMasDe(int min){
        for (Jugador j :jugadores){
            if (j.getNumGoles()>min){
                System.out.println(j.getNombre());
            }
        }
    }
}
