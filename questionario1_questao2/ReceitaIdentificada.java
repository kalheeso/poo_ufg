package questionario1_questao2;

public class ReceitaIdentificada extends Receita {

	private String cpf;

	public ReceitaIdentificada(String descricao, double valor, String cpf) {
		super(descricao, valor);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
}
