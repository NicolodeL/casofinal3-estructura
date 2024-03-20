package Dinamicas;

import ModeloEntidades.Organismo;
import java.util.List;

public class enfermedad {

    public static void realizarEvento(List<Organismo> organismos) {
        for (Organismo organismo : organismos) {
            organismo.salud -= 2;
        }
    }
}