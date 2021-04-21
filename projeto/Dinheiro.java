import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Dinheiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opd;
		double cb = 300;
		double dinheiro = 300;
		Scanner ler = new Scanner(System.in);
		ArrayList<Double> estoque = new ArrayList();
		System.out.println("\n\tDoação em dinheiro!");
		do {
			System.out.println("\n\tEscolha uma opção: ");
			System.out.println("-------------------------");
			System.out.println("\n(1)- Deseja adicionar valor para doação?");
			System.out.println("\n(2)- Deseja visualizar quantia em caixa?");
			System.out.println("\n(3)- Deseja visualizar quantidade de cesta básica?");
			System.out.println("\n(4)- Encerrar Programa.");
			System.out.println("-------------------------");
			opd = ler.nextInt();
			switch (opd) {
			case 1:
				System.out.println("Entre com um valor para entrar doação: ");
				double caixa = ler.nextDouble();
				estoque.add(caixa);
				dinheiro = dinheiro + caixa;
				System.out.println("Agradecemos sua doação!");
				break;
			case 2:
				System.out.println("Valor em caixa: ");
				System.out.println(NumberFormat.getCurrencyInstance().format(dinheiro));
				break;
			case 3:
				double qtd = dinheiro / cb;
				System.out.println("Quantidade de cesta básica: ");
				NumberFormat nf;
				nf = NumberFormat.getInstance();
				nf.setRoundingMode(RoundingMode.FLOOR);
				nf.setMaximumFractionDigits(0);
				// nf.setMinimumFractionDigits(0);
				System.out.println(nf.format(qtd));
				break;
			default:
				System.out.println("Programa finalizado!");
			}
		} while (opd != 4);
	}
}
