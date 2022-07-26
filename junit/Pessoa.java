package junit;

public class Pessoa {
	
	private String nome;
	private Double salario;
	private Integer qtdeDependentes;
	private Integer idade;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, Double salario, Integer qtdeDependentes, Integer idade) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.qtdeDependentes = qtdeDependentes;
		this.idade = idade;
	}
	
	private Double deducaoComDependentes() {
		return this.getQtdeDependentes() * 179.71;
	}
	
	public Double calculaImposto() {
		Double impostoSemDeducaoDependentes;
		if (this.getIdade() >= 65) {
			return 0.0;
		}
		if (this.getSalario() <= 1787.77) {
			return 0.0;
		}
		else if (this.getSalario() <= 2679.29) {
			impostoSemDeducaoDependentes = this.getSalario() * 0.075 - 134.08;
		}
		else if (this.getSalario() <= 3572.43) {
			impostoSemDeducaoDependentes = this.getSalario() * 0.15 - 335.03;
		}
		else if (this.getSalario() <= 4463.81) {
			impostoSemDeducaoDependentes = this.getSalario() * 0.225 - 602.96;
		}
		else {
			impostoSemDeducaoDependentes = this.getSalario() * 0.275 - 826.15;
		}
		
		if (impostoSemDeducaoDependentes - deducaoComDependentes() > 0.0) {
			return impostoSemDeducaoDependentes - deducaoComDependentes();
		}
		else {
			return 0.0;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getQtdeDependentes() {
		return qtdeDependentes;
	}

	public void setQtdeDependentes(Integer qtdeDependentes) {
		this.qtdeDependentes = qtdeDependentes;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	

}
