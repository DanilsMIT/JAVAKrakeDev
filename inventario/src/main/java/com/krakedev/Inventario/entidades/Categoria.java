package com.krakedev.Inventario.entidades;

public class Categoria {
	private int code;
	private String name;

	public Categoria(){
	}

	public Categoria(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Categoria [code=" + code + ", name=" + name + "]";
	}
	
	
}
