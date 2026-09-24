package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("         PRIMERA PRUEBA: UN JUEGO        ");
        System.out.println("=========================================\n");

        Juego21 juegoPrueba1 = new Juego21();
        juegoPrueba1.inicializar();

        Jugador j1 = new Jugador("David");
        Jugador j2 = new Jugador("Ana");
        Jugador j3 = new Jugador("Carlos");

        juegoPrueba1.agregarJugador(j1);
        juegoPrueba1.agregarJugador(j2);
        juegoPrueba1.agregarJugador(j3);

        ArrayList<Jugador> ganadoresPrueba1 = juegoPrueba1.jugar();

        System.out.println("--- Cartas y Puntajes Finales ---");
        for (Jugador j : juegoPrueba1.getJugadores()) {
            j.imprimir();
            System.out.println("---------------------------------");
        }

        if (ganadoresPrueba1.isEmpty()) {
            System.out.println("Resultado: No hubo ganadores con 21 puntos en esta partida.");
        } else {
            for (Jugador g : ganadoresPrueba1) {
                System.out.println("¡GANADOR!: " + g.getNickname() + " con " + g.getPuntajeCartas() + " puntos.");
            }
        }


        System.out.println("\n=========================================");
        System.out.println("     SEGUNDA PRUEBA: FOR 10 ITERACIONES   ");
        System.out.println("=========================================\n");

        Juego21 juegoBucle = new Juego21();
        
        // Creamos los jugadores una sola vez
        Jugador p1 = new Jugador("David");
        Jugador p2 = new Jugador("Ana");
        Jugador p3 = new Jugador("Carlos");

        juegoBucle.agregarJugador(p1);
        juegoBucle.agregarJugador(p2);
        juegoBucle.agregarJugador(p3);

        for (int i = 1; i <= 10; i++) {
            System.out.println(">>> ITERACIÓN DE JUEGO #" + i + " <<<");

         
            for (Jugador j : juegoBucle.getJugadores()) {
                j.limpiarMano();
            }

  
            juegoBucle.inicializar();

            
            ArrayList<Jugador> ganadores = juegoBucle.jugar();

           
            for (Jugador j : juegoBucle.getJugadores()) {
                System.out.println("Jugador: " + j.getNickname() + " | Puntaje: " + j.getPuntajeCartas() + " | Cartas recibidas: " + j.getCartas().size());
            }

          
            if (!ganadores.isEmpty()) {
                System.out.println("¡SE ENCONTRÓ GANADOR EN LA ITERACIÓN " + i + "!");
                for (Jugador g : ganadores) {
                    System.out.println("-> " + g.getNickname() + " logró 21 puntos.");
                }
            } else {
                System.out.println("Sin ganadores (nadie obtuvo 21 puntos).");
            }

            System.out.println("--------------------------------------------------\n");
        }
    }
}