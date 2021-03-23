programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	inteiro numero
		real n1,n2,n3,n4,n5,n6,n7, n8
		
		
		escreva("Entre com n1 ")
		leia(n1)
		escreva("Entre com n2 ")
		leia(n2)
		escreva("Entre com n3 ")
		leia(n3)
		escreva("Entre com n4 ")
		leia(n4)
		n5=  mat.potencia(n1, 2)
		n6=  mat.potencia(n2, 2)
		n7=  mat.potencia(n3, 2)
		n8=  mat.potencia(n4, 2)

		se (n7>=1000)
		{
			escreva("Finalizado", n7)
		}
		senao se (n7<1000)
		{
			escreva("resultado menor que 1000", "\nn1:",n1, "\nn2:",n2, "\nn3:",n3,"\nn4:",n4,"\nn5",n5,"\nn6",n6,"\nn7",n7,"\nn8",n8)
		}
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */