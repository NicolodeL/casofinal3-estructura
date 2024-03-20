package ModeloEntidades;

public abstract class Organismo {
    protected String posicion;
    public int salud;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoReproductivo() {
        return estadoReproductivo;
    }

    public void setEstadoReproductivo(String estadoReproductivo) {
        this.estadoReproductivo = estadoReproductivo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void interactuar(Animal otroOrganismo) {
    }

    public abstract void cazar(Animal otroOrganismo);

    public abstract void competir(Animal otroOrganismo);
}
