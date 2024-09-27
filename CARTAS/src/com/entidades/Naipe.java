package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		
		Carta cartaBing;
		int posicionN;
		for(int br=1;br<100;br++) {
			posicionN=Random.obtenerPosicion();
			cartaBing=cartas.get(posicionN);
			if(cartaBing.getEstado().equalsIgnoreCase("N")) {
				cartaBing.setEstado("C");
				auxiliar.add(cartaBing);
			}
		}
		
		Carta cnG;
		for(int b=0;b<cartas.size();b++) {
			cnG=cartas.get(b);
			
			if(cnG.getEstado().equalsIgnoreCase("N")){
				auxiliar.add(cnG);
			}
		}
		return auxiliar;
		
	}
	
	
	
	
	
	
	
	public Naipe() {
		ArrayList<Numero> NPs=new ArrayList<Numero>();
		ArrayList<Carta> c=new ArrayList<Carta>();
		numerosPosibles=NPs;
		cartas=c;
		
		numerosPosibles.add(new Numero("A",11));
		numerosPosibles.add(new Numero("2", 2));  
		numerosPosibles.add(new Numero("3", 3));   
		numerosPosibles.add(new Numero("4", 4));   
		numerosPosibles.add(new Numero("5", 5));   
		numerosPosibles.add(new Numero("6", 6));   
		numerosPosibles.add(new Numero("7", 7));   
		numerosPosibles.add(new Numero("8", 8));   
		numerosPosibles.add(new Numero("9", 9));   
		numerosPosibles.add(new Numero("10", 10)); 
		numerosPosibles.add(new Numero("J", 10));   
		numerosPosibles.add(new Numero("Q", 10));  
		numerosPosibles.add(new Numero("K", 10));
		
		Numero n;
		Palos p= new Palos();
		for(int cb=0;cb<numerosPosibles.size();cb++) {
			n=numerosPosibles.get(cb);
			cartas.add(new Carta(n,p.getCorazonRojo()));
			cartas.add(new Carta(n,p.getCorazonNegro()));
			cartas.add(new Carta(n,p.getDiamante()));
			cartas.add(new Carta(n,p.getTrebol()));
		}
		
		System.out.println("Cantidad de cartas:"+(cartas.size()));

	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

}
