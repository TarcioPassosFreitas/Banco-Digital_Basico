package Program;

import Sistema.Conta;
import Sistema.ContaCorrente;
import Sistema.ContaPoupança;
import Usuarios.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupança(venilton);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
