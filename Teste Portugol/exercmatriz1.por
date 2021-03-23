programa
{
	
	funcao inicio()
	{
		inteiro n1[4] [6], n2[4] [6],m2[4] [6],m1[4] [6], l,c
 

para (l=0;l<4;l++)
{
para (c=0;c<6;c++)
{
	escreva("Entre com um numero :")
	leia(n1 [l] [c])
	
	escreva("Entre com um numero :")
	leia(n2 [l] [c])

	m1 [l] [c] = n1[l] [c] + n2 [l] [c]
	m2 [l] [c] = n1[l] [c] - n2 [l] [c]
}
}
para (l=0;l<4;l++)
{
para (c=0;c<6;c++)
{
		

escreva ("\nA soma dos numeros é: " , m1 [l] [c], "\ne a diferença é : ", m2 [l] [c])

	
}
}
	
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 21, 2}-{m2, 6, 31, 2}-{m1, 6, 41, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */