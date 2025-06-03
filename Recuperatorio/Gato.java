import Enums.EstadoAnimal;

public class Gato extends Animal{
    private String pelaje;

    //Constructor

    public void Gato(){

    }
    public Gato(String nombre, int edad, EstadoAnimal estado, Duenio duenio, String pelaje) {
        super(nombre, edad, estado, duenio);
        this.pelaje = pelaje;
    }

    //Getter y Setter

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "pelaje='" + pelaje + '\'' +
                '}';
    }
}

