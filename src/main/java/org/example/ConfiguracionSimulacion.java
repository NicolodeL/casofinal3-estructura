package org.example;

import java.util.Scanner;

public class ConfiguracionSimulacion {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la configuración de la simulación.");
        System.out.println("Por favor, introduce el número de organismos:");
        int numOrganismos = scanner.nextInt();
        // Aquí puedes usar numOrganismos para configurar la simulación
        System.out.println("La simulación se ha configurado con " + numOrganismos + " organismos.");
    }
}