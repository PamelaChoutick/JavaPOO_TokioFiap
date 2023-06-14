package aula2;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;

	public ContaCorrente( int numeroconta, int agencia, String senhaconta,Cliente cliente, double saldoInvestimento) {
		super(numeroconta,  agencia,  senhaconta,  cliente);
		this.saldoInvestimento = saldoInvestimento;
	}

	public void investimento (double valor, Produto produto) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			this.saldoInvestimento = produto.investir(valor);
		}
		
	}
	
	public void resgatar (double valor) {
		if (this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
		}
	}

	public double getSaldoInvestimento() {
		return saldoInvestimento;
	}

	public void setSaldoInvestimento(double saldoInvestimento) {
		this.saldoInvestimento = saldoInvestimento;
	}


	@Override
	public void exibirSaldo2() {
		double saldoTotal = this.saldo + this.saldoInvestimento;

		System.out.println("Cliente: " + this.cliente.getNometitular() + " - saldo: " + this.saldo);
		System.out.println("Saldo de Investimento: " + this.saldoInvestimento);
		System.out.println("Saldo Total: " + saldoTotal);

	}


}