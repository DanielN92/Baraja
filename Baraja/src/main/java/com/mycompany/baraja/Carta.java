/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baraja;

/**
 *
 * @author Daniel Noriega R
 */
public class Carta {
    private String palo;
    private String color;
    private String valor;

    public Carta(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String obtenerPalo() {
        return palo;
    }

    public String obtenerColor() {
        return color;
    }

    public String obtenerValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Palo: " + palo + ", Color: " + color + ", Valor: " + valor;
    }
}
