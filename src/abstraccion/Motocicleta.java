package abstraccion;

public class Motocicleta extends Vehiculo {

	// las anotaciones @ son indicaciones que le damos a Java
	
	@Override
	public void frenar() {
		System.out.println("la moto esta frenando");
		
	}
// la sub clase decide como y cuando se sobreescribe el metodo abstracto. Es decir, la sub-clase implementa el metodo.
	@Override
	public void acelerar() {
		System.out.println("la moto esta acelerando");
		
	}

}
