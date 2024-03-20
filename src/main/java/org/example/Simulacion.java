package org.example;

import ModeloEntidades.*;

import java.util.ArrayList;

public class Simulacion {
    private ArrayList<Organismo> organismos;

    public Simulacion() {
        this.organismos = new ArrayList<>();
    }

    public void agregarOrganismo(Organismo organismo) {
        this.organismos.add(organismo);
    }

    public void ejecutarInteracciones() {
        for (Organismo organismo : organismos) {
            if (organismo instanceof Animal) {
                for (Organismo otroOrganismo : organismos) {
                    if (organismo != otroOrganismo) {
                        if (otroOrganismo instanceof Animal) {
                            ((Animal) organismo).interactuar((Animal) otroOrganismo);
                        } else if (otroOrganismo instanceof Rosa) {
                            ((Rosa) otroOrganismo).pinchar((Animal) organismo);
                        }
                    }
                }
            } else if (organismo instanceof Rosa) {
                for (Organismo otroOrganismo : organismos) {
                    if (organismo != otroOrganismo && otroOrganismo instanceof Abeja) {
                        ((Rosa) organismo).polinizar((Abeja) otroOrganismo);
                    }
                }
            }
        }
    }
}