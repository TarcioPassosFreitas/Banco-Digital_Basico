package Sistema;

import Usuarios.Cliente;

public class ContaPoupanša extends Conta {

	public ContaPoupanša(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanša ===");
		super.imprimirInformacoes();
		
	}

}
