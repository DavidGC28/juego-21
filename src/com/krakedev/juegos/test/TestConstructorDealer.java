package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestConstructorDealer {

    public static void main(String[] args) {
    
        Dealer dealer = new Dealer();

       
        System.out.println("=== NAIPE GENERADO POR EL DEALER ===");
        dealer.imprimirNaipe();

       
        System.out.println("\nTotal de cartas en el mazo: " + dealer.getNaipe().size());
    }
}