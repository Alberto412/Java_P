package arrays;

import java.util.Random;

public class Matriz_rueba {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        for (int i = 0; matriz.length > i; i++) {
            Random r = new Random();
            matriz[i]= r.ints(5,1,200).toArray();
            for (int j = 0; matriz[i].length > j; j++) {
               // matriz[i][j]=r.nextInt(200);
                System.out.print(" " + matriz[i][j] + " ");

            }
            System.out.println(" ");
        }
    }
}
