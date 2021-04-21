
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EstoqueDinheiro extends CestaBasica {

	Scanner ler = new Scanner(System.in);

	public EstoqueDinheiro(String nome, List<String> produto, List<Integer> estoque,
			List<Integer> composicaoReferencia) {
		super(nome, produto, estoque, composicaoReferencia);
	}

//	public String formatarMoeda() {
//        NumberFormat nf = NumberFormat.getCurrencyInstance();
//        nf.setMinimumFractionDigits(2);
//        String formatoMoeda = nf.format(estoque);
//        return formatoMoeda;
	// }

	@Override
	public void doar(int codigoProduto) {
		System.out.println("qual valor você gostaria de doar?");
		int qtd = ler.nextInt();
		int novaQtd = estoque.get(0) + qtd;
		estoque.set(0, novaQtd);
		System.out.println("Seu estoque mudou, agora ele é de: " + estoque.get(0));

		// TODO Auto-generated method stub

	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------");	
		
	//	for (int i = 1; i < estoque.size(); i++) {
	//	System.out.println(produto.get(i) + " = " + estoque.get(i)+" R$");
		
		// System.out.println(NumberFormat.getCurrencyInstance().format(dinheiro));
		//System.out.println("Dinheiro em caixa = " + estoque.get(0).formatarMoeda());
	     System.out.println("Dinheiro em caixa" + this.formatarMoeda());
		

	
	}

	private String formatarMoeda() {
		// TODO Auto-generated method stub
		return null;
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
			System.out.println(produto.get(i) + " = " + estoque.get(i));
			nCestas.add(estoque.get(i) / composicaoReferencia.get(i));
		}

		Collections.sort(nCestas);
		int a = nCestas.get(0);

		if (a > 0) {
			for (int i = 0; i < estoque.size(); i++) {
				int atual = estoque.get(i);
				int ref = estoque.get(i);
				estoque.set(i, n * (atual - ref));
				System.out.println("Seu estoque foi atualizado com sucesso!");
			}
		} else {
			System.out.println("Quantidade de cestas insuficientes ...");
		}

	}

}