import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int segundos,horas, min, ts;
String fabrica;
Scanner ler = new Scanner (System.in);
System.out.println("Entre com a fabrica: ");
fabrica = ler.next();
System.out.println("Entre com os segundos: ");
segundos = ler.nextInt();


horas = segundos /3600;
min = (segundos % 600)/60;
ts =(segundos %3600 )% 60;

System.out.println("\nO evento durou " +horas +  " horas " + min + " minutos " + " e " + segundos  + " segundos");





	}

}







//Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.