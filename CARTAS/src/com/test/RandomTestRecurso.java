package com.test;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;
import com.entidades.Random;
import com.servicios.Juego;
import com.servicios.Jugadores;

public class RandomTestRecurso {

	public static void main(String[] args) {
		int posicion;
		int tr = 2;
		for (int n = 0; n < tr; n++) {
			posicion = Random.obtenerPosicion();

			if (posicion >= 0 && posicion <= 51) {
				System.out.println("Posición: " + posicion);
			} else {
				System.out.println("El metodo estatico fallo");
			}
		}

		/// Esta parte esta para comprobar que el
		// metodo barajar agrega cartas en otro orden, comprobandolo en un debug.
		Naipe n = new Naipe();
		ArrayList<Carta> clr = new ArrayList<Carta>();
		clr = n.getCartas();

		ArrayList<Carta> cl = new ArrayList<Carta>();
		cl = n.barajar();

		// Funcionando

		Jugadores jugadores = new Jugadores();
		ArrayList<String> listaJugadores = new ArrayList<>();
		listaJugadores.add("jugador 1");
		listaJugadores.add("jugador 2");
		listaJugadores.add("jugador 3");
		jugadores.setJugadores(listaJugadores);

		Juego juego = new Juego(jugadores.getJugadores());
		juego.entregarCartas(5);

		System.out.println("JUGADORES: "+juego.getCartasJugadores().size());
		
		System.out.println("Cada Jugador tiene: "+juego.getCartasJugadores().get(0).size());
		

	}

}
