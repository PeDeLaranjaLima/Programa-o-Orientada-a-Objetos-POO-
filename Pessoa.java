package aula0409.exercicios.pilarescomputacao.questao3;

public abstract class Pessoa {
	
	protected String nome;
	protected String dataNascimento;
	
	Pessoa(){}

	Pessoa(String nome, String dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(String nome) {
		return this.nome;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getDataNascimento(String dataNascimento) {
		return this.dataNascimento;
	}
	
	public String toString() {
		return null;
	}
	
}
