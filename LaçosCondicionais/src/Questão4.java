import java.util.Scanner;
public class Questão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double numero, par, ímpar;
	Scanner ler = new Scanner (System.in);
	System.out.println("Entre com um numero: ");
	numero =ler.nextDouble();
	if (numero%2==0)
	{
		par= Math.sqrt(numero);
		System.out.printf("O número %2.1f  é par e sua raiz quadrada é %2.1f ",numero,par);
				
	}
	else if (numero%2!=0)
	{
		
		ímpar = Math.pow(numero, 2);
		System.out.printf("O número %2.1f é ímpar e o numero elevado ao quadrado é %2.2f ",numero,ímpar);
	}

	}

}

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
 