package Ejercicios_de_Archivos;

import java.io.*;

public class E3 {
    public static void main(String[] args) {

        int suma = 0;

        try (BufferedReader br =
                     new BufferedReader(new FileReader("numeros.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                int n = Integer.parseInt(linea);
                System.out.println(n);
                suma += n;
            }

            System.out.println("Suma total: " + suma);

        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}

