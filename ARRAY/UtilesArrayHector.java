package ARRAY;

import java.util.Arrays;

public class UtilesArrayHector {


    /**
     * Borra los valores del Array dejando uno vacío
     * @param array
     * @return nuevo
     */
    static int[] limpiar(int[] array)
    {
        int[] nuevo = new int[0];

        return nuevo;
    }

    /**
     * Llena el array con un número de ceros indicados
     * @param array,numeroElementos
     * @return nuevo
     */
    static int[] rellenar(int[] array, int numeroElementos)
    {
        int[] nuevo = new int[numeroElementos];

        for (int i = 0; i < nuevo.length; i++)
        {
            nuevo[i] = 0;
        }
        return nuevo;
    }

    /**
     * Llena el array con un número concreto de campos con el valor indicado
     * @param array,numeroElementos,valor
     * @return nuevo
     */
    static int[] rellenar(int[] array, int numeroElementos, int valor)
    {
        int[] nuevo = new int[numeroElementos];

        for (int i = 0; i < numeroElementos; i++)
        {
            nuevo[i] = valor;
        }
        return nuevo;
    }

    /**
     * Inserta un elemento al final del array
     * @param array,elemento
     * @return nuevo
     */
    static int[] insertarAlFinal(int[] array, int elemento)
    {
        int[] nuevo = new int[array.length+1];

        for (int i = 0; i < array.length; i++)
        {
            nuevo[i] = array[i];
        }

        nuevo[nuevo.length-1] = elemento;

        return nuevo;
    }

    /**
     * Inserta un elemento al principio del array
     * @param array,elemento
     * @return nuevo
     */
    static int[] insertarAlPrincipio(int[] array, int elemento)
    {
        int[] nuevo = new int[array.length+1];

        nuevo[0] = elemento;

        for (int i = 0; i < array.length; i++)
        {
            nuevo[i+1] = array[i];
        }

        return nuevo;
    }

    /**
     * Inserta un elemento en una posicion indicada del array
     * @param array,elemento,posicion
     * @return nuevo
     */
    static int[] insertarEnPosicion(int[] array, int elemento, int posicion)
    {
        int[] nuevo = new int[array.length+1];

        for (int i = 0; i < posicion-1; i++)
        {
            nuevo[i] = array[i];
        }

        nuevo[posicion] = elemento;

        for (int i = posicion+1; i < nuevo.length; i++)
        {
            nuevo[i] = array[i-1];
        }

        return nuevo;
    }

    /**
     * Inserta un elemento ordenado dentro del array
     * @param array,elemento
     * @return nuevo
     */
    static int[] insertarOrdenado(int[] array, int elemento)
    {
        int posicion = 0;

        while(elemento > array[posicion] && posicion < array.length)
        {
            posicion++;
        }

        int[] nuevo = insertarEnPosicion(array, elemento, posicion);

        return nuevo;
    }

    /**
     * Elimina la última posición del array
     * @param array
     * @return nuevo
     */
    static int[] eliminarUltimo(int[] array)
    {
        int[] nuevo = new int[array.length-1];

        for (int i = 0; i < nuevo.length; i++)
        {
            nuevo[i] = array[i];
        }

        return nuevo;
    }

    /**
     * Elimina la primera posición del array
     * @param array
     * @return nuevo
     */
    static int[] eliminarPrimero(int[] array)
    {
        int[] nuevo = new int[array.length-1];

        for (int i = 0; i < nuevo.length; i++)
        {
            nuevo[i] = array[i+1];
        }

        return nuevo;
    }

    /**
     * Elimina la posicion indicada
     * @param array
     * @return nuevo
     */
    static int[] eliminarPosicion(int[] array, int posicion)
    {
        int[] nuevo = new int[array.length-1];

        for (int i = 0; i < array.length; i++)
        {
            if(posicion > i)
            {
                nuevo[i] = array[i];
            }
            else if(posicion < i)
            {
                nuevo[i-1] = array[i];
            }
        }
        return nuevo;
    }

    // /**
    //  * Elimina un elemento concreto buscándolo en el array
    //  * @param array
    //  * @return nuevo
    //  */
    // static int[] eliminar(int[] array, int elemento)
    // {
    //     int[] nuevo = Arrays.copyOfRange(array, 0, array.length);

    //     for(int aux=0; aux < nuevo.length; aux++) // recorro el array y cada vez que encuentro una coincidencia llamo a la funcion que elimina esa posicion
    //     {
    //         if(nuevo[aux] == elemento)
    //         {
    //             nuevo = eliminarPosicion(nuevo, aux);
    //         }
    //     }
    //     return nuevo;
    // }

        /**
     * Elimina un elemento concreto buscándolo en el array
     * @param array
     * @return nuevo
     */
    static int[] eliminar(int[] array, int elemento)
    {
        int[] nuevo = Arrays.copyOfRange(array, 0, array.length);

        for(int aux=0; aux < nuevo.length; aux++) // recorro el array y cada vez que encuentro una coincidencia llamo a la funcion que elimina esa posicion
        {
            if(nuevo[aux] == elemento)
            {
                nuevo = eliminarPosicion(nuevo, aux);
            }
        }
        return nuevo;
    }


    /**
     * Ordena el array de menor a mayor
     * @param array
     */
    static void ordenar(int[] array)
    {
        Arrays.sort(array);
    }

    /**
     * Desordena el array de forma aleatoria
     * @param array
     */
    static void desordenar(int[] array)
    {
        for(int aux=0; aux < array.length; aux++)
        {
            int posicionAleatoria = (int)(Math.random()*array.length);

            int contenedor = array[aux];
            array[aux] = array[posicionAleatoria];
            array[posicionAleatoria] = contenedor;
        }
    }



}
