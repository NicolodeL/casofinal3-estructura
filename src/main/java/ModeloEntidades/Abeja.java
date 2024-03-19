package ModeloEntidades;

public class Abeja extends Animal {
    private int tamañoDeAguijon;
    private String color;

    public Abeja(String posicion, int salud, int edad, String estadoReproductivo, String tipo, String habitat, int tamañoDeAgujon, String color) {
        super("presa", salud, edad, estadoReproductivo, tipo, "Pradera");
        this.tamañoDeAguijon = tamañoDeAguijon;
        this.color = color;
    }
    public void polinizar(Planta planta) {
        planta.salud += 2; // Aumenta la salud de la planta
        this.salud += 5; // Aumenta la salud de la abeja
    }
    @Override
    public Abeja reproducirse(Animal pareja) {
        if (!(pareja instanceof Abeja)) {
            throw new IllegalArgumentException("La pareja debe ser una Abeja");
        }
        Abeja parejaAbeja = (Abeja) pareja;
        // Crear una nueva abeja con los atributos promedio de los padres
        int nuevaSalud = (this.salud + parejaAbeja.salud) / 2;
        int nuevoTamañoDeAguijon = (this.tamañoDeAguijon + parejaAbeja.tamañoDeAguijon) / 2;
        String nuevoColor = this.color.equals(parejaAbeja.color) ? this.color : "Mixto";

        return new Abeja("Nueva ubicación", nuevaSalud, 0, "No reproductivo", "Abeja", "Pradera", nuevoTamañoDeAguijon, nuevoColor);
    }
}