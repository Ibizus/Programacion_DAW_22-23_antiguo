package CLASES_T6.Clases;

public class DentroDeClases {
    
    public static void main(String[] args) {
    
        Persona persona1 = new Persona();

        System.out.println("Edad persona1: " + persona1.edad);
        System.out.println("Nombre persona1: " + persona1.nombre);

        persona1.nombre = "Hector";
        persona1.edad = 34;

        Persona persona2 = new Persona();
        persona2.nombre = "Javi";
        persona2.estatura = 175;
        persona2.edad = persona1.edad;

        System.out.println("Edad persona1: " + persona1.edad);
        System.out.println("Nombre persona1: " + persona1.nombre);

        System.out.println("----------------------------------");
        System.out.println("Edad persona2: " + persona2.edad);
        System.out.println("Nombre persona2: " + persona2.nombre);
        System.out.println("Estatura persona2: " + persona2.estatura);

        System.out.println("----------------------------------");
        System.out.println(persona2.toString());

    }
}
