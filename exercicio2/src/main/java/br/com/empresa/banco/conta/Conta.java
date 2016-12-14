package br.com.empresa.banco.conta;

/**
 * Classe responsável por moldar as Contas do Banco
 *
 * @author Carlos Augusto de Souza Lim
 */
public abstract class Conta {

	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}
	
	/**
	 * Metodo que incrementa o saldo.
	 * @param valor
	 * @throws ValorInvalidoException
	 */
	public void deposita(double valor) throws ValorInvalidoException {
		
		if(valor < 0) {
			throw new ValorInvalidoException(valor);
		}
		
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);
	
}
