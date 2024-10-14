package com.krakedev.entidades2;

import java.util.Date;

public class Estudiantes {
	private String CI;
	private String nombre;
	private String apellido;
	private String email;
	private Date birth_date;
	private Maestros code_teacher;
	
	public Estudiantes() {}
	public Estudiantes(String cI, String nombre, String apellido, String email, Maestros code_teacher) {
		super();
		CI = cI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.code_teacher = code_teacher;
	}
	public String getCI() {
		return CI;
	}
	public void setCI(String cI) {
		CI = cI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public Maestros getCode_teacher() {
		return code_teacher;
	}
	public void setCode_teacher(Maestros code_teacher) {
		this.code_teacher = code_teacher;
	}
	@Override
	public String toString() {
		return "Estudiantes [CI=" + CI + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", birth_date=" + birth_date + ", code_teacher=" + code_teacher + "]";
	}
	
	
	
}
