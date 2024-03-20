package ModeloEntidades;

public abstract class Planta extends Organismo {
    private String tipo;

    public Planta(String posicion, int salud, int edad, String estadoReproductivo, String tipo, String habitat) {
        super(posicion, salud, edad, estadoReproductivo, habitat);
        this.tipo = tipo;
    }

    public Planta reproducirse(Planta pareja) {
        return null;
    }
}