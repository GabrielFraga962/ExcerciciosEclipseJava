package ListaExercicios;

import java.util.*;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double Num;
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Digite um numero: ");
			Num = ler.nextDouble();
		}
		
		if (Num%2 == 0) 
		{
			System.out.printf("O Numero " + Num + " � par e sua raiz � %5.2f",Math.sqrt(Num));
		}
		else
		{
			System.out.printf("O Numero "+ Num+ " � impar e sua raiz � %5.2f",Math.pow(Num, 2));
		}			
	}
}	


