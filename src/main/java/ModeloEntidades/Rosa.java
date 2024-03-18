package ModeloEntidades;

public class Rosa extends Planta {
    private String color;
    private boolean espinas;

    public Rosa(String posicion, int salud, int edad, String estadoReproductivo, String tipo, String habitat, String color, boolean espinas) {
        super("presa", 5, edad, estadoReproductivo, "Flor", habitat);
        this.color = color;
        this.espinas = espinas;
    }
    public void pinchar(Animal animal) {
        if (espinas) {
            animal.salud -= 2; // Disminuye la salud del animal en 2 si la rosa tiene espinas
        }
    }
}