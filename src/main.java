
public class main {
	
	
 public static void main(String[] args) {
		 Conta cc = new contaCorrente();
		 Conta poupanca = new contaPoupanca();		 
		
		 cc.depositar(100);		
		 cc.transferir(100, poupanca);	
		 
		 cc.imprimirExtrato();
		 poupanca.imprimirExtrato();
	 }

}
 