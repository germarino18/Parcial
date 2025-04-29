package org.example;

import java.util.Date;

public class Mantenimiento {
    private Date fecha;
    private String observaciones;
    private AtraccionTecnico tecnico;

    public Mantenimiento(Date fecha, String observaciones, AtraccionTecnico tecnico) {
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.tecnico = tecnico;
    }

    public AtraccionTecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(AtraccionTecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
