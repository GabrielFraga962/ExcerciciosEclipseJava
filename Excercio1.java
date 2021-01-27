package ListaExercicios;

import java.util.Scanner;

public class Excercio1 {

	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner (System.in)) {
			int n1, n2, n3;
			
			System.out.println("Digite o 1º numero inteiro: ");
			n1 = ler.nextInt();
			System.out.println("Digite o 2° numero inteiro: ");
			n2 = ler.nextInt();
			System.out.println("Digite o 3° numero inteiro: ");
			n3 = ler.nextInt();
			
			if (n1 > n2)
			{
			    if(n1 > n3)
			    {
			        System.out.printf("O maior numero e: %d\n", n1);
			    }
			    else
			    {
			        System.out.printf("O maior numero e: %d\n", n3);
			    }
			}
			else
			{
			    if(n2 > n3)
			    {
			        System.out.printf("O maior numero e: %d\n", n2);
			    }
			    else
			    {
			        
			    	System.out.printf("O maior numero é: %d\n", n3);
			        
			    }				
			}
		}		
	}
}
