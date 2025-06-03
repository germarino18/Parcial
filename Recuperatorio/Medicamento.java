public class Medicamento {
    private String nombre;
    private String dosis;

    //Constuctor

    public void Medicamento(){

    }
    public Medicamento(String nombre, String dosis) {
        this.nombre = nombre;
        this.dosis = dosis;
    }

    //Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", dosis='" + dosis + '\'' +
                '}';
    }
}
