package hora_aula.HT04.aulajava01;

import java.util.Scanner;

/**************************************************************
 * Discuplina: Porgramacao Orientada a Objetos
 * Professora: Beatriz T. Andrade
 * Departamento: Departamento de computacao (DOMP) - UFS
 * Horas trabalho para exercicios 04
 * Atividade: Parque de diversões
 * 
 *  	Faça um programa que lê dois números
	inteiros e imprime a soma de todos os números
	inteiros entre eles.
	
***************************************************************/

public class EscalaAteNummero {
	
	public static void main(String[] args) {
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros e descobra a soma entre eles");
		
		System.out.println("Digite o primeiro número");
		int a = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		int b = scan.nextInt();
		
		if (a < b) {
			soma = 0;
			for(int i = a + 1; i < b; i++) {
				soma = soma + i;
			}
			System.out.println("A soma dos números é " + soma);
		}
		if (a > b) {
			soma = 0;
			for(int i = b + 1; i < a; i++) {
				soma = soma + i;
			}
			System.out.println("A soma dos números é " + soma);
		}
		if (a == b) {
			soma = 0;
			System.out.println("A soma dos números é " + soma);
		}
	
	}
}
