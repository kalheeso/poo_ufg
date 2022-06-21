package musicas_e_compositores;

import java.util.ArrayList;
import java.util.List;

public class Musica {
	
	private String nome;
	private int ano;
	private String tipo;
	private List<Compositor> compositores;
	
	public Musica() { }

	public Musica(String nome, int ano, String tipo) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.tipo = tipo;
		this.compositores = new ArrayList<Compositor>();
	}

	public List<Compositor> getCompositores() {
		return compositores;
	}

	public void addCompositor(Compositor compositor) {
		this.compositores.add(compositor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return this.nome + ", " + this.ano + " - Compositores: " + this.compositores.toString();
	}
	
	
}
