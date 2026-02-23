package Arrays_evaluable;

import java.util.Scanner;

public class E6 {

        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);


            int[] array = Array.generaArrayInt(20, 1, 100);


            System.out.println("Array original:");
            Array.muestraArrayInt(array);

            int[] invertido = Array.volteaArrayInt(array);
            System.out.println("Array invertido:");
            Array.muestraArrayInt(invertido);

            System.out.print("Introduce un número para buscar: ");
            int num = leer.nextInt();
            int posicion = Array.posicionEnArrayInt(array, num);
            if(posicion != -1)
                System.out.println("Número encontrado en la posición: "+posicion);
            else
                System.out.println("Número no está en el array.");
        }
    }

