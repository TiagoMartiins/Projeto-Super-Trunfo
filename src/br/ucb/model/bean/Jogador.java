package br.ucb.model.bean;

import java.io.Serializable;
import java.util.List;

public class Jogador implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<Personagem> personagens;
	private Personagem personagem;
	private int pontos;
	
	public Jogador() {
		createList();
	}
	
	public void pickAPersonage(int numeroPersonagem){
		this.personagem = personagens.get(numeroPersonagem);
	}
	
	public void ganhar(){
		this.pontos++;
	}
	
	public void createList(){
		Personagem batman = new Personagem();
		batman.setNome("batman");
		batman.setImagem("batman.jpg");
		batman.setHabilidades(56);
		batman.setPericias(55);
		batman.setCombate(48);
		
		Personagem capitaoMarvel = new Personagem();
		capitaoMarvel.setNome("Capitao Marvel");
		capitaoMarvel.setImagem("capitaomarvel.jpg");
		capitaoMarvel.setHabilidades(26);
		capitaoMarvel.setPericias(8);
		capitaoMarvel.setCombate(24);
		
		Personagem coisa = new Personagem();
		coisa.setNome("Coisa");
		coisa.setImagem("coisa.jpg");
		coisa.setHabilidades(34);
		coisa.setPericias(23);
		coisa.setCombate(28);
		
		Personagem homemAranha = new Personagem();
		homemAranha.setNome("Homem Aranha");
		homemAranha.setImagem("homemaranha.jpg");
		homemAranha.setHabilidades(22);
		homemAranha.setPericias(24);
		homemAranha.setCombate(28);
		
		Personagem ironMan = new Personagem();
		ironMan.setNome("Homem de Ferro");
		ironMan.setImagem("homemdeferro.jpg");
		ironMan.setHabilidades(30);
		ironMan.setPericias(32);
		ironMan.setCombate(20);
		
		Personagem hulk = new Personagem();
		hulk.setNome("Hulk");
		hulk.setImagem("hulk.jpg");
		hulk.setHabilidades(68);
		hulk.setPericias(9);
		hulk.setCombate(28);
		
		Personagem lanternaverde = new Personagem();
		lanternaverde.setNome("Lanterna Verde");
		lanternaverde.setImagem("lanternaverde.jpg");
		lanternaverde.setHabilidades(22);
		lanternaverde.setPericias(22);
		lanternaverde.setCombate(32);
		
		Personagem mulhermaravilha = new Personagem();
		mulhermaravilha.setNome("Mulher Maravilha");
		mulhermaravilha.setImagem("mulhermaravilha.jpg");
		mulhermaravilha.setHabilidades(88);
		mulhermaravilha.setPericias(16);
		mulhermaravilha.setCombate(36);
		
		Personagem thor = new Personagem();
		thor.setNome("Thor");
		thor.setImagem("thor.jpg");
		thor.setHabilidades(82);
		thor.setPericias(22);
		thor.setCombate(32);
		
		Personagem wolverine = new Personagem();
		wolverine.setNome("Wolverine");
		wolverine.setImagem("wolverine.jpg");
		wolverine.setHabilidades(88);
		wolverine.setPericias(16);
		wolverine.setCombate(36);
		
		this.personagens.add(0,batman);
		this.personagens.add(1,capitaoMarvel);
		this.personagens.add(2,coisa);
		this.personagens.add(3,homemAranha);
		this.personagens.add(4,ironMan);
		this.personagens.add(5,hulk);
		this.personagens.add(6,lanternaverde);
		this.personagens.add(7,mulhermaravilha);
		this.personagens.add(8,thor);
		this.personagens.add(9,wolverine);
		
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public int getPontos() {
		return pontos;
	}

	
	
	

}
