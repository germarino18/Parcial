public class Habitacion {
    private int numero;
    private String tipo;

    //Constructor

    public void Habitacion(){

    }
    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    //Getter y Setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
