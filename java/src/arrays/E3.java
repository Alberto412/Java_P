package arrays;

import java.sql.Array;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        boolean salir=false;
        Scanner leer= new Scanner(System.in);
        do {
            System.out.println("""
                    1. definir el tamaño del array.
                    2.salir
                    """);
            int menu= leer.nextInt();
            switch (menu){
                case 1:
                    System.out.println("define el tamaño del array");
                    int definir= leer.nextInt();
                    String bufcl=leer.nextLine();
                    String[] array = new String[definir];
                    int[] cont = new int[definir];
                    for (int i=0;i<array.length;i++){
                        System.out.println("dame el valor para la posicion "+(i+1));
                        String n= leer.nextLine();
                        array[i]=n;
                        cont[i]=n.length();
                    }
                    System.out.println("¿quieres mostrar por terminal el array?");
                    int menu1= leer.nextInt();
                    if(menu1==1){
                        int total=0;
                        for (int a: cont){

                            System.out.print(" "+a+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:salir=true;
                    break;
                default:
                    System.out.println("numero incorrecto");
            }

        }
        while (!salir);
    }

}
