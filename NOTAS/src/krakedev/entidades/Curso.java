package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> Estudiantes;

	public boolean buscarEstudiantePorCedula(Estudiante student) {
		boolean r = true;
		Estudiante e;
		for (int es = 0; es < Estudiantes.size(); es++) {
			e = Estudiantes.get(es);
			if (e.getCedula()==student.getCedula() ) {
				r = true;
				System.out.println("Un estudiante ya registrado con tal cedula");
				break;
				
			} else {
				r = false;
			}
		}

		return r;

	}

	public void matricularEstudiante(Estudiante student) {
		if (Estudiantes.size()==0) {
			Estudiantes.add(student);
		}

		if (Estudiantes.size()>0) {
			boolean cnE = buscarEstudiantePorCedula(student);
			if (cnE == false) {
				Estudiantes.add(student);
			}
		}
	}

	public double calcularPromedioCurso() {
		double pC = 0;
		double pCT = 0;

		Estudiante e;
		for (int o = 0; o < Estudiantes.size(); o++) {
			e = Estudiantes.get(o);
			double pmr = e.calcularPromedioNotasEstudiante();
			pC = pC + pmr;
		}

		pCT = pC / Estudiantes.size();
		return pCT;
	}

	public void mostrar() {
		System.out.println("====================");
		System.out.println("Curso");		
		Estudiante e;
		for (int n = 0; n < Estudiantes.size(); n++) {
			e = Estudiantes.get(n);
			e.mostrar();
		}
		System.out.println("====================");
		System.out.println("====================");
		double pCET = calcularPromedioCurso();
		System.out.println("Promedio del Curso: " + pCET);
		System.out.println("====================");
		System.out.println("====================");

	}

	public Curso() {
		ArrayList<Estudiante> z = new ArrayList<Estudiante>();
		Estudiantes = z;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return Estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		Estudiantes = estudiantes;
	}

}
