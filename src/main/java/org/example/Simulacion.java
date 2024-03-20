package Dinamicas;

import ModeloEntidades.Organismo;
import java.util.ArrayList;
import java.util.List;

public class Simulacion {
    private List<Organismo> organismos;

    public Simulacion() {
        this.organismos = new ArrayList<>();
    }

    public void agregarOrganismo(Organismo organismo) {
        this.organismos.add(organismo);
    }

    public void ejecutarEvento() {
        enfermedad.realizarEvento(this.organismos);
    }
}