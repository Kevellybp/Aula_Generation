programa
{
	
	funcao inicio()
	{
		inteiro vet[5], soma=0,mediag,x, maiornota=0
		real mediav


		para(x=0;x<5;x++)
		{
escreva ("entre com um valor: ")
leia(vet[x])
soma+= vet[x]
se (maiornota <vet [x])
{
	maiornota = vet [x] 
}
		}
		escreva (" A maior nota é: ", maiornota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */