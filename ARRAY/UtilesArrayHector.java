package ARRAY;

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

        for (int i = 0; i < numeroElementos; i++)
        {
            array[i] = 0;
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
            array[i] = valor;
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

        nuevo[nuevo.length] = elemento;

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

        for (int i = 1; i < nuevo.length; i++)
        {
            nuevo[i] = array[i];
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

        while(elemento > array[posicion])
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
}
