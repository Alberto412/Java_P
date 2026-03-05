package ArrayLists;

import java.util.*;

public class main {
    static void main(String[] args) {
        ArrayList<Empleado> empleados= new ArrayList<>();
        empleados.add(new Empleado(25,"juan",2000,"1"));
        empleados.add(new Empleado(27,"juan2",2000,"2"));
        empleados.add(new Empleado(50,"juan3",2000,"3"));
        empleados.add(new Empleado(19,"juan4",2000,"4"));
        empleados.add(new Empleado(25,"juan5",2000,"5"));
        empleados.add(1,new Empleado(65,"juan posicion 2",2000,"6"));
        empleados.trimToSize();
        System.out.println( empleados.get(5).toString());
        System.out.println("tamaño ="+ empleados.size());
        for (Empleado e: empleados){
            System.out.println(e.toString());
        }
        for (int i=0; i< empleados.size();i++){
            System.out.println(empleados.get(i).toString());

        }
        Stack<Empleado> bs= new Stack<>();
        Vector<Empleado> wfef= new Vector<>();
        ArrayList<ArrayList> egvgd= new ArrayList<>();
        egvgd.add(empleados);
        Iterator<Empleado> iterador= empleados.iterator();
        while (iterador.hasNext()){
            String nombre= iterador.next().getNombre();
            System.out.println(nombre);
        }
        ;
        Collections.sort(empleados,Empleado::compareTo);
        empleados.sort(Comparator.comparing(Empleado::getNombre));
        for (Empleado e: empleados){
            System.out.println(e.toString());
        }
    }
}
