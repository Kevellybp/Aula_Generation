programa
{
	
inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real a,b,c,r,s,d
		escreva("o valor de a é:")
		leia(a)
		escreva("o valor de b é:")
		leia(b)
		escreva("o valor de c é:")
		leia(c)
		r= mat.potencia(a+b,2)
		s= mat.potencia(b+c,2)
		d=(r+s)/2
		escreva("o valor de D é:", d)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */