package atividade.roteiro;
import java.io.IOException;
import java.util.Scanner;

public class Usuario {
	
	
	protected String nome; 
	protected int creditos;
	protected int quantidadeMidias;
	protected Midia[] midiaAlugada = new Midia[3];
	
	Usuario(String nome, int creditos, int quantidadeMidias){
		this.nome = nome;
		this.creditos = creditos;
		this.quantidadeMidias = quantidadeMidias;
	}
	
	public Midia adicionarMidia(Midia midia) {
		
		this.midiaAlugada[0] = midia; //Tem que dar uma forma de atualizar os alugueis no vetor
//		System.out.println(midiaAlugada[0]);
		return midia;
	}
	
	public void tocarMidia(Midia midia) {
		System.out.println(this.nome + " está tocando " + midia.nome);
	}
	
	public void pausarMidia(Midia midia) {
		System.out.println(this.nome + " pausou a música" + midia.nome);
	}
	
	public void stopMidia(Midia midia) {
		System.out.println(this.nome + " devolveu " + midia.nome + " a pateleira");
	}

}
