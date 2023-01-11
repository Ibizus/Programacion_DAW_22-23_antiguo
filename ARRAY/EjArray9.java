package ARRAY;

import java.util.Scanner;

public class EjArray9 {
    public static void main(String[] args) {
        
        int[] numeros = new int[8];

        pideNumeros(numeros);

        parOImpar(numeros);

        imprimeResultado()
    }



    // FUNCIONES:

    // Pide los 8 números y los mete en un array
    static void pideNumeros(int[] array)
    {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        for(int aux=0; aux < array.length; aux++)
        {
            System.out.println("Introduce un número:");
            numero = sc.nextInt();

            array[aux] = numero;
        }
        sc.close();  
    }

    // comprueba si es par o impar
    static String parOImpar(int numero)
    {
        boolean esPar = (numero % 2) == 0;

        String mensaje = (esPar) ? "Par" : "Impar";

        return mensaje;
    }



}
