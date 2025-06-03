import java.util.Date;

public class Internacion {
    private Date fechaIngreso;
    private String motivo;
    private boolean activa;
    private Habitacion habitacion;
    private Veterinario veterinario;
    private Animal animal;

    //Constructor

    public void Internacion(){

    }
    public Internacion(Date fechaIngreso, String motivo, boolean activa, Habitacion habitacion, Veterinario veterinario, Animal animal) {
        this.fechaIngreso = fechaIngreso;
        this.motivo = motivo;
        this.activa = activa;
        this.habitacion = habitacion;
        this.veterinario = veterinario;
        this.animal = animal;
    }

    //Getter y Setter

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Internacion{" +
                "fechaIngreso=" + fechaIngreso +
                ", motivo='" + motivo + '\'' +
                ", activa=" + activa +
                ", habitacion=" + habitacion +
                ", veterinario=" + veterinario +
                ", animal=" + animal +
                '}';
    }
}
