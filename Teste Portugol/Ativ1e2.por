programa
{
	
	funcao inicio()
	{
  cadeia nome
  inteiro idAno, idMes, idDias, Totaldias // Exercício1

  inteiro td,ano,mes,dia // Exer2
  cadeia idade

  escreva("a idade de:")
  leia(nome)
  escreva("idade em anos:")
leia(idAno)
escreva ("idade em mês:")
leia(idMes)
escreva("idade em dias:")
leia (idDias)

Totaldias = idAno*365 + idMes*30 +idDias
escreva("sua idade em dias é:", Totaldias)


escreva("\n a idade em dias:")
leia(td)
ano = td / 365
mes = (td % 365) / 30
dia = (td % 365) / 30


 escreva("O total de idade é:\n", ano, "anos", mes, "meses", " e" ,dia,"dias" )
  
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */