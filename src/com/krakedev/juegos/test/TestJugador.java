package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Dealer;

public class TestJugador {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Jugador jugador = new Jugador("David");

        
        Carta c1 = dealer.entregarCarta();
        Carta c2 = dealer.entregarCarta();

        jugador.recibirCarta(c1);
        jugador.recibirCarta(c2);

        System.out.println("Jugador: " + jugador.getNickname());
        System.out.println("Cantidad de cartas recibidas: " + jugador.getCartas().size());
        
        System.out.println("Cartas en mano:");
        for (Carta c : jugador.getCartas()) {
            c.imprimir();
        }
    }
}