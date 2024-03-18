package ModeloEntidades;

public abstract class Organismo {
    protected String posicion;
    protected int salud;
    protected int edad;
    protected String estadoReproductivo;
    protected String habitat;

    public Organismo(String posicion, int salud, int edad, String estadoReproductivo, String habitat) {
        this.posicion = posicion;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
        this.habitat = habitat;
    }
}
