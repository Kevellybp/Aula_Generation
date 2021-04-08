
public class Animal {
private String nome;
private int idade;
private String som;

public Animal (String nome, int idade, String som) {
	this.nome=nome;
	this.idade=idade;
	this.som=som;
}
public void imprimirInfo()
{
	System.out.println("Nome do animal: " + nome + "\nIdade animal: " + idade+ " anos" + "\nSom que o animal reproduz: " +som);
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getSom() {
	return som;
}
public void setSom(String som) {
	this.som = som;
}

}
