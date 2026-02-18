package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {

        String[][] matriz = new String[4][4];
        Scanner leer= new Scanner(System.in);
        int actual=0;
        int max=0;
        int voc = 0;
        ArrayList<Integer> X= new ArrayList<>();
        ArrayList<Integer> Y= new ArrayList<>();
        int tem=0;


        for (int i = 0; i < matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                System.out.println("escribe la palabra "+(j+1)+" de la comuna "+(i+1));
                String cad= leer.nextLine();
                matriz[i][j]=cad;
            }
        }
        for (int i = 0; i < matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                voc=voc+ matriz[i][j].toLowerCase().indexOf('a');
                if (voc<0){ voc++;}
                tem=voc;
                voc=voc+matriz[i][j].toLowerCase().indexOf('e');
                if (voc<tem){ voc=tem;}
                tem=voc;
                voc=voc+matriz[i][j].toLowerCase().indexOf('i');
                if (voc<tem){ voc=tem;}
                tem=voc;
                voc=voc+matriz[i][j].toLowerCase().indexOf('o');
                if (voc<tem){ voc=tem;}
                tem=voc;
                voc=voc+matriz[i][j].toLowerCase().indexOf('u');
                if (voc<tem){ voc=tem;}
                tem=voc;
                if(voc>=5){
                    X.add(i);
                    Y.add(j);
                }

            }
        }
        int indice=0;
        for (int a: X){
            int x=a;
            indice= X.lastIndexOf(a);
            System.out.println(matriz[a][Y.get(indice)]);
        }

    }
}
