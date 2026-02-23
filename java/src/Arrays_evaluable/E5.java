package Arrays_evaluable;

import java.util.Scanner;

public class E5 {
    static void main(String[] args) {
        int[][] matriz = new int[3][3];
        boolean creada=false;
        boolean salir=false;
        Scanner leer = new Scanner(System.in);
        do {
            boolean correcto=false;

            do {
                System.out.println("""
                        1. Rellenar TODA la matriz de números
                        2. Suma de una fila que debes poner
                        3. Suma de una columna que debes poner
                        4. Sumar la diagonal principal.
                        5. Sumar la diagonal inversa.
                        6. La media de todos los valores de la matriz.
                        7. Salir
                        """);

                try {
                    int menu = leer.nextInt();
                    switch (menu){
                        case 1:
                            for (int i =0; i<matriz.length;i++){
                                for (int j=0; j<matriz.length;j++){
                                    System.out.println("dame la posicion "+(1+i)+""+(j+1));
                                    matriz[i][j]= leer.nextInt();
                                }
                            }
                            creada= true;
                            correcto=true;
                            break;
                        case 2:   if (!creada) {
                            System.out.println("Primero debes rellenar la matriz");
                            break;
                        }

                            System.out.println("¿Qué fila quieres sumar? (1-3)");
                            int fila = leer.nextInt() - 1;

                            if (fila >= 0 && fila < matriz.length) {
                                int sumaFila = 0;
                                for (int j = 0; j < matriz.length; j++) {
                                    sumaFila += matriz[fila][j];
                                }
                                System.out.println("Suma de la fila = " + sumaFila);
                            } else {
                                System.out.println("Fila incorrecta");
                            }

                            correcto = true;
                            break;
                        case 3:
                            if (!creada) {
                                System.out.println("Primero debes rellenar la matriz");
                                break;
                            }

                            System.out.println("¿Qué columna quieres sumar? (1-3)");
                            int columna = leer.nextInt() - 1;

                            if (columna >= 0 && columna < matriz.length) {
                                int sumaColumna = 0;
                                for (int i = 0; i < matriz.length; i++) {
                                    sumaColumna += matriz[i][columna];
                                }
                                System.out.println("Suma de la columna = " + sumaColumna);
                            } else {
                                System.out.println("Columna incorrecta");
                            }

                            correcto = true;
                            break;
                        case 4:
                            if (!creada) {
                                System.out.println("Primero debes rellenar la matriz");
                                break;
                            }

                            int sumaDiagonalPrincipal = 0;
                            for (int i = 0; i < matriz.length; i++) {
                                sumaDiagonalPrincipal += matriz[i][i];
                            }

                            System.out.println("Suma diagonal principal = " + sumaDiagonalPrincipal);
                            correcto = true;
                            break;
                        case 5:
                            if (!creada) {
                                System.out.println("Primero debes rellenar la matriz");
                                break;
                            }

                            int sumaDiagonalInversa = 0;
                            for (int i = 0; i < matriz.length; i++) {
                                sumaDiagonalInversa += matriz[i][matriz.length - 1 - i];
                            }

                            System.out.println("Suma diagonal inversa = " + sumaDiagonalInversa);
                            correcto = true;
                            break;
                        case 6:
                            if (!creada) {
                                System.out.println("Primero debes rellenar la matriz");
                                break;
                            }

                            int sumaTotal = 0;
                            int totalElementos = matriz.length * matriz.length;

                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz.length; j++) {
                                    sumaTotal += matriz[i][j];
                                }
                            }

                            double media = (double) sumaTotal / totalElementos;

                            System.out.println("Media = " + media);
                            correcto = true;
                            break;
                        case 7:
                            salir = true;
                            correcto = true;
                            break;
                        default:
                            System.out.println("no has introducido el numero en el rango del menu");
                    }
                }
                catch (Exception e) {
                    System.out.println("has introducido un valor erroneo");
                    leer.nextLine();
                }
            }
            while (!correcto);

        }
        while (!salir);
    }
}
