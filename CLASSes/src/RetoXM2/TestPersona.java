package RetoXM2;

public class TestPersona {

	public static void main(String[] args) {
		//Declaro variable del tipo...
		Persona p;
		Persona p2;
		
		//asigno la variable que guarde el objeto
		p=new Persona();
		p2=new Persona();
		
		//Accedo y cambio los atributos
		
		p.nombre="Dahn";
		p.edad=20;
		p.estatura=1.70;
		
		p2.nombre="Dain";
		p2.edad=20;
		p2.estatura=1.67;		
		
		//imprimo en consola 'sysout + ctrl + space'
		
		System.out.println("p1Nombre: "+p.nombre);
		System.out.println("p1edad: "+p.edad);
		System.out.println("p1Talla: "+p.estatura);
		
		System.out.println("p2Nombre: "+p2.nombre);
		System.out.println("p2edad: "+p2.edad);
		System.out.println("p2Talla: "+p2.estatura);
		
		

	}

}
