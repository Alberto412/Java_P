import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Definitive_edition_black_Jack_Main {
    public static void main(String[] args) {
        //variables generales
        boolean salir= false;
        final String ANSI_RESET  = "\u001B[0m";
        final String ANSI_RED    = "\u001B[31m";
        final String ANSI_GREEN  = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE   = "\u001B[34m";
        //carta media
        Cartas carta_extraida= new Cartas("k","♠",2);
        int n =1;
        // c es un contador de cartad de valor diez
        int c=0;
        do {
            //inicializacion y creacion
            Scanner leer = new Scanner(System.in);
            // Declaramos el ArrayList para la baraja
            ArrayList<Cartas> Baraja = new ArrayList<>();
            for (int numero = 1; numero < 53; numero++) {
                //asignacion del palo
                String p="♠";
                String f=null;

                if (numero<=13){

                    p="♠";
                }
                else if (numero>13 && numero<=26) {
                    p="♥";

                }
                else if (numero>26 && numero<=39) {
                    p="♦";

                }
                else {
                    p="♣";

                }
                //asignacion de la figura
                if (numero==11 || numero==24 || numero==37 || numero==50){
                   f="J";
                }
                else if (numero==12 || numero==25 || numero==38 || numero==51) {
                    f="Q";
                }
                else if (numero==13 || numero==26 || numero==39 || numero==52) {
                    f="K";
                }
                else if (numero==1 || numero==14 || numero==27 || numero==40) {
                    f="A";
                    
                } else{
                    f=null;
                }
                if(n>=10 && c>3){
                    n=1;
                    c=0;

                }
                else if(n>=10 && c<=3){
                    n=10;
                    c++;
                }

                Baraja.add(new Cartas(f,p,n));
                n++;

            }
            //fin de la baraja
            //empieza el sisitema
            // Lógica del juego
            int comodinesJugador1 = 0;
            int comodinesJugador2 = 0;
            boolean plantarse = false;
            int contador1 = 0;
            int contador2 = 0;
            int total1 = 0;
            int total2 = 0;
            boolean blackJack1 = false;
            boolean blackJack2 = false;
            boolean perder1 = false;
            boolean perder2 = false;


            //inicio del jugador 1

            while (contador1 < 2) {
                System.out.println("turno del jugador uno");
                // Extraer una carta aleatoria y eliminarla
                Random rand = new Random();
                int indiceAleatorio = rand.nextInt(Baraja.size());
                carta_extraida= Baraja.remove(indiceAleatorio);
                if (carta_extraida.getFigura()!=null){
                    System.out.println("┌─────────┐"+"\n"+"│" + carta_extraida.Color(carta_extraida.getPalo())+carta_extraida.getFigura()+carta_extraida.Reset() + "        │"+"\n"+ "│         │"+"\n"+ "│    " +carta_extraida.Color(carta_extraida.getPalo())+ carta_extraida.getPalo() +carta_extraida.Reset()+ "    │"+"\n"+ "│         │"+ "\n"+"│" + carta_extraida.Color(carta_extraida.getPalo())+carta_extraida.getFigura()+carta_extraida.Reset() + "        │"+"\n"+ "└─────────┘");

                ;}
                else if (carta_extraida.getValor()==10) {
                    System.out.println("┌─────────┐" + "\n" + "│" + carta_extraida.getValor() + "       │" + "\n" + "│         │" + "\n" + "│    " + carta_extraida.getPalo() + "    │" + "\n" + "│         │" + "\n" + "│" + carta_extraida.getValor() + "       │" + "\n" + "└─────────┘");

                }
                else {
                    System.out.println("┌─────────┐"+"\n"+"│" + carta_extraida.getValor() + "        │"+"\n"+ "│         │"+"\n"+ "│    " + carta_extraida.getPalo() + "    │"+"\n"+ "│         │"+ "\n"+"│" + carta_extraida.getValor() + "        │"+"\n"+ "└─────────┘");

                ;}

                if (carta_extraida.getValor() == 1) {
                    comodinesJugador1++;
                    carta_extraida.setValor(11);
                }
                    total1 = total1 + carta_extraida.getValor();
                    contador1++;

                }
                if (total1 > 21 && comodinesJugador1 > 0 && contador1 == 2) {
                    total1 = total1 - 10;
                    comodinesJugador1--;
                    System.out.println(total1);
                }
                if (contador1 == 2) {
                    System.out.println(ANSI_RED+"total del jugador 1: " + total1+ANSI_RESET);
                }
                if (total1 == 21) {
                    blackJack1 = true;
                    System.out.println(ANSI_RED+"Black Jack del jugador 1"+ANSI_RESET);
                }

                //parte inicial del jugador dos
            while (contador2 < 2) {
                System.out.println("turno del jugador dos");
                // Extraer una carta aleatoria y eliminarla
                Random rand = new Random();
                int indiceAleatorio = rand.nextInt(Baraja.size());
                 carta_extraida = Baraja.remove(indiceAleatorio);
                if (carta_extraida.getFigura()!=null){
                    System.out.println("┌─────────┐"+"\n"+"│" + carta_extraida.getFigura() + "        │"+"\n"+ "│         │"+"\n"+ "│    " + carta_extraida.getPalo() + "    │"+"\n"+ "│         │"+ "\n"+"│" + carta_extraida.getFigura() + "        │"+"\n"+ "└─────────┘");

                    ;}
                else if (carta_extraida.getValor()==10) {
                    System.out.println("┌─────────┐" + "\n" + "│" + carta_extraida.getValor() + "       │" + "\n" + "│         │" + "\n" + "│    " + carta_extraida.getPalo() + "    │" + "\n" + "│         │" + "\n" + "│" + carta_extraida.getValor() + "       │" + "\n" + "└─────────┘");

                }
                else {
                    System.out.println("┌─────────┐"+"\n"+"│" + carta_extraida.getValor() + "        │"+"\n"+ "│         │"+"\n"+ "│    " + carta_extraida.getPalo() + "    │"+"\n"+ "│         │"+ "\n"+"│" + carta_extraida.getValor() + "        │"+"\n"+ "└─────────┘");

                    ;}
                if (carta_extraida.getValor() == 1) {
                    comodinesJugador2++;
                    carta_extraida.setValor(11);
                }
                if (total2 > 21 && comodinesJugador2 > 0 && contador1 == 2) {
                    total2 = total2 - 10;
                    comodinesJugador2--;
                    System.out.println(total2);
                }
                total2 = total2 + carta_extraida.getValor();
                contador2++;
                if (contador2 == 2) {
                    System.out.println(ANSI_BLUE+"total del jugador 2: " + total2+ANSI_RESET);
                }
                if (total2 == 21) {
                    blackJack2 = true;
                    System.out.println(ANSI_BLUE+"Black Jack"+ANSI_RESET);

                }
            }
            //fin del jugador dos
            //inicio del juego
            if (!blackJack1 && !blackJack2) {
                do {
                    System.out.println("¿desea plantase jugador 1?");
                    System.out.println("pulse uno para continuar o cualquier otro numero para plantarse");
                    int plantarse1 = leer.nextInt();
                    leer.nextLine();
                    if (plantarse1 != 1) {
                        plantarse = true;
                    } else {
                        Random rand = new Random();
                        int indiceAleatorio = rand.nextInt(Baraja.size());
                        carta_extraida = Baraja.remove(indiceAleatorio);
                        if (carta_extraida.getFigura()!=null){
                            System.out.println("┌─────────┐"+"\n"+"│" + carta_extraida.getFigura() + "        │"+"\n"+ "│         │"+"\n"+ "│    " + carta_extraida.getPalo() + "    │"+"\n"+ "│         │"+ "\n"+"│" + carta_extraida.getFigura() + "        │"+"\n"+ "└─────────┘");

                            ;}
                        else if (carta_extraida.getValor()==10) {
                            System.out.println("┌─────────┐" + "\n" + "│" + carta_extraida.getValor() + "       │" + "\n" + "│         │" + "\n" + "│    " + carta_extraida.getPalo() + "    │" + "\n" + "│         │" + "\n" + "│" + carta_extraida.getValor() + "       │" + "\n" + "└─────────┘");

                        }
                        else {
                            System.out.println("┌─────────┐"+"\n"+"│" + carta_extraida.getValor() + "        │"+"\n"+ "│         │"+"\n"+ "│    " + carta_extraida.getPalo() + "    │"+"\n"+ "│         │"+ "\n"+"│" + carta_extraida.getValor() + "        │"+"\n"+ "└─────────┘");

                            ;}
                        if (carta_extraida.getValor() == 1) {
                            comodinesJugador1++;
                            carta_extraida.setValor(11);
                        }
                        total1 = total1 + carta_extraida.getValor();
                        System.out.println(ANSI_RED+"total del jugador 1: " + total1+ANSI_RESET);

                        if (total1 > 21 && comodinesJugador1 > 0) {
                            total1 = total1 - 10;
                            comodinesJugador1--;
                            System.out.println(total1);
                        }
                        if (total1 > 21) {
                            plantarse = true;
                            perder1 = true;
                        }

                    }
                }
                while (!plantarse);

                if (perder1) {
                    System.out.println(ANSI_RED+"el jugador 1 pierde"+ANSI_RESET);
                }
                plantarse = false;
                if (!perder1) {

                    do {
                        if (total1>=total2){
                            System.out.println("¿desea plantase jugador 2?");
                            System.out.println("pulse uno para continuar o cualquier otro numero para plantarse");
                            int plantarse2 = leer.nextInt();
                            leer.nextLine();
                            if (plantarse2 != 1) {
                                plantarse = true;
                            }
                            if (plantarse2 == 1) {
                                Random rand = new Random();
                                int indiceAleatorio = rand.nextInt(Baraja.size());
                                carta_extraida = Baraja.remove(indiceAleatorio);
                                if (carta_extraida.getFigura()!=null){
                                    System.out.println("┌─────────┐"+"\n"+"│" + carta_extraida.getFigura() + "        │"+"\n"+ "│         │"+"\n"+ "│    " + carta_extraida.getPalo() + "    │"+"\n"+ "│         │"+ "\n"+"│" + carta_extraida.getFigura() + "        │"+"\n"+ "└─────────┘");

                                    ;}
                                else if (carta_extraida.getValor()==10) {
                                    System.out.println("┌─────────┐" + "\n" + "│" + carta_extraida.getValor() + "       │" + "\n" + "│         │" + "\n" + "│    " + carta_extraida.getPalo() + "    │" + "\n" + "│         │" + "\n" + "│" + carta_extraida.getValor() + "       │" + "\n" + "└─────────┘");

                                }
                                else {
                                    System.out.println("┌─────────┐"+"\n"+"│" + carta_extraida.getValor() + "        │"+"\n"+ "│         │"+"\n"+ "│    " + carta_extraida.getPalo() + "    │"+"\n"+ "│         │"+ "\n"+"│" + carta_extraida.getValor() + "        │"+"\n"+ "└─────────┘");

                                    ;}
                                if (carta_extraida.getValor() == 1) {
                                    comodinesJugador2++;
                                    carta_extraida.setValor(11);
                                }
                                total2 = total2 + carta_extraida.getValor();
                                if (total2 > 21 && comodinesJugador2 > 0) {
                                    total2 = total2 - 10;
                                    comodinesJugador2--;
                                    System.out.println(total2);
                                }
                                System.out.println(ANSI_BLUE + "total del jugador 2: " + total2 + ANSI_RESET);

                                if (total2 > 21) {
                                    plantarse = true;
                                    perder2 = true;
                                }

                            }
                        }
                        else{
                            plantarse=true;
                        }
                    }
                    while (!plantarse);
                    if (perder2) {
                        System.out.println(ANSI_BLUE+"el jugador 2 pierde"+ANSI_RESET);
                    }
                }
            }
            if (!perder1 && !perder2) {
                if (total1 > total2) System.out.println(ANSI_RED+"gana el jugador 1"+ANSI_RESET);
                else if (total2 > total1) System.out.println(ANSI_BLUE+"gana el jugador 2"+ANSI_RESET);
                else if (total2 == total1) {
                    System.out.println(ANSI_GREEN+"  ┌─────────────┐");
                    System.out.println("  │   -     -   │");
                    System.out.println("  │      ▄      │");
                    System.out.println("  │   ───────   │");
                    System.out.println("  │             │");
                    System.out.println("  │             │");
                    System.out.println("  │   EMPATE    │");
                    System.out.println("  └─────────────┘"+ANSI_RESET);

                }
                ;

            }

            //finalizacion del codigo
            System.out.println(ANSI_YELLOW+"quieres seguir?");
            System.out.println("salir 9"+ANSI_RESET);
            int menu= leer.nextInt();
            if (menu==9) salir=true;
            else salir=false;
        }
        while (!salir);
    }
}
