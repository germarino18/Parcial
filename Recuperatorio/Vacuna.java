import java.util.Date;

public class Vacuna {
    private String nombre;
    private Date fechaAplicacion;

    //Constructor
    public void Vacuna(){

    }

    public Vacuna(String nombre, Date fechaAplicacion) {
        this.nombre = nombre;
        this.fechaAplicacion = fechaAplicacion;
    }

    //Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    @Override
    public String toString() {
        return "Vacuna{" +
                "nombre='" + nombre + '\'' +
                ", fechaAplicacion=" + fechaAplicacion +
                '}';
    }
}
