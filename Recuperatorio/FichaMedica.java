import java.util.ArrayList;
import java.util.List;

public class FichaMedica {
    private Animal animal;
    private ArrayList<Consulta> consultas = new ArrayList<>();
    private ArrayList<HistorialPeso> historialPeso = new ArrayList<>();
    private ArrayList<Vacuna> vacunas = new ArrayList<>();
    private ArrayList<Tratamiento> tratamientos = new ArrayList<>();

    //Constructor
    public void FichaMedica(){

    }

    public FichaMedica(Animal animal) {
        this.animal = animal;
    }

    //Getter y Setter

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public ArrayList<HistorialPeso> getHistorialPeso() {
        return historialPeso;
    }

    public void setHistorialPeso(ArrayList<HistorialPeso> historialPeso) {
        this.historialPeso = historialPeso;
    }

    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(List<Vacuna> vacuna) {
        this.vacunas = vacunas = new ArrayList<>();
    }

    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    @Override
    public String toString() {
        return "FichaMedica{" +
                "animal=" + animal +
                ", consultas=" + consultas +
                ", historialPeso=" + historialPeso +
                ", vacunas=" + vacunas +
                '}';
    }
}
