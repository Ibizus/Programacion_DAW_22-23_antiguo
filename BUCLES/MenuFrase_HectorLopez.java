package BUCLES;

import java.util.Scanner;

public class MenuFrase_HectorLopez {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salida = false;
        String frase = "";
        String añadido = "";


        // Bucle principal

        
        
        // Imprimir menu

        System.out.println(" * Opción a - Añadir a la frase");
        System.out.println(" * Opción b - Indicar la ultima frase introducida)");
        System.out.println(" * Opción c - Indicar el número de palabras que tiene la frase");
        System.out.println(" * Opción d - Indicar cuantas veces a aparece un carácter en la frase");
        System.out.println(" * Opción e - Limpiar frase");
        System.out.println(" * Opción s - Salir");

        char entrada = sc.nextLine().charAt(0);
        // Limpio Buffer después de ller un caracter
        sc.nextLine();

        switch (entrada){

            case 'a':
                añadido = sc.nextLine();
                frase = frase + " " + añadido;
                break;

            case 'b':
                System.out.println(frase);
                break;

            case 'c':
                // Creo un Array de palabras separando por cada espacio
                String[] palabrasFrase = frase.split(" ");
                // Cuento las partes del array e imprimo
                int cantidadDePalabras = palabrasFrase.length;
                System.out.println("La frase tiene " + cantidadDePalabras + " palabras.");
                break;

            case 'd':

                break;

            case 'e':
                frase = "";
                break;

            case 's':
                System.out.println("Hasta pronto");
                break;

            default:
                System.out.println("Opción incorrecta"); 
        }

        // Limpiamos Buffer y pausamos el Bucle:
        sc.nextLine();
        System.out.println("pulse ENTER para continuar");
        sc.nextLine();
        
        


        // FIN BUcle 1



        sc.close();
    }
}
