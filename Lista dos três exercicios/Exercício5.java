package ListaExerc�ciosLa�osRepeti��o;

import java.util.Scanner;

public class Exerc�cio5 {
		
	
	double num, soma=0;
	
	Scanner ler = new Scanner (System.in);
	
	do {
		System.out.println("Entre com um n�mero ");
		num = ler.nextDouble();
		soma += num;
	} while (num != 0);
	  
	System.out.println("O total da soma �: " + soma);

 }
	
}
