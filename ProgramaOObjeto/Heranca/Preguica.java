
public class Preguica extends Animal {
	private boolean subir;

	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);
		this.subir = true;
	}

	public void yesSubir() {
		this.subir = true;
	}

	public void naoCorrer() {
		this.subir = false;
	}

	public String condicaoSubir() {
		if (subir) {
			return "O animal sobe em �rvore";
		} else {
			return "O animal n�o sobe em �rvore";
		}
	}

	public boolean isSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}
public void importInfo () {
	System.out.println(this.condicaoSubir());
}
}
