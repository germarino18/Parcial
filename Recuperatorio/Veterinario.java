import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nombre;
    private String matricula;
    private ArrayList<Especialidad> especialidades = new ArrayList<>();
    private Agenda agenda;

    //Constructor
    public void Veterinario(){

    }

    public Veterinario(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void agregarEspecialidades(Especialidad especialidad){
        especialidades.add(especialidad);
    }

    //Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", especialidades=" + especialidades +
                '}';
    }

    public void mostrarInternacionesActivas(List<Internacion> internaciones){
        for (Internacion internacion : internaciones){
            System.out.println(internacion);
        }
    }
}
