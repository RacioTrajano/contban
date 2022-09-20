package br.imd.ufrn.dominio;

public class Cliente extends Pessoa{
	private Conta conta;
	
	public Cliente () {
		Conta conta = new Conta();
	}
		
	
	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}



	public void Saque(double valor) {
		if ((conta.getSaldo() - valor) + conta.getChequeEspecial() >= 0) {
			conta.setSaldo(conta.getSaldo() - valor);
			System.out.println("Saque realizado, novo saldo: " + conta.getSaldo());
		}
		else {
			System.err.println("Não foi possível realizar saque, saldo indisponível");
		}
	}
	
	public void Deposito(double valor) {
		conta.setSaldo(conta.getSaldo() + valor); 
		System.out.println("Depósito realizado com sucesso, novo saldo: " + conta.getSaldo());
	}

}
