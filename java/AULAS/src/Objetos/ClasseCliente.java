package Objetos;

public class ClasseCliente {
		
	public String nomeCompleto;
	public String aniversario;
	public String matricula;
	public boolean desconto;
	
		public boolean promocao (String aniversario) {
			if (aniversario.equals("24/08")) {
				desconto = true;
				System.out.println("Parabens! Gra�as ao seu aniversario voc� obteve um desconto");
			}else {
				desconto = false;
				System.out.println("Tenha um otimo dia!!!");
			}
			return desconto;
		}
		public String saudacao(String nomeCompleto,String matricula) {
			String saudacao = "ola, "+ nomeCompleto +"! seu cadstro �: "+matricula;
			return saudacao;
			
		}
		
}
