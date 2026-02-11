package Ejercicios_de_Archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class E2 {

        public static void main(String[] args) {

            try (BufferedReader br =
                         new BufferedReader(new FileReader("primos.dat"))) {

                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                System.err.println("Error leyendo el fichero");
            }
        }
    }



