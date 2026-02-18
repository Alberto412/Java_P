package arrays;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        String[][] matriz = new String[3][2];
        Scanner leer= new Scanner(System.in);
        int actual=0;
        int max=0;
        int maxx = 0;
        int maxy=0;

        for (int i = 0; i < matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                System.out.println("escribe la palabra "+(j+1)+" de la comuna "+(i+1));
                String cad= leer.nextLine();
                matriz[i][j]=cad;
            }
        }
        for (int i = 0; i < matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
               actual=matriz[i][j].length();
                if(actual>max) {
                    max = actual;
                    maxy = j;
                    maxx = i;
                }
            }
        }
        System.out.println(matriz[maxx][maxy]+" es la palabra mas larga");
    }
}
