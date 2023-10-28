class Tesoura extends Coisa {
    //Sobrescrita do método abstrato, pois é filha de Coisa
    @Override
    protected int result(Coisa opcao){
        if(opcao instanceof Papel){
            return 1;
        }else if(opcao instanceof Pedra){
            return -1;
        }else{
            return 0;
        }
        
    }

    public String getNomeOpcao() {
        return "Tesoura";
    }
}