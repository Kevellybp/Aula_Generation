import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CestaSolidaria2 {
	String nome = "meuEstoque";
	List<Integer> cb1 = new ArrayList<Integer>();
	List<String> produto = new ArrayList<String>();
	List<Integer> estoque = new ArrayList<Integer>();
	EstoqueAlimento meuEstoque = new EstoqueAlimento(nome, produto, estoque, cb1);
	Scanner ler = new Scanner(System.in);

	public void mostrarMenuPrincipal() {
		int opt;

		while (true) {
			System.out.println("\n Escolha sua alternativa: ");
			System.out.println("-------------------------------------------");
			System.out.println("\n(1) -- Usar modelo de produtos essenciais e de higiene ");
			System.out.println("\n(2) -- Usar modelo de controle financeiro");
			System.out.println("\n(0) -- Encerrar programa");
			opt = lerInteiro();

			switch (opt) {
			case 1:
				escolherProdutosEssenciais();
				break;
			case 2:
				escolherFinanceiro();
			case 0:
				System.exit(0);

			}
			System.out.println("Pressione 'Enter' para continuar ...");
			ler.nextLine();
		}

	}

	public void escolherProdutosEssenciais() {

		// Estoque padrão itens essenciais e de higiene
		nome = "estoquePadrao";

		String[] arrayproduto = { "arroz", "açúcar", "biscoito", "café", "farinha de trigo", "feijão", "leite em pó",
				"macarrão", "manteiga", "molho de tomate", "óleo", "sal", "sardinha", "seleta de legumes",
				"condicionador", "creme dental", "desodorante", "escova de dentes", "papel higienico", "sabonete",
				"shampoo" };

		int[] arrayestoque = { 10, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };

		int[] arraycb1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		for (int i = 0; i < 20; i++) {
			produto.add(arrayproduto[i]);
			estoque.add(arrayestoque[i]);
			cb1.add(arraycb1[i]);
		}

		controlarDoacao();

	}

	public void adicionarItem() {
		int opt3;

		// case 1:
		System.out.println("\nEscolha o item que deseja doar:");
		System.out.println("--------------------------------");
		// Lista de opções de produto

		// System.out.println("meu estoque: " + meuEstoque.getEstoque());

		for (int i = 0; i < estoque.size(); i++) {

			meuEstoque.getEstoque().get(i);
			meuEstoque.getProduto().get(i);
			System.out.println("(" + (i + 1) + ") para adicionar " + meuEstoque.getProduto().get(i));
		}
		meuEstoque.verificarEntrada();
		opt3 = lerInteiro();
		opt3 = opt3 - 1;

		for (int i = 0; i < estoque.size(); i++) {

			if (opt3 == i) {
				meuEstoque.doar(i);
				System.out.println("A quantidade do produto " + meuEstoque.getProduto().get(i)
						+ " aumentou, a nova quantidade é: " + meuEstoque.getEstoque().get(i));
			}

		}

	}

	public void escolherFinanceiro() {
		// Estoque em dinheiro padrão
		nome = "Caixa";
		produto.add("Dinheiro");
		estoque.add(1000);
		cb1.add(400);
		controlarDoacao();
	}

	public void controlarDoacao() {

		int opt;
		do {
			System.out.println("\n Escolha sua alternativa: ");
			System.out.println("-------------------------------------------");
			System.out.println("\n(1) -- Realizar doação ");
			System.out.println("\n(2) -- Visualizar estoque");
			System.out.println("\n(3) -- Total de cestas disponíveis");
			System.out.println("\n(4) -- Realizar distribuição de cesta a uma família");
			System.out.println("\n(0) -- Encerrar Programa");
			opt = lerInteiro();

			switch (opt) {
			case 1:
				adicionarItem();
				break;
			case 2:
				meuEstoque.visualizar();
				break;
			case 3:
				meuEstoque.calcularCestas();
				break;
			case 4:
				System.out.println("Quantas cestas gostaria de distribuir a uma família?");
				int qtde = lerInteiro();
				meuEstoque.distribuirCestas(qtde);
				break;
			case 0:
				System.exit(0);
			}

			
		} while (opt != 0);

	}

	public int lerInteiro() {

		while (true) {
			try {
				return ler.nextInt();
			} catch (InputMismatchException inputMismatchException) {
				ler.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro. Por favor tente novamente.\n");
			}
		}

	}

	public static void main(String[] args) {
		CestaSolidaria2 cesta = new CestaSolidaria2();
		cesta.mostrarMenuPrincipal();

	}
}