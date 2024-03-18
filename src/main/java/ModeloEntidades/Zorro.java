package ModeloEntidades;

public class Zorro extends Animal {
    private int longitudDeCola;
    private double velocidad;

    public Zorro(String posicion, int salud, int edad, String estadoReproductivo, String alimentacion, String habitat, int longitudDeCola, double velocidad) {
        super("competidor", 15, edad, estadoReproductivo, alimentacion, habitat);
        this.longitudDeCola = longitudDeCola;
        this.velocidad = velocidad;
    }
    public void predar(Animal presa) {
        presa.salud -= 10; // Disminuye la salud de la presa
        this.salud += 10; // Aumenta la salud del predador
    }

    public void competirPorRecurso(Animal competidor) {
        competidor.salud -= 5; // Disminuye la salud del competidor
        this.salud -= 5; // Disminuye la salud de este animal
    }
}
