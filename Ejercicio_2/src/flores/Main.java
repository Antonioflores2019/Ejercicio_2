package flores;
import flores.excepciones.ErrorValidacion;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        ArrayList<Visitante> visitantes = new ArrayList();
        Scanner lector = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("\tSistema de Control de Visitas");
        System.out.println("********************");
        while (true) {
            System.out.println("1. Crear Visitante");
            System.out.println("2. Mostrar Informacion de los Visitantes ");
            System.out.println("3. Salir");
            int opcion = lector.nextInt();

            switch (opcion) {


                case 1:

                    int x = 0;
                    boolean verificar = true;

                    while (verificar == true) {
                        System.out.println("\t***Creacion de Visitante***");

                        System.out.println("Ingrese el nombre del Visitante");
                        String nombre = lector.next();

                        System.out.println("Ingrese el telefono :");
                        String telefono = lector.next();

                        Visitante nuevovisitante = new Visitante();

                        try {
                            if (!telefono.isBlank()) {
                                nuevovisitante.setTelefono(telefono);
                            }

                            if (!nombre.isBlank()) {
                                nuevovisitante.setNombre_completo(nombre);
                                verificar = false;
                            }
                        } catch (ErrorValidacion e) {
                            System.err.println(e);
                            verificar = true;
                        }

                        for (Visitante c : visitantes) {
                            if (telefono.equals(c.telefono)) {
                                c.setIndice(1);
                                x = 1;
                                break;
                            }
                        }
                        if (x == 0) {
                            nuevovisitante.setIndice(0);
                            visitantes.add(nuevovisitante);
                            System.out.println("El Visitante ha sido Creado");
                            System.out.println("---------------------------");
                        }
                    }

                    break;

                case 2:

                    if (visitantes.isEmpty()) {
                        System.out.println("-- Primero debe Crear un Visitante --");
                    } else {
                        System.out.println("**Mostrando Truristas***");
                    }
                    for (Visitante v : visitantes){
                        System.out.println("Nombre :"+v.getNombre_completo() + "\n Numero de Telefono " + v.getTelefono() + " \n Total de Visitas: " + v.getIndice());
                    }


                    break;

                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            if (opcion == 3) {
                break;
            }
            }
        }

    }



