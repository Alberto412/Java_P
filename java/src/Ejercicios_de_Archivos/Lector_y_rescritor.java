package Ejercicios_de_Archivos;

import java.io.*;

public class Lector_y_rescritor {
    public static void main() throws FileNotFoundException {
        try(DataOutputStream notas= new DataOutputStream(new FileOutputStream("/home/alberto/Escritorio/Resultado.txt", true)))
        {
        notas.writeUTF("juan");
        notas.writeDouble(1.26);
        } catch (FileNotFoundException fn){
            System.err.println("No hay archivo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(DataInputStream notasr= new DataInputStream(new FileInputStream("/home/alberto/Escritorio/Resultado.txt")))
        {
          String nombre=notasr.readUTF();
          double notasas= notasr.readDouble();
            System.out.println(nombre);
            System.out.println(notasas);
        } catch (FileNotFoundException fn){
            System.err.println("No hay archivo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        String cadena="iufrufgb yudg2eudg gdu2egui bubyvu juan baloncesto";
        String resultado []=cadena.split(" ");
        StringTokenizer tokens =new StringTokenizer(cadena," ");
        System.out.println(tokens.countTokens());
       while (tokens.hasMoreTokens()){
           System.out.print(" "+tokens.nextToken()+" ");
      }
       StringTokenizer deportes= new StringTokenizer(cadena," ");
        while (deportes.hasMoreTokens()){
            System.out.print(" "+deportes.nextToken()+" ");
        }

         /*
        for (int i=0;i< resultado.length; i++){
            if(resultado[i].equals("baloncesto")){
                System.out.println(resultado[i-1]);
            }
            System.out.println(resultado[i]);
        }
        /*
        try(
                BufferedReader lector = new BufferedReader(new FileReader("/home/alberto/Escritorio/Datos.txt"));
                BufferedWriter escritor = new BufferedWriter(new FileWriter("/home/alberto/Escritorio/Resultado.txt", true))){
            while (lector.ready()){
                String linea = lector.readLine();
                escritor.write(linea+"\n");

            }
        }

        catch(FileNotFoundException e)

        {
            throw new RuntimeException(e);
        }
        catch(IOException c)
        {
            throw new RuntimeException(c);
        }

            */
        }


    }


