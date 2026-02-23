package Arrays_evaluable;

import java.util.Scanner;

public class E1 {
    static void main() {
        Scanner leer =new Scanner(System.in);
        int[] array = new int[10];
        for (int i=0; i<array.length;i++){
            System.out.println("dame el valor "+(i+1));
            int n = leer.nextInt();
            array[i]=n;
        }
        int total=0;

        for (int i=0; i<array.length;i++){
            if(array[i]%2==0){
                total+=array[i];
            }
        }
        System.out.println("el total de la suma de los numeros pares es "+total);

    }

}
