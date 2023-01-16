package ARRAY;

public class Ej1ArrayBi {
    public static void main(String[] args) {
        
        int[][] arrayBi = new int[5][5];

        rellenarArrayBi(arrayBi);

        EjemploBidimensional.imprimirMatriz(arrayBi);
    }

    /**
     * Llena el array bidimensional
     * @param arrayBi
     */
    static void rellenarArrayBi(int[][] arrayBi)
    {
        for (int i = 0; i < arrayBi.length; i++)
        {
            for (int j = 0; j < arrayBi[i].length; j++)
            {
                arrayBi[i][j] = 10 * i + j;
            }
        }
    }


}
