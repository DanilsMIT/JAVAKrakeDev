package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public void agregarNota(Nota nota) {
		Nota m;
		if(notas.size()==0) {
			notas.add(nota);
		}

		boolean newnota = false;
		if(notas.size()>0) {
		for (int n = 0; n < notas.size(); n++) {
			m = notas.get(n);

			if (m.getMateria().getCodigo() == nota.getMateria().getCodigo()) {
				newnota = false;
			} else {newnota = true;}
		}
		}

		if (newnota == true && nota.getCalificacion() >= 0 & nota.getCalificacion() <= 10) {
			notas.add(nota);
		}

	}

	public void modificarNota(String codeM, double newnota) {
		Nota n;
		for (int m = 0; m < notas.size(); m++) {
			n = notas.get(m);

			if (codeM.equals(n.getMateria().getCodigo()) && newnota >= 0 & newnota <= 10) {
				n.setCalificacion(newnota);
				System.out.println("[Se ha intentado modificar una nota con un valor invalido se mantendra el ultimo registrado]");
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double promedioS = 0;
		double promedio;
		Nota n;
		for (int m = 0; m < notas.size(); m++) {
			n = notas.get(m);
			promedioS += n.getCalificacion();
		}
		promedio = promedioS / notas.size();

		return promedio;
	}

	public void mostrar() {
		System.out.println("--------------------");

		System.out.println("Estudiante [" + "Cedula: " + cedula +" Nombre: " + nombre +" Apellido:  "+apellido+"]");

		Nota n;
		for (int m = 0; m < notas.size(); m++) {
			n = notas.get(m);
			n.mostrar();
		}

		double pF = calcularPromedioNotasEstudiante();
		System.out.println("--------------------");
		System.out.println(" Promedio Total: " + pF);
		System.out.println("====================");

		/*En el test también se imprime el promedio sin agregarlo a este mostrar
		 * sin embargo, en el afan de agregar la palabra 'promedio' que indica de donde
		 * sale ese numero 6.0, se ha agregado aqui tal especificacion.
		 */
	}

	public Estudiante(String cedula, String nombre, String apellido) {
		ArrayList<Nota>x=new ArrayList<Nota>();
		notas=x;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;

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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
