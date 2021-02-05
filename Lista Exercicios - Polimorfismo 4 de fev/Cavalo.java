package ListaExerciciosPoli;

public class Cavalo extends Animal {
	
	public Cavalo ()
	{
		super("Morgan",25);
	}
	@Override
	public void Caminhar()
	{
		System.out.println("Cavalo correndo... iRaaa!!!");
	}
	@Override
	public void Ruido()
	{
		System.out.println("IRRRIINN! Sai de cima mim...");

	}
}
