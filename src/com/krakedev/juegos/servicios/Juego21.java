package com.krakedev.juegos.servicios;

import java.util.ArrayList;
import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

    private ArrayList<Jugador> jugadores;
    private Dealer dealer;

    public Juego21() {
        this.jugadores = new ArrayList<>();
    }

   
    public void cargarValores() {
        if (dealer != null && dealer.getNaipe() != null) {
            for (Carta carta : dealer.getNaipe()) {
                String valor = carta.getValor();
                if ("A".equals(valor)) {
                    carta.setValorJuego(11);
                } else if ("J".equals(valor) || "Q".equals(valor) || "K".equals(valor)) {
                    carta.setValorJuego(10);
                } else {
                    carta.setValorJuego(Integer.parseInt(valor));
                }
            }
        }
    }


    public void inicializar() {
        this.dealer = new Dealer();
        this.cargarValores();
    }


    public void agregarJugador(Jugador jugador) {
        if (jugador != null) {
            this.jugadores.add(jugador);
        }
    }


    public void repartirCarta(Jugador jugador) {
        if (dealer != null && jugador != null) {
            Carta cartaEntregada = dealer.entregarCarta();
            jugador.recibirCarta(cartaEntregada);
        }
    }


    public void repartirRonda() {
        if (this.jugadores != null) {
            for (Jugador jugador : this.jugadores) {
                repartirCarta(jugador);
            }
        }
    }

    // Getters y Setters
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
}