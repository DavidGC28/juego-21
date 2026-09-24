package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestCalcularTotal {

    public static void main(String[] args) {
        Juego21 juego = new Juego21();
        juego.inicializar();

        Jugador j1 = new Jugador("David");
        Jugador j2 = new Jugador("Carlos");

        juego.agregarJugador(j1);
        juego.agregarJugador(j2);

        
        juego.repartirRonda();
        juego.repartirRonda();

        System.out.println("=== VERIFICACIÓN DE PUNTAJE TOTAL DE JUGADORES ===");
        for (Jugador jugador : juego.getJugadores()) {
            jugador.imprimir();
            System.out.println("-------------------------------------------------");
        }
    }
}