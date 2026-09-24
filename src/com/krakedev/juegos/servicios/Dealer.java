package com.krakedev.juegos.servicios;

import java.util.ArrayList;
import com.krakedev.juegos.entidades.Carta;

public class Dealer {

    private ArrayList<Carta> naipe;

  
    public Dealer() {
        this.naipe = new ArrayList<>();
        this.generarNaipe();
    }

   
    public void generarNaipe() {
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] palos = {"T", "CN", "D", "CR"};

        for (String palo : palos) {
            for (String valor : valores) {
                Carta nuevaCarta = new Carta(valor, palo);
                this.naipe.add(nuevaCarta);
            }
        }
    }

   
    public void imprimirNaipe() {
        for (Carta carta : this.naipe) {
            carta.imprimir();
        }
    }

 
    public ArrayList<Carta> getNaipe() {
        return naipe;
    }

    public void setNaipe(ArrayList<Carta> naipe) {
        this.naipe = naipe;
    }
}