package org.example;

import java.util.List;

public class EmpleadoSeguridad {
    private int id;
    private String nombre;
    private List<String> especialidades;
    private List<Incidente> incidentes;

    //Constructor
    public EmpleadoSeguridad(int id, String nombre, List<String> especialidades, List<Incidente> incidentes) {
        this.id = id;
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.incidentes = incidentes;
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEspecialidad(String especialidad){
        especialidades.add(especialidad);
    }

    public void mostrarIncidentesReportados(){

    }
}
