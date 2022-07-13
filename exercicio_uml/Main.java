package exercicio_uml;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		List<Titular> listTitulares = new ArrayList<Titular>();
		
		int qtdeTitulares = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de titulares:"));
		
        for (int i = 0; i < qtdeTitulares; i++) {
        	
            int numTitulo = Integer.parseInt(JOptionPane.showInputDialog("Número do titular:"));
            String nome = JOptionPane.showInputDialog("Nome do titular:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do titular:"));
            char sexo = JOptionPane.showInputDialog("Sexo titular (M/F)").charAt(0);
            listTitulares.add(new Titular(numTitulo, nome, idade, sexo));
            
        }
        
        for (Titular titular : listTitulares) {
        	titular.setQtdeDependentes(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dependentes para o titular " + titular.getNome() + ":")));
        	for (int i = 0; i < titular.getQtdeDependentes(); i++) {
                int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo dependente (1, 2 ou 3)"));
                String nome = JOptionPane.showInputDialog("Nome do dependente:");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do dependente:"));
                char sexo = JOptionPane.showInputDialog("Sexo dependente (M/F)").charAt(0);
                titular.associarObjetos(new Dependente(tipo, nome, idade, sexo));
        	}
        }
        
        for (Titular titular : listTitulares) {
        	System.out.println(titular.calcularValorMensalidade());
        }
        
        
	}

}
