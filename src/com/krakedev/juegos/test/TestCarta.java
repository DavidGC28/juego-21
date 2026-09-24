package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;

public class TestCarta {

    public static void main(String[] args) {
        Carta c1 = new Carta("A", "CR", 11);
        Carta c2 = new Carta("10", "CN", 10);
        Carta c3 = new Carta("K", "D", 10);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}