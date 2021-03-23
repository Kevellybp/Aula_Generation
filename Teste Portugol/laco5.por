programa
{
	
	funcao inicio()
	{
		real g1,g2,g3,ac 
	
		escreva ("Digite o numero de poluição")
		leia(ac)
		se (ac<=0.25)
		{
		escreva("aceitável")
		}
		senao se (ac>=0.3 e ac< 0.4)
		{
		escreva(" O grupo 1 sera notificado")
		}
		senao se (ac>=0.4 e ac<0.5)
		{
		escreva(" O grupo 1 e 2 serão suspensos")
		}
		senao se (ac>=0.5)
		
		escreva("Todos os grupos serão notificados")
	
		}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */