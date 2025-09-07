package aula0409.exercicios.pilarescomputacao.questao3;

public class Alunos extends Pessoa {
	
	private int nota1;
	private int nota2;
	private int nota3;
	private float media;
	
	Alunos(String nome, String dataNascimento, int nota1, int nota2, int nota3){
		super(nome, dataNascimento);
		
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
	}

	public void setMedia(int nota1, int nota2, int nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public String toString() {
		return String.format(media + " do aluno " + nome + " nascido em " + dataNascimento);
	}
	
}
