package Ejercicios_de_Archivos;

import java.io.*;

public class E4 {
    public static void main(String[] args) {

        try (
                BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
                BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
                BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]))
        ) {

            String l1 = null;
            String l2 = null;

            while (true) {
                l1 = br1.readLine();
                l2 = br2.readLine();

                if (l1 == null && l2 == null) {
                    break;
                }

                if (l1 != null) {
                    bw.write(l1);
                    bw.newLine();
                }

                if (l2 != null) {
                    bw.write(l2);
                    bw.newLine();
                }
            }


        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}

