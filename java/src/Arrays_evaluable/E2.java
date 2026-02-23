package Arrays_evaluable;

import java.util.Random;

public class E2 {
    static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[] primeraC =new int[3];
        int[] ultimaC =new int[3];
        Random r = new Random();
        for (int i = 0; matriz.length > i; i++) {
          matriz[i]=r.ints(3,200,500).toArray();
        }
        for (int i = 0; matriz.length > i; i++) {
            primeraC[i]=matriz[i][0];
            ultimaC[i]=matriz[i][2];
        }
        System.out.println(" -- matriz antigua -- ");
        for (int[] i : matriz){
           for (int a: i){
               System.out.print("  "+a+"  ");
           }
            System.out.println();
        }
        for (int i = 0; matriz.length > i; i++) {

            matriz[i][2]=primeraC[i];
            matriz[i][0]= ultimaC[i];
        }
        System.out.println(" --  matriz nueva  -- ");
        for (int[] i : matriz){
            for (int a: i){
                System.out.print("  "+a+"  ");
            }
            System.out.println();
        }

    }
}
