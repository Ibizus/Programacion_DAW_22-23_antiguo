package BUCLES;

import java.util.Scanner;

public class ConanElBarbaro_HectorLopez {//Multiplos de cinco (FOR)
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // VARIABLES FIJAS:
        final int VIDA_CONAN = 4;
        final int ATAQUE_ZOMBI = 50;
        final int DEFENSA_ZOMBI = 70; 

        // VARIABLES:
        int arma = 0;
        boolean salir = false;
        int ataqueConan = 0;
        int defensaConan = 0;
        int ataqueZombi = 0;
        int defensaZombi = 0;
        int numeroZombis = 0;
        int vidaZombi = 1;
        int contadorVidasConan = VIDA_CONAN;
        boolean conanAtaca = true;


        char otraPartida = ' ';

        // BUCLE PARTIDA:
        while (!salir)
        {
                // Elegir arma
            // Espada a 2 Manos: Ataque 60 y Defensa 40
            // Hacha: Ataque 70 y Defensa 30
            // Espada Corta y  escudo: Ataque 30 y Defensa 70
            System.out.println("BIENVENIDO A CONAN EL BÁRBARO");
            System.out.println("HISTORIA...");

            System.out.println("Elije un arma para Conan:");
            System.out.println("Pulsa 1 para Espada a 2 manos");
            System.out.println("Pulsa 2 para Hacha");
            System.out.println("Pulsa 3 Espada corta y Escudo");

            arma = sc.nextInt();

            // Declaro ataque y defensa para cada arma:
            switch (arma){

                case 1:
                    ataqueConan = 61;
                    defensaConan = 41;
                    break;
                case 2:
                    ataqueConan = 71;
                    defensaConan = 31;
                    break;
                case 3:
                    ataqueConan = 31;
                    defensaConan = 71;
                    break;
            }

            // Ataques ZOMBIS y nº Zombis:
            numeroZombis = (int)Math.random()*6+5;

            // BATALLA
            while (numeroZombis > 0 || VIDA_CONAN == 0) // Mientras no muera Conan o mueran todos los Zombis
            {

                // DUELO CON CADA ZOMBI
                vidaZombi = 1;
                while (vidaZombi > 0) // Termina cuando cualquier de los dos pierda vida
                {
                    ataqueConan = (int)Math.random()*ataqueConan;
                    System.out.println("Conan ataca: " + ataqueConan);

                    defensaZombi = (int)Math.random()*defensaZombi;
                    System.out.println("Zombie defiende: " + defensaZombi);

                    if (ataqueConan > defensaZombi)
                    {
                        vidaZombi = 0;
                        System.out.println("El zombie ha muerto");
                        numeroZombis--;
                    }
                    else if (defensaZombi > ataqueConan)
                    {
                        // En este caso Zombie gana turno y ataca:
                        ataqueZombi = (int)Math.random()*ataqueZombi;
                        System.out.println("Zombie ataca: " + ataqueZombi);

                        defensaConan = (int)Math.random()*defensaConan;
                        System.out.println("Conan defiende: " + defensaConan);

                        if (ataqueZombi > defensaConan)
                        {
                            contadorVidasConan--;
                            System.out.println("Conan pierde una vida... le quedan " + contadorVidasConan + " vidas.");
                        }
                        // En cualquier otro caso Zombi pierde oportunidad y vuelve a atacar Conan

                    }
                    else if (ataqueConan == defensaZombi)
                    {
                        conanAtaca = false;
                    }
                }










            }








            System.out.println("¿Quieres jugar otra vez? (s para SI / n para NO)");
            otraPartida = sc.nextLine().toLowerCase().charAt(0);

            if (otraPartida == 'n')
            {
                salir = true;
            }

        }









        // nº ZOMBIS
            // Los zombis tienen un ataque entre 50 y una defensa de 70

        // VIDA CONAN



        // 




        sc.close();
    }
}