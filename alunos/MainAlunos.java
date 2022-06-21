package alunos;

public class MainAlunos {

	public static void main(String[] args) {
		Departamento dep1 = new Departamento("Instituto de Informática", "INF");
		
		Curso curso1 = new Curso("Engenharia de software", "ES", dep1);
		
		Aluno aluno1 = new Aluno("Matue Geraldino de Melo", 202101034, 2021, curso1);
		
		Departamento dep2 = new Departamento("Instituto de Letras", "IL");
		
		Curso curso2 = new Curso("Letras - Japonês", "LJ", dep2);
		
		Aluno aluno2 = new Aluno("Celsio Portioli", 202101030, 2020, curso2);
	}
}
