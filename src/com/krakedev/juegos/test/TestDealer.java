package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestDealer {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        System.out.println("--- IMPRIMIENDO NAIPE COMPLETO (52 CARTAS) ---");
        dealer.imprimirNaipe();
    }
}