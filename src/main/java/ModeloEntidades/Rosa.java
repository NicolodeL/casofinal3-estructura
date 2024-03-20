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
    public Rosa polinizar(Abeja abeja) {
        if (this.getEstadoReproductivo().equals("Reproductivo")) {
            return new Rosa("Nueva ubicación", 5, 0, "No reproductivo", "Flor", "Pradera", this.color, this.espinas);
        } else {
            throw new IllegalStateException("La rosa no está en el estado reproductivo adecuado para ser polinizada");
        }
    }
}