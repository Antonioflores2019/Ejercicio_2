
package flores;

import  java.util.InputMismatchException;
import java.util.Scanner;

public class LectorDeDatos {
    public static int solicitarEntero (String mensaje) {
        Scanner Lector = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            int numero = Lector.nextInt();
            return numero;
        } catch (InputMismatchException e) {
            System.out.println("El dato ingresado no es valido");

            return solicitarEntero(mensaje);
        }
    }
    public static double solicitarDouble (String mensaje) {
        Scanner lector = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            double numero = lector.nextDouble();
            return numero;
        } catch (InputMismatchException e) {
            System.out.println("El dato ingresado no es valido");

            return solicitarDouble(mensaje);
        }


            }
            public static String solicitarString (String mensaje){

        Scanner lector = new Scanner (System.in);
        System.out.println(mensaje);
        try{
            String texto = lector.next();
            return texto;
        }catch (InputMismatchException e){
            System.out.println("El dato que ingreso es invalido");
        }
        return solicitarString(mensaje);
            }

        }
