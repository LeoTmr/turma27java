programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real A,B,C,S,R,D
		
		escreva("Escreva o seu A: ")
		leia(A)
		escreva("Escreva o seu B: ")
		leia(B)
		escreva("Escreva o seu C: ")
		leia(C)

		R= Matematica.potencia ((A+B),2)
		S= Matematica.potencia ((B+C),2)

		D= ((R+S)/2)
		
		escreva("A sua distancia é : " +D)

		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */