import java.util.Date;

public class HistorialPeso {
    private Date fecha;
    private double peso;


    //Constructor

    public void HistorialPeso(){

    }
    public HistorialPeso(Date fecha, double peso) {
        this.fecha = fecha;
        this.peso = peso;
    }

    //getter y setter

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "HistorialPeso{" +
                "fecha=" + fecha +
                ", peso=" + peso +
                '}';
    }
}
