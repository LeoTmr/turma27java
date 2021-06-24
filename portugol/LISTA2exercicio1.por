programa
{
	
	funcao inicio()
	{
		
		inteiro pesoTomates 
		inteiro excesso,multa
		escreva("Escreva aqui o seu peso (Kl) em tomates :")
		leia (pesoTomates)

          multa = (pesoTomates -50)*4
		excesso = (pesoTomates - 50)

		
		se(pesoTomates>50) {
			
			escreva("Você ultrapassou o peso (Kl) de tomates permitido , excesso: " + excesso ,  " ,você pagará a mais: ",+multa, + "\n")
		}
		senao se(pesoTomates<=50){

		escreva ("Você não excedeu o peso de tomates desta vez!" )	
		
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */