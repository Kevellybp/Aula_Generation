
public class cachorro1 extends Animall {
	public cachorro1() {
		super("cachorro");
	}

	@Override
	public void getraca(int raca) {
		switch (raca) {
		case 0:
			System.out.println("Ra�a: Yorkshire");
			break;
		case 1:
			System.out.println("Ra�a: Labrador");
			break;
		case 2:
			System.out.println("Ra�a: Buldogue");
			break;
		case 3:
			System.out.println("Ra�a: Vira Lata");
			break;
			default:
			break;
		}
	}

	@Override
	public void getidade(int idade) {
		System.out.println("Idade: "+idade);
	}

	@Override
	public void getsom(String som) {
		System.out.println("Som: "+som);
	}
}
