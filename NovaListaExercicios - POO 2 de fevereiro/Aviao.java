package NovaListaExercicios;

import java.util.Scanner;

public class Aviao {
	
	private String NomeFabricante;
	private String numModelo;
	private int numAssentos;
	private int custoProducao;
	
	public Aviao (String NomeFabricante, String numModelo, int numAssentos, int custoProducao)
	{
		this.NomeFabricante = NomeFabricante;
		this.numModelo = numModelo;
		this.numAssentos = numAssentos;
		this.custoProducao = custoProducao;
				
	}
	public void ImprimirProducao ()
	{
		System.out.println("Fabricante: "+NomeFabricante+"\nNumero do Modelo: "+numModelo+"\nQtd de Assentos: "+numAssentos+"\nCusto da Produção: "+custoProducao);
	}
	Scanner ler = new Scanner (System.in);

	public int getCustoProducao() {
		return custoProducao;
	}

	public void setCustoProducao(int custoProducao) {
		this.custoProducao = custoProducao;
	}

	public String getNomeFabricante() {
		return NomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		NomeFabricante = nomeFabricante;
	}

	public String getNumModelo() {
		return numModelo;
	}

	public void setNumModelo(String numModelo) {
		this.numModelo = numModelo;
	}

	public int getNumAssentos() {
		return numAssentos;
	}

	public void setNumAssentos(int numAssentos) {
		this.numAssentos = numAssentos;
	}
	
	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	
	

}

	

	
	