package questionario1_questao2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Cadastre as Despesas/Receitas de uma pessoa");
		
		String nome = JOptionPane.showInputDialog(null,"Entre com o nome da Pessoa : ");
		int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o Mês : "));
		double valorReservado = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o valor reservado de " + nome + " para o mês " + mes + " : "));
		
		Pessoa pes = new Pessoa(nome, mes, valorReservado);
		pes.adicionaReceita("Doação", 5000.0, "123456789");

		String resp = JOptionPane.showInputDialog(null,"Entrar com as Despesas/Receitas de " + nome + " ? (S/N)");
		
		while (resp.toUpperCase().equals("S")) {
			String tipo = JOptionPane.showInputDialog(null,"Despesa ou Receita ? (D/R)");
			String descricao = JOptionPane.showInputDialog(null,"Descrição :");
			double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor : "));
			
			if (tipo.toUpperCase().equals("R"))
				pes.adicionaReceita(descricao, valor);
			if (tipo.toUpperCase().equals("D")) {
				String data = JOptionPane.showInputDialog(null,"Data :");
				pes.adicionaDespesa(descricao, valor, data);
			}
			
			resp = JOptionPane.showInputDialog(null,"Adicionar nova Despesa / Receita de " + nome + " ? (S/N)");
			
		}		
		JOptionPane.showMessageDialog(null,pes);
				
	}
}
