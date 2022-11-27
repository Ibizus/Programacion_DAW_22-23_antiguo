package BUCLES;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Introduce un número para comprobar si es primo");
        int numero = sc.nextInt();

        for (int aux=numero; aux>0; aux--)
        {
            if (numero%aux==0)
            {
                contador++;
            }
        }

        if (contador<=2)
        {
            System.out.println(numero + " SÍ es primo");
        }
        else
        {
            System.out.println(numero + " NO es primo");
        }

        sc.close();
    }
}
