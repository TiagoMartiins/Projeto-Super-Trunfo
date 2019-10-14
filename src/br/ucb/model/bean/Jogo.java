package br.ucb.model.bean;

import java.io.Serializable;
import java.util.Random;

public class Jogo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int cartaJogador;
	private int cartaComputador;
	private Jogador user;
	private Jogador computador;
	
	
	public Jogo() {
		if(this.user == null && this.computador == null){
		Random rand = new Random();
		this.cartaComputador = rand.nextInt(10);
		this.cartaJogador = rand.nextInt(10);}
		
		this.user.pickAPersonage(cartaJogador);
		this.computador.pickAPersonage(cartaComputador);
		
	}
	
	public void restartGame(){
		this.user = null;
		this.computador = null;
	}
	
	public void whoWin(String escolhaUsuario){
		if(escolhaUsuario.equals("habilidade")){
			if(this.user.getPersonagem().getHabilidades() > this.computador.getPersonagem().getHabilidades())
				this.user.ganhar();
			else
				this.computador.ganhar();
		if(escolhaUsuario.equals("pericias")){
			if(this.user.getPersonagem().getPericias() > this.computador.getPersonagem().getPericias())
				this.user.ganhar();
			else
				this.computador.ganhar();
		}
		if(escolhaUsuario.equals("combate")){
			if(this.user.getPersonagem().getCombate() > this.computador.getPersonagem().getCombate())
				this.user.ganhar();
			else
				this.computador.ganhar();
		}
			
		}
	}
	

}
