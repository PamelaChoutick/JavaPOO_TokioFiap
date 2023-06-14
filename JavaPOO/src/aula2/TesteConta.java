package aula2;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente pamela = new Cliente ("14789523680", "47852169z", "Pamela", "Rua Feliz, 1234"); 
		Cliente isabella = new Cliente ("14789525570", "478547859z", "Isabella", "Rua Feliz, 1234"); 
		
		Conta contaPamela = new ContaCorrente ( 1111, 001, "P09876", pamela, 500);
		Conta contaIsabella = new ContaCorrente ( 1478, 001, "I47851", isabella, 500);
		
		CBC cbc = new CBC ();
		LCA lca = new LCA ();
		LCI lci = new LCI ();
		
		contaPamela.depositar(3540.50);
		contaPamela.exibirSaldo();
		contaPamela.sacar(1325.40);
		contaPamela.exibirSaldo();
		 System.out.println("---------------------");
		contaIsabella.depositar(3522.10);
		contaIsabella.exibirSaldo();
		contaIsabella.sacar(1325.40);
		contaIsabella.exibirSaldo();
		System.out.println("---------------------");
		contaPamela.transferir(contaIsabella, 1000);
		contaIsabella.exibirSaldo();
		contaPamela.exibirSaldo();
		System.out.println("---------------------");
		contaIsabella.transferir(contaPamela, 1500);
		contaPamela.exibirSaldo();
		contaIsabella.exibirSaldo();
		System.out.println("----------LCA-----------");
		contaPamela.investimento(lca,1000);
	}
 
}
