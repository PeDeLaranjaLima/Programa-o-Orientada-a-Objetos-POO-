package atividade.roteiro;
import java.io.IOException;
import java.util.Scanner;

//Musica musica = new Musica("v", "c", 5);

//Scanner scan = new Scanner(System.in);

public class Locadora {
	
	private String usuario;
	private String midia;
	
	Scanner scan = new Scanner(System.in);

	Locadora(Usuario usuario,  Midia midia){
	    
		this.midia = midia.nome;
		this.usuario = usuario.nome;
		
	}	

	public void alugar(int creditos, Midia midia, Usuario usuario) {
		
		if(usuario.creditos < 3) System.out.println(usuario.nome + ", não possui créditos o suficiente (mínimo 3), para alugar: " + midia.nome);
		
		if(usuario.creditos >= 3 & usuario.quantidadeMidias > 0) {
			
			if (midia.alugado == 0){
				System.out.println(usuario.nome + ", alugou: " + midia.nome + ", divirta-se");
				usuario.creditos = usuario.creditos - 3;
				midia.alugado = 1;
				usuario.adicionarMidia(midia);
				usuario.quantidadeMidias = usuario.quantidadeMidias - 1;
			} else {
				System.out.println(midia.nome + " está alugada, tente outro produto");
			}
		}
		else {
			System.out.println(usuario.nome + "atingiu o limite de mídias alugadas");
		}
		
	}
	
	public void devolver(int creditos, Midia midia, Usuario usuario) {
		
		System.out.println("Você devolveu " + midia.nome + " seus creditos serão devolvidos");
			usuario.creditos = usuario.creditos + 3;
			midia.alugado = 0;
	}
	
	
}

