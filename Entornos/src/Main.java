import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           Jugador j1=new Jugador(36, "pedro",35);
           Jugador j2= new Jugador(3,"pepe",33);
           Jugador j3= new Jugador(33,"juan",39);
           Equipo e=new Equipo("Cordoba", "Cordoba FC");
           e.AddJugador(j1);
           e.AddJugador(j2);
           e.AddJugador(j3);
           System.out.println(e);
           System.out.println(e.Golestotaled());
           System.out.println(e.maximoGoleador());
           e.mostrarJuagdoresConMasDe(34);

    }
}
