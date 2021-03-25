import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1,n2,n3, maior;
Scanner ler = new Scanner(System.in);
System.out.println("Entre com o n1: ");
n1= ler.nextInt();
System.out.println("Entre com o n2: ");
n2= ler.nextInt();
System.out.println("Entre com o n3: ");
n3= ler.nextInt();

if (n1>n2 && n1>n3)
{
	System.out.println("O maior numéro é: " +n1);
}
else if (n2>n1 && n2>n3)
{
	System.out.println("O maior número é: " +n2);
}
else if (n3>n1 && n3>n2)
 {
	 System.out.println("O maior numéro é: " +n3);
}
	
	}
}




