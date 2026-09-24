package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestValidarGanador {

    public static void main(String[] args) {
        Juego21 juego = new Juego21();
        
     
        Jugador j1 = new Jugador("David");
        Jugador j2 = new Jugador("Ana");
        Jugador j3 = new Jugador("Carlos");

        
        
        j1.recibirCarta(new Carta("A", "CR", 11));
        j1.recibirCarta(new Carta("K", "CN", 10));

        
        j2.recibirCarta(new Carta("10", "D", 10));
        j2.recibirCarta(new Carta("9", "T", 9));

        
        j3.recibirCarta(new Carta("J", "CR", 10));
        j3.recibirCarta(new Carta("A", "T", 11));

        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        juego.agregarJugador(j3);

       
        juego.calcularTotal();

        
        ArrayList<Jugador> ganadores = juego.validarGanador();

        System.out.println("=== LISTA DE GANADORES (PUNTAJE = 21) ===");
        if (ganadores.isEmpty()) {
            System.out.println("No hubo ganadores con 21 puntos.");
        } else {
            for (Jugador g : ganadores) {
                System.out.println("Ganador: " + g.getNickname() + " - Puntaje: " + g.getPuntajeCartas());
            }
        }
    }
}