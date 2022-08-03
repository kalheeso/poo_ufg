package questionario1_questao1;

public class AlunoMestrado extends Aluno {

	private String linhaPesquisa;
	
	public AlunoMestrado() {
		
	}

	public AlunoMestrado(String linhaPesquisa) {
		super();
		this.linhaPesquisa = linhaPesquisa;
	}

	public String getLinhaPesquisa() {
		return linhaPesquisa;
	}

	public void setLinhaPesquisa(String linhaPesquisa) {
		this.linhaPesquisa = linhaPesquisa;
	}
	
	
}
