programa
{
	funcao inicio()
	{
	real n1, n2, n3, media
	cadeia nome
	escreva("entre com seu nome:")
	leia(nome)
	escreva("entre com a n1:")
	leia(n1)
	escreva("entre com a n2:")
	leia(n2)
	escreva("entre com a n3:")
	leia(n3)
media =(n1+n2+n3)/3

limpa()
se (media>=7.0)
{
escreva("aluno",nome, ", voce foi aprovado com nota:", media)
}
senao se (media>=4.0 e media<7)

{
	escreva("aluno", nome, ",ficou de exame com nota:", media)

	
}
senao
{
	escreva("voce foi reprovado")
}
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */