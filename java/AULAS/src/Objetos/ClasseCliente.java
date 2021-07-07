package Objetos;

public class ClasseCliente {
		
	public String nomeCompleto;
	public String aniversario;
	public String matricula;
	public boolean desconto;
	
		public boolean promocao (String aniversario) {
			if (aniversario.equals("24/08")) {
				desconto = true;
				System.out.println("Parabens! Graças ao seu aniversario você obteve um desconto");
			}else {
				desconto = false;
				System.out.println("Tenha um otimo dia!!!");
			}
			return desconto;
		}
		public String saudacao(String nomeCompleto,String matricula) {
			String saudacao = "ola, "+ nomeCompleto +"! seu cadstro é: "+matricula;
			return saudacao;
			
		}
		
}
