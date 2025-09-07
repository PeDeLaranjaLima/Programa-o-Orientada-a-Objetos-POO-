package atividade.roteiro;
	
	public class Musica extends Midia{
		
		 Musica(String nome, String artista, int dataLancamento, int alugado){
				super(nome, artista, dataLancamento, alugado);
			}
		 public void Tocar() {
			 System.out.println(this.nome + "está sendo tocada");
			 System.out.println("O artista foi: " + this.artista);
			 System.out.println("Sua data de lançemento foi em " + this.dataLancamento);
		 }
		 public void Pausar() {
			 System.out.println(this.nome + "foi pausada");
		 }
		 public void Retomar() {
			 System.out.println(this.nome + "foi retomada");
		 }
		 
		 public String toString() {
				return String.format(nome + " composta por: " + artista + " lançada em: " + dataLancamento);
			}
		 
	}
	
	

