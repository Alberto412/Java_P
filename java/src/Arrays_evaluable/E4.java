package Arrays_evaluable;

import java.util.Scanner;

public class E4 {
    static void main(String[] args) {
        double nota=0;
        String nombre="";
        String calificacion = "";

        double[] notas = new double[10];
        String[] alumnos = new String[10];
        String[] calificaciones = new String[10];
        Scanner leer = new Scanner(System.in);
        for (int i=0; i<notas.length;i++){
            boolean correcto=false;
            System.out.println("dame el nombre del alumno");
            nombre=leer.nextLine();
            alumnos[i]=nombre;

            do {
                System.out.println("dame su nota");

                try {
                    nota = leer.nextDouble();
                    if (nota>=0 && nota<5){
                        calificacion="suspenso";
                        correcto=true;
                    }
                    else if (nota>=5 && nota<7) {
                        calificacion="bien";
                        correcto=true;
                    }
                    else if (nota<9 && nota>=7) {
                        calificacion="notable";
                        correcto=true;
                    }
                    else if (nota>=9 && nota<=10) {
                        calificacion="sobresaliente";
                        correcto=true;
                    }
                    else {
                        System.out.println("valor fuera de rango. debe poner una nota entre 0 y 10");
                    }
                } catch (Exception e) {
                    System.out.println("has introducido un valor erroneo");
                    leer.nextLine();
                }
            }
            while (!correcto);
            leer.nextLine();
            notas[i]=nota;
            calificaciones[i]=calificacion;
        }
        for (int i=0; i<notas.length;i++){
            System.out.println("""
                    alumno """+" " + alumnos[i]+" "+ """
                    nota """+" "+ notas[i]+ " "+"""
                    calificacion """+" "+calificaciones[i]);
        }
    }

}
