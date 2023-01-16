package ARRAY;

public class Ej3ArrayBi {
    public static void main(String[] args) {
        
        int[][] tabla = new int[4][5];

        rellenarArrayBi(tabla);




    }

    /**
     * Llena el array con numeros aleatorios de 0 a 100
     * @param arrayBi
     */
    static void rellenarArrayBi(int[][] arrayBi)
    {
        for (int i = 0; i < arrayBi.length; i++)
        {
            for (int j = 0; j < arrayBi[i].length; j++)
            {
                arrayBi[i][j] = (int)(Math.random()*101);
            }
        }
    }


}
