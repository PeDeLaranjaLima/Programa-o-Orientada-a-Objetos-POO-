package hora_aula.HT04.aulajava01;

import java.util.Scanner;

/**************************************************************
 * Discuplina: Porgramacao Orientada a Objetos
 * Professora: Beatriz T. Andrade
 * Departamento: Departamento de computacao (DOMP) - UFS
 * Horas trabalho para exercicios 03
 * Atividade: Caixa automatico
 * 
***************************************************************/
public class CaixaEletronico {
	
	public static void main(String[] args) {
		
		int c = 0;
		int v = 0;
		int u = 0;
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo, por favor:");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Digite o valor do saque, por favor:");
		int saque = scan.nextInt();
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Cliente: " + nomeCompleto);
		System.out.println("Valor do saque: " + saque);
		System.out.println("----------------------------------------------------------");
	
		System.out.println("Valores de cédulas disponíveis de");
		System.out.println("50,00: " + saque / 50);
		
		c = saque % 50;
		v = saque + (c - saque);
		
		System.out.println("20,00: " + v / 20);
		
		i = v % 20;
		u = saque + (i - saque);
		
		System.out.println("1,00: " + u);
		System.out.println("Retire seu dinheiro");		
		System.out.println("----------------------------------------------------------");
		System.out.println("Oepração finalizada");
		
		
	
}
}