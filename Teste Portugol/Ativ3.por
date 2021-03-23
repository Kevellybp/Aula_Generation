programa
{
	
	funcao inicio()
	{
	cadeia fabrica
	inteiro ts, hora, minutos, segundos

	escreva(" total de evento da:")
	leia(fabrica)
	escreva ("total em segundos:")
	leia(ts)
	hora = ts / 3600
	minutos = (ts % 600) / 60
	segundos = (ts % 3600) % 60

	
escreva(" O evento durou:\n", hora, "horas", minutos, "minutos", "e", segundos, "segundos")
	
	
	 
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */