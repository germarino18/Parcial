package org.example;

import java.util.List;

public class Parque {
    private String nombre;
    private String direccion;
    private String horarioApertura;
    private String horarioCierre;
    private List<Atraccion> atracciones;

    //Consructor

    public Parque(String nombre, List<Atraccion> atracciones, String horarioCierre, String horarioApertura, String direccion) {
        this.nombre = nombre;
        this.atracciones = atracciones;
        this.horarioCierre = horarioCierre;
        this.horarioApertura = horarioApertura;
        this.direccion = direccion;
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    //public Atraccion obtenerAtraccionMasVisitada(){

    //}
}
