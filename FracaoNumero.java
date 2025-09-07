package hora_aula.HT04.aulajava01;

import java.util.Scanner;

/**************************************************************
 * Discuplina: Porgramacao Orientada a Objetos
 * Professora: Beatriz T. Andrade
 * Departamento: Departamento de computacao (DOMP) - UFS
 * Horas trabalho para exercicios 04
 * Atividade: Parque de diversões
 * 
		Faça um programa que lê um valor N. Se N for
	inteiro e positivo, ele mostra o valor de E,
	conforme a expressão abaixo:
	E = 1 + ½ + 1/3 + ... + 1/n

***************************************************************/
public class FracaoNumero {
	
	public static void main(String[] args) {
		int i = 2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro e positivo");
		int a = scan.nextInt();
		
		if(a > 0) {
			if(a == 1) {
				System.out.print("E = 1");
			}
			else {
				System.out.print("E = 1 + ");
				do {
					System.out.print("1/" + i);
					System.out.print(" + ");
					i++;
				} while(i < a);
					System.out.print("1/" + i);
		    }
		}
	}
}


