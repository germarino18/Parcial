public class Especialidad {
    private String nombre;

    //Constructor

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
