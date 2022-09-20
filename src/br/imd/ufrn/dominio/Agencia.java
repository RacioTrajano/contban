package br.imd.ufrn.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agencia {
	
	private int id;
	private String endereco;
	private Banco banco;
	private String numero;
	private List<Conta> contas;
	
	
	
	public Agencia() {
		contas = new ArrayList<Conta>();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	/**
	 * adiciona conta
	 * @param conta
	 */
	public void addConta(Conta conta) {
		if(!contas.contains(conta))
			contas.add(conta);
	}
	
	/**
	 * lista as contas
	 * @return
	 */
	public List<Conta> listarContas(){
		List<Conta> contasExistentes = new ArrayList<Conta>();
		contasExistentes.addAll(contas);
		return contasExistentes;
	}
	
	@Override
	public String toString() {
		
		return "Agencia n: " + getNumero();
	}
	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		return Objects.equals(numero, other.numero);
	}
	
	
	
	
}
