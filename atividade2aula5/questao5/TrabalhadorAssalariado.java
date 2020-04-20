package questao5;

public class TrabalhadorAssalariado extends	Trabalhador {
	double horasDeTrabalho;
	double salarioHora;
	
	public TrabalhadorAssalariado(double horas, double salario) {
		this.horasDeTrabalho = horas;
		this.salarioHora = salario;
	}
	
	@Override
	public double calcularPagamento() {
		double x = this.salarioHora;
		return x*40.00;
	}

}

