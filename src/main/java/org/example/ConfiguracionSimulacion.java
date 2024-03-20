package org.example;

import java.util.Scanner;

public class ConfiguracionSimulacion {
    private static final String USUARIO_CORRECTO = "admin";
    private static final String CONTRASENA_CORRECTA = "password";

    public void iniciar() {
        if (!autenticar()) {
            System.out.println("Acceso denegado.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la configuración de la simulación.");
        System.out.println("Por favor, introduce el número de organismos:");
        int numOrganismos = scanner.nextInt();
        // Aquí puedes usar numOrganismos para configurar la simulación
        System.out.println("La simulación se ha configurado con " + numOrganismos + " organismos.");
    }

    private boolean autenticar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre de usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Por favor, introduce tu contraseña:");
        String contrasena = scanner.nextLine();
        return USUARIO_CORRECTO.equals(usuario) && CONTRASENA_CORRECTA.equals(contrasena);
    }
    private void ejecutarSimulacion(int numOrganismos) {
        // Aquí va el código para ejecutar la simulación
        // Este es solo un ejemplo, necesitarás implementar la lógica de tu simulación
        for (int i = 0; i < numOrganismos; i++) {
            System.out.println("Ejecutando simulación para el organismo " + (i + 1));
        }
}
}