package ModeloEntidades;

public class Abeja extends Animal {
    private int tamañoDeAguijon;
    private String color;

    public Abeja(String posicion, int salud, int edad, String estadoReproductivo, String tipo, String habitat, int tamañoDeAgujon, String color) {
        super("presa", salud, edad, estadoReproductivo, tipo, habitat);
        this.tamañoDeAguijon = tamañoDeAguijon;
        this.color = color;
    }
    public void polinizar(Planta planta) {
        planta.salud += 2; // Aumenta la salud de la planta
        this.salud += 5; // Aumenta la salud de la abeja
    }
}