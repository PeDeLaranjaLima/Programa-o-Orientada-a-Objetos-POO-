package aula0409.exercicios.pilarescomputacao.questao3;

import java.io.IOException;

public class Sigaa {
	
	 public static void main( String args[] ) throws IOException {
		 
		 Pessoa[] aluno = new Pessoa[3];
		 
		 aluno[0] = new Alunos("Gbariel", "02/03/2003", 8, 7, 3);
		 aluno[1] = new Alunos("Rafael", "02/03/2003", 7, 7, 5);
		 aluno[2] = new Alunos("Eduarda", "02/03/2003", 8, 7, 5);
		 
		 for(int i = 0; i < aluno.length; i++)
			 System.out.println(aluno[i]);
		 
	 }
	

}
