

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CestaSolidaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Variáveis globais
		int opt1, opt2, opt,prosseguir;
		Scanner ler = new Scanner(System.in);
	
		String [] nomes = {"arroz", "açúcar", "biscoito", "café", "farinha de trigo", 
				"feijão", "leite em pó", "macarrão", "manteiga", "molho de tomate", "óleo",
				"sal", "sardinha", "seleta de legumes"};
		
		int [] estoque = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		int [] cb1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		int [] Lista1 = {0, 0, 0, 0, 0, 0, 0};
		
		List<Integer> minhaLista = new ArrayList<Integer>();//criar o meu list
		
		
		int opd;
		double caixa = 300;
		double cb = 300;
		double dinheiro = 300;
		
		
	
		
		

		// MENU PRINCIPAL
		do 
		{
			System.out.println("\n Escolha sua alternativa: ");
			System.out.println("-------------------------------------------");
			System.out.println("\n(1) -- Realizar doação de item essencial");
			System.out.println("\n(2) -- Realizar doação de produto de higiene");
			System.out.println("\n(3) -- Realizar doação em dinheiro");
			System.out.println("\n(4) -- Visualizar estoque de produtos");
			System.out.println("\n(5) -- Visualizar total em caixa atualmente");
			System.out.println("\n(6) -- Total de cestas disponíveis");
			System.out.println("\n(7) -- Distribuir uma cesta a uma família");
			System.out.println("\n(0) -- Encerrar programa");
			opt1 = ler.nextInt(); 
		
	
		
		// ITENS ESSENCIAIS
		
		switch (opt1) {
		case 1:
			

			do
			{
				System.out.println("\n\t\tDigite uma opção: ");
				System.out.println("-------------------------------------------");
				System.out.println("\n(1) Deseja adicionar um arroz?");
				System.out.println("\n(2) Deseja adicionar um açúcar?");
				System.out.println("\n(3) Deseja adicionar um biscoito?");
				System.out.println("\n(4) Deseja adicionar um café?");
				System.out.println("\n(5) Deseja adicionar um farinha de trigo?");
				System.out.println("\n(6) Deseja Adicionar feijão ?");
				System.out.println("\n(7) Deseja adicionar um leite em pó?");
				System.out.println("\n(8) Deseja adicionar macarrão ?");
				System.out.println("\n(9) Deseja adicionar uma manteiga?");
				System.out.println("\n(10) Deseja adicionar um molho de tomate?");
				System.out.println("\n(11) Deseja adicionar um óleo?");
				System.out.println("\n(12) Deseja adicionar um sal?");
				System.out.println("\n(13) Deseja adicionar um sardinha?");
				System.out.println("\n(14) Deseja adicionar uma seleta de legumes?");
				System.out.println("\n(15) Mostrar todos os produtos do estoque");
				System.out.println("\n(0) Encerrar o programa");
				
				opt = ler.nextInt(); 
				
			
			
			
			switch(opt)
			{
			case 1:
				estoque[0]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de arroz aumentou, agora é: "+estoque[0]);
				break;
			case 2:
				estoque[1]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de açúcar aumentou, agora é: "+estoque[1]);
				break;
			case 3:
				estoque[2]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de biscoito aumentou, agora é: "+estoque[2]);
				break;
			case 4:
				estoque[3]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de café aumentou, agora é: "+estoque[3]);
				break;
			case 5:
				estoque[4]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de farinha trigo aumentou, agora é: "+estoque[4]);
				break;
			case 6:
				estoque[5]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de feijão aumentou, agora é: "+estoque[5]);
				break;
			case 7:
				estoque[6]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de leite em pó aumentou, agora é: "+estoque[6]);
				break;
			case 8:
				estoque[7]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de macarrão aumentou, agora é: "+estoque[7]);
				break;
			case 9:
				estoque[8]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de manteiga aumentou, agora é: "+estoque[8]);
				break;
			case 10:
				estoque[9]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de molho de tomate aumentou, agora é: "+estoque[9]);
				break;
			case 11:
				estoque[10]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de óleo aumentou, agora é: "+estoque[10]);
				break;
			case 12:
				estoque[11]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de sal aumentou, agora é: "+estoque[11]);
				break;
			case 13:
				estoque[12]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de sardinha aumentou, agora é: "+estoque[12]);
				break;
			case 14:
				estoque[13]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de seleta de legumes aumentou, agora é: "+estoque[13]);
				break;
			case 15:
				estoque[14]++;
				System.out.println(" **********************");
				System.out.println("A quantidade de farinha trigo aumentou, agora é: "+estoque[14]);
				break;
			case 0:
				System.out.println(" **********************");
				System.out.println("Programa Encerrado");
			break;
				}
			
			System.out.println(" **********************");
			System.out.println("\nDigite '0' para voltar ao menu inicial ou qualquer número para fazer uma nova doação ");
			opt = ler.nextInt();
			
			
			
			}while (opt !=0);
			break; // Fim do menu de itens essenciais
				
	
		
					
			
		// ITENS DE HIGIENE E LIMPEZA
		case 2:
			do
			{
				System.out.println("\n\t\tDigite uma opção: ");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(1) Deseja adicionar um condicionador ?");
				System.out.println("\n(2) Deseja adicionar um creme dental ?");
				System.out.println("\n(3) Deseja adicionar um desodorante ?");
				System.out.println("\n(4) Deseja adicionar uma escova de dentes ?");
				System.out.println("\n(5) Deseja adicionar um papel higiênico ?");
				System.out.println("\n(6) Deseja adicionar um sabonete ?");
				System.out.println("\n(7) Deseja adicionar um shampoo ?");

				System.out.println("\n(8) Mostrar todos os produtos do estoque");
				System.out.println("\n(0) Para voltar ao menu principal");
				
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

				
				opt = ler.nextInt(); 
				
				
			switch(opt)
			{
			case 1:
				Lista1[0]++;
				System.out.println("*****************************************************************************************************************************************************************************************************************************");
				System.out.println("A quantidade de condicionador aumentou, agora é: "+Lista1[0]);
				String produto = ler.nextLine();
				break;
			case 2:
				Lista1[1]++;
				System.out.println("******************************************************************************************************************************************************************************************************************");
				System.out.println("A quantidade de creme dental aumentou, agora é: "+Lista1[1]);
				break;
			case 3:
				Lista1[2]++;
				System.out.println("******************************************************************************************************************************************************************************************************************");
				System.out.println("A quantidade de desodorante aumentou, agora é: "+Lista1[2]);
				break;
			case 4:
				Lista1[3]++;
				System.out.println("******************************************************************************************************************************************************************************************************************");
				System.out.println("A quantidade de escova de dentes aumentou, agora é: "+Lista1[3]);
				break;
			case 5:
				Lista1[4]++;
				System.out.println("******************************************************************************************************************************************************************************************************************");
				System.out.println("A quantidade de papel higiênico aumentou, agora é: "+Lista1[4]);
				break;
			case 6:
				Lista1[5]++;
				System.out.println("******************************************************************************************************************************************************************************************************************");
				System.out.println("A quantidade de sabonete aumentou, agora é: "+Lista1[5]);
				break;
			case 7:
				Lista1[6]++;
				System.out.println("******************************************************************************************************************************************************************************************************************");
				System.out.println("A quantidade de shampoo aumentou, agora é: "+Lista1[6]);
				break;
				default:
				System.out.println("\nPrograma finalizando!");
				
			}

			System.out.println("\n----------------------------------------------");
			System.out.println("\nDigite qualquer número para prosseguir...");
			
		} while (opt != 0);
			
		break;
		
		
		// DOAÇÃO EM DINHEIRO
		case 3:
			do {
				System.out.println("\n\tEscolha uma opção: ");
				System.out.println("-------------------------");
				System.out.println("\n(1)- Deseja adicionar valor para doação?");
				System.out.println("\n(2)- Deseja visualizar quantia em caixa?");
				System.out.println("\n(3)- Deseja visualizar quantidade de cesta básica?");
				System.out.println("\n(0)- Voltar ao menu principal.");
				System.out.println("-------------------------");
				opd = ler.nextInt();
				switch (opd) {
				case 1:
					System.out.println("Entre com um valor para entrar doação: ");
					caixa = ler.nextDouble();
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
					System.out.println("\nOpção inválida!");
												
				}
				System.out.println("\n----------------------------------------------");
				System.out.println("\nDigite qualquer número para prosseguir...");
				prosseguir = ler.nextInt();
				
			} while (opd != 0);
			
			System.out.println("\nDigite algum número para prosseguir...");
			prosseguir = ler.nextInt();
		break;
	
		
		// VER ESTOQUE
		case 4:
			System.out.println("\nProduto  /  Quantidade");
			System.out.println("---------------------------------");
			for (int i = 0; i < estoque.length; i++) {
			System.out.println(nomes[i]+"  =  "+ estoque[i]);
			}
			System.out.println("\n----------------------------------------------");
			System.out.println("\nDigite qualquer número para prosseguir...");
			prosseguir = ler.nextInt();
		break;
		
		
			
		// VER TOTAL EM CAIXA
		case 5:
			System.out.println("Valor em caixa: ");
			System.out.println(NumberFormat.getCurrencyInstance().format(dinheiro));
			
			System.out.println("\n----------------------------------------------");
			System.out.println("\nDigite qualquer número para prosseguir...");
			prosseguir = ler.nextInt();
		break;
			
		
		// TOTAL DE CESTAS DISPONÍVEIS
			
		case 6:
			System.out.println("\n****************** ");
			for (int i = 0; i < estoque.length;i++) {
			 minhaLista.add(estoque[i]/cb1[i]);
			}
			Collections.sort(minhaLista);
			
			
			// Cestas em termos de dinheiro
			double qtd = dinheiro / cb;
			int qtde = (int) qtd;
			
			// Exibir soma de cestas de alimentos físicos + cestas em dinheiro
			System.out.println("quantidade de cestas básicas em alimentos: "+minhaLista.get(0));
			System.out.println("quantidade de cestas básicas em dinheiro é: "+qtde);
			
			System.out.println("\n----------------------------------------------");
			System.out.println("\nDigite qualquer número para prosseguir...");
			prosseguir = ler.nextInt();
			
			break;
		
		// DISTRIBUIR UMA CESTA A UMA FAMÍLIA
		case 7:
			
			System.out.println("\nQue tipo de cesta gostaria de distribuir?\n(1) --> Alimentos\n(2)--> Dinheiro\n(0)--> Voltar ao menu inicial");
			int tipo = ler.nextInt();
			if (tipo == 1) {
				// número de cestas básicas
				System.out.println("\n****************** ");
				for (int i = 0; i < estoque.length;i++) {
					minhaLista.add(estoque[i]/cb1[i]);
				}
				Collections.sort(minhaLista);
				System.out.println("quantidade de cestas básicas: "+minhaLista.get(0));
				if (minhaLista.get(0) > 0) {
					ler.nextLine();
					System.out.println("Aperte '1' caso deseje retirar uma cesta básica e distribuí-la ...");
					for (int i = 0; i < estoque.length;i++) {
						estoque[i] = estoque[i] - cb1[i];
						System.out.println("Uma cesta completa foi retirada.");
					}
				} else {
					System.out.println("Quantidade de cestas insuficientes para doações!");
				}
				
			}
			if (tipo ==2) {
				qtd = dinheiro / cb;
				qtde = (int) qtd;
				if (qtde > 0) {
					dinheiro = dinheiro - cb;
					System.out.println("Uma bolsa em dinheiro foi distribuída a uma família! Seu caixa foi alterado!");
				}
				else {
					System.out.println("Quantidade de cestas insuficientes para doações!");					
				}
			}
			
			System.out.println("\n----------------------------------------------");
			System.out.println("\nDigite qualquer número para prosseguir...");
			prosseguir = ler.nextInt();
		break;
    
				
		}	
				
		} while (opt1 !=0);
		
		System.out.println("Programa Encerrado! Obrigado por ajudar! <3");
}
}

