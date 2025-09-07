package hora_aula.HT04.aulajava01;

import java.io.IOException;
import java.util.Scanner;

/**
 * Escreva uma descrição da classe Cachorro aqui.
 * 
 * @author Gabriel Lima Dantas
 * @version Java 22 data 02/08/2024
 */

public class Parquinho{
	
	public class Cachorro{
		
	    // variáveis de instância
	    
		private float peso; // Peso do cachorro
	    private String nome; // Nome do cachorro
	    private String latido; // Tipo de latido do cachorro (determinado com base no peso)
	    private int fome; // Quantidade de vezes que se pode alimentar o cachorro
	    private int energia; // Quantidade de energia que o cachorro possui
		private float pesoMin;
		private float pesoIdeal;
	    
	    /*
	     * Métodos mutantes para alterar certos atributos do objeto cachorro,
	     * 
	     *  Algumas das alteações são limitadas para garantir o bom funcionamento do código 
	     */
	    
	    public String getNome() { // Ateração para receber o nome
	        return this.nome;
	    }
	    public float getPeso() { // Alteração para receber o peso
	        return this.peso;
	    }
	    public int getFome() { // Alteração para saber se ainda é possível alimentar o cachorro
	    	
	    	if (fome == 0) System.out.print( this.nome + "não esta com fome");
	    	
	        return this.fome;
	    }
	    
	    public String getLatir(){ // Determina o latido do cachorro
	    	
	    	// Latido varia com o peso do cachorro
		    if(peso > 60) {
		    	latido = "Wooof, Wooof!";
		    	fome = 5;
		    	energia = 5;
		    }
		    
		    else if(peso > 20) {
		    	latido = "Au!, Au!";
		    	fome = 3;
		    	energia = 3;
		    }
		    
		    else {
		    	latido = "Yip!, Yip!";
		    	fome = 2;
		    	energia = 2;
		    }
		    
		    return this.latido;  
	    }
	    
	    // Método para receber o nome do cachorro
	    public void setNome(String nome) {
	    this.nome = nome;
	    }
	    // Método para receber a quantidade de ração, ou de adição de peso que o cachorro irá receber
	    public void setRacao(float racao) {
	    
	    this.peso = peso + racao;
	    
	    if (fome > 0) this.fome = fome - 1; // Comer reduz a fome do cachorro
	    
	    else this.fome = 0;
	    	
	    }
	    /*
	     *  Método responsável pela ação de alterar, no caso, reduzir o peso do cachorro, desde que esteja dentro d ealguns limiares
	     *  
	     *  	float brincar é o valor que representa o quanto de peso será perdido, ou para verificar se o peso está nos limites estabelecidos
	     */
	    public void setPeso(float brincar) {
	    	if (this.peso >= (this.peso * brincar)) {
	    		this.peso = this.peso - brincar;
	    		this.energia--; // Brincar diminui o peso, mas também gasta a energia
	    	} else {
	    		System.out.println(this.nome + "está com fome"); // Caso o cachorro fique com um peso abaixo de 10% do original, ele ficará com fome
	    		this.energia = 0; // Se estiver com fome, o cachorro fica sem energia 
	    	}
	    		
	    }
	
	    /**
	     * Construtor para objetos da classe Cachorro:
	     * 
	     * 		String nome é a variável que irá armazenar o nome do carchorro
	     * 		float peso é a varável que irá armazenar o peso do cachorro
	     */
	    public Cachorro(String nome, float peso, float pesoIdeal) {
	    	
	        // inicializa variáveis de instância
	        this.nome = nome;
	        this.peso = peso;
	        this.pesoIdeal = pesoIdeal;        
	    }
	}
	
		// Classe humano, responsável pelas ações de alimentar, brincar e dar carinho ao cachorro
		 
	    public class Humano{
	    	
	    	/* Método responsável pela ação de alimentar o cachorro
	    	 * 	
	    	 * 		Cachorro c é um cachorro cojeto da classe cachorro
	    	 * 		float quantidadeRacao é a quantidade de ração com a qual o cachorro  será alimentado
	    	 */
	    	public void getAlimentar (Cachorro c, float quantidadeRacao) {
	    		c.setRacao(quantidadeRacao);
	    		System.out.println("Peso atual de " + c.nome + " é " + c.peso + " Kg");
	     	}
	    	
