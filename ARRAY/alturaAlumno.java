package ARRAY;

import java.util.Scanner;

public class alturaAlumno {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String[] alumnos = new String[0];
        double[] alturas = new double[0];
        
        // FUNCION MENU CON OPCIONES (ME DEVUELVE LA OPCIONQ UE HE PULSADO)
    
        // y DE AHÍ VA A UN sWICH
    
        // 1. Añadir altura alumno: pide nombre y pone por defecto 1,5 de altura
    
        // 2. Modificar altura alumno: PIDE NOMBRE y luego pide nueva altura
    
        // 3. Mostrar todo: muestra la tabla de nombres con sus alturas:
                            // pepe - 1.60
                            // juan - 1.95
                            // maria - 1.80
    
        // 4. Incrementar altura (Pide el incremento)
    
        // 5. Sacar alumno más alto
    }


    /**
     * Añade un alumno y por defecto le pone 1.5m de altura
     * @param array1,array2
     * @return nuevo
     */
    static void añadirAlumno(String[] array1, double[] array2)
    {
        System.out.println("Inserta el nombre del nuevo alumno:");
        String nuevoNombre = sc.nextLine();

        array1 = insertaNombre(array1, nuevoNombre);

        array2 = insertaAltura(array2, 1.5);
    }

    /**
     * Añade un alumno al final del array
     * @param array,nombre
     * @return nuevo
     */
    static String[] insertaNombre(String[] array, String nombre)
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
     * Añade una altura al final del array
     * @param array
     * @return nuevo
     */
    static double[] insertaAltura(double[] array, double altura)
    {
        double[] nuevo = new double[array.length+1];

        for (int i = 0; i < array.length; i++)
        {
            nuevo[i] = array[i];
        }
        
        nuevo[nuevo.length-1] = altura;

        return nuevo;
    }


}
