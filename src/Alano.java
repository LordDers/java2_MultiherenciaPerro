// Alano es una mezcla de Dogo y Lebrel (interfaces)
public class Alano extends Perro implements Dogo, Lebrel {
	
	public void pruebaPerro () {
		super.pruebaPerro();
		System.out.println("Alano");
	}
	
	public void pruebaLebrel () {
		System.out.println("Alano Lebrel");
	}
	
	public void pruebaDogo () {
		System.out.println("Alano Dogo");
	}
	
	@Override
	public void mezcla () {
		System.out.println("Es una mezcla de Lebrel y Dogo");
	}
}