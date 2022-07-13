package exercicio_uml;

import java.util.ArrayList;
import java.util.List;

public class Titular extends Socio implements Associacao {

	private int numTitulo;
	private List<Dependente> dependentes;
	private int qtdeDependentes;
	
	public Titular() {}
	
	
	public Titular(int numTitulo, String nome, int idade, char sexo) {
		super(nome, idade, sexo);
		this.numTitulo = numTitulo;
		this.qtdeDependentes = 0;
		this.dependentes = new ArrayList<>();
	}


	public int getNumTitulo() {
		return numTitulo;
	}

	public int getQtdeDependentes() {
		return qtdeDependentes;
	}


	public void setQtdeDependentes(int qtdeDependentes) {
		this.qtdeDependentes = qtdeDependentes;
	}


	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}


	public List<Dependente> getDependentes() {
		return dependentes;
	}


	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}


	@Override
	public double calcularValorMensalidade() {
		double valorDependentes = 0;
		for (Dependente dependente : this.getDependentes()) {
			valorDependentes = dependente.calcularValorMensalidade();
		}
		if (super.getIdade() > 21 && super.getIdade() <= 65) {
			return 500.0 + valorDependentes;
		}
		if (super.getIdade() > 65) {
			return 200.0 + valorDependentes;
		}
		return 0.0;
	}

	@Override
	public String toString() {
		return this.getNumTitulo() + " - " + super.getNome() + ", " + super.getIdade() + " anos. Titulares: " + this.getDependentes();
	}

	@Override
	public void associarObjetos(Object obj) {
		this.getDependentes().add((Dependente) obj);
	}
}
