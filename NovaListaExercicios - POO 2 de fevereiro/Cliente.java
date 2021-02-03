package NovaListaExercicios;

public class Cliente {
	private  String primeiroNome;
	private  String endereco;
	private  String cpf;
	private  String estadoCivil;
	private  String genero;
	 
	
	public  Cliente ( String  primeiroNome , String  endereco , String  cpf)
	{
		this. primeiroNome = primeiroNome;
		this . endereco = endereco;
		this . cpf = cpf;
		this . estadoCivil = estadoCivil;
		this . genero = genero;
	
		
	}
		public void imprimirInfo()
		{
			System.out.println(" Cliente: "  + primeiroNome + " \n Endereço: "  + endereco +
					" \n CPF: "  + cpf +  " \n Estado Civil: "  + estadoCivil +  " \n Gênero: "  + genero);
		}
		

	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
		
	}
	
	


