package CLASES_T6.Clases;

public class TarjetaRegalo {
    

    //ATRIBUTOS
    private double saldo;
    private int codigo;

    //CONSTRUCTORES
    public TarjetaRegalo(int saldoInicial)
    {
        this.codigo = (int)(Math.random()*99999+1);
        this.saldo = saldoInicial;
    }

    //METODOS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void gasta(double cantidad)
    {
        if(this.getSaldo()<cantidad)
        {
            System.out.println("No tiene suficiente saldo para gastar " + cantidad + "€");
        }
        else 
        {
            this.setSaldo(this.getSaldo() - cantidad);
        }
    }

    public void fusionaCon(TarjetaRegalo t2)
    {
        
    }

    @Override
    public String toString()
    {
        String desglose = "Tarjeta nº " + codigo + " - Saldo " + saldo + "€";
        
        return desglose;
    }

}
