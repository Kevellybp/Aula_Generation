
public class Aviao {
private String nomeAviao;
private String capacidade;
private int anoFabricacao;
public Aviao (String nomeAviao, String capacidade, int anoFabricacao) {
	this.nomeAviao= nomeAviao;
	this.capacidade= capacidade;
	this.anoFabricacao= anoFabricacao;
}
public String getNomeAviao() {
	return nomeAviao;
}
public void setNomeAviao(String nomeAviao) {
	this.nomeAviao = nomeAviao;
}
public String getCapacidade() {
	return capacidade;
}
public void setCapacidade(String capacidade) {
	this.capacidade = capacidade;
}
public int getAnoFabricacao() {
	return anoFabricacao;
}
public void setAnoFabricacao(int anoFabricacao) {
	this.anoFabricacao = anoFabricacao;
}
public void imprimirInfo(){
	System.out.println(nomeAviao + "tem a capacidade de " + capacidade+ "pessoas " + "\nAno de fabricação " +anoFabricacao);
}
}
