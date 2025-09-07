package hora_aula.HT04.aulajava01;

import java.util.Scanner;

/**************************************************************
 * Discuplina: Porgramacao Orientada a Objetos
 * Professora: Beatriz T. Andrade
 * Departamento: Departamento de computacao (DOMP) - UFS
 * Horas trabalho para exercicios 04
 * Atividade: Parque de diversões
 * 
 *  	Seja um brinquedo em um parque de diversões
	onde, por questões de segurança, só podem entrar
	pessoas maiores de idade com mais de 1,5m de
	altura.
		Faça um programa que leia a idade e altura de uma
	pessoa, e informa se ela pode ou não entrar nesse
	brinquedo.
	
***************************************************************/

public class ParqueDiversoes {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("--------->Bem-vindo ao parque de diversões<---------");
			
			System.out.println("Digite sua idade");
			int idade = scan.nextInt();
			
			System.out.println("Digite sua altura (separada por ',' e não por '.')");
			float altura = scan.nextFloat();
			
			if ((idade < 18) || (altura <= 1.5)) {
				System.out.println("Não pode entrar");
			} else {
				System.out.println("Pode entrar");
			}
		
	}
}
