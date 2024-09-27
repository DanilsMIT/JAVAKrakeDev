package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Puntajes> puntajes;

	public String determinarGanador() {
		String winner;
		Puntajes p = null;
		int pw = puntajes.get(0).getPuntaje();
		int winnerI = 0;
		for (int u = 0; u < puntajes.size(); u++) {
			p = puntajes.get(u);

			if (pw < p.getPuntaje()) {
				pw = p.getPuntaje();
				winnerI = u;
			}
		}
		winnerI = winnerI + 1;
		winner = Integer.toString(winnerI);
		return winner;
	}

	public int devolverTotal(int idPlayer) {
		int PuntajePlayer = 0;

		Carta c;
		for (int u = 0; u < cartasJugadores.get(idPlayer).size(); u++) {
			c = cartasJugadores.get(idPlayer).get(u);
			PuntajePlayer = PuntajePlayer + c.getNumero().getValor();
		}

		Puntajes p = new Puntajes(PuntajePlayer);
		puntajes.add(p);
		return PuntajePlayer;
	}

	public Juego(ArrayList<String> players) {
		ArrayList<ArrayList<Carta>> cJ = new ArrayList<ArrayList<Carta>>();
		cartasJugadores = cJ;

		Naipe n = new Naipe();
		ArrayList<Carta> nb = n.barajar();
		naipeBarajado = nb;

		for (int o = 0; o < players.size(); o++) {
			ArrayList<Carta> npl = new ArrayList<Carta>();
			cartasJugadores.add(npl);
		}

		ArrayList<Puntajes> pl = new ArrayList<Puntajes>();
		cartasJugadores = cJ;
		puntajes = pl;
	}

	public void entregarCartas(int n) {
		int reparto = n * cartasJugadores.size();

		ArrayList<Carta> cartasAEntregar = new ArrayList<Carta>();
		Carta cE;
		for (int p = 0; p < reparto; p++) {
			cE = naipeBarajado.get(p);
			cartasAEntregar.add(cE);
		}

		for (int u = 0; u < n; u++) {
			for (int a = 0; a < cartasJugadores.size(); a++) {
				cartasJugadores.get(a).add(cartasAEntregar.remove(0));
			}
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

}
