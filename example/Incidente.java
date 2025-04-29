package org.example;

import java.util.Date;

public class Incidente {
    private Date fecha;
    private String descripcion;
    private EstadoIncidente estado;
    private Atraccion atraccion;
    private Visitante visitante;

    //Constructor
    public Incidente(Date fecha, Visitante visitante, Atraccion atraccion, EstadoIncidente estado, String descripcion) {
        this.fecha = fecha;
        this.visitante = visitante;
        this.atraccion = atraccion;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    //Getter y Setter
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Atraccion getAtraccion() {
        return atraccion;
    }

    public void setAtraccion(Atraccion atraccion) {
        this.atraccion = atraccion;
    }

    public EstadoIncidente getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidente estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
