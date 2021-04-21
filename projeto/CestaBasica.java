import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// Essa classe cria cestas básicas de acordo com  a necessidade do cliente

public abstract class CestaBasica {

	protected List<String> produto = new ArrayList<String>();// Lista com nomes dos produtos que vão na cesta básica

	protected List<Integer> estoque = new ArrayList<Integer>();// Lista com quantidade de produtos

	protected List<Integer> composicaoReferencia; // cesta de referencia

	protected String nome; // nome do objeto

	public CestaBasica(String nome, List<String> produto, List<Integer> estoque, List<Integer> composicaoReferencia) {
		this.nome = nome;
		this.produto = produto;
		this.estoque = estoque;
		this.composicaoReferencia = composicaoReferencia;
	}

	abstract public void doar(int codigoProduto);

	abstract public void visualizar();

	abstract public void calcularCestas();

	abstract public void distribuirCestas(int n);

	public List<String> getProduto() {
		return produto;
	}

	public void setProduto(List<String> produto) {
		this.produto = produto;
	}

	public List<Integer> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Integer> estoque) {
		this.estoque = estoque;
	}

	public List<Integer> getComposicaoReferencia() {
		return composicaoReferencia;
	}

	public void setComposicaoReferencia(List<Integer> composicaoReferencia) {
		this.composicaoReferencia = composicaoReferencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	// Exceção
	public int verificarEntrada(int numerador) throws ArithmeticException
	{
		return numerador;
	}//possibilita divisão por zero

	
	public static void main(String[] args)
	
	{
		Scanner scanner = new Scanner(System.in);
		
		boolean continueLoop = true; // determina se mais entradas são necessárias
		
		do
		{
			try //lê dois números e calcula o quociente
			{
				System.out.println("\nentre com o numerador: ");
				int numerador = scanner.nextInt();//Luis				
				System.out.printf("\nResultado: %d ",numerador);
				continueLoop = false;//entrada bem-sucedida; fim do loop
			}
			catch(InputMismatchException inputMismatchException)
			{
				System.err.printf("\nException: %s \n",inputMismatchException);
				scanner.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro. Por favor tente novamente.\n");			
			}				
		}while(continueLoop);


}
	
	

}