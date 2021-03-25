import java.util.*;
public class questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double n1,n2, n3;
 Scanner ler =new Scanner (System.in);
 
		System.out.println("Entre com o n1:");
		n1= ler.nextInt();
		System.out.println("Entre com o n2:");
		n2= ler.nextInt();
		System.out.println("Entre com o n3:");
		n3= ler.nextInt();
		
		ArrayList<Double> crescente = new ArrayList <Double>(); 
		
		crescente.add(n1);
		crescente.add(n2);
		crescente.add(n3);
		
		Collections.sort(crescente);
		
		for ( double resultado:crescente) {
			System.out.println(resultado);
		}
		
		
		
	}

}


//Faça um programa que entre com três números e coloque em ordem crescente.