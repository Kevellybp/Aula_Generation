import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int idade;
Scanner ler = new Scanner (System.in);
System.out.println("Entre com a idade: ");
idade= ler.nextInt();

if(idade>=10 &&idade<=14)
{
	System.out.printf("Com %d anos, sua categoria é infantil!", idade);
}
else if (idade>=15 && idade<=17)
{
	System.out.printf("Com %d anos, sua categoria é Juvenil!", idade);
}
else if(idade>=18 && idade<=25)	
{
	
	System.out.printf("Com %d anos, vocÊ já pode ser preso!", idade);
}
		
else 
{
	System.out.printf("Você não faz parte de nenhuma categoria.");
}
		
	}

}
/*3-	Faça um programa que receba a idade de uma pessoa
 *  e mostre na saída em qual categoria ela se encontra:
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto*/
