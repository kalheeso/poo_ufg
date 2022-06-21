package empregados;

public class EmpregadosMain {

	public static void main(String[] args) {
		Endereco end1 = new Endereco("Alfeus", 90, "Bueno", "Sem", "Goiania", "Goiás");
		Empresa empresa1 = new Empresa("090134510895", "0000", end1);
		Empregado empregado1 = new Empregado("Matheus G. Melo", 1235890, empresa1);
		
	}

}
