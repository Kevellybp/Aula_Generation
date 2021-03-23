programa
{
	
	funcao inicio()
	{
		real sal, somasal=0.0, mediasal,medianf, maiorsal=0,porc =100
		inteiro nf, somanf=0, cont100=0,x
	
	para (x=1;x<=4;x++)
	{
		escreva ("valor salario :")
		leia (sal)
		escreva (" qunt de filhos :")
		leia (nf)

		somasal= somasal +sal
		somanf= somanf +nf
		se 
		
		
		(maiorsal<sal)	
			
		
se (sal<=100)

	
	{
	cont100++
	}
	
	mediasal=somasal /4
	medianf =somanf /4
	porc = (cont100 *100) /4

	escreva("\nmedia salarial :", mediasal)
	escreva("\nmedia n de filhos: ",medianf)
	escreva("\n maior salario :", maiorsal)
	escreva("\nporc de pessoas com salario de ate 100: ", porc)
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 139; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */