package questionario1_questao2;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private double valorReservado;
	int mes;
	private ArrayList<Receita> receitas = new ArrayList<Receita>();
	private ArrayList<Despesa> despesas = new ArrayList<Despesa>();

	
	Pessoa (String nome, int mes, double valorReservado) {
		this.nome = nome;
		this.valorReservado = valorReservado;
		this.mes = mes;
	}
	
	public double saldoRestante() {
		double valorTotalReceitas = 0;
		double valorTotalDespesas = 0;
		for (int i = 0; i < receitas.size(); i++) {
			valorTotalReceitas += receitas.get(i).getValor();
		}
		for (int i = 0; i < despesas.size(); i++) {
			valorTotalDespesas += despesas.get(i).getValor();
		}
		return valorReservado + valorTotalReceitas - valorTotalDespesas;
	}
	
	boolean adicionaDespesa(String descricao, double valor, String data) {
		Despesa despesa = new Despesa(descricao, valor, data);
		if (saldoRestante() < despesa.getValor()) {
			return false;
		}
		else {
			despesas.add(despesa);
			return true;
		}
	}
		
	void adicionaReceita(String descricao,  double valor) {
		receitas.add(new Receita(descricao, valor));
	}
	
	void adicionaReceita(String descricao,  double valor, String cpf) {
		receitas.add(new ReceitaIdentificada(descricao, valor, cpf));
	}
		
	double totalParaGastar() {
		double total = valorReservado;
		for (int i=0;i<receitas.size();i++) {
			total = total + receitas.get(i).getValor();
		}
		return total;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorReservado() {
		return valorReservado;
	}

	public void setValorReservado(double valorReservado) {
		this.valorReservado = valorReservado;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public ArrayList<Receita> getReceitas() {
		return receitas;
	}

	public void setReceitas(ArrayList<Receita> receitas) {
		this.receitas = receitas;
	}

	public ArrayList<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(ArrayList<Despesa> despesas) {
		this.despesas = despesas;
	}

	public String toString() {
		String dadosPessoa = nome + " - Mês : " + mes + "\n" + "Valor Reservado : " + valorReservado + "\n";
		dadosPessoa = dadosPessoa + "Receitas : \n";
		for (int i=0;i<receitas.size();i++) {
			dadosPessoa = dadosPessoa + receitas.get(i) + "\n";
		}
		dadosPessoa = dadosPessoa + "Total Disponível : " + totalParaGastar()  + "\n";
		dadosPessoa = dadosPessoa + "Despesas : \n";
		for (int i=0;i < despesas.size();i++) {
			dadosPessoa = dadosPessoa + despesas.get(i) + "\n";
		}
		dadosPessoa = dadosPessoa + "Saldo restante : \n" + saldoRestante();
				
		return dadosPessoa;
	}
}
