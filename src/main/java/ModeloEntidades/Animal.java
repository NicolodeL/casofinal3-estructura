package ModeloEntidades;

public class Animal extends Organismo {
    private String alimentacion;

    public Animal(String posicion, int salud, int edad, String estadoReproductivo, String alimentacion, String habitat) {
        super(posicion, salud, edad, estadoReproductivo, habitat);
        this.alimentacion = alimentacion;
    }
}