package HerançaExercicios2;

public class Teste2 {
	public static void main(String[] args) {
		
		Administrador Admins1 = new Administrador("Paulo Guarda Chuva", "Rua Ultimo Adeus", "(11)9034-2145", 1000);
		
		Admins1.setNome("Paulo Guarda Chuva");
		Admins1.setEndereco("Rua Ultimo Adeus");
		Admins1.setTelefone("(11)9034-2145");
		Admins1.setAjudaCustos(1000);
		
		Admins1.imprimirInfo();
	}

}
