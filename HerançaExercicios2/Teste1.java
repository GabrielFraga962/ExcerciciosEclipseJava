package HerançaExercicios2;

public class Teste1 {
	public static void main(String[] args) {
		
		Fornecedor1 Fornecedor [] = new Fornecedor1 [3]; 
		
		
		Fornecedor [0] = new Fornecedor1 ( " Arthur Morgan " , " Rua 2345, 30 " , " 3450-1456 " , 7100.00f , 200.00f );
		Fornecedor [1] = new Fornecedor1 ( " Dioclines " , " Rua 0964, 24 " , " 0934-5621 " , 2500.00f , 900.00f );
		Fornecedor [2] = new Fornecedor1 ( " Nikola Tesla " , " Rua 8563, 90 " , " 9324-1145 " , 7900.00f , 100.00f );
		
		for (int i = 0 ; i < Fornecedor . length; i ++);
		{
			int i = 0;
			Fornecedor [i] . imprimirInfo ();
			Fornecedor [i] . valorSaldo ();
			
		}
	}

}
