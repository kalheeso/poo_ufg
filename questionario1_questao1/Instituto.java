package questionario1_questao1;

import java.util.List;

public class Instituto {

	private String nome;
	private List<Curso> cursos;
	
	public Instituto() {
		
	}

	public Instituto(String nome, List<Curso> cursos) {
		super();
		this.nome = nome;
		this.cursos = cursos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
}
