import java.text.NumberFormat;

public class ContaBancaria {
	private String nome;
	private String tipo;
	private int agencia;
	private int conta;
	private int saldoDisponivel;
	private int saldoBloqueado;

	public ContaBancaria(String nome, String tipo, int agencia, int conta, int saldoDisponivel, int saldoBloqueado) {
		this.nome = nome;
		this.tipo = tipo;
		this.agencia = agencia;
		this.conta = conta;
		this.saldoDisponivel = saldoDisponivel;
		this.saldoBloqueado = saldoBloqueado;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(int saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}

	public int getSaldoBloqueado() {
		return saldoBloqueado;
	}

	public void setSaldoBloqueado(int saldoBloqueado) {
		this.saldoBloqueado = saldoBloqueado;
	}

	public int setSaldoTotal() {
		return saldoDisponivel + saldoBloqueado;
	}

	public String Format1() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormatMoeda = nf.format(saldoDisponivel);
		return FormatMoeda;
	}

	public String Format2() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormatMoeda = nf.format(saldoBloqueado);
		return FormatMoeda;
	}

	public String Format3() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormatMoeda = nf.format(this.setSaldoTotal());
		return FormatMoeda;
	}

	public void imprimirInfo() {
		System.out.println("Nome: " + nome +
				"\nTipo de conta: " + tipo + "\nAgência: " + agencia + "\nConta " + conta + "\nSaldo Disponível " + this.Format1()+ "\nSaldo Bloqueado " + this.Format2()+ "\nSaldo Total " + this.Format3());
	}
}
