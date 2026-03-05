package Enums;

import java.util.EnumMap;
import java.util.HashMap;

public class CochePrueba {
    static void main(String[] args) {
        Coche c1 =new Coche("12e4g3u",Modelo.FORD);
        Coche c2 =new Coche("ddwd43",Modelo.FIAT);
        Coche c3 =new Coche("e5y6hy5",Modelo.SEAT);
        HashMap<String,Coche> coches=new HashMap<>();
        coches.put(c1.getMatricula(),c1);
        coches.put(c2.getMatricula(),c2);
        coches.put(c3.getMatricula(),c3);
        System.out.println(coches.get(c1.getMatricula()));
        System.out.println(coches.containsKey(c2.getMatricula()));
        System.out.println(coches.size());
        System.out.println(coches.keySet());
        System.out.println(coches.values());
        System.out.println(coches.entrySet());
        System.out.println(c1.getMarcas());
        EnumMap<Modelo,Integer> contador=new EnumMap<>(Modelo.class);
        for (Modelo m:Modelo.values()){
            contador.put(m,0);
        }
       /* for (Coche c:coches.values()){
            contador.put(c.getModelo_E(),contador.get(c.getModelo_E()+1));
        }
        System.out.println(contador);

        */

    }
}
