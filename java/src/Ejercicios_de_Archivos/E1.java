package Ejercicios_de_Archivos;

import java.io.*;

import java.io.*;

public class E1 {
    public static void main(String[] args) {
        File f = new File("primos.dat");

        try (FileWriter escritor = new FileWriter(f, true)) {
            for(int i = 1; i <= 500; i++) {
                if (esPrimo(i)) {
                    escritor.write(i + "\n");  // ✅ Número + salto de línea
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

/*
import java.io.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("primos.dat"))) {

            for (int i = 2; i <= 500; i++) {
                if (esPrimo(i)) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            System.err.println("Error escribiendo el fichero");
        }
    }

    static boolean esPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

 */
