import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero del mes:");
        String diaMes = sc.nextLine();

        String trabajo = "Tienes que ir a trabajar";
        String finde = "Jaranaaaaaaa";


        switch (diaMes){
        
            case "1":
            case "3":
            case "5":
            case "7":
            case "8":
            System.out.println(trabajo);
                break;        
                                 
            case "sabado":
            case "domingo":
            System.out.println(finde);
                break;   

            default:
            System.out.println("ERROR"); 
        }   // final del switch

        if (diasHastaFinDeSemana>0){
            System.out.println("Te quedan "+diasHastaFinDeSemana+" días para el fin de semana.");
        }

        
    }
}