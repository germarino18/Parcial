package org.example;

import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String nombre;
    private String dni;
    private int edad;
    private List<Entrada> listaEntradas;
    private Ticket ticket;

    //Constructor
    public Visitante(String nombre, String dni, int edad, List<Entrada> listaEntradas, Ticket ticket) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.listaEntradas = listaEntradas;
        this.ticket = ticket;
    }


    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public List<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void setListaEntradas(List<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
