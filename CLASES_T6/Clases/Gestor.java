package CLASES_T6.Clases;

public class Gestor {
    
    // ATRIBUTOS DE GESTOR:
    private String nombre;
    private String telefono;
    private double importe_max;


    // CONSTRUCTORES:
    public Gestor(String nombre, String tlf)
    {
        this.nombre = nombre;
        this.telefono = tlf;
        this.importe_max = 10000;
    }

    public Gestor(String nombre, String tlf, double importe)
    {
        this(nombre, tlf);
        this.importe_max = importe;
    }


    // METODOS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    double getImporte_max() {
        return importe_max;
    }

    public void setImporte_max(double importe_max) {
        this.importe_max = importe_max;
    }










}
