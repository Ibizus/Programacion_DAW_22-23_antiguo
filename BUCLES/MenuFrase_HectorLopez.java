package BUCLES;

import java.util.Scanner;

public class MenuFrase_HectorLopez {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salida = false;
        String frase = "";
        String añadido = "";


        // Bucle principal
        while (salida == false)
        {    
            // Imprimir menu:
            System.out.println("\t* Opción a - Añadir a la frase (añadiendo a la frase ya existente)");
            System.out.println("\t* Opción b - Mostrar el estado de la frase actualmente");
            System.out.println("\t* Opción c - Indicar el número de palabras que tiene la frase");
            System.out.println("\t* Opción d - Indicar cuantas veces a aparece un carácter y su posición");
            System.out.println("\t* Opción e - Limpiar frase");
            System.out.println("\t* Opción s - Salir");
            System.out.println("Indique la opción que quiere realizar:");

            char entrada = sc.nextLine().charAt(0);
            entrada = Character.toLowerCase(entrada);

            switch (entrada){

                case 'a':
                    System.out.println("Introducir a la frase:");
                    añadido = sc.nextLine();
                    frase = frase + "" + añadido;
                    break;

                case 'b':
                    int longitud = frase.length();

                        if (longitud > 0)
                        {
                            System.out.println("La frase actual es: \"" + frase + "\"");
                        }
                        else 
                        {
                            System.out.println("La frase esta vacía");
                        }
                    break;

                case 'c':
                    // Creo un Array de palabras separando por cada espacio
                    String[] palabrasFrase = frase.split(" ");

                    // Cuento las partes del array e imprimo
                    int cantidadDePalabras = palabrasFrase.length;
                    System.out.println("La frase actual tiene " + cantidadDePalabras + " palabras.");
                    break;

                case 'd':
                    String fraseMinuscula = frase.toLowerCase();
                    String posiciones = "En la/s posicion/es: ";
                    int contador = 0;
                    int nuevaPosicion = 0;

                    System.out.println("¿Que caracter quieres buscar?");
                    char caracterBuscado = sc.nextLine().charAt(0);
                    caracterBuscado = Character.toLowerCase(caracterBuscado);

                    // Localizo el primer caracter:
                    int posicionCaracterBuscado = fraseMinuscula.indexOf(caracterBuscado);

                    // Bucle para buscar el resto de posiciones: (siempre que lo haya encontrado una primera vez)
                    while (posicionCaracterBuscado >= 0)
                    {
                        contador++; // (Si entra es que ha encontrado una coincidencia)

                        // Guardo su posición en un String y procedo para repetir el proceso:
                        posiciones = posiciones + "" + posicionCaracterBuscado + ", ";

                        // Parto la frase para obtener el trozo siguiente a la primera posición encontrada:
                        String parteSiguiente = fraseMinuscula.substring(posicionCaracterBuscado+1);

                        // Vuelvo a hacer la búqueda desde esa primera posición
                        nuevaPosicion = parteSiguiente.indexOf(caracterBuscado);

                        // Si lo ha encontrado lo añado al String declarado (sumando las posiciones ya contadas):
                        if (nuevaPosicion >= 0)
                        {   // Le sumo 1 porque cada vez que empiezo a contar empiezo por cero
                            posicionCaracterBuscado = posicionCaracterBuscado + (nuevaPosicion+1); 
                        }
                        else
                        {   // Si no lo encuentra vuelco el valor negativo en la variable de entrada al bucle
                            posicionCaracterBuscado = nuevaPosicion; 
                        }
                    }
                    
                    // Condición para imprimir:
                    if (contador > 0)
                    {
                        System.out.println("El caracter \'" + caracterBuscado + "\' aparece " + contador + " veces.");
                        System.out.println(posiciones);
                    }
                    else
                    {
                        System.out.println("El caracter introducido no está en la frase actual.");
                    }
                    break;

                case 'e':
                    frase = "";
                    System.out.println("Se ha limpiado la frase");
                    break;

                case 's':
                    salida = true;
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida"); 
            }

            System.out.println("Pulse la tecla ENTER para continuar...");
            sc.nextLine();

        } // Fin bucle principal

        sc.close();
    }
}
