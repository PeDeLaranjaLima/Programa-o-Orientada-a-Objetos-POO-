package aula0409.exercicios.pilarescomputacao.questao2;

public class Homem extends Animal{
	
	Homem(String tamanho, int massa){
		super(tamanho, massa);
	}
	
	public String comunicar(){
		return"falando";
	}
	

	public String movimentar(){
		return "andando";
	}
	
	 public String toString() {
			return String.format("Homem");
		}
	
}
