package empregados;

public class Empresa {

	private String cnpj;
	private String razao;
	private Endereco endereco;
	
	public Empresa() {
		
	}

	public Empresa(String cnpj, String razao, Endereco endereco) {
		super();
		this.cnpj = cnpj;
		this.razao = razao;
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
