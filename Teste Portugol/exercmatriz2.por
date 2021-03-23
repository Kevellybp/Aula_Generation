programa
{
	//4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
	//e em seguida, exiba a soma dos valores dela e a soma dos valores da
	//primeira diagonal, ou seja, diagonal principal.
	funcao inicio()
{
	
	
	real matriz[3] [3], soma=0.0, diagonal=0.0
	inteiro l=0, c=0
	 para (l=0; l<3;l++)
	 {
	 	para(c=0;c<3;c++)
	 	{
	 		escreva("entre com um numero:")
	 		leia(matriz [l] [c])
	 		soma+=matriz [l] [c]
	 		se (c==l)
	 	{
	 		diagonal= diagonal+ matriz [l] [c]
	 	}
	 		
	 	}
	 }
escreva ("\n A soma geral é: ", soma, "\nA soma diagonal é:", diagonal)

	
	
}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 10, 6, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */