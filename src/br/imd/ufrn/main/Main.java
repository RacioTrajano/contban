package br.imd.ufrn.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.imd.ufrn.dominio.Agencia;
import br.imd.ufrn.dominio.Banco;
import br.imd.ufrn.dominio.Cliente;
import br.imd.ufrn.dominio.Conta;

public class Main {

	public static void main(String[] args) {
		
		Conta xico = new Conta();
		
		//xico.setTitular("Fran Xico");
		//xico.setNumConta("01");
		//xico.Deposito(200);
		
		Conta francisca = new Conta();
		//francisca.setTitular("Francisca das Dores");
		//fran1cisca.setNumConta("02");
		//francisca.Deposito(300);
		
		//Banco santander = new Banco();
		//santander.addConta(xico);
		//santander.addConta(francisca);
		
		//for(Conta d: santander.listarContas()) {
		//	System.err.println(d);
		//}
		
		
		//criando um array com opÃ§Ãµes de banco
		List<Banco> baseBancos; 
		baseBancos = new ArrayList<Banco>();
				
		//criando um banco *****************
		
		Banco caixa = new Banco();
		caixa.setNome("Caixa EconÃ³mica");
		caixa.setId(1);
		baseBancos.add(caixa);
		
		Banco santander = new Banco();
		santander.setNome("Santander");
		santander.setId(2);
		baseBancos.add(santander);
		
		//Cliente client = new Cliente();
		//*********************************
		//criando agencia
		Agencia undUfrn = new Agencia();
		undUfrn.setId(1);
		
		//adicionando agencia ao banco
		caixa.addAgencia(undUfrn);
		santander.addAgencia(undUfrn);
		
		//criando uma conta
		
		
		Conta cc01 = new Conta();
		
		//criando um cliente
		
		Cliente client = new Cliente();
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out
						.println("Digite a opï¿½ï¿½o desejada: \n" 
						+ "1 - Cadastro Cliente \n" 
						+ "2 - Escolher um banco \n"
						+ "3 - Escolher Agencia \n"
						+ "4 - Realizar depósito\n"
						+ "5 - Realizar saque \n"
						+ "6 - Ver Saldo\n"
						+ "7 - Fechar conta \n"
						+ "8 - opï¿½ï¿½es \n"
						+ "0 - Sair");
				int opcao = Integer.parseInt(sc.nextLine());
				
				switch (opcao) {
				case 1:
					System.out.println("Digite nome do titular: ");					
					client.setNome(sc.nextLine());
					Conta account = new Conta();
					account.setNumConta("01");
					client.setConta(account);
					System.err.println("O nome do titular eh: " + client.getNome());
					break;
				case 2:
					System.out.println("Digite O id do banco: ");
					for(Banco d : baseBancos) {
						System.out.println(d);
					}
					int id = Integer.parseInt(sc.nextLine());
					for(Banco d : baseBancos) {
						if(d.getId() == id) {
							client.getConta().setBanco(d);
						}
					}
					System.err.println("O banco do titular eh: " + client.getConta().getBanco());
					break;
				case 3:
					System.out.println("Digite O id da agencia: ");
					for(Agencia d : client.getConta().getBanco().listarAgencias()) {
						System.out.println(d);
					}
					int id2 = Integer.parseInt(sc.nextLine());
					for(Agencia d : client.getConta().getBanco().listarAgencias()) {
						if(d.getId() == id2) {
							client.getConta().setAgencia(d);
						}
					}
					System.err.println("A agencia do titular eh: " + client.getConta().getAgencia());
					break;
				case 4:
					System.out.println("Digite o valor do depósito: ");
					client.Deposito(Integer.parseInt(sc.nextLine()));
					
					break;
				case 5:
					System.out.println("Digite o valor do saque:  ");
					client.Saque(Integer.parseInt(sc.nextLine()));
					break;
				case 6:
					System.out.println("Valor do cheque especial disponível: ");
					System.out.println(client.getConta().getChequeEspecial());
					break;
				case 7:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;
				case 8:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;				
				case 0:
					System.exit(0);
				}

			}
		} finally {
			sc.close();
		}
		
		
		//System.out.println(xico);
	}

}
