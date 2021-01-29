package ExcerciciosArray;
 
import java.util.*;
public class Ex4Matriz3X3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] matriz = new  int [ 3 ] [ 3 ];
		int somamat =  0 , somadiago =  0 , L , C ;
		
		Scanner ler =  new  Scanner (System.in);
		for ( L = 0; L <3; L ++ ) {
			for( C = 0; C <3; C ++ ) {
				System.out.printf ("\nEntre com o valor da Matriz [% d] [% d] da matriz " , L , C );
				matriz [ L ] [ C ] = ler . nextInt ();
				somamat = somamat + matriz [ L ] [ C ];
			}
		}
		somadiago = matriz [ 0 ] [ 0 ] + matriz [ 1 ] [ 1 ] + matriz [ 2 ] [ 2 ];
		System.out.println("");
		System.out.println ( " A soma dos valores da matriz é igual a: "  + somamat);
		System.out.println("");
		System.out.println ( " A soma dos valores da diagonal principal é igual a: "  + somadiago);
	}

}
