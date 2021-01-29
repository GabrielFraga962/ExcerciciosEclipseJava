package ListaExercíciosLaçosRepetição;

import java.util.Scanner;
public class Exercício3 {

	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99.
		
		public static void main(String[] args) {
			

	int idade = 0, menor21= 0, maior50=0;
			
			while (idade != -99) {
				
				Scanner ler = new Scanner (System.in);			
				System.out.println("\nEntre com a sua idade: \n ");
				idade = ler.nextInt();
					
				if (idade < 21 && idade >0) {
					menor21++;
				}else if (idade > 50 && idade < 115) {
					maior50++;
				}
				
				System.out.printf("\n O Total com menos de 21 anos é: %d",menor21);
				System.out.printf("\n O Total com mais de 50 anos é: %d",maior50);
				break;
			}
			
		}

	}
