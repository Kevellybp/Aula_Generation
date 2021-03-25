
import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String nome;
	int  anos, meses, dias, totalDias;
	Scanner ler = new Scanner (System.in); 
	
		System.out.println("Entre como nome: ");
		nome = ler.next();
		System.out.println("Entre com o ano: " );
		anos = ler.nextInt();
		System.out.println("Entre com os meses: ");
		meses= ler.nextInt();
		System.out.println("Entre com os dias:");
		dias= ler.nextInt();
		
		totalDias = anos*365 + meses*30 + dias;
		
		System.out.println("A idade de "+ nome  + " em dias é: "+totalDias);
	
		
		
		
	}

}
