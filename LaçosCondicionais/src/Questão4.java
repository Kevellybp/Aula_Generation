import java.util.Scanner;
public class Quest�o4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double numero, par, �mpar;
	Scanner ler = new Scanner (System.in);
	System.out.println("Entre com um numero: ");
	numero =ler.nextDouble();
	if (numero%2==0)
	{
		par= Math.sqrt(numero);
		System.out.printf("O n�mero %2.1f  � par e sua raiz quadrada � %2.1f ",numero,par);
				
	}
	else if (numero%2!=0)
	{
		
		�mpar = Math.pow(numero, 2);
		System.out.printf("O n�mero %2.1f � �mpar e o numero elevado ao quadrado � %2.2f ",numero,�mpar);
	}

	}

}

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
 