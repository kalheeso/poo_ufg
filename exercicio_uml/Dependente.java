package exercicio_uml;

public class Dependente extends Socio {
	
	private int tipo;
	
	public Dependente() {}

	public Dependente(int tipo, String nome, int idade, char sexo) {
		super(nome, idade, sexo);
		this.tipo = tipo;
	}

	@Override
	public double calcularValorMensalidade() {
		if (this.getTipo() == 1 || this.getTipo() == 2) {
			if (super.getIdade() <= 10) {
				return 100.0;
			}
			if (super.getIdade() <= 21) {
				return 150.0;
			}
			if (super.getIdade() <= 65) {
				return 200.0;
			}
			return 80.0;
		}
		if (this.getTipo() == 3) {
			if (super.getIdade() <= 65) {
				return 250.0;
			}
			return 150.0;
		}
		return 0.0;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return this.getTipo() + " - " + super.getNome() + " ," + super.getIdade() + " anos";
	}
}
