package clientes_enderecos;

public class ClienteMain {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco("Dos alfeus", 210, "Campinas", "Sem", "Goiânia", "Goiás");
		Cliente cli1 = new Cliente("Senhor barriga", "80192331109", end1);
		
		Endereco end2 = new Endereco("Privet Drive", 9, "Vila NOva", "Não tem", "Anápolis", "Goiás");
		Cliente cli2 = new Cliente("Mr. Belly", "80192331112", end2);
	}

}
