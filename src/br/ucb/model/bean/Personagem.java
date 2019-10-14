package br.ucb.model.bean;

import java.io.Serializable;

public class Personagem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String imagem;
	private int habilidades;
	private int pericias;
	private int combate;
	
	public Personagem() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(int habilidades) {
		this.habilidades = habilidades;
	}

	public int getPericias() {
		return pericias;
	}

	public void setPericias(int pericias) {
		this.pericias = pericias;
	}

	public int getCombate() {
		return combate;
	}

	public void setCombate(int combate) {
		this.combate = combate;
	}
	
	

}
