package Reto12M2;

public class TestPersona {

	public static void main(String[] args) {
		//Declaro variable del tipo...
		Persona p;
		Persona p2;
		
		//asigno a la variable que guarde el objeto
		p=new Persona("Dahn",20,1.70);
		p2=new Persona("Dain",19,1.67);
		
		//Accedo y cambio los atributos
		
		//imprimo en consola 'sysout + ctrl + space'
		
		System.out.println("p1Nombre: "+p.getNombre());
		System.out.println("p1edad: "+p.getEdad());
		System.out.println("p1Talla: "+p.getEstatura());
		
		System.out.println("p2Nombre: "+p2.getNombre());
		System.out.println("p2edad: "+p2.getEdad());
		System.out.println("p2Talla: "+p2.getEstatura());
		
		

	}

}
