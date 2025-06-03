import java.util.Date;

public class Consulta {
    private Date fecha;
    private String diagnostico;
    private Tratamiento tratamiento;
    private Veterinario veterinario;

    //Constructor
    public void Consulta(){

    }

    public Consulta(Date fecha, String diagnostico, Veterinario veterinario) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        //this.tratamiento = tratamiento;
        this.veterinario = veterinario;
    }

    //Getter y Setter

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "fecha=" + fecha +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamiento=" + tratamiento +
                ", veterinario=" + veterinario +
                '}';
    }
}
