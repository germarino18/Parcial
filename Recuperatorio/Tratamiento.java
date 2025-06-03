import Enums.EstadoTratamiento;

import java.util.ArrayList;

public class Tratamiento {
    private String descripcion;
    private EstadoTratamiento estado;
    private ArrayList<Medicamento> medicamentos; //= new ArrayList<>();

    //Cosntructor
    public void Tratamiento(){

    }

    public Tratamiento(String descripcion, EstadoTratamiento estado) {
        this.descripcion = descripcion;
        this.estado = estado;
    }

    //Getter y setter

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoTratamiento getEstado() {
        return estado;
    }

    public void setEstado(EstadoTratamiento estado) {
        this.estado = estado;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamento med ) {
        this.medicamentos = medicamentos = new ArrayList<>() ;
    }


    @Override
    public String toString() {
        return "Tratamiento{" +
                "descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", medicamentos=" + medicamentos +
                '}';
    }
}
