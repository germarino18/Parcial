package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Entrada> entradas = new ArrayList<>();
        Ticket ticket1 = new TicketGeneral("123", 2000.00, new Date(2025,05,25));
        List<Horario> horariosDisponibles = new ArrayList<>();
        List<AtraccionTecnico> tecnicosAtraccion = new ArrayList<>();
        List<Mantenimiento> mantenimientos  = new ArrayList<>();

        Horario horario1 = new Horario("12 de Mayo", "10:00 AM", "14:00 PM");
        Horario horario2 = new Horario("12 de Mayo", "16:00 PM", "20:00 PM");
        horariosDisponibles.add(horario1);
        horariosDisponibles.add(horario2);

        AtraccionTecnico tecnico1 = new AtraccionTecnico("Julio", "Electricista");
        AtraccionTecnico tecnico2 = new AtraccionTecnico("Mario", "Soldador");
        tecnicosAtraccion.add(tecnico1);
        tecnicosAtraccion.add(tecnico2);



        Visitante visitante1 = new Visitante("German","1234567", 22, entradas, ticket1);

        Entrada entrada1 = new Entrada(new Date(2025, 05, 11), LocalTime.of(12,30), visitante1);
        Entrada entrada2 = new Entrada(new Date(2025, 05, 11), LocalTime.of(12,30), visitante1);

        //Agregando las entradas a lalista entradas
        entradas.add(entrada1);
        entradas.add(entrada2);

        Atraccion atraccion1 = new Atraccion("Tobogan de agua",20,10,TipoAtraccion.ACUATICA,10, horariosDisponibles,tecnicosAtraccion,mantenimientos);
        Atraccion atraccion2 = new Atraccion("Montaña Rusa", 30, 25, TipoAtraccion.MECANICA, 40, horariosDisponibles, tecnicosAtraccion, mantenimientos);
        Atraccion atraccion3 = new Atraccion("Tobogan pequeño", 15, 10, TipoAtraccion.INFANTIL, 11, horariosDisponibles, tecnicosAtraccion, mantenimientos);


        List<String> especialidades = new ArrayList<>();
        String especialidad1 = "Seguridad Privada";
        String especialidad2 = "Atención al público";
        especialidades.add(especialidad1);
        especialidades.add(especialidad2);

        List<Incidente> incidentes = new ArrayList<>();
        Incidente incidente1 = new Incidente(new Date(2025,05,15),visitante1,atraccion1,EstadoIncidente.REPORTADO,"Problema en la fila de la Atraccion acuatica");
        Incidente incidente2 = new Incidente(new Date(2025,05,15),visitante1,atraccion3,EstadoIncidente.RESUELTO,"El visitante tuvo conflictos por su hijo en la atraccion infantil.");
        incidentes.add(incidente1);
        EmpleadoSeguridad empleado1 = new EmpleadoSeguridad(11, "Gaston", especialidades, incidentes);


        Reporte reporte1 = new Reporte(01, "Lista de reportes del mes de Mayo", new Date(2025,05,16),incidentes);


        Mantenimiento mantenimiento = new Mantenimiento(new Date(2025,05,20),"Poca presion de agua para la atraccion acuatica",tecnico1);
    }

}