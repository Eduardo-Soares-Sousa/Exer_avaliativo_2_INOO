import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        //declaração do Scanner e instâcia de objetos
        Scanner lerOpcao = new Scanner(System.in);

        Jogador player1 = new Jogador("Humano");
        Jogador player2 = new Jogador("Computador");

        System.out.println("Bem vindo ao Pedra, Papel, Tesoura - BOA SORTE");
        System.out.println("Digite:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.print("Opção desejada: ");
        int escolha = lerOpcao.nextInt();
        
        //Saber a escolha do Humano
        Coisa saberOpcaoEscolhida = null;
        if(escolha == 1){
            saberOpcaoEscolhida = new Pedra();
        }else if(escolha == 2){
            saberOpcaoEscolhida = new Papel();
        }else if(escolha == 3){
            saberOpcaoEscolhida = new Tesoura();
        }else{
            System.out.println("OPÇÃO INVÁLIDA");
            System.out.println("TENTE NOVAMENTE");
        }
        player1.jogador(saberOpcaoEscolhida);

        //Saber a escolha do Computador
        Random random = new Random();
        int computadorEscolha = random.nextInt(3) + 1;

        Coisa escolhidaComputador = null;
        if(computadorEscolha == 1){
            escolhidaComputador = new Pedra();
        }else if(computadorEscolha == 2){
            escolhidaComputador = new Papel();
        }else if(computadorEscolha == 3){
            escolhidaComputador = new Tesoura();
        }else{
            System.out.println("OPÇÃO INVÁLIDA");
            System.out.println("TENTE NOVAMENTE");
        }
        player2.jogador(escolhidaComputador);

        int resultado = player1.getEscolha().result(player2.getEscolha());

        System.out.println(player1.getNamePlayer() + " escolheu " + saberOpcaoEscolhida.getNomeOpcao());
        System.out.println(player2.getNamePlayer() + " escolheu " + escolhidaComputador.getNomeOpcao());

        if (resultado > 0) {
            System.out.println(player1.getNamePlayer() + " venceu!");
            System.out.println("PARABÉNS PELA VITÓRIA");
        } else if (resultado < 0) {
            System.out.println(player2.getNamePlayer() + " venceu!");
            System.out.println("PARABÉNS PELA VITÓRIA");
        } else {
            System.out.println("Empate!");
        }
    }
}