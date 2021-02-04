package HerançaExercicios2;

public class Pessoa1 {
	
	protected String nome;
	protected String endereco;
	protected String telefone;
	
	public Pessoa1 (String nome, String endereco,String telefone)
	{
		this.nome =nome;//Construtor
		this.endereco = endereco;
		this.telefone = telefone;
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+ nome +" \nTelefone: "  + telefone +  " \nEndereço: "  + endereco + " " );
	}

}
