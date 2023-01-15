package ARRAY;

import java.util.Arrays;

public class UtilesArrayHector {


    /**
     * Borra los valores del Array dejando uno vacío
     * @param array
     * @return nuevo
     */
    static int[] limpiar()
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

        for (int i = 0; i <= posicion-1; i++)
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

    /**
     * Elimina un elemento concreto buscándolo en el array
     * @param array
     * @return nuevo
     */
    static int[] eliminar(int[] array, int elemento)
    {
        int[] nuevo = Arrays.copyOfRange(array, 0, array.length);

        int index = 0;
        while (index < nuevo.length)
        {
            // recorro el array y cada vez que encuentro una coincidencia llamo a la funcion que elimina esa posicion
            if(nuevo[index] == elemento)
            {
                nuevo = eliminarPosicion(nuevo, index);
            }
            else
            {
                index++; // Solo aumento el contador cuando no encuentro el elemento, para no saltar posiciones cuando elimino
            }
        }
        return nuevo;
    }

    /**
     * Ordena el array de menor a mayor
     * @param array
     * @return array
     */
    static int[] ordenar(int[] array)
    {
        Arrays.sort(array);

        return array;
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

    /**
     * Invierte el orden del array
     * @param array
     * @return nuevo
     */
    static int[] invertir(int[] array)
    {
        int[] nuevo = new int[array.length];

        for (int i = 0; i < nuevo.length; i++)
        {
            nuevo[i] = array[(array.length-1)-i];    
        }

        return nuevo;
    }

    /**
     * Imprime el array tabulado
     * @param array
     */
    static void imprimir(int[] array)
    {
        System.out.println("\t" + Arrays.toString(array));
    }

    /**
     * Devuelve true o false dependiendo de si el array está ordenado
     * @param array
     * @return ordenado
     */
    static boolean estaOrdenado(int[] array)
    {
        boolean ordenado = true;

        for (int i = 0; i < array.length-1; i++)
        {
            if(array[i] > array[i+1])
            {
                ordenado = false;
            }
        }
        return ordenado;
    }

    /**
     * Busca un valor dentro del array y devuelve su posición
     * ó -1 en caso de no aparecer ese elemento
     * @param array,elemento
     * @return posicion
     */
    static int buscar(int[] array, int elemento)
    {
        int posicion = -1;
        int index = 0;

        while(index < array.length && posicion == -1)
        {
            if(array[index] == elemento)
            {
                posicion = index;
            }
            index++;
        }

        return posicion;
    }

    /**
     * Devuelve el array desde la posicion inicial indicada 
     * hasta la de corte sin incluir esta última en el array resultante
     * @param array,posicionInicio,posicionCorte
     * @return nuevo
     */
    static int[] partirPor(int[] array, int posicionInicio, int posicionCorte)
    {
        // Nuevo array con el tamaño que vamos a cortar
        int[] nuevo = new int[posicionCorte-posicionInicio];

        // Se llena con las posiciones a partir de la de inicio del array de origen
        for (int i = 0; i < nuevo.length; i++)
        {
            nuevo[i] = array[i+posicionInicio];
        }

        return nuevo;
    }

    /**
     * Devuelve true si los dos arrays son iguales
     * @param array1,array2
     * @return iguales
     */
    static boolean sonIguales(int[] array1, int[] array2)
    {
        boolean iguales = false;

        if (array1.length == array2.length) // Comprobamos que los dos arrays tengan la misma longitud
        {
            int index = 0;

            // Mientras no haya un elemento diferente y no sobrepase la longitud del array aumentamos el contador
            while((elementosIguales(array1, array2, index) == true) && index < array1.length)
            {
                index++;
            }

            // Si el contador ha llegado a la ultima posición es que son iguales
            if(index ==  array1.length-1)
            {
                iguales = true;
            }
        }

        return iguales;
    }

    /**
     * devuelve true si el elemento
     * en ambos arrays son iguales
     * @param array1,array2,posicionAComparar
     * @return iguales
     */
    static boolean elementosIguales(int[] array1, int[] array2, int posicioAComparar)
    {
        boolean iguales = false;

        if(array1[posicioAComparar] == array2[posicioAComparar])
        {
            iguales = true;
        }

        return iguales;
    }


}
