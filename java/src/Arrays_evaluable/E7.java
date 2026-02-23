package Arrays_evaluable;

import java.util.Scanner;

public class E7 {

        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);

            int[][] matriz = ArrayBi.generaArrayBiInt(5,5,10,50);

            System.out.println("Matriz 5x5:");
            for(int i=0;i<5;i++) {
                for(int j=0;j<5;j++) System.out.printf("%3d ", matriz[i][j]);
                System.out.println();
            }


            System.out.println("\nPuntos de silla encontrados:");
            boolean hayPuntos = false;
            for(int i=0;i<5;i++) {
                for(int j=0;j<5;j++) {
                    if(ArrayBi.esPuntoDeSilla(matriz,i,j)) {
                        System.out.println("Valor: "+matriz[i][j]+" en posición ("+i+","+j+")");
                        hayPuntos = true;
                    }
                }
            }
            if(!hayPuntos) System.out.println("No se encontraron puntos de silla.");


            int fila, col;
            String dir;
            do {
                System.out.print("\nIntroduce fila (0-4) para la diagonal: ");
                fila = leer.nextInt();
            } while(fila<0 || fila>4);
            do {
                System.out.print("Introduce columna (0-4) para la diagonal: ");
                col = leer.nextInt();
            } while(col<0 || col>4);

            do {
                System.out.print("Introduce dirección (nose o neso): ");
                dir = leer.next();
            } while(!dir.equals("nose") && !dir.equals("neso"));

            int[] diagonal = ArrayBi.diagonal(matriz,fila,col,dir);
            System.out.println("Diagonal extraída:");
            Array.muestraArrayInt(diagonal);
        }
    }

