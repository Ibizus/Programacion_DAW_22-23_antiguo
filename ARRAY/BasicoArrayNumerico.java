package ARRAY;

import java.util.Scanner;

public class BasicoArrayNumerico {

    static Scanner sc = new Scanner(System.in); // Abrimos el Scanner fuera para poder utilizarlo en todas las funciones

    public static void main(String[] args) {
        
        int[] numeros = new int[10];

        boolean salir = false;

        do
        {
            int opcion = menu();

            switch (opcion)
            {
                case 1:
                    limpiar(numeros);
                    break;
                case 2:
                    insertarEn(numeros);
                    break;
                case 3:
                    mostrarPosicion(numeros);
                    break;
                case 4:
                    llenar(numeros);
                    break;
                case 5:
                    imprimirArray(numeros);
                    break;
                case 0:
                    System.out.println("HASTA PRONTO");
                    sc.close();
                    salir = true;
                    break;
            }

        }while (!salir);
    }//Fin MAIN

    // Función imprimir Menu
    static int menu()
    {
        System.out.println("\t* Opción 1 - Limpiar (cero)");
        System.out.println("\t* Opción 2 - Insertar en posición");
        System.out.println("\t* Opción 3 - Mostrar valor en posición");
        System.out.println("\t* Opción 4 - Llenar todo el Array con número \"n\"");
        System.out.println("\t* Opción 5 - Mostrar todo el array");
        System.out.println("\t* Opción 0 - Salir");
        System.out.println("Indique la opción que quiere realizar:");

        int lecturaEntrada = sc.nextInt();

        return lecturaEntrada;
    }

    // Opción 1 - Limpiar (cero)");
    static void limpiar(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = 0;
        }
    }

    // Pide posición y cadena para insertar
    static void insertarEn (int[] array)
    {
        System.out.println("¿Que número quieres insertar?");
        int cadenaInsertada = sc.nextInt();

        System.out.println("¿En que posición?");
        int posicion = sc.nextInt();

        if(posicion < array.length)
        {
            insertar(array, posicion, cadenaInsertada);
        }
        else
        {
            System.out.println("Posición fuera de rango");
        }
    }

    // Opción 2 - Insertar en posición
    static void insertar(int[] array, int posicion, int cadenaInsertada)
    {
        array[posicion] = cadenaInsertada;
    }

    // Opción 3 - Mostrar valor en posición
    static void mostrarPosicion(int[] array) 
    {
        System.out.println("¿Que posición quieres mostrar?");
        int posicion = sc.nextInt();

        if(posicion<array.length)
        {
            System.out.println(array[posicion]);
        }
        else
        {
            System.out.println("Posición fuera de rango");
        }
    }

    // Opción 4 - Llenar todo el Array con cadena creciente
    static void llenar(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = aux;
        }
    }

    // Opción 5 - Mostrar todo el array
    static void imprimirArray(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            System.out.println("["+aux+"] -> " +array[aux]);
        }
    }
}
