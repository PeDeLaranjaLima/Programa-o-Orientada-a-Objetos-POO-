package atividade.roteiro;

public class Filme extends Midia{
	
	 Filme(String nome, String artista, int dataLancamento, int alugado){
			super(nome, artista, dataLancamento, alugado);
		}
	
	 public void Tocar() {
		 System.out.println(this.nome + "está sendo passado");
		 System.out.println("O artista foi: " + this.artista);
		 System.out.println("Sua data de lançemento foi em " + this.dataLancamento);
	 }
	 public void Pausar() {
		 System.out.println(this.nome + "foi pausad");
	 }
	 public void Retomar() {
		 System.out.println(this.nome + "foi retomado");
	 }
	 
	 public String toString() {
			return String.format(nome + " dirigido por: " + artista + " lançado em: " + dataLancamento);
		}
	 
}