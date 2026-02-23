package Arrays_evaluable;

import java.util.Scanner;

public class E3 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("dame el numero de columnas");
        int colm= leer.nextInt();
        System.out.println("dame el numero de filas");
        int fil= leer.nextInt();
        int[][] matriz = new int[fil][colm];
        int[] A= new int[colm];
        int[] B= new int[fil];
        int totalB = 0;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.println("Introduce un numero para [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
        int cont=0;
        for (int[] fila: matriz){

            for (int i :fila){
                totalB+=i;
            }
            B[cont]=totalB;
            cont++;
            totalB=0;

        }
        for (int j = 0; j < colm; j++) {
            int suma = 0;
            for (int i = 0; i < fil; i++) {
                suma += matriz[i][j];
            }
            A[j] = suma;
        }
        for (int[] i : matriz){
            for (int a: i){
                System.out.print("  "+a+"  ");
            }
            System.out.println();
        }
        System.out.println("suma de columnas");
        for (int a: A){
            System.out.print("  "+a+"  ");
        }
        System.out.println();
        System.out.println("suma de Filas");
        for (int a: B){
            System.out.print("  "+a+"  ");
        }



    }
}
