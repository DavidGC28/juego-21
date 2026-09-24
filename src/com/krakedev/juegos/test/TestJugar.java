package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJugar {

    public static void main(String[] args) {
        Juego21 juego = new Juego21();
        juego.inicializar();

    
        Jugador j1 = new Jugador("David");
        Jugador j2 = new Jugador("Ana");
        Jugador j3 = new Jugador("Carlos");

        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        juego.agregarJugador(j3);

     
        ArrayList<Jugador> ganadores = juego.jugar();

       
        System.out.println("=== ESTADO DE TODOS LOS JUGADORES AL FINAL DE LA PARTIDA ===");
        for (Jugador j : juego.getJugadores()) {
            j.imprimir();
            System.out.println("----------------------------------------------------------");
        }

        System.out.println("\n=== RESULTADO DE GANADORES ===");
        if (ganadores.isEmpty()) {
            System.out.println("No hubo ganadores que obtuvieran exactamente 21 puntos en 3 rondas.");
        } else {
            for (Jugador g : ganadores) {
                System.out.println("¡GANADOR!: " + g.getNickname() + " - Puntaje: " + g.getPuntajeCartas());
            }
        }
    }
}