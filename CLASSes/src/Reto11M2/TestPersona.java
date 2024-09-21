package Reto11M2;

public class TestPersona {

	public static void main(String[] args) {
		//Declaro variable del tipo...
		Persona p;
		Persona p2;
		
		//asigno a la variable que guarde la clase
		p=new Persona();
		p2=new Persona();
		
		//Accedo y cambio los atributos
		
		p.setNombre("Dahn");
		p.setEdad(20);
		p.setEstatura(1.70);
		
		p2.setNombre("Dain");
		p2.setEdad(20);
		p2.setEstatura(1.67);		
		
		//imprimo en consola 'sysout + ctrl + space'
		
		System.out.println("p1Nombre: "+p.getNombre());
		System.out.println("p1edad: "+p.getEdad());
		System.out.println("p1Talla: "+p.getEstatura());
		
		System.out.println("p2Nombre: "+p2.getNombre());
		System.out.println("p2edad: "+p2.getEdad());
		System.out.println("p2Talla: "+p2.getEstatura());
		
		

	}

}
