package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        boolean salir=false;
        boolean cas1=false;
        boolean cas2=false;
        boolean cas3=false;
        boolean cas4=false;
        Scanner leer=new Scanner(System.in);
        do {
            @Deprecated
            int[] arrDig1 =new int[10];
            int[] arrDig2 = new int[10];
            char[] arrCh1=new char[5];
            char[] arrCh2=new char[5];
            StringBuilder cadCh1 = new StringBuilder();
            StringBuilder cadCh2 = new StringBuilder();
            StringBuilder cadCh3 = new StringBuilder();
            System.out.println("""
                    1.definir  numeros del 0 al 9
                    2.definir  numeros del 9 al 0
                    3.definir caracteres vocales
                    4.definir cinco primeras letras del abecedario
                    5.cadena de caracteres vocales
                    6.cadena de caracteres cinco primeras letras del abecedario
                    7.cadena de caracteres cinco primeras letras del abecedario y vocales
                    8.suma de los arrays de numeros
                    9.salir
                    """);
            int menu= leer.nextInt();
            switch (menu){
                case 1:
                    for (int i :arrDig1){
                        int c=0;
                        i=c;
                        c++;
                    }
                    cas1=true;
                    break;
                case 2:
                    for (int i :arrDig2){
                        int c=9;
                        i=c;
                        c--;
                    }
                    cas2=true;
                    break;
                case 3:  arrCh1 = new char[]{'a', 'e', 'i', 'o', 'u'};
                cas3=true;
                break;
                case 4: arrCh2 = new char[]{'a', 'b', 'c', 'd', 'e'};
                cas4=true;
                break;
                case 5:
                    if (cas3) {
                        for (char a : arrCh1) {
                            cadCh1.append(a);
                        }
                        System.out.println(cadCh1);
                    }
                    else {
                        System.out.println("define primero con el boton 3");
                    }
                break;
                case 6:
                    if (cas4) {
                        for (char a : arrCh2) {
                            cadCh2.append(a);
                        }
                        System.out.println(cadCh2);
                    }
                    else {
                        System.out.println("define primero con el boton 4");
                    }
                break;
                case 7:
                    if (cas4 && cas3) {
                        for (int i = 0; i < arrCh2.length; i++) {
                            cadCh3.append(arrCh1[i]);
                            cadCh3.append(arrCh2[i]);

                        }
                        System.out.println(cadCh3);
                    }
                    else {
                        System.out.println("define primero con el boton 3 y 4");
                    }
                break;
                case 8:
                    if (cas1 && cas2) {
                        for (int i = 0; i < arrDig2.length; i++) {
                            System.out.print(" " + (arrDig2[i] + arrDig1[i]) + " ");

                        }
                        System.out.println("");
                    }
                    else {
                        System.out.println("definir primero con el boton 1 y 2");
                    }
                break;
                case 9:
                    salir=true;
                    break;
                default:
                    System.out.println("numeros fuera de rango");

            }
        }while (!salir);

    }
}
