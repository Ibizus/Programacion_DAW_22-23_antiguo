package FUNCIONES;

import javax.naming.spi.DirStateFactory.Result;

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
        int divisor = 2;
        while(contador<1 && divisor<numero)
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
        int resultado = numero+1;
        while (esPrimo(resultado)==false)
        {
            resultado++;
        }
        return resultado;
    }

    static long potencia(int base, int exponente)
    {
        long resultado = 1;

        if (exponente > 0)
        {
            for (int aux=1; aux<=exponente; aux++)
            {
                resultado = resultado * base;
            }
        }

        return resultado;
    }

    static int digitos(int numero)
    {
        int contadorDigitos = 0;
        while (numero > 0)
        {
            numero = numero/10;
            contadorDigitos++;
        }
        return contadorDigitos;
    }

    static long digitoN(long numero, int posicion)
    {
        long resto = 0;
        long numeroAlReves = UtilesParaNumeros.voltea(numero);

        for (int aux = 0; aux<=posicion; aux++)
        {
            resto = numeroAlReves % 10;
            numeroAlReves = numeroAlReves/10;
        }
        return resto;
    }

    static long posicionDeDigito(long numero, int digito)
    {
        int contadorPosicion = 0;
        long volteado = UtilesParaNumeros.voltea(numero);

        while (volteado%10!=digito && volteado>0)
        {
            volteado = volteado/10;
            contadorPosicion++;
        }
        if (volteado == 0)
        {
            contadorPosicion = -1;
        }
        return contadorPosicion;
    }

    static long quitaPorDetras(long numero, int digitos)
    {
        return numero = numero/UtilesParaNumeros.potencia(10, digitos);
    }

    static long quitaPorDelante(long numero, int digitos)
    {
        long volteado = UtilesParaNumeros.voltea(numero);

        volteado = volteado/UtilesParaNumeros.potencia(10, digitos);

        long resultado = UtilesParaNumeros.voltea(volteado);

        return resultado;
    }


}
