package Ejercicios_de_Archivos.E11;

public class Contacto {

    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + "," + telefono;
    }
}

