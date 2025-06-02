/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baraja;

/**
 *
 * @author Daniel Noriega R
 */
import java.util.*;

public class Baraja {
    private List<Carta> cartas;
    private Random aleatorio;

    
    
    public Baraja() {
        cartas = new ArrayList<>();
        aleatorio = new Random();
        crearBaraja();
    }

    private void crearBaraja() {
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            String color = (palo.equals("Tréboles") || palo.equals("Picas")) ? "Negro" : "Rojo";
            for (String valor : valores) {
                Carta carta = new Carta(palo, color, valor);
                cartas.add(carta);
            }
        }
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

    public void sacarPrimera() {
        if (!cartas.isEmpty()) {
            Carta carta = cartas.remove(0);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en la baraja");
        } else {
            System.out.println("Ya no hay cartas");
        }
    }

    // Saca una carta al azar
    public void sacarCartaAlAzar() {
        if (!cartas.isEmpty()) {
            int posicion = aleatorio.nextInt(cartas.size());
            Carta carta = cartas.remove(posicion);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en la baraja");

        } else {
            System.out.println("Ya no hay cartas");
        }
    }

    // Saca 5 cartas como una mano
    public void sacarMano() {                  
        if (cartas.size() < 5) {
            System.out.println("No hay suficientes cartas para una mano");
            return;
        }

        for (int i = 0; i < 5; i++) {
            Carta carta = cartas.remove(0);
            System.out.println(carta);
        }

        System.out.println("Quedan " + cartas.size() + " cartas en la baraja");
    }
    
     public static void main(String[] args) {
        Baraja baraja = new Baraja();

        System.out.println("Baraja Mezclada!!");
        baraja.mezclar();
        System.out.println("");
        
        System.out.println("la primera carta en la parte superio es:");
        baraja.sacarPrimera();
        System.out.println("");
                
        System.out.println("la primera carta al azar es:");
        baraja.sacarCartaAlAzar();
        System.out.println("");
        
        System.out.println("Las cartas asignadas a tu mano son:");
        baraja.sacarMano();
    }
}
