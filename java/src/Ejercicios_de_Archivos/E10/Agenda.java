package Ejercicios_de_Archivos.E10;

import java.io.*;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> listaContactos;
    private final String FICHERO = "agenda.txt";

    public Agenda() {
        listaContactos = new ArrayList<>();
        cargarAgenda();
    }

    // Leer el fichero y cargar el ArrayList
    private void cargarAgenda() {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(FICHERO))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombre = partes[0];
                int telefono = Integer.parseInt(partes[1]);
                listaContactos.add(new Contacto(nombre, telefono));
            }

        } catch (FileNotFoundException e) {
            // Si no existe, no pasa nada
        } catch (IOException e) {
            System.err.println("Error al leer la agenda");
        }
    }

    public void añadirContacto(Contacto c) {
        listaContactos.add(c);

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(FICHERO, true))) {

            bw.write(c.toString());
            bw.newLine();

        } catch (IOException e) {
            System.err.println("Error al escribir");
        }
    }

    public void eliminarContacto(String nombre) {
        listaContactos.removeIf(c -> c.getNombre().equalsIgnoreCase(nombre));
        guardarAgenda();
    }

    public void mostrarContactos() {
        for (Contacto c : listaContactos) {
            System.out.println(c.getNombre() + " - " + c.getTelefono());
        }
    }

    private void guardarAgenda() {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(FICHERO))) {

            for (Contacto c : listaContactos) {
                bw.write(c.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            System.err.println("Error guardando agenda");
        }
    }
}

