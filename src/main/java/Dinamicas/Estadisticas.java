package Dinamicas;

import ModeloEntidades.*;
import java.util.List;

public class Estadisticas {
    private List<Organismo> organismos;

    public Estadisticas(List<Organismo> organismos) {
        this.organismos = organismos;
    }

    public int calcularSaludEcosistema() {
        int saludTotal = 0;
        for (Organismo organismo : organismos) {
            saludTotal += organismo.salud;
        }
        return saludTotal;
    }

    public void calcularTendenciasPoblacionales() {
        int numAnimales = 0;
        int numPlantas = 0;
        for (Organismo organismo : organismos) {
            if (organismo instanceof Animal) {
                numAnimales++;
            } else if (organismo instanceof Planta) {
                numPlantas++;
            }
        }
        System.out.println("Número de animales: " + numAnimales);
        System.out.println("Número de plantas: " + numPlantas);
    }
}
