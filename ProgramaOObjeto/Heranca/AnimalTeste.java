
public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro animal1 = new Cachorro("Totó", 5, "latido");
		Cavalo animal2 = new Cavalo("Bartolomeu", 12, "relincho");
		Preguica animal3 = new Preguica("Roberto", 18, "balido de ameaça");

		animal1.isCorre();
		animal1.imprimirInfo();
		animal1.printInfo();
		System.out.println();
		animal2.yesCorre();
		animal2.imprimirInfo();
		animal2.printInfo();
		System.out.println();
		animal3.yesSubir();
		animal3.imprimirInfo();
		animal3.importInfo();
	}

}
