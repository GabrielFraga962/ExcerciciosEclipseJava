package ListaExercíciosLaçosRepetição;

import java.util.Scanner;

public class Exercício5 {
		
	
	double num, soma=0;
	
	Scanner ler = new Scanner (System.in);
	
	do {
		System.out.println("Entre com um número ");
		num = ler.nextDouble();
		soma += num;
	} while (num != 0);
	  
	System.out.println("O total da soma é: " + soma);

 }
	
}
