package com.cmc.repaso.entidades;

public class Estudiante {
	private String name;
	private double score;
	private String result;

	public Estudiante(String name) {
		this.name = name;
	}

	public void calificar(double score) {
		this.score = score;

		if (score >= 8) {
			this.result = "A";
		} else {
			this.result = "F";
		}
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
