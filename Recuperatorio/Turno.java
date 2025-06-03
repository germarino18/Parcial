
import java.util.Date;

public class Turno {
    private Date fecha;
    private String hora;
    private Veterinario veterinario;
    private Animal animal;
    private boolean confirmado;

    //Constructor

    public void Turno(){

    }
    public Turno(Date fecha, String hora, Veterinario veterinario, Animal animal, boolean confirmado) {
        this.fecha = fecha;
        this.hora = hora;
        this.veterinario = veterinario;
        this.animal = animal;
        this.confirmado = confirmado;
    }

    //Getter y setter

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", veterinario=" + veterinario +
                ", animal=" + animal +
                ", confirmado=" + confirmado +
                '}';
    }
}
