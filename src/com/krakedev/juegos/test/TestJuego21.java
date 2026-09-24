package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {
        Juego21 juego = new Juego21();

        
        juego.inicializar();

        
        Jugador j1 = new Jugador("David");
        Jugador j2 = new Jugador("Annie");
        
        juego.agregarJugador(j1);
        juego.agregarJugador(j2);

      
        juego.repartirRonda();
        juego.repartirRonda();

       
        System.out.println("=== ESTADO DE LOS JUGADORES TRAS 2 RONDAS ===");
        for (Jugador j : juego.getJugadores()) {
            j.imprimir();
            System.out.println("------------------------------------");
        }
    }
}