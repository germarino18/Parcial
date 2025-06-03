import Enums.EstadoAnimal;

public abstract class Animal {
    private String nombre;
    private int edad;
    private EstadoAnimal estado;
    private FichaMedica fichaMedica;
    private Duenio duenio;

    //Constructor

    public void Animal(){

    }
    public Animal(String nombre, int edad, EstadoAnimal estado, Duenio duenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.duenio = duenio;
    }

    //Geter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public FichaMedica getFichaMedica() {
        return fichaMedica;
    }

    public void setFichaMedica(FichaMedica fichaMedica) {
        this.fichaMedica = fichaMedica;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado=" + estado +
                ", fichaMedica=" + fichaMedica +
                ", duenio=" + duenio +
                '}';
    }

    public boolean estaGrave(){
        if (estado == EstadoAnimal.GRAVE){
            return true;
        }
        return false;
    }
}
