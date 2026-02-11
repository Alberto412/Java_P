package Ejercicios_de_Archivos;

import java.io.*;

public class E9 {
    public static void main(String[] args) {

        int cont = 0, lineaNum = 1;

        try (BufferedReader br =
                     new BufferedReader(new FileReader(args[0]))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(args[1])) {
                    cont++;
                    System.out.println("Línea " + lineaNum);
                }
                lineaNum++;
            }

            System.out.println("Palabra \"" + args[1] +
                    "\" encontrada " + cont + " veces");

        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}

