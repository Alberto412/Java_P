import java.awt.*;

public class Cartas {
    // atributos
    public int valor;
    private String palo;
    private String figura;
    //gets y sets del valor
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    //gets y sets del palo
    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    //gets y sets del palo

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    //contructor

    public Cartas(String figura, String palo, int valor) {
        this.figura = figura;
        this.palo = palo;
        this.valor = valor;
    }
    //metodo
    public String Color(String color){
        String color_final = "";
        if(color.equals("♠")){
            color_final="\u001B[30m";
        }
        else if (color.equals("♥")) {
            color_final= "\u001B[31m";
        }
        else if (color.equals("♦")) {
            color_final="\u001B[33m";
        }
        else if (color.equals("♣")) {
            color_final="\u001B[1;32m";
        }
        return color_final;

    }
    public String Reset(){
        return "\u001B[0m";
    }
}
