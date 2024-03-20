package ModeloEntidades;

public class Zorro extends Animal {
    private int longitudDeCola;
    private double velocidad;

    public Zorro(String posicion, int salud, int edad, String estadoReproductivo, String alimentacion, String habitat) {
        super(posicion, salud, edad, estadoReproductivo, alimentacion, habitat);
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

    @Override
    public Zorro reproducirse(Animal pareja) {
        if (!(pareja instanceof Zorro)) {
            throw new IllegalArgumentException("La pareja debe ser un Zorro");
        }
        Zorro parejaZorro = (Zorro) pareja;
        // Crear un nuevo zorro con los atributos promedio de los padres
        int nuevaSalud = (this.salud + parejaZorro.salud) / 2;
        int nuevaLongitudDeCola = (this.longitudDeCola + parejaZorro.longitudDeCola) / 2;
        double nuevaVelocidad = (this.velocidad + parejaZorro.velocidad) / 2;

        return new Zorro("Nueva ubicación", nuevaSalud, 0, "No reproductivo", "Carnívoro", "Pradera");
    }
}

