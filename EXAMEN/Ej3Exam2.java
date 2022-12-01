package EXAMEN;

import java.util.Scanner;

public class Ej3Exam2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salida = false;
        String frase = "";

        // Bucle principal
        while (salida == false)
        {    
            // Imprimir menu:
            System.out.println("\t* Opción A - Introducir una cadena de caracteres (elimina la frase que hubiera y almacena la nueva)");
            System.out.println("\t* Opción B - Mostrar la cadena actual");
            System.out.println("\t* Opción C - Buscar una cadena y su numero de apariciones");
            System.out.println("\t* Opción D - Recorrer cada palabra en orden inverso + posición + longitud");
            System.out.println("\t* Opción E - Invertir las palabras de la cadena");
            System.out.println("\t* Opción F - Salir");
            System.out.println("Indique la opción que quiere realizar:");

            String lecturaEntrada = sc.nextLine(); // Lo leo como String para coger el char solo si se ha escrito algo válido:
            
            // Controlo que se ha leído algo para no dar error:
            if (lecturaEntrada.isEmpty() || lecturaEntrada.length() > 1)
            {
                System.out.println("Entrada no válida");
            }
            else
            {
                char entrada = lecturaEntrada.charAt(0);
                entrada = Character.toUpperCase(entrada);

                switch (entrada){

                    case 'A': // Añadir texto borrando el anterior
                        System.out.println("Introducir frase:");
                        frase = sc.nextLine();
                        break;

                    case 'B': // Mostrar cadena actual
                        int longitudActual = frase.length();

                            if (longitudActual > 0)
                            {
                                System.out.println("La frase actual es: \"" + frase + "\"");
                            }
                            else
                            {
                                System.out.println("La frase esta vacía");
                            }
                        break;

                    case 'C': // Falta buscar cadena y numero de apariciones:







                        break;

                    case 'D': // Recorrer palabras en orden inverco con posicion y longitud

                        // Creo un Array de palabras separando por cada espacio
                        String[] palabrasFrase = frase.split(" ");

                        for (int aux = (palabrasFrase.length)-1; aux>=0; aux--)
                        {
                            System.out.println((aux) + "- " + palabrasFrase[aux].toString() + "(" + palabrasFrase[aux].length() + " letras)" );
                        }
                        break;
                    case 'E': // Invertir frase
                        String[] palabrasSueltas = frase.split(" ");
                        String invertida = "La frase invertida es: ";

                        for (int aux = (palabrasSueltas.length)-1; aux>=0; aux--)
                        {
                            invertida = invertida + " " + palabrasSueltas[aux].toString();
                        }
                        System.out.println(invertida);

                        break;

                    case 'F':
                        salida = true;
                        System.out.println("¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("Opción no contemplada");
                }

            } // Fin IF/ELSE

            if (!salida) // Para no mostrar el Enter cuando introduzco la Opcion Salir 's'
            {
                System.out.println("Pulse la tecla ENTER para continuar...");
                sc.nextLine();
            }

        } // Fin bucle principal

        sc.close();
    }
}
