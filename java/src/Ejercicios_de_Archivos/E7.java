package Ejercicios_de_Archivos;

import java.io.*;

public class E7 {
    public static void main(String[] args) {

        int suma = 0, cont = 0;

        try (BufferedReader br =
                     new BufferedReader(new FileReader(args[0]))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                int n = Integer.parseInt(linea);
                System.out.println(n);
                suma += n;
                cont++;
            }

            System.out.println("Media: " + (double) suma / cont);

        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}

