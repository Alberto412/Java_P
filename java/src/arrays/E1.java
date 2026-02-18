package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        boolean salir=false;
        Scanner leer=new Scanner(System.in);
        do {
            int[] arrDig1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] arrDig2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
            char[] arrCh1 = {'a', 'e', 'i', 'o', 'u'};
            char[] arrCh2 = {'a', 'b', 'c', 'd', 'e'};
            StringBuilder cadCh1 = new StringBuilder();
            StringBuilder cadCh2 = new StringBuilder();
            StringBuilder cadCh3 = new StringBuilder();
            System.out.println("""
                    1.cadena de caracteres vocales
                    2.cadena de caracteres cinco primeras letras del abecedario
                    3.cadena de caracteres cinco primeras letras del abecedario y vocales
                    4.suma de los arrays de numeros
                    5.salir
                    """);
            int menu= leer.nextInt();
            switch (menu){
                case 1:
                    for (char a : arrCh1) {
                    cadCh1.append(a);

                }
                    System.out.println(cadCh1);
                break;
                case 2:
                    for (char a : arrCh2) {
                        cadCh2.append(a);
                    }
                    System.out.println(cadCh2);
                break;
                case 3:
                    for (int i = 0; i < arrCh2.length; i++) {
                        cadCh3.append(arrCh1[i]);
                        cadCh3.append(arrCh2[i]);

                    }
                    System.out.println(cadCh3);
                break;
                case 4:
                    for (int i = 0; i < arrDig2.length; i++) {
                        System.out.print(" "+(arrDig2[i] + arrDig1[i])+" ");

                    }
                    System.out.println("");
                break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("numeros fuera de rango");

            }
        }while (!salir);

    }
}
