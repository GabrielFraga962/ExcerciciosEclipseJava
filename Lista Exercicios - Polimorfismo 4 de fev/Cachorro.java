package ListaExerciciosPoli;

public class Cachorro extends Animal {	
	 
	public Cachorro() {
		
		super ( "Alex" , 10);	
	}
	@Override
	public void Caminhar()
	{
		System.out.println("Cachorro correndo pelo campo...");
	}
	@Override
	public void Ruido()
	{
		System.out.println("AU AU AU! estou feliz!");

	}
}
