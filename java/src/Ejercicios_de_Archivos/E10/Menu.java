package Ejercicios_de_Archivos.E10;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    int telefono = sc.nextInt();
                    agenda.añadirContacto(new Contacto(nombre, telefono));
                    break;

                case 2:
                    System.out.print("Nombre a eliminar: ");
                    agenda.eliminarContacto(sc.nextLine());
                    break;

                case 3:
                    agenda.mostrarContactos();
                    break;
            }

        } while (opcion != 0);
    }
}
