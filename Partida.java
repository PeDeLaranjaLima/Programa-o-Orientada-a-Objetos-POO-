import java.util.Scanner;

public class Partida 
{ 
    
   public static void main(){
      String nomeDesafiante;
      int chute;
      boolean acertou;
      Scanner leitor = new Scanner(System.in);
      
      System.out.println("Digite seu nome"); 
      nomeDesafiante = leitor.nextLine();
      //Poderia ler o intervalo
      System.out.println("Digite o intervalo"); 
      int inicio = leitor.nextInt();
      int fim = leitor.nextInt();
            
      Apertadinho jogo = new Apertadinho(inicio,fim);
      
      do{
          System.out.println("Digite seu chute:");
          chute = leitor.nextInt();
          System.out.println(nomeDesafiante + ", o seu chute foi: " + chute + ".");
          acertou = jogo.verificarPalpite(chute);
        } while(!acertou);
   }  
}
