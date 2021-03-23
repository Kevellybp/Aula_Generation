programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real x1, x2,y1, y2, subt1, pot1, subt2, pot2, soma, d
		escreva("valor x1")
		leia (x1)
		escreva("valor x2:")
		leia(x2)
		escreva("valor y1:")
		leia(y1)
		escreva("valor y2:")
		leia(y2)
		subt1 = x2- x1
		pot1 = mat.potencia(subt1,2.0)
		subt2= y2-y1
		pot2= mat.potencia(subt2, 2.0)
		soma = pot1+pot2
		d=mat.raiz(soma,2.0)
		escreva("a distancia entre os pontos é:", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 452; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */