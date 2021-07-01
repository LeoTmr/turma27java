package introducao;

public class DesafioGraus {

	public static void main(String[] args) {
		double temperatura=36;
		String name=" Ed";
		
		System.out.println("Ola"+name);
		System.out.println("Em Kelvin: "+(temperatura+273.15)+"K°");
		temperatura = (temperatura*1.8)+32;
		System.out.println("em Fahrenheit: "+temperatura+"F°");
	}

}
