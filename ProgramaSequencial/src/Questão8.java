import java.util.Scanner;
public class Questão8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double custFab, cc;
		Scanner ler =new Scanner (System.in);
		System.out.println("Entre com o custo de fábrica: ");
		custFab = ler.nextDouble();
		
	cc= custFab + (custFab*0.73);
	System.out.printf("\nO custo de fábrica é %2.0f, logo o custo do consumidor será %2.2f. ",custFab,cc);
		
	}

}
