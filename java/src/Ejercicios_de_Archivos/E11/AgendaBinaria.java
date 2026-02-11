package Ejercicios_de_Archivos.E11;

import java.io.*;
import java.util.ArrayList;

public class AgendaBinaria {

    private ArrayList<Contacto> lista;
    private final String FICHERO = "agenda.dat";

    public AgendaBinaria() {
        lista = new ArrayList<>();
        cargar();
    }

    private void cargar() {
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(FICHERO))) {

            while (true) {
                String nombre = dis.readUTF();
                int telefono = dis.readInt();
                lista.add(new Contacto(nombre, telefono));
            }

        } catch (EOFException e) {
            // fin normal
        } catch (IOException e) {
            System.err.println("Error leyendo");
        }
    }

    public void añadir(Contacto c) {
        lista.add(c);

        try (DataOutputStream dos =
                     new DataOutputStream(
                             new FileOutputStream(FICHERO, true))) {

            dos.writeUTF(c.getNombre());
            dos.writeInt(c.getTelefono());

        } catch (IOException e) {
            System.err.println("Error escribiendo");
        }
    }

    public void eliminar(String nombre) {
        lista.removeIf(c -> c.getNombre().equalsIgnoreCase(nombre));
        guardarTodo();
    }

    private void guardarTodo() {
        try (DataOutputStream dos =
                     new DataOutputStream(
                             new FileOutputStream(FICHERO))) {

            for (Contacto c : lista) {
                dos.writeUTF(c.getNombre());
                dos.writeInt(c.getTelefono());
            }

        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public void mostrar() {
        for (Contacto c : lista) {
            System.out.println(c.getNombre() + " - " + c.getTelefono());
        }
    }
}
