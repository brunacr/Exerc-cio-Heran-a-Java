package br.com.generation.heranca;

public class TestarAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		
		Cavalo cavalo1 = new Cavalo();
		Cavalo cavalo2 = new Cavalo();
		
		Preguica preguica1 = new Preguica();
		Preguica preguica2 = new Preguica();
		
		cachorro1.setNome("Rex");
		cachorro1.setIdade(2);;
		cachorro1.setSom("latir pouco");
		cachorro1.setAcao("correr muito");
		
		cachorro2.setNome("Lulu");
		cachorro2.setIdade(4);
		cachorro2.setSom("latir muito");
		cachorro2.setAcao("correr pouco");
		
		cavalo1.setNome("Nestor");
		cavalo1.setIdade(3);
		cavalo1.setSom("relinchar pouco");
		cavalo1.setAcao("correr pouco");
		
		cavalo2.setNome("Trovão");
		cavalo2.setIdade(5);
		cavalo2.setSom("relinchar muito");
		cavalo2.setAcao("correr muito");
		
		preguica1.setNome("Docinho");
		preguica1.setIdade(1);
		preguica1.setAcao("subir em árvores");
		
		preguica2.setNome("Florzinha");
		preguica2.setIdade(6);
		preguica2.setAcao("subir em árvores");
		
		System.out.println("O cachorro " + cachorro1.getNome() + " tem " + cachorro1.getIdade() + " anos de idade, ele costuma " + cachorro1.getSom() + " e " + cachorro1.getAcao() + ".");
		System.out.println();
		System.out.println("O cachorro " + cachorro2.getNome() + " tem " + cachorro2.getIdade() + " anos de idade, ele costuma " + cachorro2.getSom() + " e " + cachorro2.getAcao() + ".");
		System.out.println();
		System.out.println("O cavalo " + cavalo1.getNome() + " tem " + cavalo1.getIdade() + " anos de idade, ele costuma " + cavalo1.getSom() + " e " + cavalo1.getAcao() + ".");
		System.out.println();
		System.out.println("O cavalo " + cavalo2.getNome() + " tem " + cavalo2.getIdade() + " anos de idade, ele costuma " + cavalo2.getSom() + " e " + cavalo2.getAcao() + ".");
		System.out.println();
		System.out.println("A preguiça " + preguica1.getNome() + " tem " + preguica1.getIdade() + " ano de idade e ela adora " + preguica1.getAcao() + ".");
		System.out.println();
		System.out.println("A preguiça " + preguica2.getNome() + " tem " + preguica2.getIdade() + " anos de idade e ela adora " + preguica2.getAcao() + ".");
		System.out.println();

	}

}
