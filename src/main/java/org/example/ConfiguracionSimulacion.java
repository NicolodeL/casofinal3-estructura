package org.example;

import org.example.Simulacion;
import ModeloEntidades.*;
import Dinamicas.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ConfiguracionSimulacion {
    private static final String USUARIO_CORRECTO = "admin";
    private static final String CONTRASENA_CORRECTA = "password";
    private Simulacion simulacion;

    public ConfiguracionSimulacion() {
        this.simulacion = new Simulacion();
    }

    public int iniciar() {
        if (!autenticar()) {
            System.out.println("Acceso denegado.");
            return 0;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la configuración de la simulación.");
        System.out.println("Por favor, introduce el número de organismos:");
        int numOrganismos = scanner.nextInt();
        System.out.println("La simulación se ha configurado con " + numOrganismos + " organismos.");
        return numOrganismos;
    }

    private boolean autenticar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre de usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Por favor, introduce tu contraseña:");
        String contrasena = scanner.nextLine();
        return USUARIO_CORRECTO.equals(usuario) && CONTRASENA_CORRECTA.equals(contrasena);
    }

    public void ejecutarSimulacion(int numOrganismos) {
        Random random = new Random();
        for (int i = 0; i < numOrganismos; i++) {
            String posicion = "Posición " + (i + 1);
            int salud = random.nextInt(100);
            int edad = random.nextInt(100);

            Organismo organismo;
            switch (random.nextInt(4)) {
                case 0:
                    organismo = new Abeja(posicion, salud, edad, "reproductivo", "herbívoro", "bosque", 1, "Amarillo");
                    break;
                case 1:
                    organismo = new Zorro(posicion, salud, edad, "reproductivo", "carnívoro", "bosque");
                    break;
                case 2:
                    organismo = new Rosa(posicion, salud, edad, "reproductivo", "bosque");
                    break;
                default:
                    organismo = new Amanitamuscaria(posicion, salud, edad, "reproductivo", "bosque");
                    break;
            }

            simulacion.agregarOrganismo(organismo);
            System.out.println("Ejecutando simulación para el organismo " + (i + 1));
        }
    }
}