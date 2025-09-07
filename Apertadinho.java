
public class Apertadinho
{
    private final int NUM_SECRETO; 
    private int intervaloInf;
    private int intervaloSup;
    
    public Apertadinho(int intervaloInf, int intervaloSup)
    {
        //TODO: verificar se intervaloInf <= intervaloSup 
         if (intervaloInf >= intervaloSup){
           int aux =  intervaloSup;
           intervaloSup = intervaloInf;
           intervaloSup = aux;
        }
        //podem inverter os valores caso nao seja verdade            
        
        //TODO: verificar se esta gerando numeros dentro do intervalo
        NUM_SECRETO = (int)(Math.random()*(intervaloSup-intervaloInf+1)) + intervaloInf;
        //System.out.println("Pssssiu! O numero e "+ NUM_SECRETO+ "...");
    }
    
    //TODO: e preciso atualizar e imprimir os intervalos
    //cuidado com chutes fora do intervalo
    public boolean verificarPalpite(int palpite){
        boolean resposta = (palpite == NUM_SECRETO);
        if (resposta == true)
            System.out.println("Parabens! Voce acertou o numero!!!");
        else 
            System.out.println("Voce errou! Tente novamente");
            
            if(palpite < intervaloInf || palpite > intervaloSup)
                System.out.println("Os chutes devem estar dentro do intervalo!!!");
            
            if(palpite <= intervaloSup & palpite > NUM_SECRETO) intervaloSup = palpite;
            
            if(palpite >= intervaloInf & palpite < NUM_SECRETO) intervaloInf = palpite;
            
        return resposta;
    }
}
