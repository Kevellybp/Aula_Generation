import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EstoqueAlimento extends CestaBasica {
	Scanner ler = new Scanner(System.in);

	public EstoqueAlimento(String nome, List<String> produto, List<Integer> estoque,
			List<Integer> composicaoReferencia) {
		super(nome, produto, estoque, composicaoReferencia);

	}

	@Override
	public void doar(int codigoProduto) {
		// TODO Auto-generated method stub
		System.out.println("qual valor você gostaria de doar?");
		int qtd = ler.nextInt();
		int novaQtd = estoque.get(codigoProduto) + qtd;
		estoque.set(codigoProduto, novaQtd);
	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		System.out.println("Produto / Quantidade");
		System.out.println("-----------------------------------");
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println(produto.get(i) + " = " + estoque.get(i));
		} 	
	}

	@Override
	public void calcularCestas() {
		// TODO Auto-generated method stub
		List<Integer> nCestas = new ArrayList<Integer>();
		for (int i = 0; i < estoque.size(); i++) {
			nCestas.add(estoque.get(i) / composicaoReferencia.get(i));
			Collections.sort(nCestas);
		}
		System.out.println("O número de cestas completas é de: " + nCestas.get(0));
	}

	@Override
	public void distribuirCestas(int n) {
		// TODO Auto-generated method stub
		List<Integer> nCestas = new ArrayList<Integer>();
		for (int i = 0; i < estoque.size(); i++) {
			nCestas.add(estoque.get(i) / composicaoReferencia.get(i));
			Collections.sort(nCestas);
		}

		Collections.sort(nCestas);
		int a = nCestas.get(0);

		if (a >= n) {
			for (int i = 0; i < estoque.size(); i++) {
				int atual = estoque.get(i);
				int ref = composicaoReferencia.get(i);
				estoque.set(i, n * (atual - ref));				
			}
		System.out.println("Seu estoque foi atualizado com sucesso!");
		
		} else {
			System.out.println("Quantidade de cestas insuficientes ...");
		}

	}

	public void verificarEntrada() {
		// TODO Auto-generated method stub
		
	}

}