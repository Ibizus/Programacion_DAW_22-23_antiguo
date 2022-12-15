package ARRAY;

import java.util.Scanner;

public class EjercicioArray {

    static Scanner sc = new Scanner(System.in); // Abrimos el Scanner fuera para poder utilizarlo en todas las funciones

    public static void main(String[] args) {

        String[] nombres = new String[10];

        boolean salir = false;

        do
        {
            int opcion = menu();

            switch (opcion)
            {
                case 1:
                    limpiar(nombres);
                    break;
                case 2:
                    insertarEn(nombres);
                    break;
                case 3:
                    mostrarPosicion(nombres);
                    break;
                case 4:
                    llenar(nombres);
                    break;
                case 5:
                    mostrar(nombres);
                    break;
                case 0:
                    sc.close();
                    salir = true;
                    break;
            }

        }while (!salir);
    }

    static int menu()
    {
        System.out.println("\t* Opción 1 - Limpiar (null)");
        System.out.println("\t* Opción 2 - Insertar en posición");
        System.out.println("\t* Opción 3 - Mostrar valor en posición");
        System.out.println("\t* Opción 4 - Llenar todo el Array con cadena \"n\"");
        System.out.println("\t* Opción 5 - Mostrar todo el array");
        System.out.println("\t* Opción 0 - Salir");
        System.out.println("Indique la opción que quiere realizar:");

        int lecturaEntrada = sc.nextInt();
        sc.nextLine();

        return lecturaEntrada;
    }

    // Opción 1 - Limpiar (null)");
    static void limpiar(String[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = null;
        }
    }

    // Pide posición y cadena para insertar
    static void insertarEn (String[] array)
    {
        System.out.println("¿Que cadena quieres insertar?");
        String cadenaInsertada = sc.nextLine();

        System.out.println("¿En que posición?");
        int posicion = sc.nextInt();
        sc.nextLine(); // Limpio Buffer despues de leer numeros

        insertar(array, posicion, cadenaInsertada);
    }

    // Opción 2 - Insertar en posición
    static void insertar(String[] array, int posicion, String cadenaInsertada)
    {
        array[posicion] = cadenaInsertada;
    }

    // Opción 3 - Mostrar valor en posición
    static void mostrarPosicion(String[] array) 
    {
        System.out.println("¿Que posición quieres mostrar?");
        int posicion = sc.nextInt();
        sc.nextLine(); // Limpio Buffer despues de leer numeros

        System.out.println(array[posicion]);
    }

    // Opción 4 - Llenar todo el Array con cadena creciente
    static void llenar(String[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            array[aux] = "C" + aux;
        }
    }

    // Opción 5 - Mostrar todo el array
    static void mostrar(String[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            System.out.println(array[aux]);
        }
    }

}
