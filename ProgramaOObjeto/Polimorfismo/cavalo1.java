
public class cavalo1 extends Animall {
	public cavalo1() {
		super("cavalo");
	}
	@Override
	public void getraca(int raca) {
		switch (raca) {
		case 0:
			System.out.println("Ra�a: Mustangue");
			break;
		case 1:
			System.out.println("Ra�a: P�nei");
			break;
		case 2:
			System.out.println("Ra�a: Colorado");
			break;
		case 3:
			System.out.println("Ra�a: Campeiro");
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
	public void getsom (String som) {
		System.out.println("Som: "+som);
	}
}
