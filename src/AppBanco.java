
// import java.util.Scanner;

import model.Conta;

public class AppBanco {
	public static void main(String args[]) {
	//canner teclado = new Scanner(System.in);
		

		Conta[] contas = new Conta[10];
		

		for (int pos = 0; pos < contas.length; pos++) {
			contas[pos] = new Conta("111.111.111-1" + pos, 10000 + pos, pos);
			contas[pos].creditar(1000 + (pos * 100));

		}
		
		for (int pos=0; pos < contas.length; pos++) {
			System.out.println(contas[pos].exibirInfo());
		}
		
	 /*boleean achou=false;
		
		for (int pos = 0; pos < contas.length && !achou; pos++) {
			if (contas[pos].getNumeroConta() == numero) {
				System.out.println("Conta encontrada");
				System.out.println("CPF do titular"+contas[pos].getCpf());
				System.out.println("Saldo R$ "+contas[pos].getSaldo());
				achou = true;
			}
		}
		if (!achou) {
			System.out.println("Conta não encontrada");
		}*/
	

		

		/*
		 * Conta c1, c2;
		 * 
		 * c1 = new Conta("123.456.789-00", 10001, 1); c2 = new Conta("987.654.321-00",
		 * 20002, 2);
		 * 
		 * 
		 * c1.creditar(4000); c2.creditar(1000);
		 * 
		 * System.out.println(c1.exibirInfo()); System.out.println(c2.exibirInfo());
		 * 
		 * if (c1.debitar(2650.0)) { System.out.println("Debito efetuado"); } else {
		 * System.out.println("Saldo insuficiente"); }
		 * 
		 * if (c2.debitar(1200.0)) { System.out.println("Debito efetuado"); } else {
		 * System.out.println("Saldo insuficiente"); }
		 * System.out.println(c1.exibirInfo()); System.out.println(c2.exibirInfo());
		 * 
		 * // exemplificando uma transferencia
		 * 
		 * if (c1.transferir(200, c2)) { System.out.println("Transferencia efetuada!");
		 * } else { System.out.println("Transferencia nao permitida!"); }
		 * 
		 * System.out.println(c1.exibirInfo()); System.out.println(c2.exibirInfo());
		 */

	}
}
