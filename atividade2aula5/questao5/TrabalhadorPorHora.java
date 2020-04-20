package questao5;

public class TrabalhadorPorHora extends	Trabalhador {
	double horasDeTrabalho;
	double salarioHora;
	
	public TrabalhadorPorHora(double horas, double salario) {
		this.horasDeTrabalho = horas;
		this.salarioHora = salario;
	}
	
	@Override
	public double calcularPagamento(){
		double x = this.salarioHora;
		double y = this.horasDeTrabalho;
		if (y > 40.00) {
			return (x*40.00)+(x*((y-40.00)*1.5));
		}
		if (y < 40.00) {
			return (x*(40.00-y));
		} else {
			return x*40;
		}
		
	}

}
