

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int opd;
double [] cbDinheiro = {300};
Scanner ler= new Scanner (System.in);
double[] dinheiro = {300};
System.out.println("\n\tDoação em dinheiro!");
do {

	System.out.println("\n\tEscolha uma opção: ");
	System.out.println("-------------------------");
	System.out.println("\n(1)- Adicionar quantia em dinheiro.");
	System.out.println("\n(2)- Visualizar quantia em dinheiro.");
	System.out.println("\n(3)- Vizualizar quantidade de cesta básica.");
	System.out.println("\n(4)- Encerrar Programa.");
	System.out.println("-------------------------");
	opd = ler.nextInt();
	
	switch (opd) {
	case 1: 
		System.out.println("Entre com o valor em dinheiro: ");
		ler.nextDouble();
		
		break;
	case 2:
	System.out.println("Quantia em dinheiro: ");
	for (double loop:dinheiro) {
		System.out.println(loop);
	}
	


	break;
	case 3: 		
	double qtd= dinheiro [0]/cbDinheiro[0];
	System.out.println("Quantidade de cesta básica: ");
	NumberFormat nf;
	nf= NumberFormat.getInstance();
	nf.setRoundingMode(RoundingMode.FLOOR);
	nf.setMaximumFractionDigits(0);
	nf.setMinimumFractionDigits(0);
	System.out.println(nf.format(qtd));
	break;
	default:
		break;
			
	}
}while (opd!=4);

	}

}
