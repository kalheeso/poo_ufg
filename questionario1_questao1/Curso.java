package questionario1_questao1;

import java.util.List;

public class Curso {

	private String nome;
	private Instituto instituto;
	private List<Aluno> alunos;
	private List<Disciplina> disciplinas;

	
	public Curso() {
		
	}
	
	public Curso(String nome, Instituto instituto, List<Aluno> alunos, List<Disciplina> disciplinas) {
		this.nome = nome;
		this.instituto = instituto;
		this.alunos = alunos;
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instituto getInstituto() {
		return instituto;
	}

	public void setInstituto(Instituto instituto) {
		this.instituto = instituto;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
}
