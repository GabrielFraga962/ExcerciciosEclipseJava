package ListaExercicios;

import java.util.*;

public class Excercicio2 {
	
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner (System.in)) {
			int A,B,C;
			
			System.out.println("Entre como primeiro valor: ");
			A = ler.nextInt();
			System.out.println("Entre como segundo valor: ");
			B = ler.nextInt();
			System.out.println("Entre como terceiro valor: ");
			C = ler.nextInt();
			System.out.println("Os seguintes valores na oredem crescente são:");

			if(A<B) {
				
				if(B<C) {					
					System.out.println(A+"\n"+B+"\n"+C);					
				}
				else if (A < C) {
					System.out.println(A+"\n"+C+"\n"+B);
				}else {
					System.out.println(C+"\n"+A+"\n"+B);
				}
			}
			else if (B < C) {
				if (A < C) {
					System.out.println(B+"\n"+A+"\n"+C);
				}else {
					System.out.println(B+"\n"+C+"\n"+A);
				}
			}else {
				System.out.println(C+"\n"+B+"\n"+A);
			}
		}
	}
}