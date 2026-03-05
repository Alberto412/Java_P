package Enums;

import java.util.EnumMap;

public class Coche {
    //atributos
    private String matricula;
    private Modelo modelo_E;
    private String modelo_S;
    private int edad;
    private EnumMap<Modelo, String> marcas = new EnumMap<>(Modelo.class);
    //contructor

    public Coche(String matricula, Modelo modelo_E) {
        this.matricula = matricula;
        this.modelo_E = modelo_E;
        asgnacion();
    }
    //to string

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo_E=" + modelo_E +
                ", modelo_S='" + modelo_S + '\'' +
                "edad ="+edad+
                '}';
    }
    //metodos

    public void asgnacion(){

           marcas.put(Modelo.FIAT,"fiat");
           marcas.put(Modelo.FORD,"ford");
           marcas.put(Modelo.SEAT,"seat");
           modelo_S=marcas.get(this.modelo_E);



    }
  //gets y sets


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo_E() {
        return modelo_E;
    }

    public void setModelo_E(Modelo modelo_E) {
        this.modelo_E = modelo_E;
    }

    public String getModelo_S() {
        return modelo_S;
    }

    public void setModelo_S(String modelo_S) {
        this.modelo_S = modelo_S;
    }

    public EnumMap<Modelo, String> getMarcas() {
        return marcas;
    }

    public void setMarcas(EnumMap<Modelo, String> marcas) {
        this.marcas = marcas;
    }
}
