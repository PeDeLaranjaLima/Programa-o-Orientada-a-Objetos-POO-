package aula0409.exercicios.pilarescomputacao.questao2;

public class Peixe extends Animal{
	
	Peixe(String tamanho, int massa){
		super(tamanho, massa);
	}
	
	public String comunicar(){
		return "glub glub";
	}
	

	public String movimentar(){
		return "nadando";
	}

	 public String toString() {
			return String.format("Peixe");
		}
}
