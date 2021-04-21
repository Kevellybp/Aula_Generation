import java.util.Random;

public class testeAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rcachorro= new Random().nextInt(4);
		int rcavalo= new Random().nextInt(4);
		int rpreguica= new Random().nextInt(4);
		cachorro1 cao= new cachorro1 ();
cavalo1 ani= new cavalo1 ();
preguica1 ani1= new preguica1 ();
cao.getClasseAnimal();
cao.getraca(rcachorro);
cao.getidade(9);
cao.getsom("au-au");
System.out.println("+++++++++++++++++++++++++++++++++++++++");
ani.getClasseAnimal();
ani.getraca(rcavalo);
ani.getidade(12);
ani.getsom("hin hin in");
System.out.println("+++++++++++++++++++++++++++++++++++++++");
ani1.getClasseAnimal();
ani1.getraca(rpreguica);
ani1.getidade(4);
ani1.getsom("\"o\"");
	}

}
