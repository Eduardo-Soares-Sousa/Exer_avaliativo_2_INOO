package PedraPapelTesoura;

//classe abstrata:
public abstract class Coisa {
    //não há necessidade de atributos:
    //------------------------------------

    //não há necessidade de construtor:
    //------------------------------------

    //Declaração do método abstrato: 
    protected abstract int result(Coisa opcao);
    
    protected abstract String getNomeOpcao();
}