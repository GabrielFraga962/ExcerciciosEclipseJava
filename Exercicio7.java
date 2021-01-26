package ListaExcercicios;

import java.util.Scanner;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		double A, B, C, D, E, F;
		int X,Y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A ");
		A = ler.nextInt(); 
		System.out.println("Digite o valor de B ");
		B = ler.nextInt(); 
		System.out.println("Digite o valor de C ");
		C = ler.nextInt(); 
		System.out.println("Digite o valor de D ");
		D = ler.nextInt(); 
		System.out.println("Digite o valor de E ");
		E = ler.nextInt(); 
		System.out.println("Digite o valor de F ");
		F = ler.nextInt(); 
		
		X = (int) ((C*E)-(B*F) / (A*E) - (B*D));
		Y = (int) ((A*F) - (C*D) / (A*E) - (B*D));
		
		System.out.println("O valor de X é: " + X + " O valor de Y é: " + Y);


	}

}
