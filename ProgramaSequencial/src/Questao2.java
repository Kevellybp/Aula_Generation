import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int td, ano, meses,dia ;
String nome;
Scanner ler = new Scanner (System.in);
System.out.println("Entre com um nome: ");
nome = ler.next();
System.out.println("Entre com idade em dias");
td= ler.nextInt();

ano = td / 365;
meses = (td% 365) /30;
dia = (td%365) %30;

System.out.println("A idade de " +nome + " é " + ano + " anos " + meses + " meses " + dia + " dias" );
 
	}

}
