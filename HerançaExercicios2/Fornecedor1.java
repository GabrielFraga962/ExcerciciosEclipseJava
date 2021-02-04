package HerançaExercicios2;

public class Fornecedor1 extends Pessoa1 {
	
	private double valorCredito;
	private double valorDivida;

	
	public Fornecedor1 (String nome, String telefone, String endereco, double valorCredito, double valorDivida)
	{
		super(nome,endereco,telefone);
		this.valorCredito=valorCredito;
		this.valorDivida=valorDivida;
				
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double valorSaldo ()
	{
		double saldo = valorCredito - valorDivida;
		System.out.println("O valor total após o abatimento será de: R$" +saldo);
		return saldo;		
	}
	

}
