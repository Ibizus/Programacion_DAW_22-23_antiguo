package FUNCIONES;

public class UtilesParaNumeros {
    

    static boolean esCapicua(int numero)
    {
        boolean resultado = false;
        // FUNCION VOLTEA:
        long volteado = voltea(numero);

        // COMPARAMOS:
        if (numero == volteado)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }

    static long voltea(long numero)
    {
        long resto = 0;
        long volteado = 0;
        long numOperativo = numero;
        while (numOperativo > 0)
        {
            resto = numOperativo % 10;
            volteado = (volteado*10)+resto;
            numOperativo = numOperativo/10;
        }
        return volteado;
    }

    static boolean esPrimo(int numero)
    {
        boolean resultado = true;
        int contador = 0;
        int divisor=2;
        while(contador<1 || divisor==(numero-1))
        {
            if (numero%divisor==0)
            {
                contador++;
                resultado = false;
            }
            divisor++;
        }
        return resultado;
    } 

    static int siguientePrimo(int numero)
    {
        numero = numero+1;
        while (esPrimo(numero+1)==false)
        {
            numero++;
        }
        return numero;
    }




}
