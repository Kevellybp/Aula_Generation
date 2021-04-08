import java.text.NumberFormat;

public class Cliente {
private String nomeCliente;
private String produto;
private int valorProduto;

public Cliente (String nomeCliente, String produto, int valorProduto) {
	this.nomeCliente = nomeCliente;
	this.produto = produto;
	this.valorProduto = valorProduto;
}

public String getNomeCliente() {
	return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}

public String getProduto() {
	return produto;
}

public void setProduto(String produto) {
	this.produto = produto;
}

public int getValorProduto() {
	return valorProduto;
}

public void setValorProduto(int valorProduto) {
	this.valorProduto = valorProduto;
}
public String formatarmoeda () {
	NumberFormat nf= NumberFormat.getCurrencyInstance();
	nf.setMinimumFractionDigits(2);
	String formatoMoeda =nf.format(valorProduto);
	return formatoMoeda;
}
public void imprimirInfo() {
	System.out.println(nomeCliente+ "comprou um(a) " + produto + "no valor de : " + this.formatarmoeda());
}
}
