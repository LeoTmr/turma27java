programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Preciso que você me informe sua idade :")
		leia(idade)
		limpa()
		
		se (idade >= 5 e idade <=7) {
		escreva ("Sua respectiva categoria é: INFANTIL A")
			}
			
			senao se(idade >= 8 e idade <= 10){

			escreva("Sua respectiva categoria é: INFANTIL B")
				
			}
			senao se(idade >= 11 e idade <= 13){

			escreva("Sua respectiva categoria é: JUVENIL A")
				
			}
			senao se(idade >= 14 e idade <= 17){

			escreva("Sua respectiva categoria é: JUVENIL B")
				
			}
			senao se(idade >= 18){

			escreva("Sua respectiva categoria é: ADULTO")
				
			}


	}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 629; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */