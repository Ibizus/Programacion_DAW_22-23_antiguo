package EXAMEN;

import java.util.Scanner;

public class Ej1Exam2 { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PLATO1 = 5;
        final double PLATO2 = 4;
        final double PLATO3 = 4.5;
        final double PLATO4 = 6;
        final double PLATO5 = 8;
        final double PLATO6 = 9;
        final double PLATO7 = 5;
        final double PLATO8 = 1.5;
        final double PLATO9 = 1.25;
        final double PLATO10 = 2;
        
        boolean salir = false;
        double precio = 0;
        int cantidad = 0;
        double precioTotal = 0;
        String nomPlato = "";
        String salidaTicket1 = "";
        String salidaTicket2 = "";
        String salidaTicket3 = "";


        System.out.println("**** RESTAURANTE VEGA DE MIJAS ****");
        System.out.println("-----------------------------------");
        System.out.println("Primeros platos:");
        System.out.println(" 1. Salmorejo (5€)");
        System.out.println(" 2. Sopa picadillo (4€)");
        System.out.println(" 3. Ensalada de atún (4.5€)\n");
        System.out.println("Segundos platos:");
        System.out.println(" 4. Paella (6€)");
        System.out.println(" 5. Salmón (8€)"); 
        System.out.println(" 6. Codillo al horno (9€)");
        System.out.println(" 7. Lentejas (5€)\n");
        System.out.println("Postres:");
        System.out.println(" 8. Fruta (1.5€)");
        System.out.println(" 9. Café (1.25€)");
        System.out.println(" 10. Helado (2€)\n");
        System.out.println(" 0. SALIR (Imprime ticket + FIN)\n\n");


        while (!salir)
        {
            System.out.println("Selecciona la opción deseada:");
            int opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                    precio = PLATO1;
                    nomPlato = "Salmorejo";
                    break;
                case 2:
                    precio = PLATO2;
                    nomPlato = "Sopa picadillo";        
                    break;
                case 3:
                    precio = PLATO3;
                    nomPlato = "Ensalada de atún";
                    break;
                case 4:
                    precio = PLATO4;
                    nomPlato = "Paella";
                    break;
                case 5:
                    precio = PLATO5;
                    nomPlato = "Salmón";
                    break;
                case 6:
                    precio = PLATO6;
                    nomPlato = "Codillo al horno";
                    break;
                case 7:
                    precio = PLATO7;
                    nomPlato = "Lentejas";
                    break;
                case 8:
                    precio = PLATO8;
                    nomPlato = "Fruta";
                    break;
                case 9:
                    precio = PLATO9;
                    nomPlato = "Café";
                    break;
                case 10:
                    precio = PLATO10;
                    nomPlato = "Helado";
                    break;
                default:
                    break;
            }

            if (opcion >=1 && opcion <=10)
            {
                System.out.println("Cantidad:");
                cantidad = sc.nextInt();

                if (opcion >=1 && opcion <=3)
                {
                    salidaTicket1 = salidaTicket1 + "" + nomPlato + " x " + cantidad + "\n";
                }
                else if (opcion >=4 && opcion <=7)
                {
                    if (cantidad>2)
                    {
                        precio = precio -1;
                    }
                    salidaTicket2 = salidaTicket2 + "" + nomPlato + " x " + cantidad + "\n";
                }
                else if (opcion >=8 && opcion <=10)
                {
                    salidaTicket3 = salidaTicket3 + "" + nomPlato + " x " + cantidad + "\n";
                }

                precioTotal = precioTotal + (precio*cantidad);
            }
            else if (opcion == 0)
            {
                salir = true;
            }
            else 
            {
                System.out.println("Opción incorrecta");
            }
        }
        if (precioTotal >= 20 && precioTotal <=30)
        {
            precioTotal = precioTotal-2;
        }
        else if (precioTotal > 30 && precioTotal <=50)
        {
            precioTotal = precioTotal-3;
        }
        else if (precioTotal > 50)
        {
            precioTotal = precioTotal-5;
        }
        
        System.out.println("----------------------");
        System.out.println("** Primeros platos\n" + salidaTicket1);
        System.out.println("** Segundos platos\n" + salidaTicket2);
        System.out.println("** Postres\n" + salidaTicket3);
        System.out.println("TOTAL A PAGAR: " + precioTotal + "€");
        System.out.println("----------------------");

        sc.close();
    }
}