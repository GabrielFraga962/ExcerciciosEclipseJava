package ListaExcercicios;


import java.util.*;
public class Excercio1 {
	
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
	int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
	
	System.out.println("Veja a sua idade em dias\n\n"); 

	System.out.println("Sua idade em anos: ");
	IdadeAnos = ler.nextInt();
	
	System.out.println("Sua idade em meses: ");
	IdadeMeses = ler.nextInt();

	System.out.println("Sua idade em dias: ");
	IdadeDias = ler.nextInt();


	IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
	System.out.println("Sua idade em dias é = "+IdadeTotalDias+"\n");
	
	}

}
