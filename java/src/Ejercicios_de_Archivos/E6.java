package Ejercicios_de_Archivos;

import java.io.*;

public class E6 {
    public static void main(String[] args) {

        try (
                BufferedReader f1 = new BufferedReader(new FileReader("fichero1.txt"));
                BufferedReader f2 = new BufferedReader(new FileReader("fichero2.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"))
        ) {

            String l1, l2;
            while ((l1 = f1.readLine()) != null &&
                    (l2 = f2.readLine()) != null) {

                bw.write(l1 + " " + l2);
                bw.newLine();
            }

        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}

