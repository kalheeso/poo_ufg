package questionario1_questao2;

public class Receita {
	private String descricao;
	private double valor;
		
	Receita (String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}		
		
	public String toString () {
		return descricao + " - " + valor;
	}
}
