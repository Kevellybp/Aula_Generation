import java.util.Scanner;

public class DuasMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler= new Scanner (System.in);
double [][] matriz1=  new double [2][2];
double [][] matriz2= new double  [2][2];
double [][] matrizsoma= new double [2][2];
double [][] matrizsub= new double [2][2];
int n,constante;
System.out.println("Escolha a op��o desejada: \n1-somar as duas matrizes \n2-subtrair a primeira matriz da segunda \n3- adicionar uma constante as duas matrizes \n4- imprimir as matrizes");
n=ler.nextInt();
for (int l=0;l<2;l++) {
	for (int c=0;c<2;c++) {
		System.out.printf("Entre com o n�mero M[%d][%d]: ", l+1, c+1);
		matriz1 [l][c]=ler.nextDouble();	
	}
}
for (int l=0;l<2;l++) {
	for (int c=0;c<2;c++) {
		System.out.printf("Entre com o n�mero M[%d][%d]: ", l+1, c+1);
		matriz2 [l][c]=ler.nextDouble();	
	}
	}
System.out.println("Entre com o valor da constante: ");
constante=ler.nextInt();
switch (n) {
case 1:

for (int l=0; l<2;l++) {
	for (int c=0;c<2;c++) {
	matrizsoma [l][c]= matriz1[l][c] + matriz2[l][c];
	}
}
System.out.println("Soma das matrizes: ");
for (int l=0;l<2;l++) {
	for (int c=0;c<2; c++) {
		System.out.printf("\t %f \t" ,matrizsoma [l][c]);
	}System.out.println();}
break;
case 2:
for (int l=0; l<2;l++) {
	for (int c=0;c<2;c++) {
	matrizsub [l][c]=matriz1[l][c] - matriz2[l][c]; 	
	}
}
System.out.println("Subtra��o das matrizes: ");
for (int l=0;l<2;l++) {
	for (int c=0;c<2; c++) {
		System.out.printf("\t %f \t" ,matrizsub [l][c]);}System.out.println();}
break;
case 3:
	for (int l=0;l<2;l++) {
		for (int c=0;c<2; c++) {
			matriz1[l][c]+=constante;
			matriz2[l][c]+=constante;
			System.out.println("\nMatriz1: "+matriz1[l][c]+"\t\tMatriz2: "+matriz2[l][c]);
		}
	}
	break;
		
case 4:
	System.out.println("Matriz 1: ");
	for (int l=0;l<2;l++) {
		for (int c=0;c<2; c++) {
			System.out.printf("\t %f \t", matriz1[l][c]);
		}
		System.out.println();
	}
	System.out.println("\nMatriz 2: ");
	for (int l=0;l<2;l++) {
		for (int c=0;c<2; c++) {
			System.out.printf("\t %f \t", matriz2[l][c]);
		}
		System.out.println();
	}
	break;
	default:
		break;
	}

}}

/*
 * 4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a
 * ao usu�rio um menu de op��es: (1) somar as duas matrizes (2) subtrair a
 * primeira matriz da segunda (3) adicionar uma constante as duas matrizes (4)
 * imprimir as matrizes Nas duas primeiras op��es uma terceira matriz 2 x 2 deve
 * ser criada. Na terceira op��o o valor da constante deve ser lido e o
 * resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
 */
