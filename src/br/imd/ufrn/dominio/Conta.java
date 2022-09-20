package br.imd.ufrn.dominio;

import java.util.Objects;

public class Conta {
	private Banco banco;
	private Agencia agencia;
	private String numConta;
	private double saldo;
	private double chequeEspecial;
	
	public Conta() {}
	
	
		
	public Banco getBanco() {
		return banco;
	}



	public void setBanco(Banco banco) {
		this.banco = banco;
	}



	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	/**
	 * chamada para saida padrão
	 */
	@Override
	public String toString() {
		return" Conta n: " + getNumConta();
	}

	
	/** 
	 * metodo para contas iguais
	 */
	@Override
	public int hashCode() {
		return Objects.hash(numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numConta, other.numConta);
	}
	
}
