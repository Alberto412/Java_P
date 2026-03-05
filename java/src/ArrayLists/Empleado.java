package ArrayLists;

import java.util.ArrayList;
import java.util.Comparator;

public class Empleado implements Comparable<Empleado>, Comparator<Empleado> {
    //atributos
    private String nombre;
    private int edad;
    private String dni;
    private double salario;
    private static final double mit=1221;
    //gets y sets
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        boolean correcto = false;
        do {
            if (edad < 16 || edad > 68) {
                System.out.println("edad invalida. vuelva a introducirlo");

            } else{
                this.edad = edad;
                correcto=true;
            }
        }
        while (!correcto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSalario(double salario) {
        boolean correcto = false;
        do {
            if (salario > 1221) {
                this.salario = salario;
                correcto=true;
            } else if (salario>3000) {
                System.out.println("cobra demasiado");
            } else System.out.println("salario por debajo del salario minimo");
        }
        while (!correcto);
    }
    // contructor
    public Empleado(int edad, String nombre, double salario, String dni) {
       setEdad(edad);
       setSalario(salario);
       this.nombre = nombre;
       this.dni=dni;
    }
    //to string

    @Override
    public String toString() {
        return "Empleado{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
    //metodos
    public static void contartar(ArrayList<Empleado> empleados, String nombre, int edad, String dni ) {
        empleados.add(new Empleado(edad,nombre,mit,dni));
    }
    public static void  despedir(ArrayList<Empleado> empleados, String dni){
        int index = 0;
            for (Empleado e: empleados){
                if (dni.equalsIgnoreCase(e.getDni())){
                    index= empleados.indexOf(e);
                }
            }
        empleados.remove(index);
        System.out.println(" ciao ");
    }



    @Override
    public int compareTo(Empleado empleado) {
        return this.edad -empleado.edad;
    }

    @Override
    public int compare(Empleado empleado, Empleado t1) {
        return (empleado.nombre).compareTo(t1.getNombre());
    }
}
