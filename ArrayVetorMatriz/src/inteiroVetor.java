import java.util.Scanner;


public class inteiroVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double conti=0,somap=0, somai=0, contp=0;
Scanner ler= new Scanner (System.in);

	double [] vetor1= new double [6];
	for (int i=0;i<6;i++) {
		System.out.println("\nInforme o " +(i+1) + "o. n�mero: ");
		vetor1[i]= ler.nextDouble();
	}	
	System.out.println("N�meros pares:");
	for (int i=0;i<6;i++) 
		{
			if (vetor1[i]%2==0) {
				System.out.println(vetor1[i]);
				contp++;
				somap= somap+ vetor1[i];
			}
		}
	System.out.println("Soma dos n�meros pares: " +  somap);
	System.out.println("N�meros �mpares:");	
	for (int i=0;i<6;i++) {
			 if (vetor1[i]%2!=0) {
					System.out.println(vetor1[i]);
				conti++;
				somai=somai+vetor1[i];
				
				}
			} 
	System.out.println("Soma dos n�meros �mpares: " +  somai);
		
			
	
	
	}
}
/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/
