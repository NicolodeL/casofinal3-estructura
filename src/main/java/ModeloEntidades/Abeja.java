package ModeloEntidades;

public class Abeja extends Animal {
    private int tamañoDeAguijon;
    private String color;

    public Abeja(String posicion, int salud, int edad, String estadoReproductivo, String tipo, String habitat, int tamañoDeAgujon, String color) {
        super(posicion, salud, edad, estadoReproductivo, tipo, habitat);
        this.tamañoDeAguijon = tamañoDeAgujon;
        this.color = color;
    }
}