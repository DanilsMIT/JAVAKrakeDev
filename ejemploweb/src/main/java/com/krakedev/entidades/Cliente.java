package com.krakedev.entidades;

public class Cliente {
	private String ci;
	private String name;
	private int nhijos;

	public Cliente() {

	}
	public Cliente(String ci, String name, int nhijos) {
		this.ci = ci;
		this.name = name;
		this.nhijos = nhijos;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getNhijos() {
		return nhijos;
	}

	public void setNhijos(int nhijos) {
		this.nhijos = nhijos;
	}

	@Override
	public String toString() {
		return "Cliente [ci=" + ci + ", name=" + name + ", nhijos=" + nhijos + "]";
	}
}
