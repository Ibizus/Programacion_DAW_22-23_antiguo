package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Genero los arrays columnas:
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];
        
        // Los paso a mi matriz o array bidimensional:
        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};
        
        // Array de bolas sacadas
        int[] numerosGenerados = new int[0];


        // Condición de salida del bucle:
        boolean salir = true;

        do 
        {
            // Vaciado de los numeros generados en el juego anterior:
            numerosGenerados = UtilesArrayHector.limpiar();
            

            //introduzco los numeros de cada columna
            rellenarNumerosCarton(carton);


            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            //ponerBlancos(carton);


            //pinto el cartón ;
            pintarCarton(carton, numerosGenerados);


            //pregunto si quiero sacar otra bola o terminar este juego
            boolean jugar = false;

            while(jugar)
            {

                //saco numero aleatorio - no se debe repetir
                
                //pinto el carton con numeros sacados
                //int numeroAciertos = pintarCarton(carton, numerosGenerados);


                //Eres ganador??
                //if (numeroAciertos >= 15)
                {
                    System.out.println("-----------------------------");
                    System.out.println("--------  BINGO -------------");
                    System.out.println("-----------------------------");
                }

                //pregunto si quiero sacar otra bola o terminar este juego
                

               
            }

            //Pregunto si quiero jugar otro cartón o salir definitivamente del programa
           
            
        } while(!salir);
    }


    /**
     * Rellena el cartón completo con los numeros aleatorios
     * de la decena correspondiente en cada columna 
     * @param arrayBi
     */
    static void rellenarNumerosCarton(int[][] arrayBi)
    {
        // Selecciono cada una de las columnas
        for (int i = 0; i < arrayBi.length; i++)
        {
            // Recorro las posiciones de cada columna
            for (int j = 0; j < arrayBi[0].length; j++)
            {
                if(i == 0)
                {        
                       
                    arrayBi[i][j] = (int)(Math.random()*9+1); // Random para columna 0 (1-9)
                }
                else 
                {
                    arrayBi[i][j] = (int)(Math.random()*10 + (i*10)); // Random 0-9 * (columna*10)
                }
            }
        }
    }
    
    /**
     * Pinta el carton de bingo con sus valores y blancos, y va marcando
     * como X las bolas sacadas durante la partida
     * @param arrayBi,arrayBolas
     */
    static void pintarCarton(int[][] arrayBi, int[] arrayBolas)
    {
        System.out.println("\n");

        for (int i = 0; i < arrayBi[0].length; i++) // Recorre las 3 filas que vamos a pintar
        {
            System.out.print("|  ");

            for (int j = 0; j < arrayBi.length; j++) // Pinta las 8 posiciones de cada fila
            {
                System.out.print(arrayBi[j][i] + "  |  ");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }


    /**
     * Busca un valor dentro del array y devuelve
     * true si aparece en el array o false
     * en caso de no aparecer ese elemento
     * @param array,elemento
     * @return esta
     */
    static boolean buscar(int[] array, int elemento)
    {
        boolean esta = false;

        // Recorro todo el array buscando el elemento
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == elemento)
            {
                esta = true; // Cambio condición en caso de encontrar el elemento
            }
        }

        return esta;
    }
}