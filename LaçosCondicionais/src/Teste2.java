import java.util.Scanner;
public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float num1,num2,res;
	char op;
	Scanner ler= new Scanner (System.in);
	System.out.println("Entre com o menu de opções \n +--> soma\n- --> Diferença \n* -->multiplicação \n/ --> Divisao: ");
	op = ler.nextLine().charAt(0); 
	
		System.out.println("Entre com o n1: ");
		num1= ler.nextFloat();
		System.out.println("Entre com o n2: ");
		num2= ler.nextFloat();
		
		
		switch (op)
		{
		case '+' :
			res = num1+ num2;
			break;
		case '-' :
			res = num1-num2;
				break;
		case '*' :
			res = num1* num2;
			break;
		case '/' :
			res = num1/num2;
			break;
			default:
				res=0;
				System.out.println("\nOpção Inválida");
	
				
		}
		System.out.println("o resultado é: " +res);
	}

}