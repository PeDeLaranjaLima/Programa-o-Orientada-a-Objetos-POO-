package aula0409.exercicios.pilarescomputacao.questao2;

import java.io.IOException;

public class Zoologico {
	
	 public static void main( String args[] ) throws IOException {
		 
		Animal[] a = new Animal[3]; 
		a[0] = new Homem("grande", 56);
		a[1] = new Peixe("medio", 1);
		a[2] = new Passaro("pequeno", 3);
			
		 
		 for(int i = 0; i < a.length; i++) {
			 System.out.println(a[i] + " se comunica " + a[i].comunicar() + " e se movimenta " + a[i].movimentar());
			 System.out.println(a[i] + " possui " + a[i].massa + " massa e " + a[i].tamanho + " de tamanho");
		 }
		 
	 }

}
