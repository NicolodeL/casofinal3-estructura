package ModeloEntidades;

public class Rosa extends Planta {
    private String color;
    private boolean espinas;

    public Rosa(String posicion, int salud, int edad, String estadoReproductivo, String tipo, String habitat, String color, boolean espinas) {
        super(posicion, salud, edad, estadoReproductivo, tipo, habitat);
        this.color = color;
        this.espinas = espinas;
    }

    public Rosa(String posicion, int salud, int edad, String estadoReproductivo, String habitat) {
        super(posicion, salud, edad, estadoReproductivo, "Flor", habitat);
        this.color = "Rojo"; // Valor predeterminado
        this.espinas = true; // Valor predeterminado
    }

    public void pinchar(Animal animal) {
        if (espinas) {
            animal.salud -= 2; // Disminuye la salud del animal en 2 si la rosa tiene espinas
        }
    }

    public Rosa polinizar(Abeja rosa) {
        if (this.getEstadoReproductivo().equals("Reproductivo")) {
            return new Rosa("Nueva ubicación", 5, 0, "No reproductivo", "Flor", "Pradera", this.color, this.espinas);
        } else {
            throw new IllegalStateException("La rosa no está en el estado reproductivo adecuado para ser polinizada");
        }
    }
}