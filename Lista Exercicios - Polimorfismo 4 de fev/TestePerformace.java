package ListaExerciciosPoli;

import java.util.Scanner;

public class TestePerformace {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;

		int a=0;
		
		do {//a estrutura deve seguir logo abaixo e não junto com o int. Caso contrario loop infinito
			System.out.println("Selecione uma das opções "); // não esquecer de que esta estrutura entra aqui e naão no int
			System.out.println("1 cachorro\n2 cavalo\n3 preguica\n ");
			a = ler.nextInt();
			if (a==1){// estabelece as condiçoes
				animal=cachorro;
				System.out.println("Nome do dog: "+cachorro.getNome()); // tazendo nome da classe Cachorro
				System.out.println("A idade do dog: "+cachorro.getIdade()+" ano(s)");
				cachorro.Caminhar();
				cachorro.Ruido();
			}
			else if (a==2) {
				animal=cavalo;
				System.out.println("Nome do cavalo: "+cavalo.getNome());
				System.out.println("A idade do cavalo: "+cavalo.getIdade()+" ano(s)");
				cavalo.Caminhar();
				cavalo.Ruido();
			}
			else if (a==3) {
				animal=preguica;
				System.out.println("Nome da preguica: "+preguica.getNome());
				System.out.println("A idade da preguica: "+preguica.getIdade()+" ano(s)");
				preguica.Caminhar();
				preguica.Ruido();
			}
			else if (a!=1 && a !=2 && a!=3) { // se então
				System.out.println("Erro, por favor tente novamente!!! \n");
			}
				
		}
		while(a!=1 && a !=2 && a!=3); 
	}
}
		
			
	
	

	
	


