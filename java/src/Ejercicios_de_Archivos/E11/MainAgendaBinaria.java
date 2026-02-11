package Ejercicios_de_Archivos.E11;

import java.util.Scanner;

public class MainAgendaBinaria {

    public static void main(String[] args) {

        AgendaBinaria agenda = new AgendaBinaria();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nAGENDA BINARIA");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    int telefono = sc.nextInt();
                    agenda.añadir(new Contacto(nombre, telefono));
                    break;

                case 2:
                    System.out.print("Nombre a eliminar: ");
                    String borrar = sc.nextLine();
                    agenda.eliminar(borrar);
                    break;

                case 3:
                    agenda.mostrar();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }
}

