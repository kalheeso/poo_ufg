package questionario1_questao2;

public class Despesa {
	private String descricao;
	private double valor;
	private String data;
	
	public Despesa() {
		
	}
		
	public Despesa(String descricao, double valor, String data) {
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}		
		
	public String toString () {
		return data + " - " + descricao + " - " + valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
