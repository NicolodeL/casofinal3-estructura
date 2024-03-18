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
    public Abeja reproducirse(Abeja pareja) {
        // Crear una nueva abeja con los atributos promedio de los padres
        int nuevaSalud = (this.salud + pareja.salud) / 2;
        int nuevoTamañoDeAguijon = (this.tamañoDeAguijon + pareja.tamañoDeAguijon) / 2;
        String nuevoColor = this.color.equals(pareja.color) ? this.color : "Mixto";

        return new Abeja("presa", nuevaSalud, 0, "No reproductivo", "Abeja", "Pradera", nuevoTamañoDeAguijon, nuevoColor);
    }
}