programa
{
	
	funcao inicio()
	{
          inteiro idade
          inteiro contador=2
		
		escreva("Digite sua idade:")
		leia(idade)


		enquanto(idade < 18){
			escreva("Você não tem idade para acessar \n")
			escreva("Digite sua idade:")
		     leia(idade)
		     contador++
		     se(contador>3){
		     	
		     	escreva ("Voce é guerreiro \n")
		     	pare
		     		
		     }
		     	      
	   
		}
		se(contador==2){
			escreva("Parabéns você está grandinho")	
		}
		senao{
			escreva("Vaza fio")
		}

           
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 85; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */