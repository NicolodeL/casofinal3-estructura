package Dinamicas;

import ModeloEntidades.*;


import java.util.List;

public class CrecerPoblacion {
    public static void crecerPoblacion(List<Organismo> organismos) {
        for (Organismo organismo : organismos) {
            if (organismo instanceof Animal) {
                Animal animal = (Animal) organismo;
                if (animal.getEstadoReproductivo().equals("Reproductivo")) {
                    Animal descendencia = animal.reproducirse(animal);
                    organismos.add(descendencia);
                }
            } else if (organismo instanceof Planta) {
                Planta planta = (Planta) organismo;
                if (planta.getEstadoReproductivo().equals("Reproductivo")) {
                    Planta descendencia = planta.reproducirse(planta);
                    organismos.add(descendencia);
                }
            }
        }
    }
}