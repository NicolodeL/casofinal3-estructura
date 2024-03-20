package Dinamicas;

import ModeloEntidades.Organismo;
import ModeloEntidades.Planta;
import java.util.List;

public class enfermedad {
    private List<Organismo> organismos;

    public enfermedad(List<Organismo> organismos) {
        this.organismos = organismos;
    }

    public static void realizarEvento() {
        for (Organismo organismo : organismos) {
            if (!(organismo instanceof Planta)) {
                organismo.salud -= 2;
            }
        }
    }
}