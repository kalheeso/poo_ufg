package musicas_e_compositores;

public class Compositor {
	
	private String nome;
	private String nacionalidade;
	
	public Compositor() { }

	public Compositor(String nome, String nacionalidade) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String toString() {
		return this.nome;
	}
}
