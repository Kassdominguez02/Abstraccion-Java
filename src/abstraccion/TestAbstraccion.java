package abstraccion;

public class TestAbstraccion {

	public static void main(String[] args) {
		
		//isntancia de la clase automovil
		Automovil spark=new Automovil();
		
		//instancia de la clase motocicleta
		
		Motocicleta ninja=new Motocicleta();
		
		//lamamos a los metodos de casa instancia
		
		spark.acelerar();
		ninja.acelerar();
		
		spark.frenar();
		ninja.frenar();
		
		

	}//cierre main

}// cierre clase
 