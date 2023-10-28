public class Jogador {
    private String namePlayer;
    private Coisa escolha;

    public Jogador(String namePlayer){
        this.namePlayer = namePlayer;
    }

    public void jogador(Coisa escolha){
        this.escolha = escolha;
    }

    public String getNamePlayer(){
        return namePlayer;
    }

    public Coisa getEscolha(){
        return escolha;
    }   

    
}