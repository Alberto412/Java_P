package Ejercicios_de_Archivos;
import java.io.*;
import java.time.LocalTime;
import java.util.Random;

public class E5 {
    public static void main(String[] args) {

        String nombre = LocalTime.now().toString().replace(":", "_") + ".txt";
        Random r = new Random();

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(nombre))) {

            for (int i = 0; i < 5; i++) {
                bw.write(String.valueOf(r.nextInt(101)));
                bw.newLine();
            }

        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}

