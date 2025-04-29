package org.example;

import java.util.Date;

public class TicketVip extends Ticket{
    private String beneficios;

    //Constructor
    public TicketVip(String codigo, double precio, Date fechaEmision, String beneficios) {
        super(codigo, precio, fechaEmision);
        this.beneficios = beneficios;
    }

    //Getter y Setter
    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