	    	/*
	    	 * Método respnsável pela açõ de brincar, ou seja, gastar a energia e queimar o peso do cachorro
	    	 * 		
	    	 * 		Cachorro c é um cachorro cojeto da classe cachorro
	    	 */
	    	public void getBrincar(Cachorro c) {
	    		
	    		if(c.energia > 0) { // Só é possível brincar com o cachorro se ele tiver energia
	    			c.setPeso(0.1f);
	    			System.out.println(c.nome + " está com pedo de " + c.peso + " e energia de " + c.energia + " pontos");
	    		}
	    		
	    		else System.out.println(c.nome + "está cansado, melhor ir para casa");
	    	}
	    	
	    	/*
	    	 * Método responsável por fazer carinho no cachorro, ação que regenera um ponto de energia
	    	 */
	    	public void getCarinho(Cachorro c) {
	    		
	    		if (c.energia <= 5) c.energia++;
	    		
	    		else System.out.println(c.nome + " está cheio de energia"); // Se chegar no limite de energia, ele não pode mais receber carinho
	    	}
	    }

	    public static void main( String args[] ) throws IOException {
	     
	       Parquinho parquinho = new Parquinho();
	       Parquinho.Cachorro c1;
	       Parquinho.Humano h1;
	       Scanner scan = new Scanner(System.in);
	   
	       System.out.println("Nome do cachorro: ");
	       String nome = scan.nextLine();
	       System.out.println("Qual o peso do seu cachorro?");
	       float peso = scan.nextFloat();
	       float pesoIdeal= scan.nextFloat();
	       c1 = parquinho.new Cachorro(nome, peso, pesoIdeal); // Por peso ideal para determinar o mínimo e máximo de peso do cachorro, ou como ele recebe carinho, e energia com base nisso
	       
	       System.out.println (c1.getNome() + " tem " + c1.peso + " Kg");
	       System.out.println("Seu latido é: " + c1.getLatir());
	       
	       System.out.println("O que vai fazer? (Alimentar: 1 / Brincar: 2 / Fazer carinho: 3 / Sair: 4");
	       
	       while(true) {
	    	  
		       int acao = scan.nextInt();	  
		       
		       /* A ideia desse case era fazer algo próximo a um menu de jogo, no qual o usuário poderia selecionar as opções de 
		        * 1) Alimentar: Para aumentar o peso
		        * 2) Brincar: Para gastar energia
		        * 3) Fazer carinho: Para aumentar a energia
		        * 4) Sair do parque e encerrar o programa
		       */
		       switch (acao) { 
		       
		       case 1:
				       System.out.println("Alimentar " + c1.nome + ":");
				       float qtdRacao = scan.nextFloat();
				       h1 = parquinho.new Humano(); // Cria uma nova instância de humano
				       h1.getAlimentar(c1, qtdRacao);
				       
				       acao = 0;
				       
				       break;
		       case 2:
			    	   
			    	   for(int i = 0; i <=3; i++) System.out.println("Brincando com" + c1.nome + "...");
			    	   
				       h1 = parquinho.new Humano(); // Cria uma nova instância de humano
				       h1.getBrincar(c1);
				       
				       acao = 0;
				       
				       break;
				    
		       case 3:
		    	   
			    	   for(int i = 0; i <=3; i++) System.out.println("Fazendo carinho em " + c1.nome + "...");
			    	   
			    	   h1 = parquinho.new Humano(); // Cria uma nova instância de humano
			    	   h1.getCarinho(c1);
			    	   
			    	   acao = 0;
			    	   
			    	   break;
				       
		       case 4:
		    	   
			    	   System.out.println("Fim do passeio no parque");
			    	   
			    	   break;
			    	   
			    	   
		       default:
		    	   
		    	   System.out.println("Isso não é uma opção");
		    	   
			   }
		       System.out.println("O que vai fazer? (Alimentar: 1 / Brincar: 2 / Fazer carinho: 3 / Sair: 4");
		  }
	      
	    }
}
	
	

	    