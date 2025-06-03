import Enums.EstadoAnimal;
import Enums.EstadoTratamiento;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {



        Animal perro = new Perro("Timoteo", 5, EstadoAnimal.EN_TRATAMIENTO, new Duenio("German", "Mendoza", "4234567"),"Golden");
        Animal gato = new Gato("Manchas", 3, EstadoAnimal.SANO,new Duenio("Maria", "Las heras", "4567890"),"Naranja");

        FichaMedica fichaPerro = new FichaMedica(perro);
        FichaMedica fichaGato = new FichaMedica(gato);
        perro.setFichaMedica(fichaPerro);
        gato.setFichaMedica(fichaGato);


        Veterinario vet1 = new Veterinario("Manuel", "302346");
        Especialidad esp1 = new Especialidad("Fisioterapeuta de perros");
        Especialidad esp2 = new Especialidad("Operaciones de gatos");
        vet1.agregarEspecialidades(esp1);
        vet1.agregarEspecialidades(esp2);


        Consulta consultaPerro = new Consulta(new Date(2025,06,10),"Perro con pata derecha quebrada",vet1);
        Consulta consultaGato = new Consulta(new Date(2025,06,11),"Gato con pelaje Naranja con vomitos",vet1);
        Tratamiento tratamientoPerro = new Tratamiento("Reposo y masajes cada 30 minutos",EstadoTratamiento.ACTIVO);
        Tratamiento tratamientoGato = new Tratamiento("Reposo y dieta por 1 día",EstadoTratamiento.FINALIZADO);
        consultaPerro.setTratamiento(tratamientoPerro);
        consultaGato.setTratamiento(tratamientoGato);
        Medicamento med1 = new Medicamento("Desinflamatorio","2 pastillas al día");
        Medicamento med2 = new Medicamento("Gotas estomacales","10 gotitas al día");
        tratamientoPerro.setMedicamentos(med1);
        tratamientoGato.setMedicamentos(med2);


        Agenda agenda = new Agenda(vet1);
        Turno turno1 = new Turno(new Date(2025,06,15),"16:00",vet1,perro,true);
        Turno turno2 = new Turno(new Date(2025,06,16),"16:00",vet1,gato,true);
        agenda.setTurnos(turno1);
        agenda.setTurnos(turno2);


        Internacion internacionGato = new Internacion(new Date(2025,06,15),"Contaminacion estomacal", true,new Habitacion(12,"Intensiva"),vet1,gato);
        ArrayList<Internacion> internaciones = new ArrayList<>();
        internaciones.add(internacionGato);

        vet1.mostrarInternacionesActivas(internaciones);

        gato.estaGrave();






    }
}