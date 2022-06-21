package musicas_e_compositores;

public class MainMusica {

	public static void main(String[] args) {
		Musica musica1 = new Musica("Ms. Jackson", 2008, "Hip hop");
		Musica musica2 = new Musica("All the stars", 2018, "Pop");
		Musica musica3 = new Musica("The real slim shady", 2013, "Rap");
		
		Compositor compositor1 = new Compositor("Outkast", "Mexicano");
		Compositor compositor2 = new Compositor("Kendrick Lamar", "Americano");
		Compositor compositor3 = new Compositor("SZA", "Albanesa");
		Compositor compositor4 = new Compositor("Eminem", "Americano");
		
		musica1.addCompositor(compositor1);
		musica2.addCompositor(compositor2);
		musica2.addCompositor(compositor3);
		musica3.addCompositor(compositor4);
		
		System.out.println(musica1);
		System.out.println(musica2);
		System.out.println(musica3);
	}

}
