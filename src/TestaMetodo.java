
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoMikael = new Conta();
		contaDoMikael.saldo = 100;
		contaDoMikael.deposita(50); // valor a ser depositado
		System.out.println(contaDoMikael.saldo);

		boolean conseguiuRetirar = contaDoMikael.saca(20);
		System.out.println(contaDoMikael.saldo);
		System.out.println(conseguiuRetirar);
	
		Conta contaDaNeia = new Conta();
		contaDaNeia.deposita(1000);
		
		if (contaDaNeia.transfere(300, contaDoMikael)) {
			System.out.println("Transferência feita com sucesso.");
		}else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaDaNeia.saldo);
		System.out.println(contaDoMikael.saldo);
		
		contaDoMikael.titular = "mikael alisson";
		System.out.println(contaDoMikael.titular);
				
	}
}
