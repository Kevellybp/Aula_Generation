programa
{
	

	funcao inicio()
	{
		real sal,mediaS=0.0, totalsal=0.0,maiorsal=0.0,porc, cont100=0.0
		inteiro  filhos, totalf=0, mediaf,x
	
	para(x=1; x<=4; x++)
	{
	escreva ("diga seu sal:")
	leia(sal)
	escreva ("diga qnt filho:")
	leia(filhos)
	
	totalsal= totalsal +sal
	totalf= totalf +filhos
	


se( maiorsal<sal)
{
	maiorsal=sal
}
se (sal<=100)
{
	cont100++
}
	}	

mediaS=totalsal /4
mediaf= totalf /4
porc =(cont100 * 100) /4
escreva ("\nMedia salarial é:", mediaS)
escreva ("\nmedia de filhos é:", mediaf)
escreva("\n media de salario é: ",maiorsal)
escreva("\nPorcentagem de pessoas c salário menor ou até 100 é: ", porc)


	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */