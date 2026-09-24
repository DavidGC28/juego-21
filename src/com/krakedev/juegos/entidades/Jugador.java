package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {

    private String nickname;
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Jugador() {
    }

    public Jugador(String nickname) {
        this.nickname = nickname;
    }

    public void recibirCarta(Carta carta) {
        if (carta != null) {
            this.cartas.add(carta);
        }
    }

    public void imprimir() {
        System.out.println("Jugador: " + nickname);
        System.out.println("Cartas:");
        for (Carta carta : cartas) {
            carta.imprimir();
        }
    }

    // Getters y Setters
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}