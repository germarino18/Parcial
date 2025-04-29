package org.example;

import java.util.Date;

public abstract class Ticket {
    private String codigo;
    private double precio;
    private Date fechaEmision;

    //Constructor
    public Ticket(String codigo, double precio, Date fechaEmision) {
        this.codigo = codigo;
        this.precio = precio;
        this.fechaEmision = fechaEmision;
    }

    //Getter y Setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
