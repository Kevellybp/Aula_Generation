import java.text.NumberFormat;

public class Patinete {
	private String variacao;
	private String corPatinete;
	private int valorPatinete;

	public Patinete(String variacao, String corPatinete, int valorPatinete) {
		this.variacao = variacao;
		this.corPatinete = corPatinete;
		this.valorPatinete = valorPatinete;
	}

	public String getVariacao() {
		return variacao;
	}

	public void setVariacao(String variacao) {
		this.variacao = variacao;
	}

	public String getCorPatinete() {
		return corPatinete;
	}

	public void setCorPatinete(String corPatinete) {
		this.corPatinete = corPatinete;
	}

	public int getValorPatinete() {
		return valorPatinete;
	}

	public void setValorPatinete(int valorPatinete) {
		this.valorPatinete = valorPatinete;
	}

	public String importarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormatMoeda = nf.format(valorPatinete);
		return FormatMoeda;
	}

public void  imprimirInfo (){
System.out.println("Variação: " + variacao + "\nCor patinete: " + corPatinete+ "\nValor Patinete " + this.importarMoeda());
		
}
}
