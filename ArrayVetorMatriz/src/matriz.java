import java.util.Scanner;
public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler= new Scanner (System.in);
int [][] matriz= new int[3][3];
System.out.println("\nMatriz M[3][3]");

for (int l=0;l<3;l++) {
	for (int c=0;c<3;c++) {
		System.out.printf("Entre com o elemento M[%d][%d]: ", l+1, c+1);
		matriz[l][c]=ler.nextInt();	
	}
}
System.out.println("A matriz ficou: \n");
for (int l=0;l<3;l++) {
	for (int c=0;c<3;c++) {
		System.out.printf("t %d \t " , matriz[l][c]);
	}
}
	}
	}


