package Dinamicas;

import ModeloEntidades.Organismo;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Terremoto extends Eventos {
    private List<Organismo> organismos;

    public Terremoto(List<Organismo> organismos) {
        this.organismos = organismos;
    }

    @Override
    protected void realizarEvento() {
        Scanner random = null;
        int probabilidad = random.nextInt(2) + 1;
        if (probabilidad == 1) {
            for (Organismo organismo : organismos) {
                organismo.salud -= 5;
            }
        }
        else {
            enfermedad.realizarEvento();
            }
        }
    }
