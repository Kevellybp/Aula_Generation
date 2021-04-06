import java.util.Scanner;
public class matriz3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler= new Scanner (System.in);
double [][]matriz = new double [3][3];
double maior=0, cont=0;
for (int l=0;l<3;l++) {
	for (int c=0;c<3;c++) {
		System.out.println("Entre com o número: ");
		matriz [l][c]= ler.nextDouble();
		
		if (matriz[l][c]>10) {
			cont++;
		
	}
}
	}
System.out.println("Valores maiores que 10: " + cont );

}}
//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui