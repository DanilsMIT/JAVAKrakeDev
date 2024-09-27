package com.test;

import java.util.ArrayList;

import com.servicios.Juego;
import com.servicios.Jugadores;

public class GanadorTest {

	public static void main(String[] args) {
		Jugadores jugadores = new Jugadores();
        ArrayList<String> listaJugadores = new ArrayList<>();
        listaJugadores.add("jugador 1");
        listaJugadores.add("jugador 2");
        listaJugadores.add("jugador 3");
        listaJugadores.add("jugador 4");
        listaJugadores.add("jugador 5");
        listaJugadores.add("jugador 6");
        listaJugadores.add("jugador 7");

        jugadores.setJugadores(listaJugadores);
        
        Juego juego = new Juego(jugadores.getJugadores());
        juego.entregarCartas(4);
        
        for (int i = 0; i < jugadores.getJugadores().size(); i++) {
            int total = juego.devolverTotal(i);
            System.out.println("Total del jugador " + (i + 1) + ": " + total);
        }

        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
	}

}
