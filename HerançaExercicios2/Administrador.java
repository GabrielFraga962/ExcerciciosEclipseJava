package HerançaExercicios2;

public class Administrador extends Pessoa1{
	
	private double ajudaCustos;
	
	public Administrador (String nome, String telefone, String endereco, double ajudaCustos)
	{
		super(nome,endereco,telefone);
		this.ajudaCustos=ajudaCustos;
		
	}
		
		public void imprimirInfo()
		{
			System.out.println("\nNome do Func: "+getNome()+"\nNum Tel: "+getTelefone()+"\nEnderço: "+getEndereco());
	}
		public void calcularDespesas()
		{
			
		}

	public double getAjudaCustos() {
		return ajudaCustos;
	}

	public void setAjudaCustos(double ajudaCustos) {
		this.ajudaCustos = ajudaCustos;
	}


}
