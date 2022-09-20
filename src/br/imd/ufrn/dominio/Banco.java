package br.imd.ufrn.dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private int id;
	private String nome;
	private List<Agencia> agencias;

	public Banco() {
		agencias = new ArrayList<Agencia>();
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void addAgencia(Agencia agencia) {
		if(!agencias.contains(agencia))
			agencias.add(agencia);
	}
	
	public List<Agencia> listarAgencias(){
		List<Agencia> agenciasExistentes = new ArrayList<Agencia>();
		agenciasExistentes.addAll(agencias);
		return agenciasExistentes;
	}
	
	@Override
	public String toString() {
		
		return nome + " id :" + id;
	}
	
}
