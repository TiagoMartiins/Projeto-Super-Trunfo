package br.ucb.model.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import br.ucb.model.bean.Jogo;

@ManagedBean(name="jogoMB")
@SessionScoped
public class JogoMB implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Jogo jogo;
	private String escolhaUsuario;
	
	public String restartGame(){
		this.jogo.restartGame();
		return "index";
	}
	
	public String newGame(){
		return "index";
	}
	
	public String play(){
		this.jogo.whoWin(escolhaUsuario);
		return "game";
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public String getEscolhaUsuario() {
		return escolhaUsuario;
	}

	public void setEscolhaUsuario(String escolhaUsuario) {
		this.escolhaUsuario = escolhaUsuario;
	}
	
	
	
	
	
	

}
