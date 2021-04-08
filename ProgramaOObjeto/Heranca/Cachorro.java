
public class Cachorro extends Animal {

	private boolean corre;

	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
		this.corre = true;
	}

	public void isCorrer() {
		this.corre = true;

	}

	public void NaoCorrer() {
		this.corre = false;
	}

	public String condicaoCorrer() {
		if (corre) {
			return "O animal corre";
		} else {
			return "O animal não corre";
		}
	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	public void printInfo() {
		System.out.println(this.condicaoCorrer());
	}
	
}
