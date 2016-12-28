package exercicio3;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.setNumero(12345);
		System.out.println(conta);
		
		Conta conta1 = new ContaCorrente();
		conta1.setNumero(12345);
		
		Conta conta2 = new ContaCorrente();
		conta2.setNumero(12345);
		
		System.out.println(conta1 == conta2);
		System.out.println(conta1.equals(conta2));
		
		Conta conta3 = new ContaCorrente();
		conta3.setNumero(12);
		
		Conta conta4 = new ContaCorrente();
		conta4.setNumero(12345);
		
		System.out.println(conta3.equals(conta4));
		
		Conta contaComNome1 = new ContaCorrente();
		contaComNome1.setNome("teste");
		contaComNome1.setNumero(12345);
		
		Conta contaComNome2 = new ContaCorrente();
		contaComNome2.setNome("teste");
		contaComNome2.setNumero(12345);
		
		System.out.println(contaComNome1.equals(contaComNome2));
	}

}
