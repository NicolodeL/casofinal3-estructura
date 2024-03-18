package ModeloEntidades;

public class Rosa extends Planta {
    private String color;
    private boolean espinas;

    public Rosa(String posicion, int salud, int edad, String estadoReproductivo, String tipo, String habitat, String color, boolean espinas) {
        super(posicion, salud, edad, estadoReproductivo, "Flor", habitat);
        this.color = color;
        this.espinas = espinas;
    }
}