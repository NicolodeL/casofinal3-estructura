package ModeloEntidades;

public class Ambiente {
    private String clima;
    private String terreno;
    private String recursosDisponibles;

    public Ambiente(String clima, String terreno, String recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }
}