
public class contaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("====extrato conta poupança====");
		System.out.println(String.format("agencia: %s", super.agencia));
		System.out.println(String.format("Numero: %s", super.agencia));
		System.out.println(String.format("Saldo: %s", super.agencia));


	
}}
