package BUCLES;

import java.util.Scanner;

public class TandaPenaltis {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // VARIABLES:
        String cpu = "CPU";
        String jugadaUsuario = "-----";
        String jugadaCPU = "-----";
        int totalTiros = 0;
        String tiroElegido = "";
        int tipoTiro = 0;
        int tiroCPU = 0;
        int contadorGolesJugador = 0;
        int contadorGolesCPU = 0;
        int contadorTirosJugador = 0;
        int contadorTirosCPU = 0;
        boolean turnoJugador = true;
        int factorPifia = 0;

        System.out.println("¿Cuál es tu nombre?");
        String nombre = sc.nextLine();

        System.out.println("EMPIEZA LA TANDA DE PENALTIS\n\n");

        // BUCLE TANDA DE PENALTIS:
        while (totalTiros < 10)
        {
            System.out.println(nombre + "\t" + jugadaUsuario);
            System.out.println(cpu + "\t" + jugadaCPU + "\n");

                // Según el turno imprimo una cosa diferente u otra:
            if (turnoJugador == true) 
            {
                System.out.println(nombre + " tira (I (izquierda), D (derecha) o C (centro)");
            }
            else
            {
                System.out.println(nombre + " intenta parar a CPU (I (izquierda), D (derecha) o C (centro)");
            }
            tiroElegido = sc.nextLine().toUpperCase();

                // Asigno valor al movimiento del Jugador:
            switch (tiroElegido)
            {
                case "I":
                    tipoTiro = 1;
                    break;
                case "D":
                    tipoTiro = 2;
                    break;
                case "C":
                    tipoTiro = 3;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }

                // Genero el tiro de CPU con un random
            tiroCPU = (int)(Math.random()*3+1);

                // Genero el factor de PIFIA:
            factorPifia = (int)(Math.random()*10+1);

                // Con este IF entro en cualquiera de las dos posibilidades de tiro y resultado:
            if (turnoJugador == true) 
            {
                if (tipoTiro == tiroCPU) // Controlo si hay GOL de JUGADOR y modifico contadores:
                {
                    System.out.println("¡¡PARADÓN!!\n");
                    jugadaUsuario = jugadaUsuario.replaceFirst("-", "0");
                }
                else if (factorPifia <= 2)
                {
                    System.out.println("¡¡Pifia!! se va fuera!! Se ha marcado un Sergio Ramos!!");
                    jugadaUsuario = jugadaUsuario.replaceFirst("-", "0");
                }
                else
                {
                    System.out.println("GOOOOOOOOOOOOL de Señor\n");
                    jugadaUsuario = jugadaUsuario.replaceFirst("-", "X");
                    contadorGolesJugador++;
                }
                contadorTirosJugador++;
                turnoJugador = false;
            }
            else
            {
                if (tipoTiro == tiroCPU) // Controlo si hay GOL de CPU y modifico contadores:
                {
                    System.out.println("¡¡PARADÓN!!\n");
                    jugadaCPU = jugadaCPU.replaceFirst("-", "0");
                }
                else if (factorPifia <= 2)
                {
                    System.out.println("¡¡Pifia!! se va fuera!! Se ha marcado un Sergio Ramos!!");
                    jugadaCPU = jugadaCPU.replaceFirst("-", "0");
                }
                else
                {
                    System.out.println("GOOOOOOOOOOOOL de CPU\n");
                    jugadaCPU = jugadaCPU.replaceFirst("-", "X");
                    contadorGolesCPU++;
                }
                contadorTirosCPU++;
                turnoJugador = true;
            }
            totalTiros = contadorTirosJugador + contadorTirosCPU;

            if (totalTiros == 10)
            {
               if (contadorGolesJugador == contadorGolesCPU)
               {
                    totalTiros = totalTiros-2;
                    jugadaUsuario += " -";
                    jugadaCPU += " -";
               }
               else if (contadorGolesJugador > contadorGolesCPU)
               {
                    System.out.println("\n" + nombre + " gana la tanda de penaltis");
               }
               else 
               {
                    System.out.println("\n" + cpu + " gana la tanda de penaltis");
               }
            }

        }

        sc.close();
    }
}
