package questionario1_questao1;

public class Aluno {

	private int matricula;
	private String nome;
	private Curso curso;
	
	public Aluno() {
		
	}

	public Aluno(int matricula, String nome, Curso curso) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
