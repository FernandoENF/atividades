package questao5;

public class Main {

	public static void main(String[] args) {
		TrabalhadorPorHora trabalhadorH = new TrabalhadorPorHora(20,20);
		Trabalhador trabalhador = trabalhadorH;
		System.out.println(trabalhador.calcularPagamento());
		//Resultado esperado = 400
		
		TrabalhadorAssalariado trabalhadorA = new TrabalhadorAssalariado(56,20);
		Trabalhador trabalhador2 = trabalhadorA;
		System.out.println(trabalhador2.calcularPagamento());
		//Resultado esperado = 800
		
	}

}
