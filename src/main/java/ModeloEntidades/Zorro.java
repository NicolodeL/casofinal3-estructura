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
    public Zorro reproducirse(Zorro pareja) {
        // Crear un nuevo zorro con los atributos promedio de los padres
        int nuevaSalud = (this.salud + pareja.salud) / 2;
        int nuevaLongitudDeCola = (this.longitudDeCola + pareja.longitudDeCola) / 2;
        double nuevaVelocidad = (this.velocidad + pareja.velocidad) / 2;

        return new Zorro("Nueva ubicación", nuevaSalud, 0, "No reproductivo", "Carnívoro", "Pradera", nuevaLongitudDeCola, nuevaVelocidad);
    }
}
