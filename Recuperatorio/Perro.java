import Enums.EstadoAnimal;

public class Perro extends Animal{
    private String raza;

    //Constructor

    public void Perro(){

    }
    public Perro(String nombre, int edad, EstadoAnimal estado, Duenio duenio, String raza) {
        super(nombre, edad, estado, duenio);
        this.raza = raza;
    }

    //Getter y Setter

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
