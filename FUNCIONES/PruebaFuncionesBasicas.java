package FUNCIONES;

import FUNCIONES.UtilesParaNumeros; // ARCHIVO PARA TESTAR FUNCIONES CREADAS EN MI LIBRERIA:

public class PruebaFuncionesBasicas {
    public static void main(String[] args) {
        
        int base = 2;
        int exponente = 10;
        long resultado = UtilesParaNumeros.potencia(base, exponente);
        System.out.println("potencia: "+resultado);

        System.out.println("-------------------------------");

        int numero = 7;
        boolean primo = UtilesParaNumeros.esPrimo(numero);
        System.out.println("primo: "+primo);

        System.out.println("-------------------------------");

        int numero2 = 10;
        int nextPrimo = UtilesParaNumeros.siguientePrimo(numero2);
        System.out.println("siguiente primo: "+nextPrimo);

        System.out.println("-------------------------------");

        int numero3 = 1234567;
        int numeroDigitos = UtilesParaNumeros.digitos(numero3);
        System.out.println("número digitos: "+numeroDigitos);

        System.out.println("-------------------------------");

        long numero4 = 87498459;
        int posicion = 3;
        long digitoBuscado = UtilesParaNumeros.digitoN(numero4, posicion);
        System.out.println("digito de "+numero4+" en la posicion "+posicion+" es: "+digitoBuscado);

        System.out.println("-------------------------------");

        long numero5 = 987605432;
        int digitoBuscado2 = 3;
        long posicionEncontrada = UtilesParaNumeros.posicionDeDigito(numero5, digitoBuscado2);
        System.out.println("la posicion de "+digitoBuscado2+" en "+numero5+" es: "+posicionEncontrada);

        System.out.println("-------------------------------");

        long numero6 = 987659;
        int quitar = 3;
        long numeroRestante = UtilesParaNumeros.quitaPorDetras(numero6, quitar);
        System.out.println("Si quitas "+quitar+" digitos a "+numero6+" queda: "+numeroRestante);

        System.out.println("-------------------------------");

        long numeroRestante2 = UtilesParaNumeros.quitaPorDelante(numero6, quitar);
        System.out.println("Si quitas por delante "+quitar+" digitos a "+numero6+" queda: "+numeroRestante2);

        System.out.println("-------------------------------");



    }
}
