package aula0409.exercicios.pilarescomputacao.questao2;

public class Passaro extends Animal{
	
	Passaro(String tamanho, int massa){
		super(tamanho, massa);
	}
	
	public String comunicar(){
		return "cantando";
	}
	

	public String movimentar(){
		return "vovando";
	}
	
	 public String toString() {
			return String.format("Pássaro");
		}

}
