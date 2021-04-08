
public class Paciente {
	//P || p==paciente
private String nomeP;
private String acompanhante;
private String situacao;
private String dataEntrada;

public Paciente (String nomeP, String acompanhante, String situacao, String dataEntrada) {
	this.nomeP=nomeP;
	this.acompanhante=acompanhante;
	this.situacao=situacao;
	this.dataEntrada=dataEntrada;

}

public String getNomeP() {
	return nomeP;
}

public void setNomeP(String nomeP) {
	this.nomeP = nomeP;
}

public String getAcompanhante() {
	return acompanhante;
}

public void setAcompanhante(String acompanhante) {
	this.acompanhante = acompanhante;
}

public String getSituacao() {
	return situacao;
}

public void setSituacao(String situacao) {
	this.situacao = situacao;
}

public String getDataEntrada() {
	return dataEntrada;
}

public void setDataEntrada(String dataEntrada) {
	this.dataEntrada = dataEntrada;
}
public void imprimirInfo () {
	System.out.println("Nome do paciente: " + nomeP + "\nNome do acompanhante: " + acompanhante + "\nSituação do paciente: " + situacao + "\nData de entrada: " + dataEntrada);
}
}
