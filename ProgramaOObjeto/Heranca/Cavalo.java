
public class Cavalo extends Animal {
	private boolean correr;

	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
		this.correr = true;
	}

	public void yesCorrer() {
		this.correr = true;

	}

	public void NoCorrer() {
		this.correr = false;
	}

	public String condicaoCorre() {
		if (correr) {
			return "O animal corre";
		} else {
			return "O animal não corre";
		}
	}

	public boolean yesCorre() {
		return correr;
	}

	public void setCorre(boolean correr) {
		this.correr = correr;
	}
	public void printInfo() {
		System.out.println(this.condicaoCorre());
	}
}
