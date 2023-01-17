package ARRAY;

import java.util.Scanner;

public class Ej2ArrayBi {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    
        int[][] matriz = new int[4][4];

        rellenarMatriz(matriz);

        boolean resultado = esMagica(matriz);

    }

    /**
     * Llena el array con numeros pedidos al usuario
     * @param arrayBi
     */
    static void rellenarMatriz(int[][] arrayBi)
    {
        for (int i = 0; i < arrayBi.length; i++)
        {
            for (int j = 0; j < arrayBi[i].length; j++)
            {
                System.out.println("Introduce un valor:");
                arrayBi[i][j] = sc.nextInt();
            }
        }
    }





    
}
