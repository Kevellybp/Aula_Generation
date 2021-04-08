import java.text.NumberFormat;

public class Eletronico {
private String nomeProduto;
private String marcaProduto;
private int valorProduto;

public Eletronico (String nomeProduto, String marcaProduto, int  valorProduto) {
	this.nomeProduto= nomeProduto;
	this.marcaProduto= marcaProduto;
	this.valorProduto= valorProduto;
}

public String getNomeProduto() {
	return nomeProduto;
}

public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
}

public String getMarcaProduto() {
	return marcaProduto;
}

public void setMarcaProduto(String marcaProduto) {
	this.marcaProduto = marcaProduto;
}

public int getValorProduto() {
	return valorProduto;
}
public void setValorProduto(int valorProduto) {
	this.valorProduto = valorProduto;
}
public String importarMoeda() {
	NumberFormat nf= NumberFormat.getCurrencyInstance();
	nf.setMinimumFractionDigits(2);
	String FormatMoeda= nf.format(valorProduto);
	return FormatMoeda;
	
}

public void imprimirInfo() {
	System.out.println("Produto: " + nomeProduto + "\nMarca: " + marcaProduto + "\nVelor: " + this.importarMoeda());
}
}
