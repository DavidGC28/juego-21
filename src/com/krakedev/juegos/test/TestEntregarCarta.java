package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.servicios.Dealer;

public class TestEntregarCarta {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();

        System.out.println("Total cartas iniciales: " + dealer.getNaipe().size()); // 52


        Carta c1 = dealer.entregarCarta();
        Carta c2 = dealer.entregarCarta();

        System.out.print("Carta 1 entregada: ");
        if (c1 != null) {
            c1.imprimir();
        }

        System.out.print("Carta 2 entregada: ");
        if (c2 != null) {
            c2.imprimir();
        }

        System.out.println("Total cartas restantes en el mazo: " + dealer.getNaipe().size()); // Debe ser 50
    }
}