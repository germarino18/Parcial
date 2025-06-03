import java.util.ArrayList;

public class Agenda {
    private Veterinario veterinario;
    private ArrayList<Turno> turnos;

    //Constructor
    public void Agenda(){

    }

    public Agenda(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    //Getter y setter

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(Turno turno) {
        this.turnos = turnos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "veterinario=" + veterinario +
                ", turnos=" + turnos +
                '}';
    }
}
