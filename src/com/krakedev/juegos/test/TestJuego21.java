package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {
       
        Juego21 juego = new Juego21();

     
        Jugador j1 = new Jugador("David");
        Jugador j2 = new Jugador("Ana");
        Jugador j3 = new Jugador("Carlos");

        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        juego.agregarJugador(j3);

      
        juego.inicializar();

     
        juego.repartirRonda();

       
        System.out.println("=== CARTAS ASIGNADAS A LOS JUGADORES ===");
        for (Jugador jugador : juego.getJugadores()) {
            jugador.imprimir();
            System.out.println("----------------------------------------");
        }

       
        System.out.println("\n=== ESTADO DEL NAIPE TRAS EL REPARTO ===");
        System.out.println("Cartas restantes en el mazo: " + juego.getDealer().getNaipe().size());
        
        System.out.println("\n--- Lista de cartas que siguen en el mazo ---");
        juego.getDealer().imprimirNaipe();
    }
}