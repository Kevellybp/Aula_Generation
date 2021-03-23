programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real matriz1 [3] [3], soma=0.0, mediag, maiornota=0.0
		inteiro linha, coluna, cont=0

para (linha=0;linha<3;linha++)

{
	para (coluna=0;coluna<3;coluna++)
{
	escreva("entre c uma nota:")
	leia(matriz1 [linha] [coluna])
	soma += matriz1[linha] [coluna]
se (maiornota<matriz1 [linha] [coluna])
{
	maiornota = matriz1 [linha] [coluna]
}
cont++	
}

}
mediag= soma/ cont 
escreva ("\n media geral = " , mediag)
		





		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz1, 6, 7, 7}-{soma, 6, 24, 4}-{mediag, 6, 34, 6}-{maiornota, 6, 42, 9}-{cont, 7, 25, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */