package org.example;

import java.time.LocalTime;
import java.util.Date;

public class Entrada {
    private Date fecha;
    private LocalTime hora;
    private Visitante visitante;

    //Constructor
    public Entrada(Date fecha, LocalTime hora, Visitante visitante) {
        this.fecha = fecha;
        this.hora = hora;
        this.visitante = visitante;
    }

    //Getter y Setter
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }
}
