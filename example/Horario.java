package org.example;

public class Horario {
    private String dia;
    private String horaInicio;
    private String horaFin;

    public Horario(String dia, String horaFin, String horaInicio) {
        this.dia = dia;
        this.horaFin = horaFin;
        this.horaInicio = horaInicio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
}
