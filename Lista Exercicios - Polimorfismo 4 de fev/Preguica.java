package ListaExerciciosPoli;

public class Preguica extends Animal {
	
	public Preguica ()
	{
		super("Nico",8);
	}
	@Override
	public void Caminhar()
	{
		System.out.println("E agora, estou subindo para um cochilo...");
	}
	@Override	
	public void Ruido ()
	{
		System.out.println("AAAAAAHHHHZZZZ");
	}
	

}
