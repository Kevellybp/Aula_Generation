
public class preguica1 extends Animall {
public preguica1 () {
super ("Pregui�a");
}
@Override
public void getraca (int raca) {
	switch (raca) {
	case 0: 
		System.out.println("Ra�a: pregui�a-bentinho");
		break;
	case 1:
		System.out.println("Ra�a: pregui�a-de-coleira");
		break;
	case 2:
		System.out.println("Ra�a: pregui�a-real");
	case 3:
		System.out.println("Ra�a: pregui�a-comum");
		break;
		default:
			break;
	}
}
@Override
public void getidade (int idade) {
	System.out.println("Idade: "+idade);
}
@Override 
public void getsom (String som) {
	System.out.println("Som: "+som);
}
}
