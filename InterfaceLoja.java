package atividade.roteiro;

import java.io.IOException;
import java.util.Scanner;

public class InterfaceLoja {

	public static void main( String args[] ) throws IOException {
		
		 Scanner scan = new Scanner(System.in);
		 int i = 0;
		 
		//Usuario u = new Usuario(null, 0);
		 
		//Locadora l = new Locadora(null, null);
		 
		 Midia[] minhasMidias;
		 minhasMidias = new Midia[10];
		 
		 minhasMidias[0] = new Musica("1- Neva Play", "Megan Thee Stelin", 2024, 0);
		 minhasMidias[1] = new Musica("2- Me ajude a salvar os domingos", "Liniker", 2024, 0);
		 minhasMidias[2] = new Musica("3- Megalomaniaca", "Ebony", 2023, 0);
		 minhasMidias[3] = new Musica("4- Banho", "Elza Soares", 2018, 0);
		 minhasMidias[4] = new Musica("5- Ela partiu", "Tim Maia", 1977, 0);
		 
		 minhasMidias[5] = new Filme("6- O homem do norte", "Robert Eggers", 2022, 0);
		 minhasMidias[6] = new Filme("7- The wich", "Robert Eggers", 2015, 0);
		 minhasMidias[7] = new Filme("8- A hora do pesadelo", "Wes Craven", 1984, 0);	
		 minhasMidias[8] = new Filme("9- Alien, o 8.º Passageiro", "Ridley Scott", 1979, 0);	
		 minhasMidias[9] = new Filme("10- Tudo em Todo o Lugar ao Mesmo Tempo", "Daniel Scheinert, Daniel Kwan", 2022, 0);	
		 
		 
		 System.out.println("Bem-vindo a Noite do Pesadelo, sua locadora local");
		 
		 System.out.println("Digite seu nome de usuário");
		 String nome = scan.nextLine();
		 
		 System.out.println("Digite quantos créditos deseja comprar?");
		 int creditos = scan.nextInt();
		 
		 Usuario u = new Usuario(nome, creditos, 3);
		 Locadora l = new Locadora(u, minhasMidias[i]);
		 
		 
		 System.out.println("Veja nossa lista de mídias cadastradas:");
		 for(int j = 0; j < minhasMidias.length; j++)
		 	System.out.println(minhasMidias[j]);
		 
		 System.out.println("Digite o que deseja fazer?");
		 
		 System.out.println("1) ALugar mídia 2) Devolver mídia 3) Tocar mídia 4) Pausar mídia 5) Sair da mídia");
		 
		 switch (scan.nextInt()) {
		 
		 case 1:
			 System.out.println("Digite o índice da mídia que deseja alugar");
			 i = scan.nextInt() - 1;
			 
			l.alugar(creditos, minhasMidias[i], u);
			
			 i++;
			 break;
		 
		 case 2:
		 
			 System.out.println("Digite o índice da mídia que deseja devolver");
			 i = scan.nextInt() - 1;
			 
			 l.devolver(creditos,  minhasMidias[i], u);
			 
			 break;
			 
		 case 3:
			 System.out.println("Digite o índice da mídia que deseja tocar");
			 i = scan.nextInt() - 1;
			 u.tocarMidia(minhasMidias[i]);
			 break;
			 
		 case 4:
			 System.out.println("Digite o índice da mídia que deseja pausar");
			 i = scan.nextInt() - 1;
			 u.pausarMidia(minhasMidias[i]);
			 break;
		 
		 case 5: 
			 System.out.println("Digite o índice da mídia que deseja dar stop");
			 i = scan.nextInt() - 1;
			 u.stopMidia(minhasMidias[i]);
			 System.out.println(u.toString());
		 }
		 
	}
	
}
