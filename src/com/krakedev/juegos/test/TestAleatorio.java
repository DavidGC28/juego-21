package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        int maximo = 10;
        
        boolean salioCero = false;
        boolean salioMaximo = false;
        boolean fueraDeRango = false;

        System.out.println("=== GENERANDO 100 NÚMEROS ALEATORIOS (0 A " + maximo + ") ===");

        for (int i = 1; i <= 100; i++) {
            int numeroGenerado = dealer.generarAleatorio(maximo);
            System.out.println("Iteración " + i + ": " + numeroGenerado);

            if (numeroGenerado == 0) {
                salioCero = true;
            }
            if (numeroGenerado == maximo) {
                salioMaximo = true;
            }
            if (numeroGenerado < 0 || numeroGenerado > maximo) {
                fueraDeRango = true;
            }
        }

        System.out.println("\n--- RESULTADOS DE VERIFICACIÓN ---");
        System.out.println("¿Se generó al menos un 0?: " + salioCero);
        System.out.println("¿Se generó al menos el valor máximo (" + maximo + ")?: " + salioMaximo);
        System.out.println("¿Hubo algún número fuera del rango [0, " + maximo + "]?: " + fueraDeRango);
    }
}