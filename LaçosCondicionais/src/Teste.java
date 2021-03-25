import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,media;
		Scanner ler = new Scanner (System.in);
		System.out.println("Entre com a n1: ");
		n1= ler.nextFloat();
		System.out.println("Entre com a n2: ");
		n2= ler.nextFloat();
		System.out.println("Entre com a n3: ");
		n3= ler.nextFloat();
				
		media =(n1+n2+n3)/3;
		System.out.println("\nA media é: "+media);
		
if (media>=7 && media<=10)
{
System.out.println("Parabéns, vocÊ foi aprovado! ");
}
else if (media>=4 && media<7)
{
	System.out.println("Aluno de exame! ");
}
	
else if (media>=0 && media<4)
{
	System.out.println("Aluno reprovado! ");
}
else 
{
	System.out.println("Media fora do intervalo!");
}

System.out.printf("Com as notas %f, %f, %f eu vou obter a media : %2.2f", n1,n2,n3,media);
	}

}
