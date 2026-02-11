package Ejercicios_de_Archivos;

import java.io.*;
import java.util.*;

public class E8 {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(args[0]))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                palabras.add(linea);
            }

        } catch (IOException e) {
            System.err.println("Error");
        }

        Collections.sort(palabras);

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter(args[0].replace(".txt", "_sort.txt")))) {

            for (String p : palabras) {
                bw.write(p);
                bw.newLine();
            }

        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}
