package aula2;
import java.sql.Date;

public abstract class Conta {

	protected long numeroconta;
	protected int agencia;
	protected Date dataconta;
	protected double saldo;
	protected String senhaconta;
	protected Cliente cliente;
	
	public Conta(long numeroconta, int agencia, String senhaconta, Cliente cliente) {
		this.numeroconta = numeroconta;
		this.agencia = agencia;
		this.dataconta = new Date (System.currentTimeMillis());
		this.senhaconta = senhaconta;
		this.cliente = cliente;
		
		System.out.println("Objeto Conta criado!");
		System.out.println("Data abertura: " + this.dataconta);
	}
	
	
	
	public long getNumeroconta() {
		return numeroconta;
	}



	public void setNumeroconta(long numeroconta) {
		this.numeroconta = numeroconta;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public Date getDataconta() {
		return dataconta;
	}



	public void setDataconta(Date dataconta) {
		this.dataconta = dataconta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public String getSenhaconta() {
		return senhaconta;
	}



	public void setSenhaconta(String senhaconta) {
		this.senhaconta = senhaconta;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public boolean sacar(double valor) {
//		if (this.saldo >= valor) {
//			this.saldo -= valor;
//			return true;
		if (valor > 0) { // nao pode sacar 0 reais
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}
		return false;
		}
	
	public void depositar(double valor) {
		this.saldo += valor;
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);

		if (teste == true) { // verificar se tem dinheiro na conta
			this.sacar(valor);
		if (valor > 0) {
			if (teste == true) { // verificar se tem dinheiro na conta
				this.sacar(valor);
			}
		}

		conta.depositar(valor);
		}
	}

	public void exibirSaldo() {
		System.out.println("Cliente: " + this.cliente.getNometitular() + " - saldo: " + this.saldo);
	}
	public abstract void exibirSaldo2();


}

	
	
	