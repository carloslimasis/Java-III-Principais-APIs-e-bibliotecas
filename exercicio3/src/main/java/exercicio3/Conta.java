package exercicio3;

/**
 * Classe responsável por moldar as Contas do Banco
 *
 * @author Carlos Augusto de Souza Lim
 */
public abstract class Conta {

	protected String nome;
	protected int numero;
	protected double saldo;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Metodo que incrementa o saldo.
	 * 
	 * @param valor
	 * @throws ValorInvalidoException
	 */
	public void deposita(double valor) throws ValorInvalidoException {

		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}

		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}

	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		
		boolean equals = false;
		
		if(this.nome != null) {
			equals = this.nome.equals(outraConta.getNome());
		}
		
		equals = this.numero == outraConta.numero;
		
		return equals;
	}
}
