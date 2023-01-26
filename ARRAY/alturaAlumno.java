package ARRAY;

import java.util.Scanner;

public class alturaAlumno {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        

        // VARIABLES:
        String[] alumnos = new String[0];
        double[] alturas = new double[0];

        boolean salir = false;
        int opcion = 0;


        // BUCLE MENU
        while (!salir)
        {
            // FUNCION MENU CON OPCIONES (ME DEVUELVE LA OPCIONQ UE HE PULSADO)
            opcion = menu();

            switch (opcion)
            {
                case 1:
                    añadirAlumno(alumnos, alturas);
                    break;

                case 2:
                    modificaAlturaAlumno(alumnos, alturas);
                    break;

                case 3:
                    pintarTabla(alumnos, alturas);
                    break;

                case 4:
                    
                    break;

                case 5:
                
                    break;

                case 6:
                
                    break;
                
                default:
                    salir = true;
                    System.out.println("Hasta pronto");

            }// Switch

        }// While salir

    }// Main


    // FUNCIONES:

    /**
     * Imprime el menu y devuelve la opción elegida
     * @return usuario
     */
    static int menu()
    {
        int usuario = 0;

        System.out.println("Elige la opción que quieres realizar:");
        System.out.println("\t1 -> Añadir nuevo alumno"); // pide nombre y pone por defecto 1,5 de altura
        System.out.println("\t2 -> Modificar altura alumno"); // PIDE NOMBRE y luego pide nueva altura
        System.out.println("\t3 -> Mostrar todo"); // Muestra la tabla de nombres con sus alturas
        System.out.println("\t4 -> Incrementar altura"); // Pide el incremento
        System.out.println("\t5 -> Sacar el alumno más alto");
        System.out.println("\t6 -> Sacar la media de altura");
        System.out.println("Pulsa cualquier otro número para salir");
        usuario = sc.nextInt();
        // limpiar Buffer:
        sc.nextLine();

        return usuario;
    }

    /**
     * Pide nombre, añade al alumno y por defecto le pone 1.5m de altura
     * @param array1,array2
     * @return nuevo
     */
    static void añadirAlumno(String[] array1, double[] array2)
    {
        System.out.println("Inserta el nombre del nuevo alumno:");
        String nuevoNombre = sc.nextLine();

        array1 = añadeNombre(array1, nuevoNombre);

        array2 = añadeAltura(array2);
    }

    /**
     * Añade un alumno al final del array
     * @param array,nombre
     * @return nuevo
     */
    static String[] añadeNombre(String[] array, String nombre)
    {
        String[] nuevo = new String[array.length+1];

        for (int i = 0; i < array.length; i++)
        {
            nuevo[i] = array[i];
        }
        
        nuevo[nuevo.length-1] = nombre;

        return nuevo;
    }

    /**
     * Añade una altura al final del array con un valor por defecto
     * @param array
     * @return nuevo
     */
    static double[] añadeAltura(double[] array)
    {
        double[] nuevo = new double[array.length+1];
        double alturaPorDefecto = 1.5;

        for (int i = 0; i < array.length; i++)
        {
            nuevo[i] = array[i];
        }
        
        modificaAltura(nuevo, nuevo.length-1, alturaPorDefecto);
        //nuevo[nuevo.length-1] = alturaPorDefecto; //lo comento porque paso a hacerlo con una funcion

        return nuevo;
    }

    /**
     * Modifica la altura de una posicion dada del array por un valor tambien dado
     * @param array,posicion,altura
     */
    static void modificaAltura(double[] array, int posicion, double altura)
    {
        array[posicion] = altura;
    }

    /**
     * Busca la coincidencia de un nombre en el array y devuelve su posición
     * o devuelve -1 si no lo encuentra
     * @param array,nombre
     * @return posicionEncontrada
     */
    static int buscaNombre(String[] array, String nombre)
    {
        int posicionEncontrada = -1;
        int index = 0;

        // Mientras no llegue al final de array y el valor de posicón no haya cambiado
        while(index < array.length && posicionEncontrada == -1)
        {
            // Guardo la posición en el caso de encontrar un nombre igual
            if(array[index].equals(nombre))
            {
                posicionEncontrada = index;
            }
            index++;
        }

        return posicionEncontrada;
    }

    /**
     * Pide un nombre, lo busca y pide la altura para modificarla
     * @param arrayNombre,arrayAltura
     */
    static void modificaAlturaAlumno(String[] arrayNombre, double[] arrayAltura)
    {
        System.out.println("Introduce el nombre del alumno a modificar:");
        String nombreBuscado = sc.nextLine();

        int posicion = buscaNombre(arrayNombre, nombreBuscado);

        System.out.println("Introduce la nueva altura:");
        double altura = sc.nextDouble();

        modificaAltura(arrayAltura, posicion, altura);
    }

}
