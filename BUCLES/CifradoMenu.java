package BUCLES;

import java.util.Scanner;

public class CifradoMenu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // VARIABLES:
        int opcion = 0;
        int factorCifrado = 0;
        String texto = "";
        int contador = 0;
        char caracterRevisado = ' ';
        char caracterCifrado = ' ';
        int numeroCaracter = 0;
        boolean salir = false;


        // BUCLE MENU
        while (!salir)
        {
            System.out.println("PROGRAMA COMPUTACIONAL DE CIFRADO DE SEGURIDAD EXTREMA");

            System.out.println("Elige la opción que quieres realizar:");
            System.out.println("1 para CIFRAR");
            System.out.println("2 para DESCIFRAR");
            System.out.println("3 para SALIR");
            opcion = sc.nextInt();
        // limpiar Buffer:
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                    System.out.println("Dime el factor de cifrado entre 1 y 9:"); // Numero entre 1 y 9
                    factorCifrado = sc.nextInt();
                    //limpiar Buffer:
                    sc.nextLine();
            
                    System.out.println("Introduce el texto a cifrar (EN MAYÚSCULAS):");
                    texto = sc.nextLine().toUpperCase().replace(" ","");
            
                    System.out.print(factorCifrado);
                    // Bucle que cambia cada caracter:
                    while (contador < texto.length())
                    {
                        caracterRevisado = texto.charAt(contador);
                        numeroCaracter = (int)caracterRevisado +factorCifrado;
                        if (numeroCaracter > 'Z')
                        {
                            numeroCaracter = numeroCaracter-26;
                        }
                        caracterCifrado = (char)numeroCaracter;
                        System.out.print(caracterCifrado);
                        contador++;
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Introduce el texto cifrado:");
                    texto = sc.nextLine().toUpperCase();
                    factorCifrado = Character.getNumericValue(texto.charAt(0));

                    texto = texto.substring(1);

                    while (contador < texto.length())
                    {
                        caracterRevisado = texto.charAt(contador);
                        numeroCaracter = (int)caracterRevisado-factorCifrado;
                        if (numeroCaracter < 'A')
                        {
                            numeroCaracter = numeroCaracter+26;
                        }
                        caracterCifrado = (char)numeroCaracter;
                        System.out.print(caracterCifrado);
                        contador++;
                    }
                    System.out.println("");
                    break;

                case 3:
                default:
                    salir = true;
                    System.out.println("Hasta pronto");
            }
        }
        sc.close();
    }
}
