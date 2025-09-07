package atividade.roteiro;
import java.io.IOException;
import java.util.Scanner;

public abstract class Midia {
	
	protected String nome; 
	protected String artista;
	protected int dataLancamento;
	protected int alugado;
	
	
	Midia(String nome, String artista, int dataLancamento, int alugado){
		
		this.nome = nome;
		this.artista = artista;
		this.dataLancamento = dataLancamento;
		this.alugado = alugado;
		
	}
	
	public String toString() {
		return null;
	}
	
}
