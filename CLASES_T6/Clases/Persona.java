package CLASES_T6.Clases;

public class Persona {
    
        // Atributos de la clase
        String nombre;
        String apellidos;
        int edad;
        int estatura;
        String dni;


        // Constructores:
        public Persona()
        {
            this.nombre = "Desconocido";
        }

        public Persona(String nombre, int edad)
        {
            this.nombre = nombre;
            this.edad = edad;
        }


        // Metodos
        void cumplirAños()
        {
            edad = edad+1;
        }

        void cambiarNombre(String nombre)
        {
            this.nombre = nombre;
        }

        void copiarPersona(Persona personaX)
        {
            this.nombre = personaX.nombre;
            this.apellidos = personaX.apellidos;
            this.edad = personaX.edad;
        }
}
