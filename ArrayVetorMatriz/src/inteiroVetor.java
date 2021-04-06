import java.util.Scanner;


public class inteiroVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double conti=0,somap=0, somai=0, contp=0;
Scanner ler= new Scanner (System.in);

	double [] vetor1= new double [6];
	for (int i=0;i<6;i++) {
		System.out.println("\nInforme o " +(i+1) + "o. número: ");
		vetor1[i]= ler.nextDouble();
	}	
	System.out.println("Números pares:");
	for (int i=0;i<6;i++) 
		{
			if (vetor1[i]%2==0) {
				System.out.println(vetor1[i]);
				contp++;
				somap= somap+ vetor1[i];
			}
		}
	System.out.println("Soma dos números pares: " +  somap);
	System.out.println("Números ímpares:");	
	for (int i=0;i<6;i++) {
			 if (vetor1[i]%2!=0) {
					System.out.println(vetor1[i]);
				conti++;
				somai=somai+vetor1[i];
				
				}
			} 
	System.out.println("Soma dos números ímpares: " +  somai);
		
			
	
	
	}
}
/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/
