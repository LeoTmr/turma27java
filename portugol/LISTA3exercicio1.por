programa
{
	inclua biblioteca Matematica --> M
	
	funcao inicio()
	{
		real salario =0.00 
		real meSalarios = 0.00
		real toSalarios =0.00
		real meFilhos = 0.00
		real toFilhos =0.00
		real maiorSalario = 0.00
		real Pessoas=0.00
		inteiro filhos = 0
		real cont = 0.00
			const real intrevistados = 2.0


		para(inteiro x=1;x<=intrevistados; x++){
			escreva("Eu preciso que você me informe o seu salario: ")
		leia (salario)
		limpa()
			
			escreva("Sistema compilando informações, agora, preciso que você me informe o numero de filhos: ")
		leia(filhos)
		limpa()
					
				toSalarios = toSalarios + salario
				toFilhos = toFilhos + filhos
				

				se (salario > maiorSalario){
					maiorSalario = salario
				}
				se(salario<=100){
					cont++
				}
		}
		Pessoas = (cont*100)/intrevistados
		
		meSalarios = toSalarios / intrevistados
		escreva("\n A media salarial é aproximadamente: ",M.arredondar(meSalarios,2))

		meFilhos= toFilhos / intrevistados
		escreva("\n A media de filhos é aproximadamente: ",M.arredondar(meFilhos,2))

		escreva("\n O salario maior foi: ", maiorSalario)

		escreva("\n O numero de pessoas com o salario de ate R$100.00 é: ",M.arredondar(Pessoas,2))
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 75; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */