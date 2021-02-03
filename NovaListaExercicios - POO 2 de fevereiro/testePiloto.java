package NovaListaExercicios;

import java.util.Scanner;
public class testePiloto {

	public static void main(String[] args) {
		
		String Fabricante = null, Modelo = null;
		int numAssentos = 0, custoProducao = 0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qauntas unidades você gostaria de fabricar? ");
		int F = ler.nextInt();
		
		Aviao [] nAviao = new Aviao [F];
		
		for (int x=0;x<F;x++) {
			
			System.out.println("Qual o modelo?");
			Modelo = ler.next();
			System.out.println("Preço médio do modelo?");
			custoProducao = ler.nextInt();
			System.out.println("Qual é a quantidade de assentos?");
			numAssentos = ler.nextInt();
			
			
			nAviao[x] = new Aviao (Fabricante,Modelo,numAssentos,custoProducao);								
		}	
for (int x=0;x<F;x++) {
			
			nAviao [x].ImprimirProducao();
			System.out.println("-----------------------");
		
		}
	} 

	
}

