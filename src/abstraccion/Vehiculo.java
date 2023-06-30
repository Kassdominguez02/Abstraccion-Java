package abstraccion;

public abstract class Vehiculo {
	
	// atributos
	
	public String marca;
	public int año;
	
	//Metodo concreto
	
	public void mostarInfo() {
		System.out.println("Mi auto es :"+marca+ "del año :" + año);
		
	};
	
	// Metodo abstracto
	
	public  abstract void frenar();
	
	public abstract void acelerar();
	
	

}

/*
 * Abstraccion
 * 
 * en Java una clase abstracta es una clase que no puede ser implementada directamente (que no puede instaciar) sino que se utilizar como una base para crear subclases mas concretas. se utiliza para definir una estructura comun y compartir el comportamiento entre las subclases relacionadas.
 * 
 * una clase abstracta puede implementar metodos concretos (metodos que hemos utilizado hasta ahora) y metodos abstractos.
 * 
 * */
