package Sistema;

public interface IConta {
	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDeDestino);
	
	void imprimirExtrato();
}
